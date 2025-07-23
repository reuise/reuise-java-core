package dev.reuise.core.card;
public enum CardGridPositionMode {

    FLEX() {
        @Override
        public String getShortName() {
            return "flex";
        }
    },
    ABSOLUTE() {
        @Override
        public String getShortName() {
            return "absolute";
        }
    };
    public abstract String getShortName();
}