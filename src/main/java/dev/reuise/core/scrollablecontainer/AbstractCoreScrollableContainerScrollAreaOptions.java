package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreScrollableContainerScrollAreaOptions<S extends AbstractCoreScrollableContainerScrollAreaOptions<S>> implements CoreScrollableContainerScrollAreaOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions scrollAreaTopFadeOptions;

    protected dev.reuise.core.layout.CoreContainerOptions scrollAreaLeftFadeOptions;

    protected dev.reuise.core.layout.CoreContainerOptions scrollAreaContentOptions;

    protected dev.reuise.core.layout.CoreContainerOptions scrollAreaBottomFadeOptions;

    protected dev.reuise.core.layout.CoreContainerOptions scrollAreaRightFadeOptions;

    protected AbstractCoreScrollableContainerScrollAreaOptions() {
        scrollAreaTopFadeOptions = createDefaultScrollAreaTopFadeOptions();
        scrollAreaLeftFadeOptions = createDefaultScrollAreaLeftFadeOptions();
        scrollAreaContentOptions = createDefaultScrollAreaContentOptions();
        scrollAreaBottomFadeOptions = createDefaultScrollAreaBottomFadeOptions();
        scrollAreaRightFadeOptions = createDefaultScrollAreaRightFadeOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultScrollDirection(ScrollDirection.VERTICAL);
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
        setOption("scrollDirection", scrollDirection);
        setLayoutChildrenScrollDirection(scrollDirection);
        return self();
    }

    protected void setLayoutChildrenScrollDirection(ScrollDirection scrollDirection) {
    }

    private void setDefaultScrollDirection(ScrollDirection scrollDirection) {
        setDefaultOption("scrollDirection", scrollDirection);
        setLayoutChildrenScrollDirection(scrollDirection);
    }

    @Override
    public ScrollableContainerFadeOptions getFadeOptions() {
        return ((ScrollableContainerFadeOptions) (getOptionValue("fadeOptions")));
    }

    @Override
    public ComponentOption<ScrollableContainerFadeOptions> getFadeOptionsOption() {
        return ((ComponentOption<ScrollableContainerFadeOptions>) (getOption("fadeOptions")));
    }

    @Override
    public S setFadeOptions(ScrollableContainerFadeOptions fadeOptions) {
        setOption("fadeOptions", fadeOptions);
        setLayoutChildrenFadeOptions(fadeOptions);
        return self();
    }

    protected void setLayoutChildrenFadeOptions(ScrollableContainerFadeOptions fadeOptions) {
    }

    private void setDefaultFadeOptions(ScrollableContainerFadeOptions fadeOptions) {
        setDefaultOption("fadeOptions", fadeOptions);
        setLayoutChildrenFadeOptions(fadeOptions);
    }

    @Override
    public Integer getBorderRadius() {
        return ((Integer) (getOptionValue("borderRadius")));
    }

    @Override
    public ComponentOption<Integer> getBorderRadiusOption() {
        return ((ComponentOption<Integer>) (getOption("borderRadius")));
    }

    @Override
    public S setBorderRadius(Integer borderRadius) {
        setOption("borderRadius", borderRadius);
        setLayoutChildrenBorderRadius(borderRadius);
        return self();
    }

    protected void setLayoutChildrenBorderRadius(Integer borderRadius) {
    }

    private void setDefaultBorderRadius(Integer borderRadius) {
        setDefaultOption("borderRadius", borderRadius);
        setLayoutChildrenBorderRadius(borderRadius);
    }

    @Override
    public String getFillColor() {
        return ((String) (getOptionValue("fillColor")));
    }

    @Override
    public ComponentOption<String> getFillColorOption() {
        return ((ComponentOption<String>) (getOption("fillColor")));
    }

    @Override
    public S setFillColor(String fillColor) {
        setOption("fillColor", fillColor);
        setLayoutChildrenFillColor(fillColor);
        return self();
    }

    protected void setLayoutChildrenFillColor(String fillColor) {
    }

    private void setDefaultFillColor(String fillColor) {
        setDefaultOption("fillColor", fillColor);
        setLayoutChildrenFillColor(fillColor);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrollAreaTopFadeOptions() {
        return scrollAreaTopFadeOptions;
    }

    @Override
    public boolean hasScrollAreaTopFadeOptions() {
        return scrollAreaTopFadeOptions != null;
    }

    @Override
    public S setScrollAreaTopFadeOptions(dev.reuise.core.layout.CoreContainerOptions scrollAreaTopFadeOptions) {
        if (!hasScrollAreaTopFadeOptions())
            this.scrollAreaTopFadeOptions = createDefaultScrollAreaTopFadeOptions();

        // Merge with default options
        this.scrollAreaTopFadeOptions.merge(scrollAreaTopFadeOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrollAreaLeftFadeOptions() {
        return scrollAreaLeftFadeOptions;
    }

    @Override
    public boolean hasScrollAreaLeftFadeOptions() {
        return scrollAreaLeftFadeOptions != null;
    }

    @Override
    public S setScrollAreaLeftFadeOptions(dev.reuise.core.layout.CoreContainerOptions scrollAreaLeftFadeOptions) {
        if (!hasScrollAreaLeftFadeOptions())
            this.scrollAreaLeftFadeOptions = createDefaultScrollAreaLeftFadeOptions();

        // Merge with default options
        this.scrollAreaLeftFadeOptions.merge(scrollAreaLeftFadeOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrollAreaContentOptions() {
        return scrollAreaContentOptions;
    }

    @Override
    public boolean hasScrollAreaContentOptions() {
        return scrollAreaContentOptions != null;
    }

    @Override
    public S setScrollAreaContentOptions(dev.reuise.core.layout.CoreContainerOptions scrollAreaContentOptions) {
        if (!hasScrollAreaContentOptions())
            this.scrollAreaContentOptions = createDefaultScrollAreaContentOptions();

        // Merge with default options
        this.scrollAreaContentOptions.merge(scrollAreaContentOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrollAreaBottomFadeOptions() {
        return scrollAreaBottomFadeOptions;
    }

    @Override
    public boolean hasScrollAreaBottomFadeOptions() {
        return scrollAreaBottomFadeOptions != null;
    }

    @Override
    public S setScrollAreaBottomFadeOptions(dev.reuise.core.layout.CoreContainerOptions scrollAreaBottomFadeOptions) {
        if (!hasScrollAreaBottomFadeOptions())
            this.scrollAreaBottomFadeOptions = createDefaultScrollAreaBottomFadeOptions();

        // Merge with default options
        this.scrollAreaBottomFadeOptions.merge(scrollAreaBottomFadeOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrollAreaRightFadeOptions() {
        return scrollAreaRightFadeOptions;
    }

    @Override
    public boolean hasScrollAreaRightFadeOptions() {
        return scrollAreaRightFadeOptions != null;
    }

    @Override
    public S setScrollAreaRightFadeOptions(dev.reuise.core.layout.CoreContainerOptions scrollAreaRightFadeOptions) {
        if (!hasScrollAreaRightFadeOptions())
            this.scrollAreaRightFadeOptions = createDefaultScrollAreaRightFadeOptions();

        // Merge with default options
        this.scrollAreaRightFadeOptions.merge(scrollAreaRightFadeOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultScrollAreaTopFadeOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultScrollAreaLeftFadeOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultScrollAreaContentOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultScrollAreaBottomFadeOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultScrollAreaRightFadeOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}