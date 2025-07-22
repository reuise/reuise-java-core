package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreSurfaceOptions extends CoreBaseComponentPartOptions , CoreSurfacePartOptions , CoreContainerPartOptions , CoreFlexContainerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreFlexContainerOptions {
    CoreFlexContainerPartOptions getFlexContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}