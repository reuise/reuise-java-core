package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreCheckboxTableCellOptions extends CoreBaseComponentPartOptions , CoreTableCellPartOptions , CoreTableCellOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreCheckboxTableCellPartOptions {
    CoreTableCellPartOptions getTableCellPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}