package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTableBodyPart extends ComponentPart , CoreTableBodyFeatures , CoreParentComponentPart {
    CoreParentComponentPart getParentComponentPart();
}