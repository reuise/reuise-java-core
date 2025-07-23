package dev.reuise.core.chip;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreChip extends CoreComponent , CoreParentComponent , CoreChipPart {
    CoreChip getComponent();
}