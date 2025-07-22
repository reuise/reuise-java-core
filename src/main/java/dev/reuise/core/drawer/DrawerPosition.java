package dev.reuise.core.drawer;
public enum DrawerPosition {

    TOP() {
        @Override
        public String getShortName() {
            return "top";
        }
    },
    LEFT() {
        @Override
        public String getShortName() {
            return "left";
        }
    },
    RIGHT() {
        @Override
        public String getShortName() {
            return "right";
        }
    },
    BOTTOM() {
        @Override
        public String getShortName() {
            return "bottom";
        }
    };
    public abstract String getShortName();
}