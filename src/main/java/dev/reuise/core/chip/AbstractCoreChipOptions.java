package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreLabelOptions;
public abstract class AbstractCoreChipOptions<S extends AbstractCoreChipOptions<S>> implements CoreComponentOptions , CoreChipOptions {
    protected dev.reuise.core.icon.CoreIconOptions startIconOptions;

    protected dev.reuise.core.text.CoreLabelOptions labelContainerOptions;

    protected dev.reuise.core.icon.CoreIconOptions endIconOptions;

    protected AbstractCoreChipOptions() {
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
    public String getValue() {
        return ((String) (getOptionValue("value")));
    }

    @Override
    public ComponentOption<String> getValueOption() {
        return ((ComponentOption<String>) (getOption("value")));
    }

    @Override
    public S setValue(String value) {
        setOption("value", value, true);
        setLayoutChildrenValue(value);
        return self();
    }

    protected void setLayoutChildrenValue(String value) {
    }

    private void setDefaultValue(String value) {
        setDefaultOption("value", value, true);
        setLayoutChildrenValue(value);
    }

    @Override
    public ChipSize getSize() {
        return ((ChipSize) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<ChipSize> getSizeOption() {
        return ((ComponentOption<ChipSize>) (getOption("size")));
    }

    @Override
    public S setSize(ChipSize size) {
        setOption("size", size);
        setLayoutChildrenSize(size);
        return self();
    }

    protected void setLayoutChildrenSize(ChipSize size) {
    }

    private void setDefaultSize(ChipSize size) {
        setDefaultOption("size", size);
        setLayoutChildrenSize(size);
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
    public dev.reuise.core.text.CoreLabelOptions getLabelContainerOptions() {
        return labelContainerOptions;
    }

    @Override
    public boolean hasLabelContainerOptions() {
        return labelContainerOptions != null;
    }

    @Override
    public S setLabelContainerOptions(dev.reuise.core.text.CoreLabelOptions labelContainerOptions) {
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

    protected CoreLabelOptions createDefaultLabelContainerOptions() {
        CoreLabelOptions options = getComponentFactory().createLabelOptions();
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