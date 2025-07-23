package dev.reuise.core.applayout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.splitcontainer.CoreSplitContainer;
public interface CoreAppLayoutPart extends ComponentPart , CoreAppLayoutFeatures , CoreParentComponentPart {
    void openDrawer();

    void closeDrawer();

    CoreContainer getDrawerScrim();

    CoreSplitContainer getDrawerSplit();

    CoreSplitContainer getTopAppBarSplit();

    CoreAppLayoutBody getBody();

    CoreParentComponentPart getParentComponentPart();
}