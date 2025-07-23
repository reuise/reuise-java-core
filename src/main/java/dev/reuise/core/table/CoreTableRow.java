package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableRow extends CoreComponent , CoreParentComponent , CoreTableRowPart {
    CoreTableRow getComponent();
}