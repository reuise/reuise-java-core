package dev.reuise.core.chip;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreFieldSet;
public interface CoreChipGroup extends CoreComponent , CoreFieldSet , CoreChipGroupPart {
    CoreChipGroup getComponent();
}