package dev.reuise.core.input;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
public interface CoreMultiEmailAddressFieldPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreMultiEmailAddressField getComponent();
}