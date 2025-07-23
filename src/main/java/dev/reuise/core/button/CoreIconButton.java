package dev.reuise.core.button;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreIconButton extends CoreComponent , CoreParentComponent , CoreIconButtonPart {
    CoreIconButton getComponent();
}