package dev.reuise.core.scrollablecontainer;

public class ScrollableContainerFadeOptions {
    private String color;
    private int size = 50;
    private ScrollDirection scrollDirection;
    private boolean mask = false;

    public ScrollableContainerFadeOptions() {
    }

    public String getColor() {
        return color;
    }

    public ScrollableContainerFadeOptions setColor(String color) {
        this.color = color;
        return this;
    }

    public ScrollDirection getScrollDirection() {
        return scrollDirection;
    }

    public ScrollableContainerFadeOptions setScrollDirection(ScrollDirection scrollDirection) {
        this.scrollDirection = scrollDirection;
        return this;
    }

    public int getSize() {
        return size;
    }

    public ScrollableContainerFadeOptions setSize(int size) {
        this.size = size;
        return this;
    }

    public boolean isMask() {
        return mask;
    }

    public ScrollableContainerFadeOptions setMask(boolean mask) {
        this.mask = mask;
        return this;
    }
}
