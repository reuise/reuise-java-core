package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreSplitContainerPanelPartOptions {
    boolean isCollapsed();

    ComponentOption<Boolean> getCollapsedOption();

    CoreSplitContainerPanelPartOptions setCollapsed(Boolean collapsed);

    CoreSplitContainerPanelPartOptions setCollapsed(Boolean collapsed, State state);

    CoreSplitContainerPanelPartOptions setCollapsedAllStates(Boolean collapsed);

    CoreSplitContainerPanelPartOptions setCollapsed(ScreenSizeValues<Boolean> collapsed);

    boolean isCollapsed(State state);

    ComponentOption<Boolean> getCollapsedOption(State state);

    Collection<State> getCollapsedStates();

    boolean isCollapsedAnyState();

    Object getSize();

    ComponentOption<Object> getSizeOption();

    CoreSplitContainerPanelPartOptions setSize(Object size);

    CoreSplitContainerPanelPartOptions setSize(Object size, State state);

    CoreSplitContainerPanelPartOptions setSizeAllStates(Object size);

    CoreSplitContainerPanelPartOptions setSize(ScreenSizeValues<Object> size);

    Object getSize(State state);

    ComponentOption<Object> getSizeOption(State state);

    Collection<State> getSizeStates();

    Object getMinSize();

    ComponentOption<Object> getMinSizeOption();

    CoreSplitContainerPanelPartOptions setMinSize(Object minSize);

    CoreSplitContainerPanelPartOptions setMinSize(Object minSize, State state);

    CoreSplitContainerPanelPartOptions setMinSizeAllStates(Object minSize);

    CoreSplitContainerPanelPartOptions setMinSize(ScreenSizeValues<Object> minSize);

    Object getMinSize(State state);

    ComponentOption<Object> getMinSizeOption(State state);

    Collection<State> getMinSizeStates();

    Object getMaxSize();

    ComponentOption<Object> getMaxSizeOption();

    CoreSplitContainerPanelPartOptions setMaxSize(Object maxSize);

    CoreSplitContainerPanelPartOptions setMaxSize(Object maxSize, State state);

    CoreSplitContainerPanelPartOptions setMaxSizeAllStates(Object maxSize);

    CoreSplitContainerPanelPartOptions setMaxSize(ScreenSizeValues<Object> maxSize);

    Object getMaxSize(State state);

    ComponentOption<Object> getMaxSizeOption(State state);

    Collection<State> getMaxSizeStates();

    SplitDirection getDirection();

    ComponentOption<SplitDirection> getDirectionOption();

    CoreSplitContainerPanelPartOptions setDirection(SplitDirection direction);

    CoreSplitContainerPanelPartOptions setDirection(SplitDirection direction, State state);

    CoreSplitContainerPanelPartOptions setDirectionAllStates(SplitDirection direction);

    CoreSplitContainerPanelPartOptions setDirection(ScreenSizeValues<SplitDirection> direction);

    SplitDirection getDirection(State state);

    ComponentOption<SplitDirection> getDirectionOption(State state);

    Collection<State> getDirectionStates();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreSplitContainerPanel getComponent();
}