package dev.reuise.core.accordion;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreFlexContainer;
public interface CoreAccordionItem extends CoreComponent , CoreFlexContainer , CoreAccordionItemPart {
    CoreAccordionItem getComponent();
}