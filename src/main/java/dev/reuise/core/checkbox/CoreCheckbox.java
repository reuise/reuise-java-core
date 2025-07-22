package dev.reuise.core.checkbox;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreCheckbox extends CoreComponent , CoreParentComponent , CoreCheckboxPart {
    CoreCheckbox getComponent();
}