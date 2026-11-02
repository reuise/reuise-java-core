package dev.reuise.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreListItemOptions extends CoreBasicListItemPartOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreBasicListItemOptions , CoreComponentOptions , CoreListItemPartOptions {
    CoreBasicListItemPartOptions getBasicListItemPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
