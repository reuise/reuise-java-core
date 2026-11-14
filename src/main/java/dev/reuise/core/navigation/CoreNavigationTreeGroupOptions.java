package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.core.accordion.CoreAccordionItemPartOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFlexContainerPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreNavigationTreeGroupOptions extends CoreAccordionItemPartOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreFlexContainerPartOptions , CoreNavigationTreeGroupPartOptions , CoreParentComponentPartOptions , CoreAccordionItemOptions , CoreComponentOptions {
    CoreAccordionItemPartOptions getAccordionItemPart();

    CoreFlexContainerPartOptions getFlexContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
