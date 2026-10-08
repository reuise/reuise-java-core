package dev.reuise.core.accordion;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreFlexContainerPart;
public interface CoreAccordionPart extends ComponentPart , CoreFlexContainerPart , CoreAccordionFeatures {
    CoreFlexContainerPart getFlexContainerPart();
}
