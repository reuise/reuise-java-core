package dev.reuise.core.button;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreFlexContainerPart;
public interface CoreButtonBarPart extends ComponentPart , CoreFlexContainerPart , CoreButtonBarFeatures {
    CoreButtonBarPart addButton(CoreButton button);

    CoreButtonBarPart addButton(String label);

    CoreButton createButton(String label);

    CoreFlexContainerPart getFlexContainerPart();
}
