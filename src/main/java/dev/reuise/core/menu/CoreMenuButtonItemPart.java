package dev.reuise.core.menu;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButtonPart;
public interface CoreMenuButtonItemPart extends ComponentPart , CoreButtonPart , CoreMenuButtonItemFeatures {
    CoreButtonPart getButtonPart();
}
