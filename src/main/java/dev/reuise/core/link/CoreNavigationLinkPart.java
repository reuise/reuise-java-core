package dev.reuise.core.link;
import dev.reuise.core.ComponentPart;
public interface CoreNavigationLinkPart extends CoreNavigationLinkFeatures , ComponentPart , CoreLinkPart {
    CoreLinkPart getLinkPart();
}