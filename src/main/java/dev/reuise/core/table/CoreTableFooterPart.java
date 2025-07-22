package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTableFooterPart extends CoreTableFooterFeatures , ComponentPart , CoreParentComponentPart {
    CoreParentComponentPart getParentComponentPart();
}