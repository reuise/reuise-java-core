package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTableCellPart extends ComponentPart , CoreTableCellFeatures , CoreParentComponentPart {
    CoreParentComponentPart getParentComponentPart();
}