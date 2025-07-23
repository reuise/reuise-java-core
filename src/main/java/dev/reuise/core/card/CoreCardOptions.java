package dev.reuise.core.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFlexContainerPartOptions;
import dev.reuise.core.layout.CoreSurfaceOptions;
import dev.reuise.core.layout.CoreSurfacePartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreCardOptions extends CoreCardPartOptions , CoreBaseComponentPartOptions , CoreSurfacePartOptions , CoreContainerPartOptions , CoreFlexContainerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreSurfaceOptions {
    CoreSurfacePartOptions getSurfacePart();

    CoreFlexContainerPartOptions getFlexContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}