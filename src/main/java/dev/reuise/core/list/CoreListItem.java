package dev.reuise.core.list;
import dev.reuise.core.CoreComponent;
public interface CoreListItem extends CoreComponent , CoreBasicListItem , CoreListItemPart {
    CoreListItem getComponent();
}