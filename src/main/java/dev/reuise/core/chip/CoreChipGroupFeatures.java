package dev.reuise.core.chip;
import java.util.List;
import java.util.function.Function;
public interface CoreChipGroupFeatures {
    List<String> getSelected();

    CoreChipGroupFeatures setSelected(List<String> selected);

    CoreChipGroupFeatures clearSelected();

    boolean hasSelected(String selected);

    boolean isHideUnselected();

    CoreChipGroupFeatures setHideUnselected(Boolean hideUnselected);

    List<CoreChip> getChips();

    CoreChipGroupFeatures setChips(List<CoreChip> chips);

    <T> CoreChipGroupFeatures setChips(List<T> data, Function<T, CoreChip> mapper);

    CoreChipGroupFeatures addChip(CoreChip chip);

    CoreChipGroupFeatures removeChip(CoreChip chip);

    CoreChipGroupFeatures clearChips();

    List<Object> getChipData();

    Function<Object, CoreChip> getChipDataMapper();
}
