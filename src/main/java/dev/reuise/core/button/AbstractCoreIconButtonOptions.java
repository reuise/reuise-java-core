package dev.reuise.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.icon.IconSize;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreIconButtonOptions<S extends AbstractCoreIconButtonOptions<S>> implements CoreComponentOptions , CoreIconButtonOptions {
    protected dev.reuise.core.icon.CoreIconOptions iconOptions;

    protected AbstractCoreIconButtonOptions() {
        iconOptions = createDefaultIconOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Object getSize() {
        return iconOptions.getSize();
    }

    @Override
    public S setSize(Object size) {
        this.iconOptions.setSize(size);
        return self();
    }

    // Implementation
    @Override
    public S setSize(IconSize size) {
        if (size == null)
            return self();

        setSize(size.getSize());
        return self();
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
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}