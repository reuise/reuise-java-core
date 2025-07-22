package dev.reuise.core.button;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreIconButtonPart extends ComponentPart , CoreParentComponentPart , CoreIconButtonFeatures {
    CoreIcon getIcon();

    CoreParentComponentPart getParentComponentPart();
}