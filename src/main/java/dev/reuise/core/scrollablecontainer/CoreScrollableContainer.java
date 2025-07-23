package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreScrollableContainer extends CoreComponent , CoreContainer , CoreScrollableContainerPart {
    CoreScrollableContainer getComponent();
}