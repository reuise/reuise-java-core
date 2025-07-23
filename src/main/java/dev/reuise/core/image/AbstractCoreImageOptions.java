package dev.reuise.core.image;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreImageOptions<S extends AbstractCoreImageOptions<S>> implements CoreImageOptions , CoreComponentOptions {
    protected dev.reuise.core.link.CoreLinkOptions linkOptions;

    protected AbstractCoreImageOptions() {
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
        return self();
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
    }

    @Override
    public SpriteOptions getSpriteOptions() {
        return ((SpriteOptions) (getOptionValue("spriteOptions")));
    }

    @Override
    public ComponentOption<SpriteOptions> getSpriteOptionsOption() {
        return ((ComponentOption<SpriteOptions>) (getOption("spriteOptions")));
    }

    @Override
    public S setSpriteOptions(SpriteOptions spriteOptions) {
        setOption("spriteOptions", spriteOptions);
        return self();
    }

    private void setDefaultSpriteOptions(SpriteOptions spriteOptions) {
        setDefaultOption("spriteOptions", spriteOptions);
    }

    @Override
    public String getLinkUrl() {
        return ((String) (getOptionValue("linkUrl")));
    }

    @Override
    public ComponentOption<String> getLinkUrlOption() {
        return ((ComponentOption<String>) (getOption("linkUrl")));
    }

    @Override
    public S setLinkUrl(String linkUrl) {
        setOption("linkUrl", linkUrl);
        return self();
    }

    private void setDefaultLinkUrl(String linkUrl) {
        setDefaultOption("linkUrl", linkUrl);
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