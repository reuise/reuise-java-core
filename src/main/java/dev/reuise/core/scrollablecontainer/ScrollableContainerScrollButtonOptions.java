package dev.reuise.core.scrollablecontainer;

public class ScrollableContainerScrollButtonOptions {
    private ScrollDirection scrollDirection;

    public ScrollableContainerScrollButtonOptions() {
    }

    public ScrollDirection getScrollDirection() {
        return scrollDirection;
    }

    public ScrollableContainerScrollButtonOptions setScrollDirection(ScrollDirection scrollDirection) {
        this.scrollDirection = scrollDirection;
        return this;
    }
}
