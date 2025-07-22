package dev.reuise.core.input;
public enum TextFieldSize {

    EXTRA_SMALL() {
        @Override
        public Integer getRadius() {
            return 14;
        }

        @Override
        public Integer getIconSize() {
            return 12;
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
        public Integer getLineHeight() {
            return 18;
        }

        @Override
        public Integer getPaddingY() {
            return 4;
        }

        @Override
        public String getShortName() {
            return "xs";
        }
    },
    SMALL() {
        @Override
        public Integer getRadius() {
            return 16;
        }

        @Override
        public Integer getIconSize() {
            return 12;
        }

        @Override
        public Integer getFontSize() {
            return 12;
        }

        @Override
        public Integer getPaddingX() {
            return 16;
        }

        @Override
        public Integer getLineHeight() {
            return 18;
        }

        @Override
        public Integer getPaddingY() {
            return 4;
        }

        @Override
        public String getShortName() {
            return "sm";
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
        public Integer getLineHeight() {
            return 20;
        }

        @Override
        public Integer getPaddingY() {
            return 6;
        }

        @Override
        public String getShortName() {
            return "md";
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
        public Integer getLineHeight() {
            return 20;
        }

        @Override
        public Integer getPaddingY() {
            return 8;
        }

        @Override
        public String getShortName() {
            return "lg";
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
        public Integer getLineHeight() {
            return 22;
        }

        @Override
        public Integer getPaddingY() {
            return 8;
        }

        @Override
        public String getShortName() {
            return "xl";
        }
    };
    public abstract Integer getRadius();

    public abstract Integer getIconSize();

    public abstract Integer getFontSize();

    public abstract Integer getPaddingX();

    public abstract Integer getLineHeight();

    public abstract Integer getPaddingY();

    public abstract String getShortName();
}