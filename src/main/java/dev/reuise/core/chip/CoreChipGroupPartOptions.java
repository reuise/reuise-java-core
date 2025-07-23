package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreChipGroupPartOptions {
    List<String> getSelected();

    ComponentOption<List<String>> getSelectedOption();

    CoreChipGroupPartOptions setSelected(List<String> selected);

    boolean hasSelected(String selected);

    boolean isHideUnselected();

    ComponentOption<Boolean> getHideUnselectedOption();

    CoreChipGroupPartOptions setHideUnselected(Boolean hideUnselected);

    List<CoreChip> getChips();

    ComponentOption<List<CoreChip>> getChipsOption();

    CoreChipGroupPartOptions setChips(List<CoreChip> chips);

    CoreChipGroupPartOptions addChip(CoreChip chip);

    CoreChipGroupPartOptions removeChip(CoreChip chip);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreChipOptions getAddButtonOptions();

    CoreChipGroupPartOptions setAddButtonOptions(CoreChipOptions addButtonOptions);

    boolean hasAddButtonOptions();

    ComponentCreator<? extends CoreChip, ? extends CoreChipOptions> getAddButtonCreator();

    CoreComponentFactory getComponentFactory();

    CoreChipGroup getComponent();
}