package dev.reuise.core.slidecontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreSlideContainerEdgePart extends ComponentPart , CoreSlideContainerEdgeFeatures , CoreParentComponentPart {
    CoreParentComponentPart getParentComponentPart();
}