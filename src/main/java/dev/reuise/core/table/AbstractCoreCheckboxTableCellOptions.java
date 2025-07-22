package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreCheckboxTableCellOptions<S extends AbstractCoreCheckboxTableCellOptions<S>> implements CoreComponentOptions , CoreCheckboxTableCellOptions {
    protected dev.reuise.core.checkbox.CoreCheckboxOptions checkboxOptions;

    protected AbstractCoreCheckboxTableCellOptions() {
        checkboxOptions = createDefaultCheckboxOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
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
        if (checkboxOptions == null)
            checkboxOptions = createDefaultCheckboxOptions();

        checkboxOptions.setLabel(label);
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
        setLayoutChildrenLabel(label);
    }

    @Override
    public dev.reuise.core.checkbox.CoreCheckboxOptions getCheckboxOptions() {
        return checkboxOptions;
    }

    @Override
    public boolean hasCheckboxOptions() {
        return checkboxOptions != null;
    }

    @Override
    public S setCheckboxOptions(dev.reuise.core.checkbox.CoreCheckboxOptions checkboxOptions) {
        if (!hasCheckboxOptions())
            this.checkboxOptions = createDefaultCheckboxOptions();

        // Merge with default options
        this.checkboxOptions.merge(checkboxOptions);
        return self();
    }

    protected CoreCheckboxOptions createDefaultCheckboxOptions() {
        CoreCheckboxOptions options = getComponentFactory().createCheckboxOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}