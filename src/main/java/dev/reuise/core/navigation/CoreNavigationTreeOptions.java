package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.accordion.CoreAccordionOptions;
import dev.reuise.core.accordion.CoreAccordionPartOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFlexContainerPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreNavigationTreeOptions extends CoreAccordionPartOptions , CoreNavigationTreePartOptions , CoreAccordionOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreFlexContainerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions {
    CoreAccordionPartOptions getAccordionPart();

    CoreFlexContainerPartOptions getFlexContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
