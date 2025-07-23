package dev.reuise.core.button;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
public interface CoreButtonPart extends ComponentPart , CoreParentComponentPart , CoreButtonFeatures {
    boolean isType(ButtonType type);

    CoreIcon getStartIcon();

    CoreInlineText getLabelContainer();

    CoreIcon getEndIcon();

    CoreParentComponentPart getParentComponentPart();
}