package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreColumnLayoutOptions extends CoreColumnLayoutPartOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreFlexContainerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreFlexContainerOptions {
    CoreFlexContainerPartOptions getFlexContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}