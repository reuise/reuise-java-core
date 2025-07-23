package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.menu.CoreMenu;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
public interface CoreTableHeaderCellPart extends ComponentPart , CoreParentComponentPart , CoreTableHeaderCellFeatures {
    CoreInlineText getLabelContainer();

    CoreMenu getMenu();

    CoreIconButton getMenuButton();

    CoreParentComponentPart getParentComponentPart();
}