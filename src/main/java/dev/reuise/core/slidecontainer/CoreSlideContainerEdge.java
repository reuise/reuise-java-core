package dev.reuise.core.slidecontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreSlideContainerEdge extends CoreComponent , CoreParentComponent , CoreSlideContainerEdgePart {
    CoreSlideContainerEdge getComponent();
}