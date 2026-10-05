package dev.reuise.core.layout;

import java.util.*;
import java.util.function.*;

import dev.reuise.core.parentcomponent.CoreParentComponent;

public class MarkdownParser {
    // ---- Block-level consumers ----
    private final BiFunction<CoreParentComponent, Integer, CoreParentComponent> headingConsumer;
    private final Function<CoreParentComponent, CoreParentComponent> paragraphConsumer;
    private final BiFunction<CoreParentComponent, Boolean, CoreParentComponent> listConsumer; // Boolean = ordered
    private final Function<CoreParentComponent, CoreParentComponent> listItemConsumer;
    private final Function<CoreParentComponent, CoreParentComponent> dividerConsumer;
    private final Function<CoreParentComponent, CoreParentComponent> blockquoteConsumer;
    private final Function<CoreParentComponent, CoreParentComponent> codeBlockConsumer;

    // ---- Inline consumers ----
    private final TriConsumer<CoreParentComponent, String, String> linkConsumer;
    private final TriConsumer<CoreParentComponent, String, String> emailConsumer;
    private final TriConsumer<CoreParentComponent, String, String> imageConsumer;
    private final BiConsumer<CoreParentComponent, String> boldConsumer;
    private final BiConsumer<CoreParentComponent, String> italicConsumer;
    private final BiConsumer<CoreParentComponent, String> strikeConsumer;
    private final TriConsumer<CoreParentComponent, String, String> colorConsumer;
    private final Consumer<CoreParentComponent> lineBreakConsumer;
    private final BiConsumer<CoreParentComponent, String> textConsumer;

    private MarkdownParser(Builder b) {
        this.headingConsumer = b.headingConsumer;
        this.paragraphConsumer = b.paragraphConsumer;
        this.listConsumer = b.listConsumer;
        this.listItemConsumer = b.listItemConsumer;
        this.dividerConsumer = b.dividerConsumer;
        this.blockquoteConsumer = b.blockquoteConsumer;
        this.codeBlockConsumer = b.codeBlockConsumer;

        this.linkConsumer = b.linkConsumer;
        this.emailConsumer = b.emailConsumer;
        this.imageConsumer = b.imageConsumer;
        this.boldConsumer = b.boldConsumer;
        this.italicConsumer = b.italicConsumer;
        this.strikeConsumer = b.strikeConsumer;
        this.colorConsumer = b.colorConsumer;
        this.lineBreakConsumer = b.lineBreakConsumer;
        this.textConsumer = b.textConsumer;
    }

