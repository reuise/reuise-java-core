package dev.reuise.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFlexContainerPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreSheetViewOptions extends CoreViewPartOptions , CoreViewOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreSheetViewPartOptions , CoreFlexContainerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions {
    CoreViewPartOptions getViewPart();

    CoreFlexContainerPartOptions getFlexContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}