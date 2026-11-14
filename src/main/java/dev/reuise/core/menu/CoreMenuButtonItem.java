package dev.reuise.core.menu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.button.CoreButton;
public interface CoreMenuButtonItem extends CoreComponent , CoreButton , CoreMenuButtonItemPart {
    CoreMenuButtonItem getComponent();
}
