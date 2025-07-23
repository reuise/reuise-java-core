package dev.reuise.core.link;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreNavigationLinkPartOptions {
    boolean isActive();

    ComponentOption<Boolean> getActiveOption();

    CoreNavigationLinkPartOptions setActive(Boolean active);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreNavigationLink getComponent();
}