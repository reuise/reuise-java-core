package dev.reuise.core.accordion;
public interface CoreAccordionItemFeatures {
    boolean isExpanded();

    CoreAccordionItemFeatures setExpanded(Boolean expanded);

    boolean isToggleAtEnd();

    CoreAccordionItemFeatures setToggleAtEnd(Boolean toggleAtEnd);
}
