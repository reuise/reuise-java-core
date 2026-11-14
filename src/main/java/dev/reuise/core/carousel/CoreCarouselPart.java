package dev.reuise.core.carousel;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
import dev.reuise.core.text.CoreInlineText;
public interface CoreCarouselPart extends CoreCarouselFeatures , ComponentPart , CoreContainerPart {
    CoreCarouselPart next();

    CoreCarouselPart previous();

    CoreCarouselPart play();

    CoreCarouselPart pause();

    CoreCarouselPart refresh();

    CoreContainer getViewport();

    CoreContainer getSlider();

    CoreContainer getNavigation();

    CoreButton getPreviousButton();

    CoreContainer getIndicators();

    CoreButton getNextButton();

    CoreButton getAutoplayButton();

    CoreInlineText getAnnouncement();

    CoreContainerPart getContainerPart();
}
