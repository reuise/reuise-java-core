package dev.reuise.core.table;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTableFooter extends CoreComponent , CoreParentComponent , CoreTableFooterPart {
    CoreTableFooter getComponent();
}