package dev.reuise.core.button;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreButton extends CoreComponent , CoreParentComponent , CoreButtonPart {
    CoreButton getComponent();
}