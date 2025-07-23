package dev.reuise.core.badge;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreBadgeOptions extends CoreBaseComponentOptions , CoreBadgePartOptions , CoreBaseComponentPartOptions , CoreComponentOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}