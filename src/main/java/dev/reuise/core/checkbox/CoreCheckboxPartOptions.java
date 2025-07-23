package dev.reuise.core.checkbox;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreLabel;
import dev.reuise.core.text.CoreLabelOptions;
// Size here??
public interface CoreCheckboxPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreCheckboxPartOptions setLabel(String label);

    boolean isChecked();

    ComponentOption<Boolean> getCheckedOption();

    CoreCheckboxPartOptions setChecked(Boolean checked);

    CheckboxSize getSize();

    CoreCheckboxPartOptions setSize(CheckboxSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreBasicCheckboxOptions getCheckboxOptions();

    CoreCheckboxPartOptions setCheckboxOptions(CoreBasicCheckboxOptions checkboxOptions);

    boolean hasCheckboxOptions();

    ComponentCreator<? extends CoreBasicCheckbox, ? extends CoreBasicCheckboxOptions> getCheckboxCreator();

    CoreLabelOptions getLabelContainerOptions();

    CoreCheckboxPartOptions setLabelContainerOptions(CoreLabelOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreLabel, ? extends CoreLabelOptions> getLabelContainerCreator();

    CoreComponentFactory getComponentFactory();

    CoreCheckbox getComponent();
}