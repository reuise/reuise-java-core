package dev.reuise.core.layout;
public enum BackdropFilter {

    BLUR() {
        @Override
        public Object getDefaultValue() {
            return 1;
        }
    },
    BRIGHTNESS() {
        @Override
        public Object getDefaultValue() {
            return 1.0;
        }
    },
    CONTRAST() {
        @Override
        public Object getDefaultValue() {
            return 1.0;
        }
    },
    GRAYSCALE() {
        @Override
        public Object getDefaultValue() {
            return 0.0;
        }
    },
    HUE_ROTATE() {
        @Override
        public Object getDefaultValue() {
            return 0;
        }
    },
    INVERT() {
        @Override
        public Object getDefaultValue() {
            return 0.0;
        }
    },
    OPACITY() {
        @Override
        public Object getDefaultValue() {
            return 1.0;
        }
    },
    SATURATE() {
        @Override
        public Object getDefaultValue() {
            return 1.0;
        }
    },
    SEPIA() {
        @Override
        public Object getDefaultValue() {
            return 0.0;
        }
    };
    public abstract Object getDefaultValue();
}