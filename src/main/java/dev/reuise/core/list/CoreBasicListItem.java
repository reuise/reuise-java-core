package dev.reuise.core.list;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreBasicListItem extends CoreComponent , CoreParentComponent , CoreBasicListItemPart {
    CoreBasicListItem getComponent();
}