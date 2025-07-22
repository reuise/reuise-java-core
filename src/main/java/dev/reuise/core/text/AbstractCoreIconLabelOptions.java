package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreIconLabelOptions<S extends AbstractCoreIconLabelOptions<S>> implements CoreComponentOptions , CoreIconLabelOptions {
    protected dev.reuise.core.link.CoreLinkOptions linkOptions;

    protected dev.reuise.core.icon.CoreIconOptions startIconOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions;

    protected dev.reuise.core.icon.CoreIconOptions endIconOptions;

    protected AbstractCoreIconLabelOptions() {
        labelContainerOptions = createDefaultLabelContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getText() {
        return ((String) (getOptionValue("text")));
    }

    @Override
    public ComponentOption<String> getTextOption() {
        return ((ComponentOption<String>) (getOption("text")));
    }

    @Override
    public S setText(String text) {
        setOption("text", text);
        setLayoutChildrenText(text);
        return self();
    }

    protected void setLayoutChildrenText(String text) {
        if (labelContainerOptions == null)
            labelContainerOptions = createDefaultLabelContainerOptions();

        labelContainerOptions.setText(text);
    }

    private void setDefaultText(String text) {
        setDefaultOption("text", text);
        setLayoutChildrenText(text);
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
    public dev.reuise.core.icon.CoreIconOptions getStartIconOptions() {
        return startIconOptions;
    }

    @Override
    public boolean hasStartIconOptions() {
        return startIconOptions != null;
    }

    @Override
    public S setStartIconOptions(dev.reuise.core.icon.CoreIconOptions startIconOptions) {
        if (!hasStartIconOptions())
            this.startIconOptions = createDefaultStartIconOptions();

        // Merge with default options
        this.startIconOptions.merge(startIconOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreInlineTextOptions getLabelContainerOptions() {
        return labelContainerOptions;
    }

    @Override
    public boolean hasLabelContainerOptions() {
        return labelContainerOptions != null;
    }

    @Override
    public S setLabelContainerOptions(dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions) {
        if (!hasLabelContainerOptions())
            this.labelContainerOptions = createDefaultLabelContainerOptions();

        // Merge with default options
        this.labelContainerOptions.merge(labelContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getEndIconOptions() {
        return endIconOptions;
    }

    @Override
    public boolean hasEndIconOptions() {
        return endIconOptions != null;
    }

    @Override
    public S setEndIconOptions(dev.reuise.core.icon.CoreIconOptions endIconOptions) {
        if (!hasEndIconOptions())
            this.endIconOptions = createDefaultEndIconOptions();

        // Merge with default options
        this.endIconOptions.merge(endIconOptions);
        return self();
    }

    protected CoreLinkOptions createDefaultLinkOptions() {
        CoreLinkOptions options = getComponentFactory().createLinkOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreIconOptions createDefaultStartIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreInlineTextOptions createDefaultLabelContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreIconOptions createDefaultEndIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected abstract S self();
}