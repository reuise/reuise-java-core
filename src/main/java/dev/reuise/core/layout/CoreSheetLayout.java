package dev.reuise.core.layout;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.splitcontainer.CoreSplitContainer;
public interface CoreSheetLayout extends CoreComponent , CoreSheetLayoutPart , CoreSplitContainer {
    CoreSheetLayout getComponent();
}