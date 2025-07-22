package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.checkbox.CoreCheckbox;
public interface CoreCheckboxTableCellPart extends CoreTableCellPart , ComponentPart , CoreCheckboxTableCellFeatures {
    CoreCheckbox getCheckbox();

    CoreTableCellPart getTableCellPart();
}