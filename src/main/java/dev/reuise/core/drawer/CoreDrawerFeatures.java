package dev.reuise.core.drawer;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.applayout.CoreAppLayout;
public interface CoreDrawerFeatures {
    boolean isResizable();

    CoreDrawerFeatures setResizable(Boolean resizable);

    Object getMinSize();

    CoreDrawerFeatures setMinSize(Object minSize);

    CoreDrawerFeatures setMinSize(Object minSize, State state);

    CoreDrawerFeatures setMinSizeAllStates(Object minSize);

    CoreDrawerFeatures setMinSize(ScreenSizeValues<Object> minSize);

    Object getMinSize(State state);

    Object getMaxSize();

    CoreDrawerFeatures setMaxSize(Object maxSize);

    CoreDrawerFeatures setMaxSize(Object maxSize, State state);

    CoreDrawerFeatures setMaxSizeAllStates(Object maxSize);

    CoreDrawerFeatures setMaxSize(ScreenSizeValues<Object> maxSize);

    Object getMaxSize(State state);

    DrawerPosition getDrawerPosition();

    CoreDrawerFeatures setDrawerPosition(DrawerPosition drawerPosition);

    CoreDrawerFeatures setDrawerPosition(DrawerPosition drawerPosition, State state);

    CoreDrawerFeatures setDrawerPositionAllStates(DrawerPosition drawerPosition);

    CoreDrawerFeatures setDrawerPosition(ScreenSizeValues<DrawerPosition> drawerPosition);

    DrawerPosition getDrawerPosition(State state);

    boolean isOpen();

    CoreDrawerFeatures setOpen(Boolean open);

    Integer getTransitionDuration();

    CoreDrawerFeatures setTransitionDuration(Integer transitionDuration);

    CoreAppLayout getAppLayout();

    CoreDrawerFeatures setAppLayout(CoreAppLayout appLayout);
}