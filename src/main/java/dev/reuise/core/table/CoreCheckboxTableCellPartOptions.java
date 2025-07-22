package dev.reuise.core.table;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.checkbox.CoreCheckbox;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreCheckboxTableCellPartOptions {
    boolean isChecked();

    ComponentOption<Boolean> getCheckedOption();

    CoreCheckboxTableCellPartOptions setChecked(Boolean checked);

    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreCheckboxTableCellPartOptions setLabel(String label);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreCheckboxOptions getCheckboxOptions();

    CoreCheckboxTableCellPartOptions setCheckboxOptions(CoreCheckboxOptions checkboxOptions);

    boolean hasCheckboxOptions();

    ComponentCreator<? extends CoreCheckbox, ? extends CoreCheckboxOptions> getCheckboxCreator();

    CoreComponentFactory getComponentFactory();

    CoreCheckboxTableCell getComponent();
}