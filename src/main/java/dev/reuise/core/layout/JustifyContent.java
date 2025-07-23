package dev.reuise.core.layout;
public enum JustifyContent {

    START() {
        @Override
        public String getCssValue() {
            return "start";
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
    NORMAL() {
        @Override
        public String getCssValue() {
            return "normal";
        }
    },
    SPACE_BETWEEN() {
        @Override
        public String getCssValue() {
            return "space-between";
        }
    },
    SPACE_AROUND() {
        @Override
        public String getCssValue() {
            return "space-around";
        }
    },
    SPACE_EVENLY() {
        @Override
        public String getCssValue() {
            return "space-evenly";
        }
    },
    STRETCH() {
        @Override
        public String getCssValue() {
            return "stretch";
        }
    };
    public abstract String getCssValue();
}