package dev.reuise.core.consent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreFlexContainer;
public interface CoreConsentBanner extends CoreComponent , CoreConsentBannerPart , CoreFlexContainer {
    CoreConsentBanner getComponent();
}
