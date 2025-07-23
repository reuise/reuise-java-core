package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreScrollableContainerEdge extends CoreScrollableContainerEdgePart , CoreComponent , CoreParentComponent {
    CoreScrollableContainerEdge getComponent();
}