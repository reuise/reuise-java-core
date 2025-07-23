package dev.reuise.core.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreNavigationLinkOptions extends CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreLinkPartOptions , CoreLinkOptions , CoreNavigationLinkPartOptions {
    CoreLinkPartOptions getLinkPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}