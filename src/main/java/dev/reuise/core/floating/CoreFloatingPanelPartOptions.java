package dev.reuise.core.floating;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreFloatingPanelPartOptions {
    String getTitle();

    ComponentOption<String> getTitleOption();

    CoreFloatingPanelPartOptions setTitle(String title);

    String getCloseLabel();

    ComponentOption<String> getCloseLabelOption();

    CoreFloatingPanelPartOptions setCloseLabel(String closeLabel);

    String getMinimiseLabel();

    ComponentOption<String> getMinimiseLabelOption();

    CoreFloatingPanelPartOptions setMinimiseLabel(String minimiseLabel);

    boolean isExpanded();

    ComponentOption<Boolean> getExpandedOption();

    CoreFloatingPanelPartOptions setExpanded(Boolean expanded);

    boolean isMinimised();

    ComponentOption<Boolean> getMinimisedOption();

    CoreFloatingPanelPartOptions setMinimised(Boolean minimised);

    boolean isDocked();

    ComponentOption<Boolean> getDockedOption();

    CoreFloatingPanelPartOptions setDocked(Boolean docked);

    String getCorner();

    ComponentOption<String> getCornerOption();

    CoreFloatingPanelPartOptions setCorner(String corner);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreFloatingActionButtonOptions getTriggerOptions();

    CoreFloatingPanelPartOptions setTriggerOptions(CoreFloatingActionButtonOptions triggerOptions);

    boolean hasTriggerOptions();

    ComponentCreator<? extends CoreFloatingActionButton, ? extends CoreFloatingActionButtonOptions> getTriggerCreator();

    CoreContainerOptions getPanelOptions();

    CoreFloatingPanelPartOptions setPanelOptions(CoreContainerOptions panelOptions);

    boolean hasPanelOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getPanelCreator();

    CoreContainerOptions getHeaderOptions();

    CoreFloatingPanelPartOptions setHeaderOptions(CoreContainerOptions headerOptions);

    boolean hasHeaderOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getHeaderCreator();

    CoreInlineTextOptions getTitleContainerOptions();

    CoreFloatingPanelPartOptions setTitleContainerOptions(CoreInlineTextOptions titleContainerOptions);

    boolean hasTitleContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getTitleContainerCreator();

    CoreButtonOptions getMinimiseButtonOptions();

    CoreFloatingPanelPartOptions setMinimiseButtonOptions(CoreButtonOptions minimiseButtonOptions);

    boolean hasMinimiseButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getMinimiseButtonCreator();

    CoreButtonOptions getCloseButtonOptions();

    CoreFloatingPanelPartOptions setCloseButtonOptions(CoreButtonOptions closeButtonOptions);

    boolean hasCloseButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getCloseButtonCreator();

    CoreContainerOptions getContentOptions();

    CoreFloatingPanelPartOptions setContentOptions(CoreContainerOptions contentOptions);

    boolean hasContentOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContentCreator();

    CoreComponentFactory getComponentFactory();

    CoreFloatingPanel getComponent();
}
