package dev.reuise.core.layout;
import dev.reuise.core.CoreComponent;
public interface CoreSurface extends CoreComponent , CoreSurfacePart , CoreFlexContainer {
    CoreSurface getComponent();
}