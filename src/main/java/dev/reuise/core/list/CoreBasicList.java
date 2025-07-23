package dev.reuise.core.list;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreBasicList extends CoreComponent , CoreParentComponent , CoreBasicListPart {
    CoreBasicList getComponent();
}