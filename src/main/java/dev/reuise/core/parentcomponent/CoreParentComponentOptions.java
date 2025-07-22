package dev.reuise.core.parentcomponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreParentComponentOptions extends CoreBaseComponentOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}
