package dev.reuise.core.parentcomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreParentComponentPartOptions {
    List<CoreComponent> getChildren();

    ComponentOption<List<CoreComponent>> getChildrenOption();

    CoreParentComponentPartOptions setChildren(List<CoreComponent> children);

    CoreParentComponentPartOptions setChild(CoreComponent child);

    CoreParentComponentPartOptions removeChild(CoreComponent child);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreParentComponent getComponent();
}