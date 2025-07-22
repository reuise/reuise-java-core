package dev.reuise.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreMenuOptions extends CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreMenuPartOptions , CoreParentComponentOptions {
    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}