package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.link.CoreLinkPartOptions;
import dev.reuise.core.link.CoreNavigationLinkOptions;
import dev.reuise.core.link.CoreNavigationLinkPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreNavigationTreeLinkOptions extends CoreNavigationLinkOptions , CoreBaseComponentPartOptions , CoreNavigationTreeLinkPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreLinkPartOptions , CoreNavigationLinkPartOptions {
    CoreNavigationLinkPartOptions getNavigationLinkPart();

    CoreLinkPartOptions getLinkPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
