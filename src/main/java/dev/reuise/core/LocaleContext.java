package dev.reuise.core;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Immutable, request-local localization policy shared by server and browser components.
 * Messages are plain text; resolving one does not translate or replace component labels.
 * Formatting settings do not infer a currency from the language or perform formatting.
 *
 * <p>Set a context on document or component options to establish a scope. Descendants
 * resolve their current parent context on demand; setting a component context to null
 * resumes inheritance. Replacing a context does not automatically re-render labels
 * previously resolved by an application.
 *
 * <pre>
 * LocaleContext locale = new LocaleContext("fr-CA")
 *         .withFallbackLanguageTag("en")
 *         .withCurrencyCode("EUR")
 *         .withMessageBundle("fr", messages);
 * options.setLocaleContext(locale);
 * </pre>
 *
 * <p>Web components transfer explicit overrides as escaped JSON in
 * {@code data-reuise-locale}. Hydration restores these before child creation;
 * inherited contexts are not duplicated on every child. Catalogs remain
 * application-supplied and must contain only browser-visible data.
 */
public final class LocaleContext {
    public static final LocaleContext DEFAULT = new LocaleContext("en");

    private final String languageTag;
    private final TextDirection textDirection;
    private final String fallbackLanguageTag;
    private final String formattingLanguageTag;
    private final String timeZone;
    private final String currencyCode;
    private final Map<String, Map<String, String>> messageBundles;

    /** Language tags are case-insensitive, hyphen-separated and stored in lower case. */
    public LocaleContext(String languageTag) {
        this(tag(languageTag), null, "en", null, "UTC", null, Collections.emptyMap());
    }

    private LocaleContext(String languageTag, TextDirection textDirection, String fallbackLanguageTag,
            String formattingLanguageTag, String timeZone, String currencyCode,
            Map<String, Map<String, String>> messageBundles) {
        this.languageTag = languageTag;
        this.textDirection = textDirection;
        this.fallbackLanguageTag = fallbackLanguageTag;
        this.formattingLanguageTag = formattingLanguageTag;
        this.timeZone = timeZone;
        this.currencyCode = currencyCode;
        this.messageBundles = messageBundles;
    }

    public String getLanguageTag() {
        return languageTag;
    }

    /** Null leaves direction unspecified rather than guessing it from the language. */
    public TextDirection getTextDirection() {
        return textDirection;
    }

    public String getFallbackLanguageTag() {
        return fallbackLanguageTag;
    }

    public String getFormattingLanguageTag() {
        return formattingLanguageTag == null ? languageTag : formattingLanguageTag;
    }

    /** An explicit time-zone identifier; UTC is the deterministic server/browser default. */
    public String getTimeZone() {
        return timeZone;
    }

    /** Null means that no application currency has been selected. */
    public String getCurrencyCode() {
        return currencyCode;
    }

    public Map<String, Map<String, String>> getMessageBundles() {
        return messageBundles;
    }

    public LocaleContext withLanguageTag(String languageTag) {
        return new LocaleContext(tag(languageTag), textDirection, fallbackLanguageTag,
                formattingLanguageTag, timeZone, currencyCode, messageBundles);
    }

    public LocaleContext withTextDirection(TextDirection textDirection) {
        return new LocaleContext(languageTag, textDirection, fallbackLanguageTag,
                formattingLanguageTag, timeZone, currencyCode, messageBundles);
    }

    /** Null disables the configured fallback; the base-language fallback still applies. */
    public LocaleContext withFallbackLanguageTag(String fallbackLanguageTag) {
        return new LocaleContext(languageTag, textDirection,
                fallbackLanguageTag == null ? null : tag(fallbackLanguageTag),
                formattingLanguageTag, timeZone, currencyCode, messageBundles);
    }

    /** Null makes formatting follow the message language again. */
    public LocaleContext withFormattingLanguageTag(String formattingLanguageTag) {
        return new LocaleContext(languageTag, textDirection, fallbackLanguageTag,
                formattingLanguageTag == null ? null : tag(formattingLanguageTag),
                timeZone, currencyCode, messageBundles);
    }

    public LocaleContext withTimeZone(String timeZone) {
        return new LocaleContext(languageTag, textDirection, fallbackLanguageTag,
                formattingLanguageTag, nonBlank(timeZone, "Time zone"), currencyCode, messageBundles);
    }

    public LocaleContext withCurrencyCode(String currencyCode) {
        if (currencyCode != null && !currencyCode.matches("[A-Z]{3}"))
            throw new IllegalArgumentException("Currency must be an uppercase three-letter code");
        return new LocaleContext(languageTag, textDirection, fallbackLanguageTag,
                formattingLanguageTag, timeZone, currencyCode, messageBundles);
    }

    /** Replaces one locale's bundle, defensively copying its plain-text messages. */
    public LocaleContext withMessageBundle(String languageTag, Map<String, String> messages) {
        Map<String, String> bundle = new LinkedHashMap<>();
        Objects.requireNonNull(messages, "Messages").forEach((key, value) ->
                bundle.put(nonBlank(key, "Message key"), Objects.requireNonNull(value, "Message text")));
        Map<String, Map<String, String>> bundles = new LinkedHashMap<>(messageBundles);
        bundles.put(tag(languageTag), Collections.unmodifiableMap(bundle));
        return new LocaleContext(this.languageTag, textDirection, fallbackLanguageTag,
                formattingLanguageTag, timeZone, currencyCode, Collections.unmodifiableMap(bundles));
    }

