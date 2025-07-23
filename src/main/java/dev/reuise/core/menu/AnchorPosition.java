package dev.reuise.core.menu;
public enum AnchorPosition {

    TOP_LEFT() {
        @Override
        public String getShortName() {
            return "tl";
        }
    },
    TOP_CENTER() {
        @Override
        public String getShortName() {
            return "tc";
        }
    },
    TOP_RIGHT() {
        @Override
        public String getShortName() {
            return "tr";
        }
    },
    CENTER_LEFT() {
        @Override
        public String getShortName() {
            return "cl";
        }
    },
    CENTER_CENTER() {
        @Override
        public String getShortName() {
            return "cc";
        }
    },
    CENTER_RIGHT() {
        @Override
        public String getShortName() {
            return "cr";
        }
    },
    BOTTOM_LEFT() {
        @Override
        public String getShortName() {
            return "bl";
        }
    },
    BOTTOM_CENTER() {
        @Override
        public String getShortName() {
            return "bc";
        }
    },
    BOTTOM_RIGHT() {
        @Override
        public String getShortName() {
            return "br";
        }
    };
    public abstract String getShortName();
}