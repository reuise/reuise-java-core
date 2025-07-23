package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.checkbox.CoreCheckbox;
// Checked here??
public interface CoreCheckboxTableColumnPart extends ComponentPart , CoreCheckboxTableColumnFeatures , CoreTableColumnPart {
    boolean isChecked();

    CoreCheckboxTableColumnPart setChecked(Boolean checked);

    CoreCheckbox getCheckbox();

    CoreTableColumnPart getTableColumnPart();
}