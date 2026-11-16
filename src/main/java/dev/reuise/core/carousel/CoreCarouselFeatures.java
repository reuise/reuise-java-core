package dev.reuise.core.carousel;
public interface CoreCarouselFeatures {
    Integer getActiveIndex();

    CoreCarouselFeatures setActiveIndex(Integer activeIndex);

    Integer getDefaultActiveIndex();

    CoreCarouselFeatures setDefaultActiveIndex(Integer defaultActiveIndex);

    Integer getGroupSize();

    CoreCarouselFeatures setGroupSize(Integer groupSize);

    String getAlign();

    CoreCarouselFeatures setAlign(String align);

    boolean isWhitespace();

    CoreCarouselFeatures setWhitespace(Boolean whitespace);

    boolean isCircular();

    CoreCarouselFeatures setCircular(Boolean circular);

    boolean isDraggable();

    CoreCarouselFeatures setDraggable(Boolean draggable);

    boolean isAutoplay();

    CoreCarouselFeatures setAutoplay(Boolean autoplay);

    Integer getAutoplayInterval();

    CoreCarouselFeatures setAutoplayInterval(Integer autoplayInterval);

    boolean isPaused();

    CoreCarouselFeatures setPaused(Boolean paused);

    Integer getTransitionMillis();

    CoreCarouselFeatures setTransitionMillis(Integer transitionMillis);

    boolean isShowNavigation();

    CoreCarouselFeatures setShowNavigation(Boolean showNavigation);

    boolean isShowIndicators();

    CoreCarouselFeatures setShowIndicators(Boolean showIndicators);

    String getActiveDotColor();

    CoreCarouselFeatures setActiveDotColor(String activeDotColor);

    Integer getGap();

    CoreCarouselFeatures setGap(Integer gap);

    String getLabel();

    CoreCarouselFeatures setLabel(String label);

    String getPreviousLabel();

    CoreCarouselFeatures setPreviousLabel(String previousLabel);

    String getNextLabel();

    CoreCarouselFeatures setNextLabel(String nextLabel);

    String getPlayLabel();

    CoreCarouselFeatures setPlayLabel(String playLabel);

    String getPauseLabel();

    CoreCarouselFeatures setPauseLabel(String pauseLabel);

    String getPageLabel();

    CoreCarouselFeatures setPageLabel(String pageLabel);
}
