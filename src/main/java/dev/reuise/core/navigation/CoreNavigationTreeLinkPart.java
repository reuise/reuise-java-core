package dev.reuise.core.navigation;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.link.CoreNavigationLinkPart;
import dev.reuise.core.list.CoreListItem;
public interface CoreNavigationTreeLinkPart extends ComponentPart , CoreNavigationTreeLinkFeatures , CoreNavigationLinkPart {
    CoreListItem getItem();

    CoreNavigationLinkPart getNavigationLinkPart();
}
