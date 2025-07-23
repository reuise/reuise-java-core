package dev.reuise.core.table;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.menu.CoreMenu;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreTableHeaderCellPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreTableHeaderCellPartOptions setLabel(String label);

    boolean isHasMenuButton();

    ComponentOption<Boolean> getHasMenuButtonOption();

    CoreTableHeaderCellPartOptions setHasMenuButton(Boolean hasMenuButton);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreInlineTextOptions getLabelContainerOptions();

    CoreTableHeaderCellPartOptions setLabelContainerOptions(CoreInlineTextOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getLabelContainerCreator();

    CoreMenuOptions getMenuOptions();

    CoreTableHeaderCellPartOptions setMenuOptions(CoreMenuOptions menuOptions);

    boolean hasMenuOptions();

    ComponentCreator<? extends CoreMenu, ? extends CoreMenuOptions> getMenuCreator();

    CoreIconButtonOptions getMenuButtonOptions();

    CoreTableHeaderCellPartOptions setMenuButtonOptions(CoreIconButtonOptions menuButtonOptions);

    boolean hasMenuButtonOptions();

    ComponentCreator<? extends CoreIconButton, ? extends CoreIconButtonOptions> getMenuButtonCreator();

    CoreComponentFactory getComponentFactory();

    CoreTableHeaderCell getComponent();
}