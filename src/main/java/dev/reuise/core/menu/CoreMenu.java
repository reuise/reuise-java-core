package dev.reuise.core.menu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreMenu extends CoreComponent , CoreParentComponent , CoreMenuPart {
    CoreMenu getComponent();
}