    // ---- Parse method ----
    public void parse(String markdown, CoreParentComponent root) {
        if (markdown == null || markdown.isEmpty() || root == null) {
            return;
        }

        Deque<CoreParentComponent> parentStack = new ArrayDeque<>();
        parentStack.push(root);

        String[] lines = markdown.split("\\R", -1);

        boolean inCodeBlock = false;
        List<String> codeLines = new ArrayList<>();

        CoreParentComponent currentList = null;
        boolean currentListOrdered = false;

        List<String> paragraphLines = new ArrayList<>();

        Runnable flushParagraph = () -> {
            if (paragraphLines.isEmpty()) {
                return;
            }

            String paragraphText = String.join("\n", paragraphLines).trim();
            paragraphLines.clear();

            if (paragraphText.isEmpty() || paragraphConsumer == null) {
                return;
            }

            CoreParentComponent para = paragraphConsumer.apply(parentStack.peek());
            if (para != null) {
                parentStack.push(para);
            }

            parseInlineToParent(paragraphText, parentStack.peek());

            if (para != null) {
                parentStack.pop();
            }
        };

        for (String rawLine : lines) {
            String line = rawLine.trim();

            // Inside fenced code block: keep raw content exactly as-is
            if (inCodeBlock) {
                if (line.startsWith("```")) {
                    if (codeBlockConsumer != null) {
                        CoreParentComponent codeBlock = codeBlockConsumer.apply(parentStack.peek());
                        if (codeBlock != null) {
                            parentStack.push(codeBlock);
                        }

                        parseInlineToParent(String.join("\n", codeLines), parentStack.peek());

                        if (codeBlock != null) {
                            parentStack.pop();
                        }
                    }

                    codeLines.clear();
                    inCodeBlock = false;
                } else {
                    codeLines.add(rawLine);
                }
                continue;
            }

            // Blank line ends paragraph and list
            if (line.isEmpty()) {
                flushParagraph.run();

                if (currentList != null) {
                    parentStack.pop();
                    currentList = null;
                }

                continue;
            }

            // Opening fenced code block
            if (line.startsWith("```")) {
                flushParagraph.run();

                if (currentList != null) {
                    parentStack.pop();
                    currentList = null;
                }

                inCodeBlock = true;
                codeLines.clear();
                continue;
            }

            // Headings
            int headingLevel = getHeadingLevel(line);
            if (headingLevel > 0) {
                flushParagraph.run();

                if (currentList != null) {
                    parentStack.pop();
                    currentList = null;
                }

                String text = line.substring(headingLevel + 1).trim();

                if (headingConsumer != null) {
                    CoreParentComponent heading = headingConsumer.apply(parentStack.peek(), headingLevel);
                    if (heading != null) {
                        parentStack.push(heading);
                    }

                    parseInlineToParent(text, parentStack.peek());

                    if (heading != null) {
                        parentStack.pop();
                    }
                }

                continue;
            }

            // Divider
            if (line.matches("^([\\*\\-_])\\1{2,}$")) {
                flushParagraph.run();

                if (currentList != null) {
                    parentStack.pop();
                    currentList = null;
                }

                if (dividerConsumer != null) {
                    CoreParentComponent divider = dividerConsumer.apply(parentStack.peek());
                    if (divider != null) {
                        parentStack.push(divider);
                        parentStack.pop();
                    }
                }

                continue;
            }

            // Blockquote
            if (line.startsWith(">")) {
                flushParagraph.run();

                if (currentList != null) {
                    parentStack.pop();
                    currentList = null;
                }

                String text = line.substring(1).trim();

                if (blockquoteConsumer != null) {
                    CoreParentComponent blockquote = blockquoteConsumer.apply(parentStack.peek());
                    if (blockquote != null) {
                        parentStack.push(blockquote);
                    }

                    parseInlineToParent(text, parentStack.peek());

                    if (blockquote != null) {
                        parentStack.pop();
                    }
                }

                continue;
            }

            // Lists
            boolean isUnordered = line.matches("^[*+-]\\s+.+");
            boolean isOrdered = line.matches("^\\d+\\.\\s+.+");
            boolean isListItem = isUnordered || isOrdered;

            if (isListItem) {
                flushParagraph.run();

                boolean ordered = isOrdered;

                if (currentList == null || currentListOrdered != ordered) {
                    if (currentList != null) {
                        parentStack.pop();
                        currentList = null;
                    }

                    if (listConsumer != null) {
                        currentList = listConsumer.apply(parentStack.peek(), ordered);
                        if (currentList != null) {
                            parentStack.push(currentList);
                        }
                    }

                    currentListOrdered = ordered;
                }

                String itemText = ordered
                    ? line.replaceFirst("^\\d+\\.\\s+", "")
                    : line.replaceFirst("^[*+-]\\s+", "");

                if (listItemConsumer != null) {
                    CoreParentComponent itemParent = currentList != null ? currentList : parentStack.peek();
                    CoreParentComponent item = listItemConsumer.apply(itemParent);

                    if (item != null) {
                        parentStack.push(item);
                    }

                    parseInlineToParent(itemText, parentStack.peek());

                    if (item != null) {
                        parentStack.pop();
                    }
                }

                continue;
            }

            // Leaving a list because normal text has started
            if (currentList != null) {
                parentStack.pop();
                currentList = null;
            }

            // Normal paragraph line: preserve line breaks within paragraph
            paragraphLines.add(rawLine.strip());
        }

        // Flush trailing paragraph
        flushParagraph.run();

        // Close trailing list
        if (currentList != null) {
            parentStack.pop();
            currentList = null;
        }

        // Handle unterminated code block at EOF
        if (inCodeBlock && !codeLines.isEmpty() && codeBlockConsumer != null) {
            CoreParentComponent codeBlock = codeBlockConsumer.apply(parentStack.peek());
            if (codeBlock != null) {
                parentStack.push(codeBlock);
            }

            parseInlineToParent(String.join("\n", codeLines), parentStack.peek());

            if (codeBlock != null) {
                parentStack.pop();
            }
        }
    }

