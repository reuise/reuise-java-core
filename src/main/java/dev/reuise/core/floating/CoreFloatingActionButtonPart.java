package dev.reuise.core.floating;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButtonPart;
import dev.reuise.core.text.CoreInlineText;
public interface CoreFloatingActionButtonPart extends ComponentPart , CoreButtonPart , CoreFloatingActionButtonFeatures {
    CoreInlineText getBadge();

    CoreButtonPart getButtonPart();
}
