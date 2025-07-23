package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.chip.CoreChipGroup;
public interface CoreChipFieldPart extends ComponentPart , CoreTextFieldPart , CoreChipFieldFeatures {
    CoreChipGroup getChipGroup();

    CoreTextFieldPart getTextFieldPart();
}