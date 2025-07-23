package dev.reuise.core.table;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.option.ComponentOption;
public interface CoreTableColumnPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreTableColumnPartOptions setLabel(String label);

    CoreMenuOptions getMenuOptions();

    ComponentOption<CoreMenuOptions> getMenuOptionsOption();

    CoreTableColumnPartOptions setMenuOptions(CoreMenuOptions menuOptions);

    boolean isHasMenuButton();

    ComponentOption<Boolean> getHasMenuButtonOption();

    CoreTableColumnPartOptions setHasMenuButton(Boolean hasMenuButton);

    CoreIconButtonOptions getMenuButtonOptions();

    ComponentOption<CoreIconButtonOptions> getMenuButtonOptionsOption();

    CoreTableColumnPartOptions setMenuButtonOptions(CoreIconButtonOptions menuButtonOptions);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreTableColumn getComponent();
}