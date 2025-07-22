package dev.reuise.core.table;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.checkbox.CoreCheckbox;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.option.ComponentCreator;
// Checked here??
public interface CoreCheckboxTableColumnPartOptions {
    boolean isChecked();

    CoreCheckboxTableColumnPartOptions setChecked(Boolean checked);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreCheckboxOptions getCheckboxOptions();

    CoreCheckboxTableColumnPartOptions setCheckboxOptions(CoreCheckboxOptions checkboxOptions);

    boolean hasCheckboxOptions();

    ComponentCreator<? extends CoreCheckbox, ? extends CoreCheckboxOptions> getCheckboxCreator();

    CoreComponentFactory getComponentFactory();

    CoreCheckboxTableColumn getComponent();
}