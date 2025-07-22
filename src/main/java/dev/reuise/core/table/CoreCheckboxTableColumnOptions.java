package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreCheckboxTableColumnOptions extends CoreBaseComponentPartOptions , CoreCheckboxTableColumnPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreTableColumnPartOptions , CoreTableColumnOptions {
    CoreTableColumnPartOptions getTableColumnPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}