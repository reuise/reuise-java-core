package dev.reuise.core;

import java.util.Arrays;
import java.util.List;

public enum ScreenSize implements MediaQuery {
    EXTRA_SMALL() {
        @Override
        public String getShortName() {
            return "xs";
        }

        @Override
        public String getQuery() {
            return getMaxWidthQuery();
        }

        @Override
        public int getMinWidth() {
            return 0;
        }

        @Override
        public int getMaxWidth() {
            return 599;
        }
    },
    SMALL() {
        @Override
        public String getShortName() {
            return "sm";
        }

        @Override
        public String getQuery() {
            return getMinWidthQuery()+" and "+getMaxWidthQuery();
        }

        @Override
        public int getMinWidth() {
            return 600;
        }

        @Override
        public int getMaxWidth() {
            return 899;
        }
    },
    MEDIUM() {
        @Override
        public String getShortName() {
            return "md";
        }

        @Override
        public String getQuery() {
            return getMinWidthQuery()+" and "+getMaxWidthQuery();
        }

        @Override
        public int getMinWidth() {
            return 900;
        }

        @Override
        public int getMaxWidth() {
            return 1199;
        }
    },
    LARGE() {
        @Override
        public String getShortName() {
            return "lg";
        }

        @Override
        public String getQuery() {
            return getMinWidthQuery()+" and "+getMaxWidthQuery();
        }

        @Override
        public int getMinWidth() {
            return 1200;
        }

        @Override
        public int getMaxWidth() {
            return 1439;
        }
    },
    EXTRA_LARGE() {
        @Override
        public String getShortName() {
            return "xl";
        }

        @Override
        public String getQuery() {
            return getMinWidthQuery();
        }

        @Override
        public int getMinWidth() {
            return 1440;
        }

        @Override
        public int getMaxWidth() {
            return Integer.MAX_VALUE;
        }
    };

    public abstract String getShortName();
    public abstract int getMinWidth();
    public abstract int getMaxWidth();

    public String getMinWidthQuery() {
        return "(min-width: "+getMinWidth()+"px)";
    }

    public String getMaxWidthQuery() {
        return "(max-width: "+getMaxWidth()+"px)";
    }

    @Override
    public String getStateKey() {
        return "screensize_"+getShortName();
    }

    public boolean matchesWidth(int width) {
        return width >= getMinWidth() && width <= getMaxWidth();
    }

    public static ScreenSizeRange to(ScreenSize maxSize) {
        return new ScreenSizeRange(ScreenSize.EXTRA_SMALL, maxSize);
    }

    public static ScreenSizeRange from(ScreenSize minSize) {
        return new ScreenSizeRange(minSize, ScreenSize.EXTRA_LARGE);
    }

    public static List<ScreenSize> getSizes() {
        return Arrays.asList(ScreenSize.values());
    }

    public static ScreenSize get(int width) {
        return getSizes().stream().filter(s -> s.matchesWidth(width)).findAny().orElse(null);
    }

    public static ScreenSize getSmallest() {
        return EXTRA_SMALL;
    }

    public static ScreenSize getLargest() {
        return EXTRA_LARGE;
    }
}
