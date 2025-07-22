package dev.reuise.core.drawer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.applayout.CoreAppLayout;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreDrawerPartOptions {
    boolean isResizable();

    ComponentOption<Boolean> getResizableOption();

    CoreDrawerPartOptions setResizable(Boolean resizable);

    Object getMinSize();

    ComponentOption<Object> getMinSizeOption();

    CoreDrawerPartOptions setMinSize(Object minSize);

    CoreDrawerPartOptions setMinSize(Object minSize, State state);

    CoreDrawerPartOptions setMinSizeAllStates(Object minSize);

    CoreDrawerPartOptions setMinSize(ScreenSizeValues<Object> minSize);

    Object getMinSize(State state);

    ComponentOption<Object> getMinSizeOption(State state);

    Collection<State> getMinSizeStates();

    Object getMaxSize();

    ComponentOption<Object> getMaxSizeOption();

    CoreDrawerPartOptions setMaxSize(Object maxSize);

    CoreDrawerPartOptions setMaxSize(Object maxSize, State state);

    CoreDrawerPartOptions setMaxSizeAllStates(Object maxSize);

    CoreDrawerPartOptions setMaxSize(ScreenSizeValues<Object> maxSize);

    Object getMaxSize(State state);

    ComponentOption<Object> getMaxSizeOption(State state);

    Collection<State> getMaxSizeStates();

    DrawerPosition getDrawerPosition();

    ComponentOption<DrawerPosition> getDrawerPositionOption();

    CoreDrawerPartOptions setDrawerPosition(DrawerPosition drawerPosition);

    CoreDrawerPartOptions setDrawerPosition(DrawerPosition drawerPosition, State state);

    CoreDrawerPartOptions setDrawerPositionAllStates(DrawerPosition drawerPosition);

    CoreDrawerPartOptions setDrawerPosition(ScreenSizeValues<DrawerPosition> drawerPosition);

    DrawerPosition getDrawerPosition(State state);

    ComponentOption<DrawerPosition> getDrawerPositionOption(State state);

    Collection<State> getDrawerPositionStates();

    boolean isOpen();

    ComponentOption<Boolean> getOpenOption();

    CoreDrawerPartOptions setOpen(Boolean open);

    Integer getTransitionDuration();

    ComponentOption<Integer> getTransitionDurationOption();

    CoreDrawerPartOptions setTransitionDuration(Integer transitionDuration);

    CoreAppLayout getAppLayout();

    ComponentOption<CoreAppLayout> getAppLayoutOption();

    CoreDrawerPartOptions setAppLayout(CoreAppLayout appLayout);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreDrawer getComponent();
}