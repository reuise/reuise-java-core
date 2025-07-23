package dev.reuise.core.chip;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreFieldSetPart;
public interface CoreChipGroupPart extends ComponentPart , CoreChipGroupFeatures , CoreFieldSetPart {
    void removeLastChip();

    void clear();

    CoreChip getAddButton();

    CoreFieldSetPart getFieldSetPart();
}