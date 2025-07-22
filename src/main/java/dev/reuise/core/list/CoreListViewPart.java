package dev.reuise.core.list;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreListViewPart extends ComponentPart , CoreParentComponentPart , CoreListViewFeatures {
    void clearItems();

    CoreParentComponentPart getParentComponentPart();
}