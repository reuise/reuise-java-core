package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreFlexContainerOptions extends CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreFlexContainerPartOptions , CoreContainerOptions , CoreParentComponentPartOptions , CoreComponentOptions {
    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}