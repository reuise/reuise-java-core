package dev.reuise.core.splitcontainer;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreSplitContainerFeatures {
    SplitDirection getDirection();

    CoreSplitContainerFeatures setDirection(SplitDirection direction);

    CoreSplitContainerFeatures setDirection(SplitDirection direction, State state);

    CoreSplitContainerFeatures setDirectionAllStates(SplitDirection direction);

    CoreSplitContainerFeatures setDirection(ScreenSizeValues<SplitDirection> direction);

    SplitDirection getDirection(State state);

    boolean isReverseDirection();

    CoreSplitContainerFeatures setReverseDirection(Boolean reverseDirection);

    CoreSplitContainerFeatures setReverseDirection(Boolean reverseDirection, State state);

    CoreSplitContainerFeatures setReverseDirectionAllStates(Boolean reverseDirection);

    CoreSplitContainerFeatures setReverseDirection(ScreenSizeValues<Boolean> reverseDirection);

    boolean isReverseDirection(State state);

    boolean isResizable();

    CoreSplitContainerFeatures setResizable(Boolean resizable);

    Object getSplitPosition();

    CoreSplitContainerFeatures setSplitPosition(Object splitPosition);

    CoreSplitContainerFeatures setSplitPosition(Object splitPosition, State state);

    CoreSplitContainerFeatures setSplitPositionAllStates(Object splitPosition);

    CoreSplitContainerFeatures setSplitPosition(ScreenSizeValues<Object> splitPosition);

    Object getSplitPosition(State state);

    Object getMinSplitPosition();

    CoreSplitContainerFeatures setMinSplitPosition(Object minSplitPosition);

    CoreSplitContainerFeatures setMinSplitPosition(Object minSplitPosition, State state);

    CoreSplitContainerFeatures setMinSplitPositionAllStates(Object minSplitPosition);

    CoreSplitContainerFeatures setMinSplitPosition(ScreenSizeValues<Object> minSplitPosition);

    Object getMinSplitPosition(State state);

    Object getMaxSplitPosition();

    CoreSplitContainerFeatures setMaxSplitPosition(Object maxSplitPosition);

    CoreSplitContainerFeatures setMaxSplitPosition(Object maxSplitPosition, State state);

    CoreSplitContainerFeatures setMaxSplitPositionAllStates(Object maxSplitPosition);

    CoreSplitContainerFeatures setMaxSplitPosition(ScreenSizeValues<Object> maxSplitPosition);

    Object getMaxSplitPosition(State state);
}