package dev.reuise.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
public abstract class AbstractCoreButtonOptions<S extends AbstractCoreButtonOptions<S>> implements CoreButtonOptions , CoreComponentOptions {
    protected dev.reuise.core.icon.CoreIconOptions startIconOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions;

    protected dev.reuise.core.icon.CoreIconOptions endIconOptions;

    protected AbstractCoreButtonOptions() {
        labelContainerOptions = createDefaultLabelContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultSize(ButtonSize.MEDIUM);
        setDefaultType(ButtonType.SECONDARY);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getLabel() {
        return ((String) (getOptionValue("label")));
    }

    @Override
    public ComponentOption<String> getLabelOption() {
        return ((ComponentOption<String>) (getOption("label")));
    }

    @Override
    public S setLabel(String label) {
        setOption("label", label);
        setLayoutChildrenLabel(label);
        return self();
    }

    protected void setLayoutChildrenLabel(String label) {
        if (labelContainerOptions == null)
            labelContainerOptions = createDefaultLabelContainerOptions();

        labelContainerOptions.setText(label);
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
        setLayoutChildrenLabel(label);
    }

    @Override
    public ButtonSize getSize() {
        return ((ButtonSize) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<ButtonSize> getSizeOption() {
        return ((ComponentOption<ButtonSize>) (getOption("size")));
    }

    @Override
    public S setSize(ButtonSize size) {
        setOption("size", size);
        setLayoutChildrenSize(size);
        return self();
    }

    protected void setLayoutChildrenSize(ButtonSize size) {
    }

    private void setDefaultSize(ButtonSize size) {
        setDefaultOption("size", size);
        setLayoutChildrenSize(size);
    }

    @Override
    public ButtonType getType() {
        return ((ButtonType) (getOptionValue("type")));
    }

    @Override
    public ComponentOption<ButtonType> getTypeOption() {
        return ((ComponentOption<ButtonType>) (getOption("type")));
    }

    @Override
    public S setType(ButtonType type) {
        setOption("type", type);
        setLayoutChildrenType(type);
        return self();
    }

    protected void setLayoutChildrenType(ButtonType type) {
    }

    private void setDefaultType(ButtonType type) {
        setDefaultOption("type", type);
        setLayoutChildrenType(type);
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