package dev.reuise.core.checkbox;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreBasicCheckboxPartOptions {
    boolean isChecked();

    ComponentOption<Boolean> getCheckedOption();

    CoreBasicCheckboxPartOptions setChecked(Boolean checked);

    CheckboxSize getSize();

    ComponentOption<CheckboxSize> getSizeOption();

    CoreBasicCheckboxPartOptions setSize(CheckboxSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreBasicCheckbox getComponent();
}