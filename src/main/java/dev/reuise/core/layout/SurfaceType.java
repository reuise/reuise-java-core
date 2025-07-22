package dev.reuise.core.layout;
public enum SurfaceType {

    ELEVATED() {
        @Override
        public String getStyleName() {
            return "elevated";
        }
    },
    FILLED() {
        @Override
        public String getStyleName() {
            return "filled";
        }
    },
    OUTLINED() {
        @Override
        public String getStyleName() {
            return "outlined";
        }
    };
    public abstract String getStyleName();
}