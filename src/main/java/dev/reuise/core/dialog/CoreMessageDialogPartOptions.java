package dev.reuise.core.dialog;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreMessageDialogPartOptions {
    String getText();

    ComponentOption<String> getTextOption();

    CoreMessageDialogPartOptions setText(String text);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreMessageDialog getComponent();
}