package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
public interface CoreFlexContainerPart extends ComponentPart , CoreContainerPart , CoreFlexContainerFeatures {
    CoreContainerPart getContainerPart();
}