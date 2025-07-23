package dev.reuise.core.menu;
import dev.reuise.core.ComponentPart;
public interface CoreMenuDividerPart extends ComponentPart , CoreMenuItemPart , CoreMenuDividerFeatures {
    CoreMenuItemPart getMenuItemPart();
}