package dev.reuise.core.list;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreListView extends CoreComponent , CoreParentComponent , CoreListViewPart {
    CoreListView getComponent();
}