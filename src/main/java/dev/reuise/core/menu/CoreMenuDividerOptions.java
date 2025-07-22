package dev.reuise.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.list.CoreBasicListItemPartOptions;
import dev.reuise.core.list.CoreListItemPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreMenuDividerOptions extends CoreMenuItemPartOptions , CoreBasicListItemPartOptions , CoreBaseComponentPartOptions , CoreMenuItemOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreMenuDividerPartOptions , CoreListItemPartOptions {
    CoreMenuItemPartOptions getMenuItemPart();

    CoreListItemPartOptions getListItemPart();

    CoreBasicListItemPartOptions getBasicListItemPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}