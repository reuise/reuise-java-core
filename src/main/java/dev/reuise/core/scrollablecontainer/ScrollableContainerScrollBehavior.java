package dev.reuise.core.scrollablecontainer;

public class ScrollableContainerScrollBehavior {
    private ScrollIncrement increment = ScrollIncrement.AUTO;
    private boolean continuous = true;

    public ScrollableContainerScrollBehavior() {
    }

    public ScrollIncrement getIncrement() {
        return increment;
    }

    public ScrollableContainerScrollBehavior setIncrement(ScrollIncrement increment) {
        this.increment = increment;
        return this;
    }

    public boolean isContinuous() {
        return continuous;
    }

    public ScrollableContainerScrollBehavior setContinuous(boolean continuous) {
        this.continuous = continuous;
        return this;
    }
}
