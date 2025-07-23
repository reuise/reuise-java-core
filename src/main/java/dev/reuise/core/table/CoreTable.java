package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTable extends CoreComponent , CoreParentComponent , CoreTablePart {
    CoreTable getComponent();
}