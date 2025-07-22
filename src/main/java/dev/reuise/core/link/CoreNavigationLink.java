package dev.reuise.core.link;
import dev.reuise.core.CoreComponent;
public interface CoreNavigationLink extends CoreComponent , CoreLink , CoreNavigationLinkPart {
    CoreNavigationLink getComponent();
}