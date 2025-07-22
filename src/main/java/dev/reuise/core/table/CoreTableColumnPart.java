package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTableColumnPart extends ComponentPart , CoreTableColumnFeatures , CoreParentComponentPart {
    CoreParentComponentPart getParentComponentPart();
}