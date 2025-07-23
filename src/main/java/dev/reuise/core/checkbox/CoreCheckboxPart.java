package dev.reuise.core.checkbox;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreLabel;
// Size here??
public interface CoreCheckboxPart extends ComponentPart , CoreCheckboxFeatures , CoreParentComponentPart {
    CheckboxSize getSize();

    CoreCheckboxPart setSize(CheckboxSize size);

    void toggle();

    CoreBasicCheckbox getCheckbox();

    CoreLabel getLabelContainer();

    CoreParentComponentPart getParentComponentPart();
}