package dev.reuise.core.banner;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerPart;
import dev.reuise.core.text.CoreParagraph;
public interface CoreBannerPart extends CoreBannerFeatures , ComponentPart , CoreFlexContainerPart {
    CoreBannerPart requestDismiss();

    CoreIcon getIcon();

    CoreContainer getContent();

    CoreParagraph getMessageParagraph();

    CoreFlexContainer getActions();

    CoreButton getDismissButton();

    CoreFlexContainerPart getFlexContainerPart();
}
