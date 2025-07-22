package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTableHeaderPart extends ComponentPart , CoreParentComponentPart , CoreTableHeaderFeatures {
    CoreTableHeaderRow getRow();

    CoreParentComponentPart getParentComponentPart();
}