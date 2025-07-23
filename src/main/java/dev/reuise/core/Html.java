package dev.reuise.core;

public class Html {
    private final StringBuilder content;

    private Html(String initialContent) {
        this.content = new StringBuilder(initialContent);
    }

    public static Html create() {
        return new Html("");
    }

    public static Html of(String initialContent) {
        return new Html(initialContent);
    }

    private Html addTag(String tagName, String innerContent, boolean selfClosing, String... attributes) {
        content.append("<").append(tagName);
        for (int i = 0; i < attributes.length; i += 2) {
            content.append(" ").append(attributes[i]).append("=\"").append(attributes[i + 1]).append("\"");
        }
        if (selfClosing) {
            content.append(" />");
        } else {
            content.append(">").append(innerContent).append("</").append(tagName).append(">");
        }
        return this;
    }

    public Html bold(String text) {
        return addTag("b", text, false);
    }

    public Html italic(String text) {
        return addTag("i", text, false);
    }

    public Html underline(String text) {
        return addTag("u", text, false);
    }

    public Html paragraph(String text) {
        return addTag("p", text, false);
    }

    public Html heading(int level, String text) {
        if (level < 1 || level > 6) level = 1;
        return addTag("h" + level, text, false);
    }

    public Html link(String href, String text) {
        return addTag("a", text, false, "href", href);
    }

    public Html image(String src, String alt) {
        return addTag("img", "", true, "src", src, "alt", alt);
    }

    public Html lineBreak() {
        return addTag("br", "", true);
    }

    public Html text(String html) {
        content.append(html);
        return this;
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
