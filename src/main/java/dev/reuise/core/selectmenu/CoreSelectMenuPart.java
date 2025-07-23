package dev.reuise.core.selectmenu;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.input.CoreTextField;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.list.CoreListItem;
import dev.reuise.core.menu.CoreMenu;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
// Placeholder here??
// Label here??
// Autocomplete here??
// ReadOnly here??
// Size here??
public interface CoreSelectMenuPart extends ComponentPart , CoreParentComponentPart , CoreSelectMenuFeatures {
    String getPlaceholder();

    CoreSelectMenuPart setPlaceholder(String placeholder);

    String getLabel();

    CoreSelectMenuPart setLabel(String label);

    String getAutocomplete();

    CoreSelectMenuPart setAutocomplete(String autocomplete);

    CoreSelectMenuPart setAutocomplete(boolean autocomplete);

    boolean isReadOnly();

    CoreSelectMenuPart setReadOnly(Boolean readOnly);

    TextFieldSize getSize();

    CoreSelectMenuPart setSize(TextFieldSize size);

    CoreSelectMenuPart addItem(CoreListItem item);

    CoreSelectMenuPart addItem(String text);

    CoreTextField getTextField();

    CoreMenu getMenu();

    CoreParentComponentPart getParentComponentPart();
}