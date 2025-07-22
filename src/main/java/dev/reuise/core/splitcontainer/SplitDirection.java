package dev.reuise.core.splitcontainer;
public enum SplitDirection {

    VERTICAL() {
        @Override
        public String getShortName() {
            return "vertical";
        }
    },
    HORIZONTAL() {
        @Override
        public String getShortName() {
            return "horizontal";
        }
    };
    public abstract String getShortName();
}