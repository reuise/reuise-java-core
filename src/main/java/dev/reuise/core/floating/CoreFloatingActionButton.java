package dev.reuise.core.floating;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.button.CoreButton;
public interface CoreFloatingActionButton extends CoreComponent , CoreButton , CoreFloatingActionButtonPart {
    CoreFloatingActionButton getComponent();
}
