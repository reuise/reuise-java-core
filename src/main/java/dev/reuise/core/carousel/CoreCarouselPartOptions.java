package dev.reuise.core.carousel;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreCarouselPartOptions {
    Integer getActiveIndex();

    ComponentOption<Integer> getActiveIndexOption();

    CoreCarouselPartOptions setActiveIndex(Integer activeIndex);

    Integer getGroupSize();

    ComponentOption<Integer> getGroupSizeOption();

    CoreCarouselPartOptions setGroupSize(Integer groupSize);

    String getAlign();

    ComponentOption<String> getAlignOption();

    CoreCarouselPartOptions setAlign(String align);

    boolean isWhitespace();

    ComponentOption<Boolean> getWhitespaceOption();

    CoreCarouselPartOptions setWhitespace(Boolean whitespace);

    boolean isCircular();

    ComponentOption<Boolean> getCircularOption();

    CoreCarouselPartOptions setCircular(Boolean circular);

    boolean isDraggable();

    ComponentOption<Boolean> getDraggableOption();

    CoreCarouselPartOptions setDraggable(Boolean draggable);

    boolean isAutoplay();

    ComponentOption<Boolean> getAutoplayOption();

    CoreCarouselPartOptions setAutoplay(Boolean autoplay);

    Integer getAutoplayInterval();

    ComponentOption<Integer> getAutoplayIntervalOption();

    CoreCarouselPartOptions setAutoplayInterval(Integer autoplayInterval);

    boolean isPaused();

    ComponentOption<Boolean> getPausedOption();

    CoreCarouselPartOptions setPaused(Boolean paused);

    Integer getTransitionMillis();

    ComponentOption<Integer> getTransitionMillisOption();

    CoreCarouselPartOptions setTransitionMillis(Integer transitionMillis);

    boolean isShowNavigation();

    ComponentOption<Boolean> getShowNavigationOption();

    CoreCarouselPartOptions setShowNavigation(Boolean showNavigation);

    boolean isShowIndicators();

    ComponentOption<Boolean> getShowIndicatorsOption();

    CoreCarouselPartOptions setShowIndicators(Boolean showIndicators);

    Integer getGap();

    ComponentOption<Integer> getGapOption();

    CoreCarouselPartOptions setGap(Integer gap);

    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreCarouselPartOptions setLabel(String label);

    String getPreviousLabel();

    ComponentOption<String> getPreviousLabelOption();

    CoreCarouselPartOptions setPreviousLabel(String previousLabel);

    String getNextLabel();

    ComponentOption<String> getNextLabelOption();

    CoreCarouselPartOptions setNextLabel(String nextLabel);

    String getPlayLabel();

    ComponentOption<String> getPlayLabelOption();

    CoreCarouselPartOptions setPlayLabel(String playLabel);

    String getPauseLabel();

    ComponentOption<String> getPauseLabelOption();

    CoreCarouselPartOptions setPauseLabel(String pauseLabel);

    String getPageLabel();

    ComponentOption<String> getPageLabelOption();

    CoreCarouselPartOptions setPageLabel(String pageLabel);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getViewportOptions();

    CoreCarouselPartOptions setViewportOptions(CoreContainerOptions viewportOptions);

    boolean hasViewportOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getViewportCreator();

    CoreContainerOptions getSliderOptions();

    CoreCarouselPartOptions setSliderOptions(CoreContainerOptions sliderOptions);

    boolean hasSliderOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getSliderCreator();

    CoreContainerOptions getNavigationOptions();

    CoreCarouselPartOptions setNavigationOptions(CoreContainerOptions navigationOptions);

    boolean hasNavigationOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getNavigationCreator();

    CoreButtonOptions getPreviousButtonOptions();

    CoreCarouselPartOptions setPreviousButtonOptions(CoreButtonOptions previousButtonOptions);

    boolean hasPreviousButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getPreviousButtonCreator();

    CoreContainerOptions getIndicatorsOptions();

    CoreCarouselPartOptions setIndicatorsOptions(CoreContainerOptions indicatorsOptions);

    boolean hasIndicatorsOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getIndicatorsCreator();

    CoreButtonOptions getNextButtonOptions();

    CoreCarouselPartOptions setNextButtonOptions(CoreButtonOptions nextButtonOptions);

    boolean hasNextButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getNextButtonCreator();

    CoreButtonOptions getAutoplayButtonOptions();

    CoreCarouselPartOptions setAutoplayButtonOptions(CoreButtonOptions autoplayButtonOptions);

    boolean hasAutoplayButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getAutoplayButtonCreator();

    CoreInlineTextOptions getAnnouncementOptions();

    CoreCarouselPartOptions setAnnouncementOptions(CoreInlineTextOptions announcementOptions);

    boolean hasAnnouncementOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getAnnouncementCreator();

    CoreComponentFactory getComponentFactory();

    CoreCarousel getComponent();
}
