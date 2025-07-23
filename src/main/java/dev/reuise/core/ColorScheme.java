package dev.reuise.core;

public enum ColorScheme implements MediaQuery {
    LIGHT() {
        @Override
        public String getShortName() {
            return "light";
        }

        @Override
        public String getQuery() {
            return "@media (prefers-color-scheme: light)";
        }
    },
    DARK() {
        @Override
        public String getShortName() {
            return "dark";
        }

        @Override
        public String getQuery() {
            return "@media (prefers-color-scheme: dark)";
        }
    },;

    public abstract String getShortName();

    @Override
    public String getStateKey() {
        return "colorscheme_"+getShortName();
    }
}
