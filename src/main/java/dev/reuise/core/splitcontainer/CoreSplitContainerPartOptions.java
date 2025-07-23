package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreSplitContainerPartOptions {
    SplitDirection getDirection();

    ComponentOption<SplitDirection> getDirectionOption();

    CoreSplitContainerPartOptions setDirection(SplitDirection direction);

    CoreSplitContainerPartOptions setDirection(SplitDirection direction, State state);

    CoreSplitContainerPartOptions setDirectionAllStates(SplitDirection direction);

    CoreSplitContainerPartOptions setDirection(ScreenSizeValues<SplitDirection> direction);

    SplitDirection getDirection(State state);

    ComponentOption<SplitDirection> getDirectionOption(State state);

    Collection<State> getDirectionStates();

    boolean isReverseDirection();

    ComponentOption<Boolean> getReverseDirectionOption();

    CoreSplitContainerPartOptions setReverseDirection(Boolean reverseDirection);

    CoreSplitContainerPartOptions setReverseDirection(Boolean reverseDirection, State state);

    CoreSplitContainerPartOptions setReverseDirectionAllStates(Boolean reverseDirection);

    CoreSplitContainerPartOptions setReverseDirection(ScreenSizeValues<Boolean> reverseDirection);

    boolean isReverseDirection(State state);

    ComponentOption<Boolean> getReverseDirectionOption(State state);

    Collection<State> getReverseDirectionStates();

    boolean isReverseDirectionAnyState();

    boolean isResizable();

    ComponentOption<Boolean> getResizableOption();

    CoreSplitContainerPartOptions setResizable(Boolean resizable);

    Object getSplitPosition();

    ComponentOption<Object> getSplitPositionOption();

    CoreSplitContainerPartOptions setSplitPosition(Object splitPosition);

    CoreSplitContainerPartOptions setSplitPosition(Object splitPosition, State state);

    CoreSplitContainerPartOptions setSplitPositionAllStates(Object splitPosition);

    CoreSplitContainerPartOptions setSplitPosition(ScreenSizeValues<Object> splitPosition);

    Object getSplitPosition(State state);

    ComponentOption<Object> getSplitPositionOption(State state);

    Collection<State> getSplitPositionStates();

    Object getMinSplitPosition();

    ComponentOption<Object> getMinSplitPositionOption();

    CoreSplitContainerPartOptions setMinSplitPosition(Object minSplitPosition);

    CoreSplitContainerPartOptions setMinSplitPosition(Object minSplitPosition, State state);

    CoreSplitContainerPartOptions setMinSplitPositionAllStates(Object minSplitPosition);

    CoreSplitContainerPartOptions setMinSplitPosition(ScreenSizeValues<Object> minSplitPosition);

    Object getMinSplitPosition(State state);

    ComponentOption<Object> getMinSplitPositionOption(State state);

    Collection<State> getMinSplitPositionStates();

    Object getMaxSplitPosition();

    ComponentOption<Object> getMaxSplitPositionOption();

    CoreSplitContainerPartOptions setMaxSplitPosition(Object maxSplitPosition);

    CoreSplitContainerPartOptions setMaxSplitPosition(Object maxSplitPosition, State state);

    CoreSplitContainerPartOptions setMaxSplitPositionAllStates(Object maxSplitPosition);

    CoreSplitContainerPartOptions setMaxSplitPosition(ScreenSizeValues<Object> maxSplitPosition);

    Object getMaxSplitPosition(State state);

    ComponentOption<Object> getMaxSplitPositionOption(State state);

    Collection<State> getMaxSplitPositionStates();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getContainerOptions();

    CoreSplitContainerPartOptions setContainerOptions(CoreContainerOptions containerOptions);

    boolean hasContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContainerCreator();

    CoreSplitContainerPanelOptions getStartPanelOptions();

    CoreSplitContainerPartOptions setStartPanelOptions(CoreSplitContainerPanelOptions startPanelOptions);

    boolean hasStartPanelOptions();

    ComponentCreator<? extends CoreSplitContainerPanel, ? extends CoreSplitContainerPanelOptions> getStartPanelCreator();

    CoreSplitContainerDividerOptions getDividerOptions();

    CoreSplitContainerPartOptions setDividerOptions(CoreSplitContainerDividerOptions dividerOptions);

    boolean hasDividerOptions();

    ComponentCreator<? extends CoreSplitContainerDivider, ? extends CoreSplitContainerDividerOptions> getDividerCreator();

    CoreSplitContainerPanelOptions getEndPanelOptions();

    CoreSplitContainerPartOptions setEndPanelOptions(CoreSplitContainerPanelOptions endPanelOptions);

    boolean hasEndPanelOptions();

    ComponentCreator<? extends CoreSplitContainerPanel, ? extends CoreSplitContainerPanelOptions> getEndPanelCreator();

    CoreComponentFactory getComponentFactory();

    CoreSplitContainer getComponent();
}