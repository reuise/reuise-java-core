package dev.reuise.core.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreBasicCheckboxOptions<S extends AbstractCoreBasicCheckboxOptions<S>> implements CoreComponentOptions , CoreBasicCheckboxOptions {
    protected AbstractCoreBasicCheckboxOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultSize(CheckboxSize.MEDIUM);
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
        return self();
    }

    private void setDefaultChecked(Boolean checked) {
        setDefaultOption("checked", checked);
    }

    @Override
    public CheckboxSize getSize() {
        return ((CheckboxSize) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<CheckboxSize> getSizeOption() {
        return ((ComponentOption<CheckboxSize>) (getOption("size")));
    }

    @Override
    public S setSize(CheckboxSize size) {
        setOption("size", size);
        return self();
    }

    private void setDefaultSize(CheckboxSize size) {
        setDefaultOption("size", size);
    }

    protected abstract S self();
}