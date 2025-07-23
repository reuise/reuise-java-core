package dev.reuise.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.icon.IconSize;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreIconButtonOptions<S extends AbstractCoreIconButtonOptions<S>> implements CoreComponentOptions , CoreIconButtonOptions {
    @Override
    public S setSize(IconSize size) {
        if (size == null)
            return self();

        setSize(size.getSize());
        return self();
    }

    protected dev.reuise.core.icon.CoreIconOptions iconOptions;

    protected AbstractCoreIconButtonOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultSize(IconSize.SMALL);
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
        setLayoutChildrenSize(size);
        return self();
    }

    protected void setLayoutChildrenSize(Object size) {
    }

    private void setDefaultSize(Object size) {
        setDefaultOption("size", size);
        setLayoutChildrenSize(size);
    }

    @Override
    public String getUrl() {
        return ((String) (getOptionValue("url")));
    }

    @Override
    public ComponentOption<String> getUrlOption() {
        return ((ComponentOption<String>) (getOption("url")));
    }

    @Override
    public S setUrl(String url) {
        setOption("url", url);
        setLayoutChildrenUrl(url);
        return self();
    }

    protected void setLayoutChildrenUrl(String url) {
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
        setLayoutChildrenUrl(url);
    }

    @Override
    public String getTarget() {
        return ((String) (getOptionValue("target")));
    }

    @Override
    public ComponentOption<String> getTargetOption() {
        return ((ComponentOption<String>) (getOption("target")));
    }

    @Override
    public S setTarget(String target) {
        setOption("target", target);
        setLayoutChildrenTarget(target);
        return self();
    }

    protected void setLayoutChildrenTarget(String target) {
    }

    private void setDefaultTarget(String target) {
        setDefaultOption("target", target);
        setLayoutChildrenTarget(target);
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getIconOptions() {
        return iconOptions;
    }

    @Override
    public boolean hasIconOptions() {
        return iconOptions != null;
    }

    @Override
    public S setIconOptions(dev.reuise.core.icon.CoreIconOptions iconOptions) {
        if (!hasIconOptions())
            this.iconOptions = createDefaultIconOptions();

        // Merge with default options
        this.iconOptions.merge(iconOptions);
        return self();
    }

    protected CoreIconOptions createDefaultIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected abstract S self();
}