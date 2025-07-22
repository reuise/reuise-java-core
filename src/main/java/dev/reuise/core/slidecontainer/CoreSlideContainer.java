package dev.reuise.core.slidecontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreSlideContainer extends CoreComponent , CoreContainer , CoreSlideContainerPart {
    CoreSlideContainer getComponent();
}