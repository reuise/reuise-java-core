package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreTableBodyOptions extends CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreTableBodyPartOptions , CoreParentComponentOptions {
    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}