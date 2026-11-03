# Reuise for Java
This is core code. For implementations see: 

[Reuise for Java (Web)](https://github.com/reuise/reuise-java-web-core-material)

[Reuise for Java (Web)](https://github.com/reuise/reuise-java-web-core-bare)

[Reuise for Java (Android)](https://github.com/reuise/reuise-java-android-material)

[Reuise for Java (Android)](https://github.com/reuise/reuise-java-android-bare)

## Text and trusted HTML in 0.8.2-beta

`setText(String)` and string-valued text options are **literal text**, on both
the backend and frontend. Markup-like strings and entity-like strings are not
interpreted as HTML. Backend renderers encode text and quoted attributes at the
output boundary; frontend setters use `textContent` and native `setAttribute`
without pre-encoding.

Use the existing `setText(Html)` overload only for trusted markup:

```java
text.setText(userSuppliedText);
text.setText(Html.create().bold(userSuppliedText));
text.setText(Html.of("<strong>Trusted application markup</strong>"));
```

`Html` structural helpers (`bold`, `paragraph`, `link`, `image`, etc.) encode their
string arguments. `plainText(String)` appends encoded text. `Html.of(String)` and
the legacy `Html.text(String)` append **raw trusted HTML**, not sanitized HTML;
never pass user input to them. Setting ordinary text clears previously selected
trusted markup. The `HtmlContent` option preserves this distinction through
component composition and option initialization.

Frontend text getters return DOM text, not markup. Hydration preserves existing
server-rendered markup; subsequent string updates replace it with literal text.
Backend getters retain the supplied string (including the markup string supplied
through `Html`); do not use getters to sanitize or serialize trusted HTML.

Link URLs and `Html.link`/`Html.image` URLs accept relative URLs and `http`,
`https`, `mailto`, or `tel` schemes. Other schemes, including `javascript` and
`data`, throw `IllegalArgumentException`. HTML encoding is not JavaScript, CSS, or
URL sanitization: raw script, stylesheet, generic event attributes, and raw HTML
APIs remain trusted application-code boundaries.

Regression tests live in the 0.8.2-beta implementation-template repository:
`mvn test` runs helper/backend cases; `mvn -f src/test/browser/pom.xml package`
builds the GWT browser assertions. Serve the resulting webapp and load
`index.html`; success is reported as `PASS` with the assertion count.
