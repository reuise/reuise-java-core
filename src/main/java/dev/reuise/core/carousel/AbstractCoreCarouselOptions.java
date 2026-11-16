package dev.reuise.core.carousel;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
public abstract class AbstractCoreCarouselOptions<S extends AbstractCoreCarouselOptions<S>> implements CoreCarouselOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions viewportOptions;

    protected dev.reuise.core.layout.CoreContainerOptions sliderOptions;

    protected dev.reuise.core.layout.CoreContainerOptions navigationOptions;

    protected dev.reuise.core.button.CoreButtonOptions previousButtonOptions;

    protected dev.reuise.core.layout.CoreContainerOptions indicatorsOptions;

    protected dev.reuise.core.button.CoreButtonOptions nextButtonOptions;

    protected dev.reuise.core.button.CoreButtonOptions autoplayButtonOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions announcementOptions;

    protected AbstractCoreCarouselOptions() {
        viewportOptions = createDefaultViewportOptions();
        sliderOptions = createDefaultSliderOptions();
        navigationOptions = createDefaultNavigationOptions();
        previousButtonOptions = createDefaultPreviousButtonOptions();
        indicatorsOptions = createDefaultIndicatorsOptions();
        nextButtonOptions = createDefaultNextButtonOptions();
        autoplayButtonOptions = createDefaultAutoplayButtonOptions();
        announcementOptions = createDefaultAnnouncementOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        initializeDefaultActiveIndex(0);
        setDefaultDefaultActiveIndex(0);
        setDefaultAlign("start");
        setDefaultWhitespace(false);
        setDefaultCircular(false);
        setDefaultDraggable(true);
        setDefaultAutoplay(false);
        setDefaultAutoplayInterval(4000);
        setDefaultPaused(false);
        setDefaultTransitionMillis(300);
        setDefaultShowNavigation(true);
        setDefaultShowIndicators(true);
        setDefaultActiveDotColor("#616161");
        setDefaultGap(16);
        setDefaultLabel("Carousel");
        setDefaultPreviousLabel("Previous page");
        setDefaultNextLabel("Next page");
        setDefaultPlayLabel("Start automatic rotation");
        setDefaultPauseLabel("Pause automatic rotation");
        setDefaultPageLabel("Page {index} of {count}");
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Integer getActiveIndex() {
        return ((Integer) (getOptionValue("activeIndex")));
    }

    @Override
    public ComponentOption<Integer> getActiveIndexOption() {
        return ((ComponentOption<Integer>) (getOption("activeIndex")));
    }

    @Override
    public S setActiveIndex(Integer activeIndex) {
        setOption("activeIndex", activeIndex, true);
        setLayoutChildrenActiveIndex(activeIndex);
        return self();
    }

    protected void setLayoutChildrenActiveIndex(Integer activeIndex) {
    }

    private void initializeDefaultActiveIndex(Integer activeIndex) {
        setDefaultOption("activeIndex", activeIndex, true);
        setLayoutChildrenActiveIndex(activeIndex);
    }

    @Override
    public Integer getDefaultActiveIndex() {
        return ((Integer) (getOptionValue("defaultActiveIndex")));
    }

    @Override
    public ComponentOption<Integer> getDefaultActiveIndexOption() {
        return ((ComponentOption<Integer>) (getOption("defaultActiveIndex")));
    }

    @Override
    public S setDefaultActiveIndex(Integer defaultActiveIndex) {
        setOption("defaultActiveIndex", defaultActiveIndex, true);
        setLayoutChildrenDefaultActiveIndex(defaultActiveIndex);
        return self();
    }

    protected void setLayoutChildrenDefaultActiveIndex(Integer defaultActiveIndex) {
    }

    private void setDefaultDefaultActiveIndex(Integer defaultActiveIndex) {
        setDefaultOption("defaultActiveIndex", defaultActiveIndex, true);
        setLayoutChildrenDefaultActiveIndex(defaultActiveIndex);
    }

    @Override
    public Integer getGroupSize() {
        return ((Integer) (getOptionValue("groupSize")));
    }

    @Override
    public ComponentOption<Integer> getGroupSizeOption() {
        return ((ComponentOption<Integer>) (getOption("groupSize")));
    }

    @Override
    public S setGroupSize(Integer groupSize) {
        setOption("groupSize", groupSize, true);
        setLayoutChildrenGroupSize(groupSize);
        return self();
    }

    protected void setLayoutChildrenGroupSize(Integer groupSize) {
    }

    private void setDefaultGroupSize(Integer groupSize) {
        setDefaultOption("groupSize", groupSize, true);
        setLayoutChildrenGroupSize(groupSize);
    }

    @Override
    public String getAlign() {
        return ((String) (getOptionValue("align")));
    }

    @Override
    public ComponentOption<String> getAlignOption() {
        return ((ComponentOption<String>) (getOption("align")));
    }

    @Override
    public S setAlign(String align) {
        setOption("align", align, true);
        setLayoutChildrenAlign(align);
        return self();
    }

    protected void setLayoutChildrenAlign(String align) {
    }

    private void setDefaultAlign(String align) {
        setDefaultOption("align", align, true);
        setLayoutChildrenAlign(align);
    }

    @Override
    public boolean isWhitespace() {
        return Boolean.TRUE.equals(getOptionValue("whitespace"));
    }

    @Override
    public ComponentOption<Boolean> getWhitespaceOption() {
        return ((ComponentOption<Boolean>) (getOption("whitespace")));
    }

    @Override
    public S setWhitespace(Boolean whitespace) {
        setOption("whitespace", whitespace, true);
        setLayoutChildrenWhitespace(whitespace);
        return self();
    }

    protected void setLayoutChildrenWhitespace(Boolean whitespace) {
    }

    private void setDefaultWhitespace(Boolean whitespace) {
        setDefaultOption("whitespace", whitespace, true);
        setLayoutChildrenWhitespace(whitespace);
    }

    @Override
    public boolean isCircular() {
        return Boolean.TRUE.equals(getOptionValue("circular"));
    }

    @Override
    public ComponentOption<Boolean> getCircularOption() {
        return ((ComponentOption<Boolean>) (getOption("circular")));
    }

    @Override
    public S setCircular(Boolean circular) {
        setOption("circular", circular, true);
        setLayoutChildrenCircular(circular);
        return self();
    }

    protected void setLayoutChildrenCircular(Boolean circular) {
    }

    private void setDefaultCircular(Boolean circular) {
        setDefaultOption("circular", circular, true);
        setLayoutChildrenCircular(circular);
    }

    @Override
    public boolean isDraggable() {
        return Boolean.TRUE.equals(getOptionValue("draggable"));
    }

    @Override
    public ComponentOption<Boolean> getDraggableOption() {
        return ((ComponentOption<Boolean>) (getOption("draggable")));
    }

    @Override
    public S setDraggable(Boolean draggable) {
        setOption("draggable", draggable, true);
        setLayoutChildrenDraggable(draggable);
        return self();
    }

    protected void setLayoutChildrenDraggable(Boolean draggable) {
    }

    private void setDefaultDraggable(Boolean draggable) {
        setDefaultOption("draggable", draggable, true);
        setLayoutChildrenDraggable(draggable);
    }

    @Override
    public boolean isAutoplay() {
        return Boolean.TRUE.equals(getOptionValue("autoplay"));
    }

    @Override
    public ComponentOption<Boolean> getAutoplayOption() {
        return ((ComponentOption<Boolean>) (getOption("autoplay")));
    }

    @Override
    public S setAutoplay(Boolean autoplay) {
        setOption("autoplay", autoplay, true);
        setLayoutChildrenAutoplay(autoplay);
        return self();
    }

    protected void setLayoutChildrenAutoplay(Boolean autoplay) {
    }

    private void setDefaultAutoplay(Boolean autoplay) {
        setDefaultOption("autoplay", autoplay, true);
        setLayoutChildrenAutoplay(autoplay);
    }

    @Override
    public Integer getAutoplayInterval() {
        return ((Integer) (getOptionValue("autoplayInterval")));
    }

    @Override
    public ComponentOption<Integer> getAutoplayIntervalOption() {
        return ((ComponentOption<Integer>) (getOption("autoplayInterval")));
    }

    @Override
    public S setAutoplayInterval(Integer autoplayInterval) {
        setOption("autoplayInterval", autoplayInterval, true);
        setLayoutChildrenAutoplayInterval(autoplayInterval);
        return self();
    }

    protected void setLayoutChildrenAutoplayInterval(Integer autoplayInterval) {
    }

    private void setDefaultAutoplayInterval(Integer autoplayInterval) {
        setDefaultOption("autoplayInterval", autoplayInterval, true);
        setLayoutChildrenAutoplayInterval(autoplayInterval);
    }

    @Override
    public boolean isPaused() {
        return Boolean.TRUE.equals(getOptionValue("paused"));
    }

    @Override
    public ComponentOption<Boolean> getPausedOption() {
        return ((ComponentOption<Boolean>) (getOption("paused")));
    }

    @Override
    public S setPaused(Boolean paused) {
        setOption("paused", paused, true);
        setLayoutChildrenPaused(paused);
        return self();
    }

    protected void setLayoutChildrenPaused(Boolean paused) {
    }

    private void setDefaultPaused(Boolean paused) {
        setDefaultOption("paused", paused, true);
        setLayoutChildrenPaused(paused);
    }

    @Override
    public Integer getTransitionMillis() {
        return ((Integer) (getOptionValue("transitionMillis")));
    }

    @Override
    public ComponentOption<Integer> getTransitionMillisOption() {
        return ((ComponentOption<Integer>) (getOption("transitionMillis")));
    }

    @Override
    public S setTransitionMillis(Integer transitionMillis) {
        setOption("transitionMillis", transitionMillis, true);
        setLayoutChildrenTransitionMillis(transitionMillis);
        return self();
    }

    protected void setLayoutChildrenTransitionMillis(Integer transitionMillis) {
    }

    private void setDefaultTransitionMillis(Integer transitionMillis) {
        setDefaultOption("transitionMillis", transitionMillis, true);
        setLayoutChildrenTransitionMillis(transitionMillis);
    }

    @Override
    public boolean isShowNavigation() {
        return Boolean.TRUE.equals(getOptionValue("showNavigation"));
    }

    @Override
    public ComponentOption<Boolean> getShowNavigationOption() {
        return ((ComponentOption<Boolean>) (getOption("showNavigation")));
    }

    @Override
    public S setShowNavigation(Boolean showNavigation) {
        setOption("showNavigation", showNavigation, true);
        setLayoutChildrenShowNavigation(showNavigation);
        return self();
    }

    protected void setLayoutChildrenShowNavigation(Boolean showNavigation) {
    }

    private void setDefaultShowNavigation(Boolean showNavigation) {
        setDefaultOption("showNavigation", showNavigation, true);
        setLayoutChildrenShowNavigation(showNavigation);
    }

    @Override
    public boolean isShowIndicators() {
        return Boolean.TRUE.equals(getOptionValue("showIndicators"));
    }

    @Override
    public ComponentOption<Boolean> getShowIndicatorsOption() {
        return ((ComponentOption<Boolean>) (getOption("showIndicators")));
    }

    @Override
    public S setShowIndicators(Boolean showIndicators) {
        setOption("showIndicators", showIndicators, true);
        setLayoutChildrenShowIndicators(showIndicators);
        return self();
    }

    protected void setLayoutChildrenShowIndicators(Boolean showIndicators) {
    }

    private void setDefaultShowIndicators(Boolean showIndicators) {
        setDefaultOption("showIndicators", showIndicators, true);
        setLayoutChildrenShowIndicators(showIndicators);
    }

    @Override
    public String getActiveDotColor() {
        return ((String) (getOptionValue("activeDotColor")));
    }

    @Override
    public ComponentOption<String> getActiveDotColorOption() {
        return ((ComponentOption<String>) (getOption("activeDotColor")));
    }

    @Override
    public S setActiveDotColor(String activeDotColor) {
        setOption("activeDotColor", activeDotColor, true);
        setLayoutChildrenActiveDotColor(activeDotColor);
        return self();
    }

    protected void setLayoutChildrenActiveDotColor(String activeDotColor) {
    }

    private void setDefaultActiveDotColor(String activeDotColor) {
        setDefaultOption("activeDotColor", activeDotColor, true);
        setLayoutChildrenActiveDotColor(activeDotColor);
    }

    @Override
    public Integer getGap() {
        return ((Integer) (getOptionValue("gap")));
    }

    @Override
    public ComponentOption<Integer> getGapOption() {
        return ((ComponentOption<Integer>) (getOption("gap")));
    }

    @Override
    public S setGap(Integer gap) {
        setOption("gap", gap, true);
        setLayoutChildrenGap(gap);
        return self();
    }

    protected void setLayoutChildrenGap(Integer gap) {
    }

    private void setDefaultGap(Integer gap) {
        setDefaultOption("gap", gap, true);
        setLayoutChildrenGap(gap);
    }

    @Override
    public String getLabel() {
        return ((String) (getOptionValue("label")));
    }

    @Override
    public ComponentOption<String> getLabelOption() {
        return ((ComponentOption<String>) (getOption("label")));
    }

    @Override
    public S setLabel(String label) {
        setOption("label", label, true);
        setLayoutChildrenLabel(label);
        return self();
    }

    protected void setLayoutChildrenLabel(String label) {
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label, true);
        setLayoutChildrenLabel(label);
    }

    @Override
    public String getPreviousLabel() {
        return ((String) (getOptionValue("previousLabel")));
    }

    @Override
    public ComponentOption<String> getPreviousLabelOption() {
        return ((ComponentOption<String>) (getOption("previousLabel")));
    }

    @Override
    public S setPreviousLabel(String previousLabel) {
        setOption("previousLabel", previousLabel, true);
        setLayoutChildrenPreviousLabel(previousLabel);
        return self();
    }

    protected void setLayoutChildrenPreviousLabel(String previousLabel) {
        if (previousButtonOptions == null)
            previousButtonOptions = createDefaultPreviousButtonOptions();

        previousButtonOptions.setLabel(previousLabel);
    }

    private void setDefaultPreviousLabel(String previousLabel) {
        setDefaultOption("previousLabel", previousLabel, true);
        setLayoutChildrenPreviousLabel(previousLabel);
    }

    @Override
    public String getNextLabel() {
        return ((String) (getOptionValue("nextLabel")));
    }

    @Override
    public ComponentOption<String> getNextLabelOption() {
        return ((ComponentOption<String>) (getOption("nextLabel")));
    }

    @Override
    public S setNextLabel(String nextLabel) {
        setOption("nextLabel", nextLabel, true);
        setLayoutChildrenNextLabel(nextLabel);
        return self();
    }

    protected void setLayoutChildrenNextLabel(String nextLabel) {
        if (nextButtonOptions == null)
            nextButtonOptions = createDefaultNextButtonOptions();

        nextButtonOptions.setLabel(nextLabel);
    }

    private void setDefaultNextLabel(String nextLabel) {
        setDefaultOption("nextLabel", nextLabel, true);
        setLayoutChildrenNextLabel(nextLabel);
    }

    @Override
    public String getPlayLabel() {
        return ((String) (getOptionValue("playLabel")));
    }

    @Override
    public ComponentOption<String> getPlayLabelOption() {
        return ((ComponentOption<String>) (getOption("playLabel")));
    }

    @Override
    public S setPlayLabel(String playLabel) {
        setOption("playLabel", playLabel, true);
        setLayoutChildrenPlayLabel(playLabel);
        return self();
    }

    protected void setLayoutChildrenPlayLabel(String playLabel) {
        if (autoplayButtonOptions == null)
            autoplayButtonOptions = createDefaultAutoplayButtonOptions();

        autoplayButtonOptions.setLabel(playLabel);
    }

    private void setDefaultPlayLabel(String playLabel) {
        setDefaultOption("playLabel", playLabel, true);
        setLayoutChildrenPlayLabel(playLabel);
    }

    @Override
    public String getPauseLabel() {
        return ((String) (getOptionValue("pauseLabel")));
    }

    @Override
    public ComponentOption<String> getPauseLabelOption() {
        return ((ComponentOption<String>) (getOption("pauseLabel")));
    }

    @Override
    public S setPauseLabel(String pauseLabel) {
        setOption("pauseLabel", pauseLabel, true);
        setLayoutChildrenPauseLabel(pauseLabel);
        return self();
    }

    protected void setLayoutChildrenPauseLabel(String pauseLabel) {
    }

    private void setDefaultPauseLabel(String pauseLabel) {
        setDefaultOption("pauseLabel", pauseLabel, true);
        setLayoutChildrenPauseLabel(pauseLabel);
    }

    @Override
    public String getPageLabel() {
        return ((String) (getOptionValue("pageLabel")));
    }

    @Override
    public ComponentOption<String> getPageLabelOption() {
        return ((ComponentOption<String>) (getOption("pageLabel")));
    }

    @Override
    public S setPageLabel(String pageLabel) {
        setOption("pageLabel", pageLabel, true);
        setLayoutChildrenPageLabel(pageLabel);
        return self();
    }

    protected void setLayoutChildrenPageLabel(String pageLabel) {
    }

    private void setDefaultPageLabel(String pageLabel) {
        setDefaultOption("pageLabel", pageLabel, true);
        setLayoutChildrenPageLabel(pageLabel);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getViewportOptions() {
        return viewportOptions;
    }

    @Override
    public boolean hasViewportOptions() {
        return viewportOptions != null;
    }

    @Override
    public S setViewportOptions(dev.reuise.core.layout.CoreContainerOptions viewportOptions) {
        if (!hasViewportOptions())
            this.viewportOptions = createDefaultViewportOptions();

        // Merge with default options
        this.viewportOptions.merge(viewportOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getSliderOptions() {
        return sliderOptions;
    }

    @Override
    public boolean hasSliderOptions() {
        return sliderOptions != null;
    }

    @Override
    public S setSliderOptions(dev.reuise.core.layout.CoreContainerOptions sliderOptions) {
        if (!hasSliderOptions())
            this.sliderOptions = createDefaultSliderOptions();

        // Merge with default options
        this.sliderOptions.merge(sliderOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getNavigationOptions() {
        return navigationOptions;
    }

    @Override
    public boolean hasNavigationOptions() {
        return navigationOptions != null;
    }

    @Override
    public S setNavigationOptions(dev.reuise.core.layout.CoreContainerOptions navigationOptions) {
        if (!hasNavigationOptions())
            this.navigationOptions = createDefaultNavigationOptions();

        // Merge with default options
        this.navigationOptions.merge(navigationOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getPreviousButtonOptions() {
        return previousButtonOptions;
    }

    @Override
    public boolean hasPreviousButtonOptions() {
        return previousButtonOptions != null;
    }

    @Override
    public S setPreviousButtonOptions(dev.reuise.core.button.CoreButtonOptions previousButtonOptions) {
        if (!hasPreviousButtonOptions())
            this.previousButtonOptions = createDefaultPreviousButtonOptions();

        // Merge with default options
        this.previousButtonOptions.merge(previousButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getIndicatorsOptions() {
        return indicatorsOptions;
    }

    @Override
    public boolean hasIndicatorsOptions() {
        return indicatorsOptions != null;
    }

    @Override
    public S setIndicatorsOptions(dev.reuise.core.layout.CoreContainerOptions indicatorsOptions) {
        if (!hasIndicatorsOptions())
            this.indicatorsOptions = createDefaultIndicatorsOptions();

        // Merge with default options
        this.indicatorsOptions.merge(indicatorsOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getNextButtonOptions() {
        return nextButtonOptions;
    }

    @Override
    public boolean hasNextButtonOptions() {
        return nextButtonOptions != null;
    }

    @Override
    public S setNextButtonOptions(dev.reuise.core.button.CoreButtonOptions nextButtonOptions) {
        if (!hasNextButtonOptions())
            this.nextButtonOptions = createDefaultNextButtonOptions();

        // Merge with default options
        this.nextButtonOptions.merge(nextButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getAutoplayButtonOptions() {
        return autoplayButtonOptions;
    }

    @Override
    public boolean hasAutoplayButtonOptions() {
        return autoplayButtonOptions != null;
    }

    @Override
    public S setAutoplayButtonOptions(dev.reuise.core.button.CoreButtonOptions autoplayButtonOptions) {
        if (!hasAutoplayButtonOptions())
            this.autoplayButtonOptions = createDefaultAutoplayButtonOptions();

        // Merge with default options
        this.autoplayButtonOptions.merge(autoplayButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreInlineTextOptions getAnnouncementOptions() {
        return announcementOptions;
    }

    @Override
    public boolean hasAnnouncementOptions() {
        return announcementOptions != null;
    }

    @Override
    public S setAnnouncementOptions(dev.reuise.core.text.CoreInlineTextOptions announcementOptions) {
        if (!hasAnnouncementOptions())
            this.announcementOptions = createDefaultAnnouncementOptions();

        // Merge with default options
        this.announcementOptions.merge(announcementOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultViewportOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultSliderOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultNavigationOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultPreviousButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultIndicatorsOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultNextButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultAutoplayButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreInlineTextOptions createDefaultAnnouncementOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
