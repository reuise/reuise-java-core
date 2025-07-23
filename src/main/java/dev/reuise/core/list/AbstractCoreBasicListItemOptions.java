package dev.reuise.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreBasicListItemOptions<S extends AbstractCoreBasicListItemOptions<S>> implements CoreBasicListItemOptions , CoreComponentOptions {
    protected dev.reuise.core.link.CoreLinkOptions linkOptions;

    protected AbstractCoreBasicListItemOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
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
        if (linkOptions == null)
            linkOptions = createDefaultLinkOptions();

        linkOptions.setUrl(url);
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
        setLayoutChildrenUrl(url);
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getLinkOptions() {
        return linkOptions;
    }

    @Override
    public boolean hasLinkOptions() {
        return linkOptions != null;
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getOrCreateLinkOptions() {
        if (!hasLinkOptions())
            linkOptions = createDefaultLinkOptions();

        return linkOptions;
    }

    @Override
    public S setLinkOptions(dev.reuise.core.link.CoreLinkOptions linkOptions) {
        if (!hasLinkOptions())
            this.linkOptions = createDefaultLinkOptions();

        // Merge with default options
        this.linkOptions.merge(linkOptions);
        return self();
    }

    protected CoreLinkOptions createDefaultLinkOptions() {
        CoreLinkOptions options = getComponentFactory().createLinkOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected abstract S self();
}