package dev.reuise.core.selectmenu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreSelectMenu extends CoreComponent , CoreParentComponent , CoreSelectMenuPart {
    CoreSelectMenu getComponent();
}