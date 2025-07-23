package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
public interface CoreSurfacePart extends ComponentPart , CoreSurfaceFeatures , CoreFlexContainerPart {
    CoreFlexContainerPart getFlexContainerPart();
}