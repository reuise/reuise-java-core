package dev.reuise.core.menu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreMenuButton extends CoreComponent , CoreContainer , CoreMenuButtonPart {
    CoreMenuButton getComponent();
}
