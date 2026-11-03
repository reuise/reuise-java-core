package dev.reuise.core;

/** Encoding for HTML text and quoted attributes, not JavaScript or CSS. */
public final class HtmlEscaper {
    private HtmlEscaper() {
    }

    public static String text(String value) {
        return value == null ? "" : value.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static String attribute(String value) {
        return text(value).replace("\"", "&quot;").replace("'", "&#39;");
    }

    public static String attributeName(String name) {
        if (name == null || !name.matches("[A-Za-z_:][A-Za-z0-9_.:-]*"))
            throw new IllegalArgumentException("Invalid HTML attribute name: " + name);
        return name;
    }

    /** Reject executable link schemes, including browser-ignored control characters. */
    public static String url(String value) {
        if (value == null)
            return "";
        String normalized = value.replace("\t", "").replace("\n", "").replace("\r", "").trim();
        int colon = normalized.indexOf(':');
        int boundary = normalized.length();
        for (char separator : new char[] {'/', '?', '#'}) {
            int index = normalized.indexOf(separator);
            if (index >= 0 && index < boundary)
                boundary = index;
        }
        if (colon >= 0 && colon < boundary) {
            String scheme = normalized.substring(0, colon);
            if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")
                    && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("tel"))
                throw new IllegalArgumentException("Unsupported link URL scheme: " + scheme);
        }
        return value;
    }
}
