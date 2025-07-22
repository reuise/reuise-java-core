package dev.reuise.core.slidecontainer;

public class SlideContainerSlideButtonOptions {
    private SlideDirection slideDirection;

    public SlideContainerSlideButtonOptions() {
    }

    public SlideDirection getSlideDirection() {
        return slideDirection;
    }

    public SlideContainerSlideButtonOptions setSlideDirection(SlideDirection slideDirection) {
        this.slideDirection = slideDirection;
        return this;
    }
}
