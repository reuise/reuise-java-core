package dev.reuise.core.text;
public enum FontWeight {

    THIN() {
        @Override
        public Integer getValue() {
            return 100;
        }
    },
    EXTRA_LIGHT() {
        @Override
        public Integer getValue() {
            return 200;
        }
    },
    LIGHT() {
        @Override
        public Integer getValue() {
            return 300;
        }
    },
    NORMAL() {
        @Override
        public Integer getValue() {
            return 400;
        }
    },
    MEDIUM() {
        @Override
        public Integer getValue() {
            return 500;
        }
    },
    SEMI_BOLD() {
        @Override
        public Integer getValue() {
            return 600;
        }
    },
    BOLD() {
        @Override
        public Integer getValue() {
            return 700;
        }
    },
    EXTRA_BOLD() {
        @Override
        public Integer getValue() {
            return 800;
        }
    },
    BLACK() {
        @Override
        public Integer getValue() {
            return 900;
        }
    };
    public abstract Integer getValue();
}