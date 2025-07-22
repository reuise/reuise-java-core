package dev.reuise.core.view;
public enum SheetSize {

    EXTRA_SMALL() {
        @Override
        public Object getMinSize() {
            return 60;
        }

        @Override
        public Object getSize() {
            return 100;
        }

        @Override
        public Object getMaxSize() {
            return 140;
        }
    },
    SMALL() {
        @Override
        public Object getMinSize() {
            return 290;
        }

        @Override
        public Object getSize() {
            return 330;
        }

        @Override
        public Object getMaxSize() {
            return 370;
        }
    },
    MEDIUM() {
        @Override
        public Object getMinSize() {
            return "46%";
        }

        @Override
        public Object getSize() {
            return "50%";
        }

        @Override
        public Object getMaxSize() {
            return "54%";
        }
    },
    LARGE() {
        @Override
        public Object getMinSize() {
            return "71%";
        }

        @Override
        public Object getSize() {
            return "75%";
        }

        @Override
        public Object getMaxSize() {
            return "79%";
        }
    },
    EXTRA_LARGE() {
        @Override
        public Object getMinSize() {
            return "76%";
        }

        @Override
        public Object getSize() {
            return "80%";
        }

        @Override
        public Object getMaxSize() {
            return "84%";
        }
    },
    FULL() {
        @Override
        public Object getMinSize() {
            return "100%";
        }

        @Override
        public Object getSize() {
            return "100%";
        }

        @Override
        public Object getMaxSize() {
            return "100%";
        }
    };
    public abstract Object getMinSize();

    public abstract Object getSize();

    public abstract Object getMaxSize();
}