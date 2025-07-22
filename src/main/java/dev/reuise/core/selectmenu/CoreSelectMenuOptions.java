package dev.reuise.core.selectmenu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreSelectMenuOptions extends CoreSelectMenuPartOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreParentComponentOptions {
    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}