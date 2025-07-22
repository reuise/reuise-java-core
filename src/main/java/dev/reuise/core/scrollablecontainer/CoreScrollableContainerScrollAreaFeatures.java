package dev.reuise.core.scrollablecontainer;
public interface CoreScrollableContainerScrollAreaFeatures {
    ScrollDirection getScrollDirection();

    CoreScrollableContainerScrollAreaFeatures setScrollDirection(ScrollDirection scrollDirection);

    ScrollableContainerFadeOptions getFadeOptions();

    CoreScrollableContainerScrollAreaFeatures setFadeOptions(ScrollableContainerFadeOptions fadeOptions);

    Integer getBorderRadius();

    CoreScrollableContainerScrollAreaFeatures setBorderRadius(Integer borderRadius);

    String getFillColor();

    CoreScrollableContainerScrollAreaFeatures setFillColor(String fillColor);
}