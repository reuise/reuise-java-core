package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreScrollableContainerOptions<S extends AbstractCoreScrollableContainerOptions<S>> implements CoreComponentOptions , CoreScrollableContainerOptions {
    protected dev.reuise.core.layout.CoreContainerOptions scrollAreaBeforeOptions;

    protected dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions scrollAreaOptions;

    protected dev.reuise.core.layout.CoreContainerOptions scrollAreaAfterOptions;

    protected AbstractCoreScrollableContainerOptions() {
        scrollAreaBeforeOptions = createDefaultScrollAreaBeforeOptions();
        scrollAreaOptions = createDefaultScrollAreaOptions();
        scrollAreaAfterOptions = createDefaultScrollAreaAfterOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultScrollDirection(ScrollDirection.VERTICAL);
        setDefaultShowScrollBars(true);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public ScrollDirection getScrollDirection() {
        return ((ScrollDirection) (getOptionValue("scrollDirection")));
    }

    @Override
    public ComponentOption<ScrollDirection> getScrollDirectionOption() {
        return ((ComponentOption<ScrollDirection>) (getOption("scrollDirection")));
    }

    @Override
    public S setScrollDirection(ScrollDirection scrollDirection) {
        setOption("scrollDirection", scrollDirection, true);
        setLayoutChildrenScrollDirection(scrollDirection);
        return self();
    }

    protected void setLayoutChildrenScrollDirection(ScrollDirection scrollDirection) {
        if (scrollAreaOptions == null)
            scrollAreaOptions = createDefaultScrollAreaOptions();

        scrollAreaOptions.setScrollDirection(scrollDirection);
    }

    private void setDefaultScrollDirection(ScrollDirection scrollDirection) {
        setDefaultOption("scrollDirection", scrollDirection, true);
        setLayoutChildrenScrollDirection(scrollDirection);
    }

    @Override
    public boolean isShowScrollBars() {
        return Boolean.TRUE.equals(getOptionValue("showScrollBars"));
    }

    @Override
    public ComponentOption<Boolean> getShowScrollBarsOption() {
        return ((ComponentOption<Boolean>) (getOption("showScrollBars")));
    }

    @Override
    public S setShowScrollBars(Boolean showScrollBars) {
        setOption("showScrollBars", showScrollBars);
        setLayoutChildrenShowScrollBars(showScrollBars);
        return self();
    }

    protected void setLayoutChildrenShowScrollBars(Boolean showScrollBars) {
    }

    private void setDefaultShowScrollBars(Boolean showScrollBars) {
        setDefaultOption("showScrollBars", showScrollBars);
        setLayoutChildrenShowScrollBars(showScrollBars);
    }

    @Override
    public ScrollableContainerFadeOptions getScrollAreaFadeOptions() {
        return ((ScrollableContainerFadeOptions) (getOptionValue("scrollAreaFadeOptions")));
    }

    @Override
    public ComponentOption<ScrollableContainerFadeOptions> getScrollAreaFadeOptionsOption() {
        return ((ComponentOption<ScrollableContainerFadeOptions>) (getOption("scrollAreaFadeOptions")));
    }

    @Override
    public S setScrollAreaFadeOptions(ScrollableContainerFadeOptions scrollAreaFadeOptions) {
        setOption("scrollAreaFadeOptions", scrollAreaFadeOptions);
        setLayoutChildrenScrollAreaFadeOptions(scrollAreaFadeOptions);
        return self();
    }

    protected void setLayoutChildrenScrollAreaFadeOptions(ScrollableContainerFadeOptions scrollAreaFadeOptions) {
        if (scrollAreaOptions == null)
            scrollAreaOptions = createDefaultScrollAreaOptions();

        scrollAreaOptions.setFadeOptions(scrollAreaFadeOptions);
    }

    private void setDefaultScrollAreaFadeOptions(ScrollableContainerFadeOptions scrollAreaFadeOptions) {
        setDefaultOption("scrollAreaFadeOptions", scrollAreaFadeOptions);
        setLayoutChildrenScrollAreaFadeOptions(scrollAreaFadeOptions);
    }

    @Override
    public Integer getScrollAreaBorderRadius() {
        return ((Integer) (getOptionValue("scrollAreaBorderRadius")));
    }

    @Override
    public ComponentOption<Integer> getScrollAreaBorderRadiusOption() {
        return ((ComponentOption<Integer>) (getOption("scrollAreaBorderRadius")));
    }

    @Override
    public S setScrollAreaBorderRadius(Integer scrollAreaBorderRadius) {
        setOption("scrollAreaBorderRadius", scrollAreaBorderRadius);
        setLayoutChildrenScrollAreaBorderRadius(scrollAreaBorderRadius);
        return self();
    }

    protected void setLayoutChildrenScrollAreaBorderRadius(Integer scrollAreaBorderRadius) {
        if (scrollAreaOptions == null)
            scrollAreaOptions = createDefaultScrollAreaOptions();

        scrollAreaOptions.setBorderRadius(scrollAreaBorderRadius);
    }

    private void setDefaultScrollAreaBorderRadius(Integer scrollAreaBorderRadius) {
        setDefaultOption("scrollAreaBorderRadius", scrollAreaBorderRadius);
        setLayoutChildrenScrollAreaBorderRadius(scrollAreaBorderRadius);
    }

    @Override
    public String getScrollAreaFillColor() {
        return ((String) (getOptionValue("scrollAreaFillColor")));
    }

    @Override
    public ComponentOption<String> getScrollAreaFillColorOption() {
        return ((ComponentOption<String>) (getOption("scrollAreaFillColor")));
    }

    @Override
    public S setScrollAreaFillColor(String scrollAreaFillColor) {
        setOption("scrollAreaFillColor", scrollAreaFillColor);
        setLayoutChildrenScrollAreaFillColor(scrollAreaFillColor);
        return self();
    }

    protected void setLayoutChildrenScrollAreaFillColor(String scrollAreaFillColor) {
        if (scrollAreaOptions == null)
            scrollAreaOptions = createDefaultScrollAreaOptions();

        scrollAreaOptions.setFillColor(scrollAreaFillColor);
    }

    private void setDefaultScrollAreaFillColor(String scrollAreaFillColor) {
        setDefaultOption("scrollAreaFillColor", scrollAreaFillColor);
        setLayoutChildrenScrollAreaFillColor(scrollAreaFillColor);
    }

    @Override
    public ScrollableContainerScrollButtonOptions getScrollButtonOptions() {
        return ((ScrollableContainerScrollButtonOptions) (getOptionValue("scrollButtonOptions")));
    }

    @Override
    public ComponentOption<ScrollableContainerScrollButtonOptions> getScrollButtonOptionsOption() {
        return ((ComponentOption<ScrollableContainerScrollButtonOptions>) (getOption("scrollButtonOptions")));
    }

    @Override
    public S setScrollButtonOptions(ScrollableContainerScrollButtonOptions scrollButtonOptions) {
        setOption("scrollButtonOptions", scrollButtonOptions);
        setLayoutChildrenScrollButtonOptions(scrollButtonOptions);
        return self();
    }

    protected void setLayoutChildrenScrollButtonOptions(ScrollableContainerScrollButtonOptions scrollButtonOptions) {
    }

    private void setDefaultScrollButtonOptions(ScrollableContainerScrollButtonOptions scrollButtonOptions) {
        setDefaultOption("scrollButtonOptions", scrollButtonOptions);
        setLayoutChildrenScrollButtonOptions(scrollButtonOptions);
    }

    @Override
    public ScrollableContainerScrollBehavior getScrollBehavior() {
        return ((ScrollableContainerScrollBehavior) (getOptionValue("scrollBehavior")));
    }

    @Override
    public ComponentOption<ScrollableContainerScrollBehavior> getScrollBehaviorOption() {
        return ((ComponentOption<ScrollableContainerScrollBehavior>) (getOption("scrollBehavior")));
    }

    @Override
    public S setScrollBehavior(ScrollableContainerScrollBehavior scrollBehavior) {
        setOption("scrollBehavior", scrollBehavior);
        setLayoutChildrenScrollBehavior(scrollBehavior);
        return self();
    }

    protected void setLayoutChildrenScrollBehavior(ScrollableContainerScrollBehavior scrollBehavior) {
    }

    private void setDefaultScrollBehavior(ScrollableContainerScrollBehavior scrollBehavior) {
        setDefaultOption("scrollBehavior", scrollBehavior);
        setLayoutChildrenScrollBehavior(scrollBehavior);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrollAreaBeforeOptions() {
        return scrollAreaBeforeOptions;
    }

    @Override
    public boolean hasScrollAreaBeforeOptions() {
        return scrollAreaBeforeOptions != null;
    }

    @Override
    public S setScrollAreaBeforeOptions(dev.reuise.core.layout.CoreContainerOptions scrollAreaBeforeOptions) {
        if (!hasScrollAreaBeforeOptions())
            this.scrollAreaBeforeOptions = createDefaultScrollAreaBeforeOptions();

        // Merge with default options
        this.scrollAreaBeforeOptions.merge(scrollAreaBeforeOptions);
        return self();
    }

    @Override
    public dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions getScrollAreaOptions() {
        return scrollAreaOptions;
    }

    @Override
    public boolean hasScrollAreaOptions() {
        return scrollAreaOptions != null;
    }

    @Override
    public S setScrollAreaOptions(dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions scrollAreaOptions) {
        if (!hasScrollAreaOptions())
            this.scrollAreaOptions = createDefaultScrollAreaOptions();

        // Merge with default options
        this.scrollAreaOptions.merge(scrollAreaOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrollAreaAfterOptions() {
        return scrollAreaAfterOptions;
    }

    @Override
    public boolean hasScrollAreaAfterOptions() {
        return scrollAreaAfterOptions != null;
    }

    @Override
    public S setScrollAreaAfterOptions(dev.reuise.core.layout.CoreContainerOptions scrollAreaAfterOptions) {
        if (!hasScrollAreaAfterOptions())
            this.scrollAreaAfterOptions = createDefaultScrollAreaAfterOptions();

        // Merge with default options
        this.scrollAreaAfterOptions.merge(scrollAreaAfterOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultScrollAreaBeforeOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreScrollableContainerScrollAreaOptions createDefaultScrollAreaOptions() {
        CoreScrollableContainerScrollAreaOptions options = getComponentFactory().createScrollableContainerScrollAreaOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultScrollAreaAfterOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}