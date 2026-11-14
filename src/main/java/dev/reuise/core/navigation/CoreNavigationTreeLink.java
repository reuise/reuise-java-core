package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.link.CoreNavigationLink;
public interface CoreNavigationTreeLink extends CoreComponent , CoreNavigationLink , CoreNavigationTreeLinkPart {
    CoreNavigationTreeLink getComponent();
}
