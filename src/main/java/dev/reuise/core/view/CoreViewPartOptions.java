package dev.reuise.core.view;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreViewPartOptions {
    String getTitle();

    ComponentOption<String> getTitleOption();

    CoreViewPartOptions setTitle(String title);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreView getComponent();
}