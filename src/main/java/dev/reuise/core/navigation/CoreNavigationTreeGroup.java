package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.accordion.CoreAccordionItem;
public interface CoreNavigationTreeGroup extends CoreComponent , CoreNavigationTreeGroupPart , CoreAccordionItem {
    CoreNavigationTreeGroup getComponent();
}
