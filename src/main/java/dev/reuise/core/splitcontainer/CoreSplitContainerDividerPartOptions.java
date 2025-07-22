package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreSplitContainerDividerPartOptions {
    Integer getThickness();

    ComponentOption<Integer> getThicknessOption();

    CoreSplitContainerDividerPartOptions setThickness(Integer thickness);

    CoreSplitContainerDividerPartOptions setThickness(Integer thickness, State state);

    CoreSplitContainerDividerPartOptions setThicknessAllStates(Integer thickness);

    CoreSplitContainerDividerPartOptions setThickness(ScreenSizeValues<Integer> thickness);

    Integer getThickness(State state);

    ComponentOption<Integer> getThicknessOption(State state);

    Collection<State> getThicknessStates();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreSplitContainerDivider getComponent();
}