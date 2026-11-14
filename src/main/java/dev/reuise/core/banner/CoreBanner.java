package dev.reuise.core.banner;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreFlexContainer;
public interface CoreBanner extends CoreComponent , CoreBannerPart , CoreFlexContainer {
    CoreBanner getComponent();
}
