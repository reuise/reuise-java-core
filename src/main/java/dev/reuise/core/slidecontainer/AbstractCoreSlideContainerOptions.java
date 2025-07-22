package dev.reuise.core.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreSlideContainerOptions<S extends AbstractCoreSlideContainerOptions<S>> implements CoreSlideContainerOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions slideAreaBeforeOptions;

    protected dev.reuise.core.layout.CoreContainerOptions slideAreaOptions;

    protected dev.reuise.core.layout.CoreContainerOptions slideAreaAfterOptions;

    protected AbstractCoreSlideContainerOptions() {
        slideAreaBeforeOptions = createDefaultSlideAreaBeforeOptions();
        slideAreaOptions = createDefaultSlideAreaOptions();
        slideAreaAfterOptions = createDefaultSlideAreaAfterOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultSlideDirection(SlideDirection.VERTICAL);
        setDefaultShowSlideBars(true);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public SlideDirection getSlideDirection() {
        return ((SlideDirection) (getOptionValue("slideDirection")));
    }

    @Override
    public ComponentOption<SlideDirection> getSlideDirectionOption() {
        return ((ComponentOption<SlideDirection>) (getOption("slideDirection")));
    }

    @Override
    public S setSlideDirection(SlideDirection slideDirection) {
        setOption("slideDirection", slideDirection);
        setLayoutChildrenSlideDirection(slideDirection);
        return self();
    }

    protected void setLayoutChildrenSlideDirection(SlideDirection slideDirection) {
    }

    private void setDefaultSlideDirection(SlideDirection slideDirection) {
        setDefaultOption("slideDirection", slideDirection);
        setLayoutChildrenSlideDirection(slideDirection);
    }

    @Override
    public boolean isShowSlideBars() {
        return Boolean.TRUE.equals(getOptionValue("showSlideBars"));
    }

    @Override
    public ComponentOption<Boolean> getShowSlideBarsOption() {
        return ((ComponentOption<Boolean>) (getOption("showSlideBars")));
    }

    @Override
    public S setShowSlideBars(Boolean showSlideBars) {
        setOption("showSlideBars", showSlideBars);
        setLayoutChildrenShowSlideBars(showSlideBars);
        return self();
    }

    protected void setLayoutChildrenShowSlideBars(Boolean showSlideBars) {
    }

    private void setDefaultShowSlideBars(Boolean showSlideBars) {
        setDefaultOption("showSlideBars", showSlideBars);
        setLayoutChildrenShowSlideBars(showSlideBars);
    }

    @Override
    public SlideContainerSlideButtonOptions getSlideButtonOptions() {
        return ((SlideContainerSlideButtonOptions) (getOptionValue("slideButtonOptions")));
    }

    @Override
    public ComponentOption<SlideContainerSlideButtonOptions> getSlideButtonOptionsOption() {
        return ((ComponentOption<SlideContainerSlideButtonOptions>) (getOption("slideButtonOptions")));
    }

    @Override
    public S setSlideButtonOptions(SlideContainerSlideButtonOptions slideButtonOptions) {
        setOption("slideButtonOptions", slideButtonOptions);
        setLayoutChildrenSlideButtonOptions(slideButtonOptions);
        return self();
    }

    protected void setLayoutChildrenSlideButtonOptions(SlideContainerSlideButtonOptions slideButtonOptions) {
    }

    private void setDefaultSlideButtonOptions(SlideContainerSlideButtonOptions slideButtonOptions) {
        setDefaultOption("slideButtonOptions", slideButtonOptions);
        setLayoutChildrenSlideButtonOptions(slideButtonOptions);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getSlideAreaBeforeOptions() {
        return slideAreaBeforeOptions;
    }

    @Override
    public boolean hasSlideAreaBeforeOptions() {
        return slideAreaBeforeOptions != null;
    }

    @Override
    public S setSlideAreaBeforeOptions(dev.reuise.core.layout.CoreContainerOptions slideAreaBeforeOptions) {
        if (!hasSlideAreaBeforeOptions())
            this.slideAreaBeforeOptions = createDefaultSlideAreaBeforeOptions();

        // Merge with default options
        this.slideAreaBeforeOptions.merge(slideAreaBeforeOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getSlideAreaOptions() {
        return slideAreaOptions;
    }

    @Override
    public boolean hasSlideAreaOptions() {
        return slideAreaOptions != null;
    }

    @Override
    public S setSlideAreaOptions(dev.reuise.core.layout.CoreContainerOptions slideAreaOptions) {
        if (!hasSlideAreaOptions())
            this.slideAreaOptions = createDefaultSlideAreaOptions();

        // Merge with default options
        this.slideAreaOptions.merge(slideAreaOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getSlideAreaAfterOptions() {
        return slideAreaAfterOptions;
    }

    @Override
    public boolean hasSlideAreaAfterOptions() {
        return slideAreaAfterOptions != null;
    }

    @Override
    public S setSlideAreaAfterOptions(dev.reuise.core.layout.CoreContainerOptions slideAreaAfterOptions) {
        if (!hasSlideAreaAfterOptions())
            this.slideAreaAfterOptions = createDefaultSlideAreaAfterOptions();

        // Merge with default options
        this.slideAreaAfterOptions.merge(slideAreaAfterOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultSlideAreaBeforeOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultSlideAreaOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultSlideAreaAfterOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}