    /** Resolves exact locale, base language, then the configured fallback locale. */
    public String resolveMessage(String key) {
        String message = findMessage(nonBlank(key, "Message key"));
        if (message == null)
            throw new IllegalStateException("Missing message '" + key + "' for locale '" + languageTag + "'");
        return message;
    }

    /** Uses caller-supplied text for a missing key, never the key itself. */
    public String resolveMessage(String key, String defaultText) {
        Objects.requireNonNull(defaultText, "Default message text");
        String message = findMessage(nonBlank(key, "Message key"));
        return message == null ? defaultText : message;
    }

    private String findMessage(String key) {
        String message = message(languageTag, key);
        int separator = languageTag.indexOf('-');
        if (message == null && separator > 0)
            message = message(languageTag.substring(0, separator), key);
        if (message == null && fallbackLanguageTag != null)
            message = message(fallbackLanguageTag, key);
        return message;
    }

    private String message(String languageTag, String key) {
        Map<String, String> bundle = messageBundles.get(languageTag);
        return bundle == null ? null : bundle.get(key);
    }

    /**
     * Versioned string-only state for hydration. Bundles are transferred as data, not callbacks.
     * Include only messages appropriate for disclosure to the browser.
     */
    public Map<String, String> toSnapshot() {
        Map<String, String> snapshot = new LinkedHashMap<>();
        snapshot.put("version", "1");
        snapshot.put("language", languageTag);
        if (textDirection != null) snapshot.put("direction", textDirection.getAttributeValue());
        if (fallbackLanguageTag != null) snapshot.put("fallback", fallbackLanguageTag);
        if (formattingLanguageTag != null) snapshot.put("formattingLanguage", formattingLanguageTag);
        snapshot.put("timeZone", timeZone);
        if (currencyCode != null) snapshot.put("currency", currencyCode);
        messageBundles.forEach((locale, messages) -> messages.forEach((key, value) ->
                snapshot.put("message:" + locale + ":" + key, value)));
        return Collections.unmodifiableMap(snapshot);
    }

    public static LocaleContext fromSnapshot(Map<String, String> snapshot) {
        Objects.requireNonNull(snapshot, "Locale snapshot");
        if (!"1".equals(snapshot.get("version")))
            throw new IllegalArgumentException("Unsupported locale snapshot version");
        LocaleContext context = new LocaleContext(snapshot.get("language"))
                .withFallbackLanguageTag(snapshot.get("fallback"))
                .withFormattingLanguageTag(snapshot.get("formattingLanguage"))
                .withTimeZone(snapshot.get("timeZone"))
                .withCurrencyCode(snapshot.get("currency"));
        String direction = snapshot.get("direction");
        if (direction != null) {
            if ("ltr".equals(direction)) context = context.withTextDirection(TextDirection.LTR);
            else if ("rtl".equals(direction)) context = context.withTextDirection(TextDirection.RTL);
            else if ("auto".equals(direction)) context = context.withTextDirection(TextDirection.AUTO);
            else throw new IllegalArgumentException("Invalid locale snapshot direction: " + direction);
        }
        Map<String, Map<String, String>> bundles = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : snapshot.entrySet()) {
            String name = entry.getKey();
            if (!name.startsWith("message:")) continue;
            int separator = name.indexOf(':', 8);
            if (separator < 0)
                throw new IllegalArgumentException("Invalid locale snapshot message: " + name);
            String locale = tag(name.substring(8, separator));
            Map<String, String> bundle = bundles.get(locale);
            if (bundle == null) {
                bundle = new LinkedHashMap<>();
                bundles.put(locale, bundle);
            }
            bundle.put(name.substring(separator + 1), entry.getValue());
        }
        for (Map.Entry<String, Map<String, String>> entry : bundles.entrySet())
            context = context.withMessageBundle(entry.getKey(), entry.getValue());
        return context;
    }

    /** JSON data, not HTML; callers embedding it in an attribute must HTML-escape it. */
    public String toJson() {
        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, String> entry : toSnapshot().entrySet()) {
            if (json.length() > 1) json.append(',');
            appendJsonString(json, entry.getKey());
            json.append(':');
            appendJsonString(json, entry.getValue());
        }
        return json.append('}').toString();
    }

    private static void appendJsonString(StringBuilder json, String value) {
        json.append('"');
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            if (character == '"' || character == '\\') json.append('\\').append(character);
            else if (character < 32 || character == '\u2028' || character == '\u2029') {
                String hex = Integer.toHexString(character);
                json.append("\\u");
                for (int pad = hex.length(); pad < 4; pad++) json.append('0');
                json.append(hex);
            } else json.append(character);
        }
        json.append('"');
    }

    private static String tag(String value) {
        nonBlank(value, "Language tag");
        if (!value.matches("[A-Za-z]{1,8}(-[A-Za-z0-9]{1,8})*"))
            throw new IllegalArgumentException("Invalid language tag: " + value);
        StringBuilder normalized = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            normalized.append(character >= 'A' && character <= 'Z' ? (char) (character + 32) : character);
        }
        return normalized.toString();
    }

    private static String nonBlank(String value, String name) {
        if (value == null || value.trim().isEmpty())
            throw new IllegalArgumentException(name + " must not be blank");
        return value;
    }
}
