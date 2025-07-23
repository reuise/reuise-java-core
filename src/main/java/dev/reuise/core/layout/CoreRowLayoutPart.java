package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
public interface CoreRowLayoutPart extends ComponentPart , CoreRowLayoutFeatures , CoreFlexContainerPart {
    CoreFlexContainerPart getFlexContainerPart();
}