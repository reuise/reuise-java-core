package dev.reuise.core.skeleton;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreSkeletonOptions extends CoreBaseComponentOptions , CoreBaseComponentPartOptions , CoreComponentOptions , CoreSkeletonPartOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}