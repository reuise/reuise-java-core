package dev.reuise.core.topappbar;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
import java.util.List;
public interface CoreTopAppBarPartOptions {
    boolean isFixed();

    ComponentOption<Boolean> getFixedOption();

    CoreTopAppBarPartOptions setFixed(Boolean fixed);

    CoreTopAppBarPartOptions setFixed(Boolean fixed, State state);

    CoreTopAppBarPartOptions setFixedAllStates(Boolean fixed);

    CoreTopAppBarPartOptions setFixed(ScreenSizeValues<Boolean> fixed);

    boolean isFixed(State state);

    ComponentOption<Boolean> getFixedOption(State state);

    Collection<State> getFixedStates();

    boolean isFixedAnyState();

    boolean isHasNavigationButton();

    ComponentOption<Boolean> getHasNavigationButtonOption();

    CoreTopAppBarPartOptions setHasNavigationButton(Boolean hasNavigationButton);

    CoreTopAppBarPartOptions setHasNavigationButton(Boolean hasNavigationButton, State state);

    CoreTopAppBarPartOptions setHasNavigationButtonAllStates(Boolean hasNavigationButton);

    CoreTopAppBarPartOptions setHasNavigationButton(ScreenSizeValues<Boolean> hasNavigationButton);

    boolean isHasNavigationButton(State state);

    ComponentOption<Boolean> getHasNavigationButtonOption(State state);

    Collection<State> getHasNavigationButtonStates();

    boolean isHasNavigationButtonAnyState();

    List<CoreButton> getActions();

    ComponentOption<List<CoreButton>> getActionsOption();

    CoreTopAppBarPartOptions setActions(List<CoreButton> actions);

    CoreTopAppBarPartOptions addAction(CoreButton action);

    CoreTopAppBarPartOptions removeAction(CoreButton action);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getContainerOptions();

    CoreTopAppBarPartOptions setContainerOptions(CoreContainerOptions containerOptions);

    boolean hasContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContainerCreator();

    CoreIconButtonOptions getNavigationButtonOptions();

    CoreIconButtonOptions getOrCreateNavigationButtonOptions();

    CoreTopAppBarPartOptions setNavigationButtonOptions(CoreIconButtonOptions navigationButtonOptions);

    boolean hasNavigationButtonOptions();

    ComponentCreator<? extends CoreIconButton, ? extends CoreIconButtonOptions> getNavigationButtonCreator();

    CoreContainerOptions getTitleContainerOptions();

    CoreTopAppBarPartOptions setTitleContainerOptions(CoreContainerOptions titleContainerOptions);

    boolean hasTitleContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getTitleContainerCreator();

    CoreContainerOptions getActionsContainerOptions();

    CoreTopAppBarPartOptions setActionsContainerOptions(CoreContainerOptions actionsContainerOptions);

    boolean hasActionsContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getActionsContainerCreator();

    CoreComponentFactory getComponentFactory();

    CoreTopAppBar getComponent();
}