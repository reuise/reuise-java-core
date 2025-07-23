package dev.reuise.core.icon;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreIconOptions<S extends AbstractCoreIconOptions<S>> implements CoreIconOptions , CoreComponentOptions {
    protected dev.reuise.core.link.CoreLinkOptions linkOptions;

    protected dev.reuise.core.image.CoreImageOptions imageOptions;

    protected AbstractCoreIconOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Integer getSize() {
        return ((Integer) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<Integer> getSizeOption() {
        return ((ComponentOption<Integer>) (getOption("size")));
    }

    @Override
    public S setSize(Integer size) {
        setOption("size", size);
        setLayoutChildrenSize(size);
        return self();
    }

    protected void setLayoutChildrenSize(Integer size) {
    }

    private void setDefaultSize(Integer size) {
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
        if (imageOptions == null)
            imageOptions = createDefaultImageOptions();

        imageOptions.setUrl(url);
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
        setLayoutChildrenUrl(url);
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
        setLayoutChildrenLinkUrl(linkUrl);
        return self();
    }

    protected void setLayoutChildrenLinkUrl(String linkUrl) {
        if (linkOptions == null)
            linkOptions = createDefaultLinkOptions();

        linkOptions.setUrl(linkUrl);
    }

    private void setDefaultLinkUrl(String linkUrl) {
        setDefaultOption("linkUrl", linkUrl);
        setLayoutChildrenLinkUrl(linkUrl);
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

    @Override
    public dev.reuise.core.image.CoreImageOptions getImageOptions() {
        return imageOptions;
    }

    @Override
    public boolean hasImageOptions() {
        return imageOptions != null;
    }

    @Override
    public dev.reuise.core.image.CoreImageOptions getOrCreateImageOptions() {
        if (!hasImageOptions())
            imageOptions = createDefaultImageOptions();

        return imageOptions;
    }

    @Override
    public S setImageOptions(dev.reuise.core.image.CoreImageOptions imageOptions) {
        if (!hasImageOptions())
            this.imageOptions = createDefaultImageOptions();

        // Merge with default options
        this.imageOptions.merge(imageOptions);
        return self();
    }

    protected CoreLinkOptions createDefaultLinkOptions() {
        CoreLinkOptions options = getComponentFactory().createLinkOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreImageOptions createDefaultImageOptions() {
        CoreImageOptions options = getComponentFactory().createImageOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected abstract S self();
}