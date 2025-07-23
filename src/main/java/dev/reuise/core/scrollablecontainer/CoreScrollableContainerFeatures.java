package dev.reuise.core.scrollablecontainer;
public interface CoreScrollableContainerFeatures {
    ScrollDirection getScrollDirection();

    CoreScrollableContainerFeatures setScrollDirection(ScrollDirection scrollDirection);

    boolean isShowScrollBars();

    CoreScrollableContainerFeatures setShowScrollBars(Boolean showScrollBars);

    ScrollableContainerFadeOptions getScrollAreaFadeOptions();

    CoreScrollableContainerFeatures setScrollAreaFadeOptions(ScrollableContainerFadeOptions scrollAreaFadeOptions);

    Integer getScrollAreaBorderRadius();

    CoreScrollableContainerFeatures setScrollAreaBorderRadius(Integer scrollAreaBorderRadius);

    String getScrollAreaFillColor();

    CoreScrollableContainerFeatures setScrollAreaFillColor(String scrollAreaFillColor);

    ScrollableContainerScrollButtonOptions getScrollButtonOptions();

    CoreScrollableContainerFeatures setScrollButtonOptions(ScrollableContainerScrollButtonOptions scrollButtonOptions);

    ScrollableContainerScrollBehavior getScrollBehavior();

    CoreScrollableContainerFeatures setScrollBehavior(ScrollableContainerScrollBehavior scrollBehavior);
}