package dev.reuise.core;

public class ScreenSizeRange implements MediaQuery {
    public static final ScreenSizeRange SMALL_SCREENS = from(ScreenSize.EXTRA_SMALL).to(ScreenSize.SMALL);
    public static final ScreenSizeRange LARGE_SCREENS = from(ScreenSize.MEDIUM).to(ScreenSize.EXTRA_LARGE);

    private ScreenSize minSize;
    private ScreenSize maxSize;

    public ScreenSizeRange(ScreenSize minSize, ScreenSize maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public ScreenSize getMinSize() {
        return minSize;
    }

    public void setMinSize(ScreenSize minSize) {
        this.minSize = minSize;
    }

    public ScreenSize getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(ScreenSize maxSize) {
        this.maxSize = maxSize;
    }

    public ScreenSizeRange to(ScreenSize maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    @Override
    public String getQuery() {
        if(minSize == null) return maxSize != null ? maxSize.getMinWidthQuery() : "";
        else if(maxSize == null || maxSize == ScreenSize.getLargest()) return minSize.getMinWidthQuery();
        return minSize.getMinWidthQuery()+" and "+maxSize.getMaxWidthQuery();
    }

    @Override
    public String getStateKey() {
        if(minSize == null) return maxSize != null ? getStateId(ScreenSize.getSmallest(), maxSize) : "";
        else if(maxSize == null) return getStateId(minSize, ScreenSize.getLargest());
        return getStateId(minSize, maxSize);
    }

    private String getStateId(ScreenSize min, ScreenSize max) {
        return "screensizerange_"+min.getShortName()+"-"+max.getShortName();
    }

    public static ScreenSizeRange from(ScreenSize minSize) {
        return new ScreenSizeRange(minSize, ScreenSize.EXTRA_LARGE);
    }

    @Override
    public int hashCode() {
        return getQuery().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) return false;
        if (getClass() != other.getClass()) return false;
        return getQuery().equals(((ScreenSizeRange)other).getQuery());
    }
}