package dev.reuise.core.menu;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.list.CoreListItem;
public interface CoreMenuItem extends CoreComponent , CoreMenuItemPart , CoreListItem {
    CoreMenuItem getComponent();
}