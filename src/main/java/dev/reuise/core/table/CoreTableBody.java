package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableBody extends CoreComponent , CoreParentComponent , CoreTableBodyPart {
    CoreTableBody getComponent();
}