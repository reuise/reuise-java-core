package dev.reuise.core.list;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreBasicListPart extends ComponentPart , CoreBasicListFeatures , CoreParentComponentPart {
    void clearItems();

    CoreParentComponentPart getParentComponentPart();
}