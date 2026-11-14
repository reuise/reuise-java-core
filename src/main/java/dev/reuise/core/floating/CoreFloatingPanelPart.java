package dev.reuise.core.floating;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
import dev.reuise.core.text.CoreInlineText;
public interface CoreFloatingPanelPart extends ComponentPart , CoreFloatingPanelFeatures , CoreContainerPart {
    CoreFloatingPanelPart open();

    CoreFloatingPanelPart close();

    CoreFloatingPanelPart minimise();

    CoreFloatingPanelPart toggle();

    CoreFloatingActionButton getTrigger();

    CoreContainer getPanel();

    CoreContainer getHeader();

    CoreInlineText getTitleContainer();

    CoreButton getMinimiseButton();

    CoreButton getCloseButton();

    CoreContainer getContent();

    CoreContainerPart getContainerPart();
}
