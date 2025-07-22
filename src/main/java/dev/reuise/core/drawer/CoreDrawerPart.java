package dev.reuise.core.drawer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreDrawerPart extends ComponentPart , CoreContainerPart , CoreDrawerFeatures {
    void open();

    void close();

    CoreContainerPart getContainerPart();
}