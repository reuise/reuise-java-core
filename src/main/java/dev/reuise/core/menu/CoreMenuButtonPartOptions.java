package dev.reuise.core.menu;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreMenuButtonPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreMenuButtonPartOptions setLabel(String label);

    boolean isExpanded();

    ComponentOption<Boolean> getExpandedOption();

    CoreMenuButtonPartOptions setExpanded(Boolean expanded);

    boolean isActionMenu();

    ComponentOption<Boolean> getActionMenuOption();

    CoreMenuButtonPartOptions setActionMenu(Boolean actionMenu);

    boolean isShowChevron();

    ComponentOption<Boolean> getShowChevronOption();

    CoreMenuButtonPartOptions setShowChevron(Boolean showChevron);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreButtonOptions getTriggerOptions();

    CoreMenuButtonPartOptions setTriggerOptions(CoreButtonOptions triggerOptions);

    boolean hasTriggerOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getTriggerCreator();

    CoreContainerOptions getPopupOptions();

    CoreMenuButtonPartOptions setPopupOptions(CoreContainerOptions popupOptions);

    boolean hasPopupOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getPopupCreator();

    CoreComponentFactory getComponentFactory();

    CoreMenuButton getComponent();
}
