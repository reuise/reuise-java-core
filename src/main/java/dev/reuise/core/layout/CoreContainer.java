package dev.reuise.core.layout;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreContainer extends CoreComponent , CoreContainerPart , CoreParentComponent {
    CoreContainer getComponent();
}