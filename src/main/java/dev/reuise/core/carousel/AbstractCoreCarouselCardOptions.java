package dev.reuise.core.carousel;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreCarouselCardOptions<S extends AbstractCoreCarouselCardOptions<S>> implements CoreCarouselCardOptions , CoreComponentOptions {
    protected AbstractCoreCarouselCardOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultAutoSize(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isAutoSize() {
        return Boolean.TRUE.equals(getOptionValue("autoSize"));
    }

    @Override
    public ComponentOption<Boolean> getAutoSizeOption() {
        return ((ComponentOption<Boolean>) (getOption("autoSize")));
    }

    @Override
    public S setAutoSize(Boolean autoSize) {
        setOption("autoSize", autoSize, true);
        return self();
    }

    private void setDefaultAutoSize(Boolean autoSize) {
        setDefaultOption("autoSize", autoSize, true);
    }

    protected abstract S self();
}
