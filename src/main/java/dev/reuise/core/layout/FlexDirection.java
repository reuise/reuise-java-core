package dev.reuise.core.layout;
public enum FlexDirection {

    ROW() {
        @Override
        public String getCssValue() {
            return "row";
        }
    },
    ROW_REVERSE() {
        @Override
        public String getCssValue() {
            return "row-reverse";
        }
    },
    COLUMN() {
        @Override
        public String getCssValue() {
            return "column";
        }
    },
    COLUMN_REVERSE() {
        @Override
        public String getCssValue() {
            return "column-reverse";
        }
    };
    public abstract String getCssValue();
}