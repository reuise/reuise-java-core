package dev.reuise.core.menu;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.list.CoreListItem;
import dev.reuise.core.list.CoreListView;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreMenuPart extends ComponentPart , CoreParentComponentPart , CoreMenuFeatures {
    void open();

    void close();

    void clearItems();

    CoreMenuPart addItem(CoreListItem item);

    CoreMenuPart addItem(String text);

    CoreMenuPart addDivider();

    CoreListView getList();

    CoreParentComponentPart getParentComponentPart();
}