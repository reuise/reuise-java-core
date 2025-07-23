package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreSurfacePartOptions {
    SurfaceType getType();

    ComponentOption<SurfaceType> getTypeOption();

    CoreSurfacePartOptions setType(SurfaceType type);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreSurface getComponent();
}