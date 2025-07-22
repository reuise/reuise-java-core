package dev.reuise.core.button;
public enum ButtonSize {

    EXTRA_SMALL() {
        @Override
        public Integer getRadius() {
            return 14;
        }

        @Override
        public Integer getIconSize() {
            return 16;
        }

        @Override
        public Integer getFontSize() {
            return 12;
        }

        @Override
        public Integer getPaddingX() {
            return 12;
        }

        @Override
        public Integer getPaddingY() {
            return 0;
        }

        @Override
        public String getShortName() {
            return "xs";
        }

        @Override
        public Integer getHeight() {
            return 28;
        }
    },
    SMALL() {
        @Override
        public Integer getRadius() {
            return 16;
        }

        @Override
        public Integer getIconSize() {
            return 16;
        }

        @Override
        public Integer getFontSize() {
            return 14;
        }

        @Override
        public Integer getPaddingX() {
            return 16;
        }

        @Override
        public Integer getPaddingY() {
            return 0;
        }

        @Override
        public String getShortName() {
            return "sm";
        }

        @Override
        public Integer getHeight() {
            return 32;
        }
    },
    MEDIUM() {
        @Override
        public Integer getRadius() {
            return 18;
        }

        @Override
        public Integer getIconSize() {
            return 16;
        }

        @Override
        public Integer getFontSize() {
            return 14;
        }

        @Override
        public Integer getPaddingX() {
            return 18;
        }

        @Override
        public Integer getPaddingY() {
            return 0;
        }

        @Override
        public String getShortName() {
            return "md";
        }

        @Override
        public Integer getHeight() {
            return 36;
        }
    },
    LARGE() {
        @Override
        public Integer getRadius() {
            return 24;
        }

        @Override
        public Integer getIconSize() {
            return 16;
        }

        @Override
        public Integer getFontSize() {
            return 16;
        }

        @Override
        public Integer getPaddingX() {
            return 24;
        }

        @Override
        public Integer getPaddingY() {
            return 0;
        }

        @Override
        public String getShortName() {
            return "lg";
        }

        @Override
        public Integer getHeight() {
            return 48;
        }
    },
    EXTRA_LARGE() {
        @Override
        public Integer getRadius() {
            return 32;
        }

        @Override
        public Integer getIconSize() {
            return 16;
        }

        @Override
        public Integer getFontSize() {
            return 18;
        }

        @Override
        public Integer getPaddingX() {
            return 28;
        }

        @Override
        public Integer getPaddingY() {
            return 0;
        }

        @Override
        public String getShortName() {
            return "xl";
        }

        @Override
        public Integer getHeight() {
            return 64;
        }
    };
    public abstract Integer getRadius();

    public abstract Integer getIconSize();

    public abstract Integer getFontSize();

    public abstract Integer getPaddingX();

    public abstract Integer getPaddingY();

    public abstract String getShortName();

    public abstract Integer getHeight();
}