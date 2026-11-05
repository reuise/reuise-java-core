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

## CSS priority

Style append operations preserve each property's `important` flag and parse typed
values using the property's normal rules (for example, width `24` becomes
`24px`). Appending a normal declaration for the same property replaces an
existing important declaration and clears its priority, matching backend style
merging. This applies to inline styles and existing stylesheet rules, including
responsive and nested rules. Values read from browser CSS declarations remain
browser-normalized strings.

## Frontend DOM accessors

Frontend `getTooltip()` / `setTooltip()` read and write the element's `title`
attribute, including on SVG elements. A null tooltip removes the attribute;
an empty tooltip keeps an explicitly empty attribute.

Frontend `getStyleClasses()` and `getAttributes()` return non-null, detached
snapshots of the current DOM. Class snapshots include framework-generated and
externally added classes, not just classes supplied in component options.
Attribute values are decoded DOM strings, not HTML-encoded strings. Mutating a
snapshot does not change the element; use the component setters for updates.
These accessors also read existing values on hydrated components.

## Parent-component lifecycle

Adding a child registers it once, preserves the order on repeated adds, and
detaches it from its previous parent when moved. Hydrated children are registered
without duplicating or unnecessarily moving their existing DOM nodes.
`insertBefore` moves an existing entry rather than duplicating it; a reference
not owned by the parent falls back to `add`. Null or self references do nothing.

Wrappers, including nested wrappers, are owned as outer child entries. Inserting
or removing a wrapped child through the outer parent moves or detaches that
whole wrapper unit, preserving its internal children. `removeFromParent` instead
removes a child from its immediate model parent. Removing a foreign or already
removed child does nothing.

`setChildren` / `setChild` replace registered children, unlinking old ownership
and updating the frontend DOM. Replacement accepts the parent's own live list
and ignores duplicate entries. Unregistered server-rendered nodes are preserved
during replacement and option initialization; explicit `removeAll` /
`clearChildren` also clear residual frontend DOM. Self/ancestor insertion and
wrapper cycles throw `IllegalArgumentException`.

## Data attributes

On both web platforms, `setData(Map<String, String>)` merges entries using the
single-key setter. An empty map leaves existing data unchanged, including
server-rendered and framework attributes. `getData()` returns a non-null,
detached snapshot of the current `data-*` attributes, excluding other attributes.
Keys are literal attribute suffixes: `"user-id"` means `data-user-id`, not the
JavaScript dataset key `userId`. This also works on SVG elements.

A null value passed to either data setter creates an empty attribute; it does
not remove it. Use `removeAttribute("data-user-id")` to remove an entry.
`getData(key)` returns null for a missing attribute and `hasData(key)` reports
presence, including empty attributes. Prefer lowercase keys for backend/frontend
parity (HTML attribute names are case-insensitive; SVG names are case-sensitive).
