package dev.reuise.core.slidecontainer;
public interface CoreSlideContainerFeatures {
    SlideDirection getSlideDirection();

    CoreSlideContainerFeatures setSlideDirection(SlideDirection slideDirection);

    boolean isShowSlideBars();

    CoreSlideContainerFeatures setShowSlideBars(Boolean showSlideBars);

    SlideContainerSlideButtonOptions getSlideButtonOptions();

    CoreSlideContainerFeatures setSlideButtonOptions(SlideContainerSlideButtonOptions slideButtonOptions);
}