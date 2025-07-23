package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.Axis;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreScrollableContainerPart extends ComponentPart , CoreContainerPart , CoreScrollableContainerFeatures {
    void scroll(double xCoord, double yCoord);

    void scrollToEnd(Axis direction);

    CoreContainer getScrollAreaBefore();

    CoreScrollableContainerScrollArea getScrollArea();

    CoreContainer getScrollAreaAfter();

    CoreContainerPart getContainerPart();
}