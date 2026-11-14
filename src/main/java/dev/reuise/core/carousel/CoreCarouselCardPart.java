package dev.reuise.core.carousel;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreCarouselCardPart extends ComponentPart , CoreContainerPart , CoreCarouselCardFeatures {
    CoreContainerPart getContainerPart();
}
