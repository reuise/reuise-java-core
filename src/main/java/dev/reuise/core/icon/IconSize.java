package dev.reuise.core.icon;
public enum IconSize {

    EXTRA_SMALL() {
        @Override
        public Integer getSize() {
            return 8;
        }

        @Override
        public String getShortName() {
            return "xs";
        }
    },
    SMALL() {
        @Override
        public Integer getSize() {
            return 16;
        }

        @Override
        public String getShortName() {
            return "sm";
        }
    },
    MEDIUM() {
        @Override
        public Integer getSize() {
            return 28;
        }

        @Override
        public String getShortName() {
            return "md";
        }
    },
    LARGE() {
        @Override
        public Integer getSize() {
            return 32;
        }

        @Override
        public String getShortName() {
            return "lg";
        }
    },
    EXTRA_LARGE() {
        @Override
        public Integer getSize() {
            return 48;
        }

        @Override
        public String getShortName() {
            return "xl";
        }
    };
    public abstract Integer getSize();

    public abstract String getShortName();
}