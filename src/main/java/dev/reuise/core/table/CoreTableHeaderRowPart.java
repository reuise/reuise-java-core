package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTableHeaderRowPart extends ComponentPart , CoreParentComponentPart , CoreTableHeaderRowFeatures {
    CoreParentComponentPart getParentComponentPart();
}