package dev.reuise.core.dialog;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreHeading;
public interface CoreDialogPart extends ComponentPart , CoreParentComponentPart , CoreDialogFeatures {
    void open();

    void close();

    void shake();

    CoreContainer getContainer();

    CoreContainer getHeader();

    CoreHeading getTitleHeading();

    CoreFlexContainer getBody();

    CoreFlexContainer getFooter();

    CoreContainer getScrim();

    CoreButton getAcceptButton();

    CoreButton getCancelButton();

    CoreParentComponentPart getParentComponentPart();
}