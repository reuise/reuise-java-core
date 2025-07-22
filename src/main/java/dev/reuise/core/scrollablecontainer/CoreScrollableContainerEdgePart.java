package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreScrollableContainerEdgePart extends ComponentPart , CoreParentComponentPart , CoreScrollableContainerEdgeFeatures {
    CoreParentComponentPart getParentComponentPart();
}