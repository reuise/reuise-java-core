package dev.reuise.core.menu;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreMenuButtonPart extends ComponentPart , CoreMenuButtonFeatures , CoreContainerPart {
    CoreMenuButtonPart open();

    CoreMenuButtonPart close();

    CoreMenuButtonPart toggle();

    CoreButton getTrigger();

    CoreContainer getPopup();

    CoreContainerPart getContainerPart();
}
