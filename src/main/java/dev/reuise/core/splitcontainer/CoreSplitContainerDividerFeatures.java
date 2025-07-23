package dev.reuise.core.splitcontainer;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreSplitContainerDividerFeatures {
    Integer getThickness();

    CoreSplitContainerDividerFeatures setThickness(Integer thickness);

    CoreSplitContainerDividerFeatures setThickness(Integer thickness, State state);

    CoreSplitContainerDividerFeatures setThicknessAllStates(Integer thickness);

    CoreSplitContainerDividerFeatures setThickness(ScreenSizeValues<Integer> thickness);

    Integer getThickness(State state);
}