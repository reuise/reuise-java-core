package dev.reuise.core.topappbar;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import java.util.List;
public interface CoreTopAppBarFeatures {
    boolean isFixed();

    CoreTopAppBarFeatures setFixed(Boolean fixed);

    CoreTopAppBarFeatures setFixed(Boolean fixed, State state);

    CoreTopAppBarFeatures setFixedAllStates(Boolean fixed);

    CoreTopAppBarFeatures setFixed(ScreenSizeValues<Boolean> fixed);

    boolean isFixed(State state);

    boolean isHasNavigationButton();

    CoreTopAppBarFeatures setHasNavigationButton(Boolean hasNavigationButton);

    CoreTopAppBarFeatures setHasNavigationButton(Boolean hasNavigationButton, State state);

    CoreTopAppBarFeatures setHasNavigationButtonAllStates(Boolean hasNavigationButton);

    CoreTopAppBarFeatures setHasNavigationButton(ScreenSizeValues<Boolean> hasNavigationButton);

    boolean isHasNavigationButton(State state);

    List<CoreButton> getActions();

    CoreTopAppBarFeatures setActions(List<CoreButton> actions);

    CoreTopAppBarFeatures addAction(CoreButton action);

    CoreTopAppBarFeatures removeAction(CoreButton action);
}