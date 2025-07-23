package dev.reuise.core.chip;
import java.util.List;
public interface CoreChipGroupFeatures {
    List<String> getSelected();

    CoreChipGroupFeatures setSelected(List<String> selected);

    boolean hasSelected(String selected);

    boolean isHideUnselected();

    CoreChipGroupFeatures setHideUnselected(Boolean hideUnselected);

    List<CoreChip> getChips();

    CoreChipGroupFeatures setChips(List<CoreChip> chips);

    CoreChipGroupFeatures addChip(CoreChip chip);

    CoreChipGroupFeatures removeChip(CoreChip chip);
}