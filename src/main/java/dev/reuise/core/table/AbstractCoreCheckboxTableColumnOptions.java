package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
public abstract class AbstractCoreCheckboxTableColumnOptions<S extends AbstractCoreCheckboxTableColumnOptions<S>> implements CoreCheckboxTableColumnOptions , CoreComponentOptions {
    protected dev.reuise.core.checkbox.CoreCheckboxOptions checkboxOptions;

    protected AbstractCoreCheckboxTableColumnOptions() {
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
        return checkboxOptions.isChecked();
    }

    @Override
    public S setChecked(Boolean checked) {
        this.checkboxOptions.setChecked(checked);
        return self();
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