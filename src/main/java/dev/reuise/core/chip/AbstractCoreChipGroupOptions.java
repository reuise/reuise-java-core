package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreChipGroupOptions<S extends AbstractCoreChipGroupOptions<S>> implements CoreComponentOptions , CoreChipGroupOptions {
    protected dev.reuise.core.chip.CoreChipOptions addButtonOptions;

    protected AbstractCoreChipGroupOptions() {
        addButtonOptions = createDefaultAddButtonOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultSelected(new ArrayList<>());
        setDefaultHideUnselected(true);
        setChips(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public List<String> getSelected() {
        return ((List<String>) (getOptionValue("selected")));
    }

    @Override
    public ComponentOption<List<String>> getSelectedOption() {
        return ((ComponentOption<List<String>>) (getOption("selected")));
    }

    @Override
    public S setSelected(List<String> selected) {
        setOption("selected", selected);
        return self();
    }

    @Override
    public boolean hasSelected(String selected) {
        List<String> list = getSelected();
        if (list == null) {
            return false;
        }
        return list.contains(selected);
    }

    private void setDefaultSelected(List<String> selected) {
        setDefaultOption("selected", selected);
    }

    @Override
    public boolean isHideUnselected() {
        return Boolean.TRUE.equals(getOptionValue("hideUnselected"));
    }

    @Override
    public ComponentOption<Boolean> getHideUnselectedOption() {
        return ((ComponentOption<Boolean>) (getOption("hideUnselected")));
    }

    @Override
    public S setHideUnselected(Boolean hideUnselected) {
        setOption("hideUnselected", hideUnselected);
        setLayoutChildrenHideUnselected(hideUnselected);
        return self();
    }

    protected void setLayoutChildrenHideUnselected(Boolean hideUnselected) {
    }

    private void setDefaultHideUnselected(Boolean hideUnselected) {
        setDefaultOption("hideUnselected", hideUnselected);
        setLayoutChildrenHideUnselected(hideUnselected);
    }

    @Override
    public List<CoreChip> getChips() {
        return ((List<CoreChip>) (getOptionValue("chips")));
    }

    @Override
    public ComponentOption<List<CoreChip>> getChipsOption() {
        return ((ComponentOption<List<CoreChip>>) (getOption("chips")));
    }

    @Override
    public S setChips(List<CoreChip> chips) {
        setOption("chips", chips, true);
        return self();
    }

    @Override
    public S addChip(CoreChip chip) {
        List<CoreChip> list = getChips();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setChips(list);
        }
        list.add(chip);
        return self();
    }

    @Override
    public S removeChip(CoreChip chip) {
        List<CoreChip> list = getChips();
        if (list == null) {
            return self();
        }
        list.remove(chip);
        return self();
    }

    private void setDefaultChips(List<CoreChip> chips) {
        setDefaultOption("chips", chips, true);
    }

    @Override
    public dev.reuise.core.chip.CoreChipOptions getAddButtonOptions() {
        return addButtonOptions;
    }

    @Override
    public boolean hasAddButtonOptions() {
        return addButtonOptions != null;
    }

    @Override
    public S setAddButtonOptions(dev.reuise.core.chip.CoreChipOptions addButtonOptions) {
        if (!hasAddButtonOptions())
            this.addButtonOptions = createDefaultAddButtonOptions();

        // Merge with default options
        this.addButtonOptions.merge(addButtonOptions);
        return self();
    }

    protected CoreChipOptions createDefaultAddButtonOptions() {
        CoreChipOptions options = getComponentFactory().createChipOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}