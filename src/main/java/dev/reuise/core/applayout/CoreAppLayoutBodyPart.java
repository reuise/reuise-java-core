package dev.reuise.core.applayout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreFlexContainerPart;
public interface CoreAppLayoutBodyPart extends ComponentPart , CoreFlexContainerPart , CoreAppLayoutBodyFeatures {
    CoreFlexContainerPart getFlexContainerPart();
}