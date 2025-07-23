package dev.reuise.core.slidecontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreSlideContainerPart extends ComponentPart , CoreContainerPart , CoreSlideContainerFeatures {
    void slidePrevious();

    void slideNext();

    CoreContainer getSlideAreaBefore();

    CoreContainer getSlideArea();

    CoreContainer getSlideAreaAfter();

    CoreContainerPart getContainerPart();
}