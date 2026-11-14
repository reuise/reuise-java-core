package dev.reuise.core.banner;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.CoreFlexContainerPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreBannerOptions extends CoreBannerPartOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreFlexContainerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreFlexContainerOptions {
    CoreFlexContainerPartOptions getFlexContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
