package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
public interface CoreColumnLayoutPart extends ComponentPart , CoreColumnLayoutFeatures , CoreFlexContainerPart {
    CoreFlexContainerPart getFlexContainerPart();
}