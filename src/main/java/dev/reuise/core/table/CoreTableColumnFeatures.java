package dev.reuise.core.table;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.menu.CoreMenuOptions;
public interface CoreTableColumnFeatures {
    String getLabel();

    CoreTableColumnFeatures setLabel(String label);

    CoreMenuOptions getMenuOptions();

    CoreTableColumnFeatures setMenuOptions(CoreMenuOptions menuOptions);

    boolean isHasMenuButton();

    CoreTableColumnFeatures setHasMenuButton(Boolean hasMenuButton);

    CoreIconButtonOptions getMenuButtonOptions();

    CoreTableColumnFeatures setMenuButtonOptions(CoreIconButtonOptions menuButtonOptions);
}