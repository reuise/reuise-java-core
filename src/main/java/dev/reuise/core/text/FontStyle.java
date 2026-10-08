package dev.reuise.core.text;
public enum FontStyle {

    NORMAL() {
        @Override
        public String getValue() {
            return "normal";
        }
    },
    ITALIC() {
        @Override
        public String getValue() {
            return "italic";
        }
    },
    OBLIQUE() {
        @Override
        public String getValue() {
            return "oblique";
        }
    };

    public abstract String getValue();
}
