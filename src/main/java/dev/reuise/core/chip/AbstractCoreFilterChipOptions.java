package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreLabelPartOptions;
public abstract class AbstractCoreFilterChipOptions<S extends AbstractCoreFilterChipOptions<S>> implements CoreFilterChipOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreIconPartOptions startIconOptions;

    // Indirect layout child
    private CoreLabelPartOptions labelContainerOptions;

    // Indirect layout child
    private CoreIconPartOptions endIconOptions;

    protected AbstractCoreFilterChipOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        startIconOptions = getStartIconOptions();
        labelContainerOptions = getLabelContainerOptions();
        endIconOptions = getEndIconOptions();
        setDefaultHasCheckIcon(true);
        setDefaultHasRemoveIcon(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isSelected() {
        return Boolean.TRUE.equals(getOptionValue("selected"));
    }

    @Override
    public ComponentOption<Boolean> getSelectedOption() {
        return ((ComponentOption<Boolean>) (getOption("selected")));
    }

    @Override
    public S setSelected(Boolean selected) {
        setOption("selected", selected);
        return self();
    }

    private void setDefaultSelected(Boolean selected) {
        setDefaultOption("selected", selected);
    }

    @Override
    public boolean isHasCheckIcon() {
        return Boolean.TRUE.equals(getOptionValue("hasCheckIcon"));
    }

    @Override
    public ComponentOption<Boolean> getHasCheckIconOption() {
        return ((ComponentOption<Boolean>) (getOption("hasCheckIcon")));
    }

    @Override
    public S setHasCheckIcon(Boolean hasCheckIcon) {
        setOption("hasCheckIcon", hasCheckIcon);
        return self();
    }

    private void setDefaultHasCheckIcon(Boolean hasCheckIcon) {
        setDefaultOption("hasCheckIcon", hasCheckIcon);
    }

    @Override
    public boolean isHasRemoveIcon() {
        return Boolean.TRUE.equals(getOptionValue("hasRemoveIcon"));
    }

    @Override
    public ComponentOption<Boolean> getHasRemoveIconOption() {
        return ((ComponentOption<Boolean>) (getOption("hasRemoveIcon")));
    }

    @Override
    public S setHasRemoveIcon(Boolean hasRemoveIcon) {
        setOption("hasRemoveIcon", hasRemoveIcon);
        return self();
    }

    private void setDefaultHasRemoveIcon(Boolean hasRemoveIcon) {
        setDefaultOption("hasRemoveIcon", hasRemoveIcon);
    }

    protected abstract S self();
}