package dev.reuise.core.view;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreFlexContainerPart;
public interface CoreViewPart extends CoreViewFeatures , ComponentPart , CoreFlexContainerPart {
    void onHide();

    CoreFlexContainerPart getFlexContainerPart();
}