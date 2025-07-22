package dev.reuise.core.checkbox;
public enum CheckboxSize {

    SMALL() {
        @Override
        public Integer getFontSize() {
            return 10;
        }

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
        public Integer getFontSize() {
            return 12;
        }

        @Override
        public Integer getSize() {
            return 18;
        }

        @Override
        public String getShortName() {
            return "md";
        }
    },
    LARGE() {
        @Override
        public Integer getFontSize() {
            return 14;
        }

        @Override
        public Integer getSize() {
            return 23;
        }

        @Override
        public String getShortName() {
            return "lg";
        }
    };
    public abstract Integer getFontSize();

    public abstract Integer getSize();

    public abstract String getShortName();
}