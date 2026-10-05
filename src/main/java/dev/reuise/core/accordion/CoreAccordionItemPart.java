package dev.reuise.core.accordion;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreFlexContainerPart;
public interface CoreAccordionItemPart extends ComponentPart , CoreAccordionItemFeatures , CoreFlexContainerPart {
    CoreFlexContainerPart getFlexContainerPart();
}