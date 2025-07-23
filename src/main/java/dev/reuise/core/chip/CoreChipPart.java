package dev.reuise.core.chip;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreLabel;
public interface CoreChipPart extends ComponentPart , CoreParentComponentPart , CoreChipFeatures {
    CoreIcon getStartIcon();

    CoreLabel getLabelContainer();

    CoreIcon getEndIcon();

    CoreParentComponentPart getParentComponentPart();
}