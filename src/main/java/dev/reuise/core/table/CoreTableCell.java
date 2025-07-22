package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableCell extends CoreTableCellPart , CoreComponent , CoreParentComponent {
    CoreTableCell getComponent();
}