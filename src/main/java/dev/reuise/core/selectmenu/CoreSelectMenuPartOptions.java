package dev.reuise.core.selectmenu;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.input.CoreTextField;
import dev.reuise.core.input.CoreTextFieldOptions;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.menu.CoreMenu;
import dev.reuise.core.menu.CoreMenuItem;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
// Placeholder here??
// Label here??
// Autocomplete here??
// ReadOnly here??
// Size here??
public interface CoreSelectMenuPartOptions {
    List<CoreMenuItem> getItems();

    ComponentOption<List<CoreMenuItem>> getItemsOption();

    CoreSelectMenuPartOptions setItems(List<CoreMenuItem> items);

    CoreSelectMenuPartOptions addItem(CoreMenuItem item);

    CoreSelectMenuPartOptions setItem(CoreMenuItem item);

    CoreSelectMenuPartOptions removeItem(CoreMenuItem item);

    String getPlaceholder();

    CoreSelectMenuPartOptions setPlaceholder(String placeholder);

    String getLabel();

    CoreSelectMenuPartOptions setLabel(String label);

    String getAutocomplete();

    CoreSelectMenuPartOptions setAutocomplete(String autocomplete);

    CoreSelectMenuPartOptions setAutocomplete(boolean autocomplete);

    boolean isReadOnly();

    CoreSelectMenuPartOptions setReadOnly(Boolean readOnly);

    TextFieldSize getSize();

    CoreSelectMenuPartOptions setSize(TextFieldSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreTextFieldOptions getTextFieldOptions();

    CoreSelectMenuPartOptions setTextFieldOptions(CoreTextFieldOptions textFieldOptions);

    boolean hasTextFieldOptions();

    ComponentCreator<? extends CoreTextField, ? extends CoreTextFieldOptions> getTextFieldCreator();

    CoreMenuOptions getMenuOptions();

    CoreSelectMenuPartOptions setMenuOptions(CoreMenuOptions menuOptions);

    boolean hasMenuOptions();

    ComponentCreator<? extends CoreMenu, ? extends CoreMenuOptions> getMenuCreator();

    CoreComponentFactory getComponentFactory();

    CoreSelectMenu getComponent();
}