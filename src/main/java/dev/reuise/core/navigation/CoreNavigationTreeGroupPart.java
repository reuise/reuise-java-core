package dev.reuise.core.navigation;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.accordion.CoreAccordionItemPart;
public interface CoreNavigationTreeGroupPart extends ComponentPart , CoreNavigationTreeGroupFeatures , CoreAccordionItemPart {
    CoreNavigationTreeLink getLink();

    CoreNavigationTree getTree();

    CoreAccordionItemPart getAccordionItemPart();
}
