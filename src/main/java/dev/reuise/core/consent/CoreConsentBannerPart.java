package dev.reuise.core.consent;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.dialog.CoreDialog;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerPart;
import dev.reuise.core.text.CoreParagraph;
public interface CoreConsentBannerPart extends ComponentPart , CoreFlexContainerPart , CoreConsentBannerFeatures {
    CoreParagraph getMessageParagraph();

    CoreFlexContainer getActions();

    CoreButton getAcceptButton();

    CoreButton getRejectButton();

    CoreButton getPreferencesButton();

    CoreDialog getPreferencesDialog();

    CoreFlexContainerPart getFlexContainerPart();
}
