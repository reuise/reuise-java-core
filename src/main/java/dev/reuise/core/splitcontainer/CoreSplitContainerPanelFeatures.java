package dev.reuise.core.splitcontainer;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreSplitContainerPanelFeatures {
    boolean isCollapsed();

    CoreSplitContainerPanelFeatures setCollapsed(Boolean collapsed);

    CoreSplitContainerPanelFeatures setCollapsed(Boolean collapsed, State state);

    CoreSplitContainerPanelFeatures setCollapsedAllStates(Boolean collapsed);

    CoreSplitContainerPanelFeatures setCollapsed(ScreenSizeValues<Boolean> collapsed);

    boolean isCollapsed(State state);

    Object getSize();

    CoreSplitContainerPanelFeatures setSize(Object size);

    CoreSplitContainerPanelFeatures setSize(Object size, State state);

    CoreSplitContainerPanelFeatures setSizeAllStates(Object size);

    CoreSplitContainerPanelFeatures setSize(ScreenSizeValues<Object> size);

    Object getSize(State state);

    Object getMinSize();

    CoreSplitContainerPanelFeatures setMinSize(Object minSize);

    CoreSplitContainerPanelFeatures setMinSize(Object minSize, State state);

    CoreSplitContainerPanelFeatures setMinSizeAllStates(Object minSize);

    CoreSplitContainerPanelFeatures setMinSize(ScreenSizeValues<Object> minSize);

    Object getMinSize(State state);

    Object getMaxSize();

    CoreSplitContainerPanelFeatures setMaxSize(Object maxSize);

    CoreSplitContainerPanelFeatures setMaxSize(Object maxSize, State state);

    CoreSplitContainerPanelFeatures setMaxSizeAllStates(Object maxSize);

    CoreSplitContainerPanelFeatures setMaxSize(ScreenSizeValues<Object> maxSize);

    Object getMaxSize(State state);

    SplitDirection getDirection();

    CoreSplitContainerPanelFeatures setDirection(SplitDirection direction);

    CoreSplitContainerPanelFeatures setDirection(SplitDirection direction, State state);

    CoreSplitContainerPanelFeatures setDirectionAllStates(SplitDirection direction);

    CoreSplitContainerPanelFeatures setDirection(ScreenSizeValues<SplitDirection> direction);

    SplitDirection getDirection(State state);
}