    private int getHeadingLevel(String line) {
        int level = 0;
        while (level < line.length() && line.charAt(level) == '#') {
            level++;
        }
        if (level > 0 && line.length() > level && line.charAt(level) == ' ') {
            return level;
        }
        return 0;
    }

    // ---- Inline parsing ----
    private void parseInlineToParent(String text, CoreParentComponent parent) {
        if (text == null || text.isEmpty() || parent == null) {
            return;
        }

        int index = 0;
        StringBuilder plainText = new StringBuilder();

        Runnable flushText = () -> {
            if (plainText.length() > 0 && textConsumer != null) {
                textConsumer.accept(parent, plainText.toString());
                plainText.setLength(0);
            }
        };

        while (index < text.length()) {
            // Line breaks
            if (text.charAt(index) == '\n') {
                flushText.run();

                if (lineBreakConsumer != null) {
                    lineBreakConsumer.accept(parent);
                } else if (textConsumer != null) {
                    textConsumer.accept(parent, "\n");
                }

                index++;
                continue;
            }

            // Images (must come before links)
            if (text.startsWith("![", index)) {
                int mid = text.indexOf("](", index);
                int end = mid != -1 ? text.indexOf(")", mid + 2) : -1;
                if (mid != -1 && end != -1) {
                    flushText.run();

                    String alt = text.substring(index + 2, mid);
                    String src = text.substring(mid + 2, end);

                    if (imageConsumer != null) {
                        imageConsumer.accept(parent, alt, src);
                    }

                    index = end + 1;
                    continue;
                }
            }

            // Links / email
            if (text.charAt(index) == '[') {
                int mid = text.indexOf("](", index);
                int end = mid != -1 ? text.indexOf(")", mid + 2) : -1;
                if (mid != -1 && end != -1) {
                    flushText.run();

                    String label = text.substring(index + 1, mid);
                    String url = text.substring(mid + 2, end);

                    if (url.startsWith("mailto:")) {
                        if (emailConsumer != null) {
                            emailConsumer.accept(
                                parent,
                                label.isEmpty() ? url.substring(7) : label,
                                url
                            );
                        }
                    } else {
                        if (linkConsumer != null) {
                            linkConsumer.accept(parent, label, url);
                        }
                    }

                    index = end + 1;
                    continue;
                }
            }

            // Bold
            if (text.startsWith("**", index)) {
                int end = text.indexOf("**", index + 2);
                if (end != -1) {
                    flushText.run();

                    String content = text.substring(index + 2, end);
                    if (boldConsumer != null) {
                        boldConsumer.accept(parent, content);
                    }

                    index = end + 2;
                    continue;
                }
            }

            // Strikethrough
            if (text.startsWith("~~", index)) {
                int end = text.indexOf("~~", index + 2);
                if (end != -1) {
                    flushText.run();

                    String content = text.substring(index + 2, end);
                    if (strikeConsumer != null) {
                        strikeConsumer.accept(parent, content);
                    }

                    index = end + 2;
                    continue;
                }
            }

            // Italic
            if (text.startsWith("*", index)) {
                int end = text.indexOf("*", index + 1);
                if (end != -1) {
                    flushText.run();

                    String content = text.substring(index + 1, end);
                    if (italicConsumer != null) {
                        italicConsumer.accept(parent, content);
                    }

                    index = end + 1;
                    continue;
                }
            }

            // Colors
            if (text.startsWith("{color:", index)) {
                int sep = text.indexOf("|", index);
                int end = sep != -1 ? text.indexOf("}", sep + 1) : -1;
                if (sep != -1 && end != -1) {
                    flushText.run();

                    String color = text.substring(index + 7, sep);
                    String content = text.substring(sep + 1, end);

                    if (colorConsumer != null) {
                        colorConsumer.accept(parent, content, color);
                    }

                    index = end + 1;
                    continue;
                }
            }

            plainText.append(text.charAt(index));
            index++;
        }

        flushText.run();
    }

