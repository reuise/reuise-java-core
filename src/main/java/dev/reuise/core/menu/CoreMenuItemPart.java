package dev.reuise.core.menu;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.list.CoreListItemPart;
public interface CoreMenuItemPart extends ComponentPart , CoreMenuItemFeatures , CoreListItemPart {
    CoreListItemPart getListItemPart();
}