package dev.reuise.core.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreLinkOptions<S extends AbstractCoreLinkOptions<S>> implements CoreComponentOptions , CoreLinkOptions {
    protected dev.reuise.core.icon.CoreIconOptions startIconOptions;

    protected dev.reuise.core.icon.CoreIconOptions endIconOptions;

    protected AbstractCoreLinkOptions() {
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
    }

    private void setDefaultText(String text) {
        setDefaultOption("text", text);
        setLayoutChildrenText(text);
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
    public String getExternalIndicator() {
        return ((String) (getOptionValue("externalIndicator")));
    }

    @Override
    public ComponentOption<String> getExternalIndicatorOption() {
        return ((ComponentOption<String>) (getOption("externalIndicator")));
    }

    @Override
    public S setExternalIndicator(String externalIndicator) {
        setOption("externalIndicator", externalIndicator, true);
        setLayoutChildrenExternalIndicator(externalIndicator);
        return self();
    }

    protected void setLayoutChildrenExternalIndicator(String externalIndicator) {
    }

    private void setDefaultExternalIndicator(String externalIndicator) {
        setDefaultOption("externalIndicator", externalIndicator, true);
        setLayoutChildrenExternalIndicator(externalIndicator);
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

    protected CoreIconOptions createDefaultStartIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreIconOptions createDefaultEndIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected abstract S self();
}
