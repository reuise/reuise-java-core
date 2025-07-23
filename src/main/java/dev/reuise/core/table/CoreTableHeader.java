package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableHeader extends CoreComponent , CoreParentComponent , CoreTableHeaderPart {
    CoreTableHeader getComponent();
}