    // ---- Builder ----
    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private BiFunction<CoreParentComponent, Integer, CoreParentComponent> headingConsumer;
        private Function<CoreParentComponent, CoreParentComponent> paragraphConsumer;
        private BiFunction<CoreParentComponent, Boolean, CoreParentComponent> listConsumer;
        private Function<CoreParentComponent, CoreParentComponent> listItemConsumer;
        private Function<CoreParentComponent, CoreParentComponent> dividerConsumer;
        private Function<CoreParentComponent, CoreParentComponent> blockquoteConsumer;
        private Function<CoreParentComponent, CoreParentComponent> codeBlockConsumer;

        private TriConsumer<CoreParentComponent, String, String> linkConsumer;
        private TriConsumer<CoreParentComponent, String, String> emailConsumer;
        private TriConsumer<CoreParentComponent, String, String> imageConsumer;
        private BiConsumer<CoreParentComponent, String> boldConsumer;
        private BiConsumer<CoreParentComponent, String> italicConsumer;
        private BiConsumer<CoreParentComponent, String> strikeConsumer;
        private TriConsumer<CoreParentComponent, String, String> colorConsumer;
        private Consumer<CoreParentComponent> lineBreakConsumer;
        private BiConsumer<CoreParentComponent, String> textConsumer;

        public Builder onHeading(BiFunction<CoreParentComponent, Integer, CoreParentComponent> c) {
            headingConsumer = c;
            return this;
        }

        public Builder onParagraph(Function<CoreParentComponent, CoreParentComponent> c) {
            paragraphConsumer = c;
            return this;
        }

        public Builder onList(BiFunction<CoreParentComponent, Boolean, CoreParentComponent> c) {
            listConsumer = c;
            return this;
        }

        public Builder onListItem(Function<CoreParentComponent, CoreParentComponent> c) {
            listItemConsumer = c;
            return this;
        }

        public Builder onDivider(Function<CoreParentComponent, CoreParentComponent> c) {
            dividerConsumer = c;
            return this;
        }

        public Builder onBlockquote(Function<CoreParentComponent, CoreParentComponent> c) {
            blockquoteConsumer = c;
            return this;
        }

        public Builder onCodeBlock(Function<CoreParentComponent, CoreParentComponent> c) {
            codeBlockConsumer = c;
            return this;
        }

        public Builder onLink(TriConsumer<CoreParentComponent, String, String> c) {
            linkConsumer = c;
            return this;
        }

        public Builder onEmail(TriConsumer<CoreParentComponent, String, String> c) {
            emailConsumer = c;
            return this;
        }

        public Builder onImage(TriConsumer<CoreParentComponent, String, String> c) {
            imageConsumer = c;
            return this;
        }

        public Builder onBold(BiConsumer<CoreParentComponent, String> c) {
            boldConsumer = c;
            return this;
        }

        public Builder onItalic(BiConsumer<CoreParentComponent, String> c) {
            italicConsumer = c;
            return this;
        }

        public Builder onStrikethrough(BiConsumer<CoreParentComponent, String> c) {
            strikeConsumer = c;
            return this;
        }

        public Builder onColor(TriConsumer<CoreParentComponent, String, String> c) {
            colorConsumer = c;
            return this;
        }

        public Builder onLineBreak(Consumer<CoreParentComponent> c) {
            lineBreakConsumer = c;
            return this;
        }

        public Builder onText(BiConsumer<CoreParentComponent, String> c) {
            textConsumer = c;
            return this;
        }

        public MarkdownParser build() {
            return new MarkdownParser(this);
        }
    }

    @FunctionalInterface
    public interface TriConsumer<A, B, C> {
        void accept(A a, B b, C c);
    }
}