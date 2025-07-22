package dev.reuise.core.link;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreLinkPart extends ComponentPart , CoreLinkFeatures , CoreParentComponentPart {
    CoreParentComponentPart getParentComponentPart();
}