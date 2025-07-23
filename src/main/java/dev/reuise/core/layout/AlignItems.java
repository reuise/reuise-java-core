package dev.reuise.core.layout;
public enum AlignItems {

    START() {
        @Override
        public String getCssValue() {
            return "start";
        }
    },
    SELF_START() {
        @Override
        public String getCssValue() {
            return "self-start";
        }
    },
    CENTER() {
        @Override
        public String getCssValue() {
            return "center";
        }
    },
    END() {
        @Override
        public String getCssValue() {
            return "end";
        }
    },
    SELF_END() {
        @Override
        public String getCssValue() {
            return "self-end";
        }
    };
    public abstract String getCssValue();
}