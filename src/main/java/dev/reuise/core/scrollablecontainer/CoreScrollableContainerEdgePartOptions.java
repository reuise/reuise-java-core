package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
public interface CoreScrollableContainerEdgePartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreScrollableContainerEdge getComponent();
}