package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableColumn extends CoreComponent , CoreParentComponent , CoreTableColumnPart {
    CoreTableColumn getComponent();
}