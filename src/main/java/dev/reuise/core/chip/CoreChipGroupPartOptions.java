package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
import java.util.function.Function;
public interface CoreChipGroupPartOptions {
    List<String> getSelected();

    ComponentOption<List<String>> getSelectedOption();

    CoreChipGroupPartOptions setSelected(List<String> selected);

    CoreChipGroupPartOptions clearSelected();

    boolean hasSelected(String selected);

    boolean isHideUnselected();

    ComponentOption<Boolean> getHideUnselectedOption();

    CoreChipGroupPartOptions setHideUnselected(Boolean hideUnselected);

    List<CoreChip> getChips();

    ComponentOption<List<CoreChip>> getChipsOption();

    CoreChipGroupPartOptions setChips(List<CoreChip> chips);

    <T> CoreChipGroupPartOptions setChips(List<T> data, Function<T, CoreChip> mapper);

    CoreChipGroupPartOptions addChip(CoreChip chip);

    CoreChipGroupPartOptions removeChip(CoreChip chip);

    CoreChipGroupPartOptions clearChips();

    List<Object> getChipData();

    Function<Object, CoreChip> getChipDataMapper();

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
