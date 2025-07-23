package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableHeaderCell extends CoreComponent , CoreParentComponent , CoreTableHeaderCellPart {
    CoreTableHeaderCell getComponent();
}