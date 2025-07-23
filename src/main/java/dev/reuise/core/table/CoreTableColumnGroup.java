package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableColumnGroup extends CoreComponent , CoreParentComponent , CoreTableColumnGroupPart {
    CoreTableColumnGroup getComponent();
}