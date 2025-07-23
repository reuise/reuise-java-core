package dev.reuise.core.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreLabelOptions;
public abstract class AbstractCoreCheckboxOptions<S extends AbstractCoreCheckboxOptions<S>> implements CoreCheckboxOptions , CoreComponentOptions {
    protected dev.reuise.core.checkbox.CoreBasicCheckboxOptions checkboxOptions;

    protected dev.reuise.core.text.CoreLabelOptions labelContainerOptions;

    protected AbstractCoreCheckboxOptions() {
        checkboxOptions = createDefaultCheckboxOptions();
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
    public CheckboxSize getSize() {
        return checkboxOptions.getSize();
    }

    @Override
    public S setSize(CheckboxSize size) {
        this.checkboxOptions.setSize(size);
        return self();
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
    public boolean isChecked() {
        return Boolean.TRUE.equals(getOptionValue("checked"));
    }

    @Override
    public ComponentOption<Boolean> getCheckedOption() {
        return ((ComponentOption<Boolean>) (getOption("checked")));
    }

    @Override
    public S setChecked(Boolean checked) {
        setOption("checked", checked);
        setLayoutChildrenChecked(checked);
        return self();
    }

    protected void setLayoutChildrenChecked(Boolean checked) {
        if (checkboxOptions == null)
            checkboxOptions = createDefaultCheckboxOptions();

        checkboxOptions.setChecked(checked);
    }

    private void setDefaultChecked(Boolean checked) {
        setDefaultOption("checked", checked);
        setLayoutChildrenChecked(checked);
    }

    @Override
    public dev.reuise.core.checkbox.CoreBasicCheckboxOptions getCheckboxOptions() {
        return checkboxOptions;
    }

    @Override
    public boolean hasCheckboxOptions() {
        return checkboxOptions != null;
    }

    @Override
    public S setCheckboxOptions(dev.reuise.core.checkbox.CoreBasicCheckboxOptions checkboxOptions) {
        if (!hasCheckboxOptions())
            this.checkboxOptions = createDefaultCheckboxOptions();

        // Merge with default options
        this.checkboxOptions.merge(checkboxOptions);
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

    protected CoreBasicCheckboxOptions createDefaultCheckboxOptions() {
        CoreBasicCheckboxOptions options = getComponentFactory().createBasicCheckboxOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreLabelOptions createDefaultLabelContainerOptions() {
        CoreLabelOptions options = getComponentFactory().createLabelOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}