package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.accordion.CoreAccordion;
public interface CoreNavigationTree extends CoreComponent , CoreNavigationTreePart , CoreAccordion {
    CoreNavigationTree getComponent();
}
