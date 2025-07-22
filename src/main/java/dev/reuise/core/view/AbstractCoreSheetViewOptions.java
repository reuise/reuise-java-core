package dev.reuise.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreSheetViewOptions<S extends AbstractCoreSheetViewOptions<S>> implements CoreSheetViewOptions , CoreComponentOptions {
    @Override
    public S setSize(SheetSize size) {
        setSize(((Object) (size.getSize())));
        setMinSize(((Object) (size.getMinSize())));
        setMaxSize(((Object) (size.getMaxSize())));
        return self();
    }

    protected AbstractCoreSheetViewOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultSize(SheetSize.SMALL);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Object getSize() {
        return ((Object) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<Object> getSizeOption() {
        return ((ComponentOption<Object>) (getOption("size")));
    }

    @Override
    public S setSize(Object size) {
        setOption("size", size);
        return self();
    }

    private void setDefaultSize(Object size) {
        setDefaultOption("size", size);
    }

    @Override
    public Object getMinSize() {
        return ((Object) (getOptionValue("minSize")));
    }

    @Override
    public ComponentOption<Object> getMinSizeOption() {
        return ((ComponentOption<Object>) (getOption("minSize")));
    }

    @Override
    public S setMinSize(Object minSize) {
        setOption("minSize", minSize);
        return self();
    }

    private void setDefaultMinSize(Object minSize) {
        setDefaultOption("minSize", minSize);
    }

    @Override
    public Object getMaxSize() {
        return ((Object) (getOptionValue("maxSize")));
    }

    @Override
    public ComponentOption<Object> getMaxSizeOption() {
        return ((ComponentOption<Object>) (getOption("maxSize")));
    }

    @Override
    public S setMaxSize(Object maxSize) {
        setOption("maxSize", maxSize);
        return self();
    }

    private void setDefaultMaxSize(Object maxSize) {
        setDefaultOption("maxSize", maxSize);
    }

    protected abstract S self();
}