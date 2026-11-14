package dev.reuise.core.navigation;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.accordion.CoreAccordionPart;
public interface CoreNavigationTreePart extends ComponentPart , CoreNavigationTreeFeatures , CoreAccordionPart {
    CoreAccordionPart getAccordionPart();
}
