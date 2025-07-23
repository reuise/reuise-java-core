package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTableRowPart extends ComponentPart , CoreTableRowFeatures , CoreParentComponentPart {
    CoreParentComponentPart getParentComponentPart();
}