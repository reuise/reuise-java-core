package dev.reuise.core.accordion;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerPart;
public interface CoreAccordionItemPart extends ComponentPart , CoreAccordionItemFeatures , CoreFlexContainerPart {
    CoreAccordionItemPart toggle();

    CoreFlexContainer getHeader();

    CoreButton getToggle();

    CoreContainer getContent();

    CoreFlexContainerPart getFlexContainerPart();
}
