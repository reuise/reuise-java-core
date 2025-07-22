package dev.reuise.core.dialog;
public enum DialogSize {

    EXTRA_SMALL() {
        @Override
        public String getShortName() {
            return "xs";
        }

        @Override
        public Integer getWidth() {
            return 400;
        }
    },
    SMALL() {
        @Override
        public String getShortName() {
            return "sm";
        }

        @Override
        public Integer getWidth() {
            return 600;
        }
    },
    MEDIUM() {
        @Override
        public String getShortName() {
            return "md";
        }

        @Override
        public Integer getWidth() {
            return 900;
        }
    },
    LARGE() {
        @Override
        public String getShortName() {
            return "lg";
        }

        @Override
        public Integer getWidth() {
            return 1200;
        }
    },
    EXTRA_LARGE() {
        @Override
        public String getShortName() {
            return "xl";
        }

        @Override
        public Integer getWidth() {
            return 1440;
        }
    },
    FULL_SCREEN() {
        @Override
        public String getShortName() {
            return "fullscreen";
        }

        @Override
        public Integer getWidth() {
            return null;
        }
    };
    public abstract String getShortName();

    public abstract Integer getWidth();
}