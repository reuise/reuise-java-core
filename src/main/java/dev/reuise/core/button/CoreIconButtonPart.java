package dev.reuise.core.button;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.IconSize;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
// Size here??
public interface CoreIconButtonPart extends ComponentPart , CoreParentComponentPart , CoreIconButtonFeatures {
    Object getSize();

    CoreIconButtonPart setSize(Object size);

    CoreIconButtonPart setSize(IconSize size);

    CoreIcon getIcon();

    CoreParentComponentPart getParentComponentPart();
}
