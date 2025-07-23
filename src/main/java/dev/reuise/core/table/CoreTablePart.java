package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTablePart extends ComponentPart , CoreTableFeatures , CoreParentComponentPart {
    CoreContainer getTable();

    CoreTableColumnGroup getColumnGroup();

    CoreTableHeader getHeader();

    CoreTableBody getBody();

    CoreTableFooter getFooter();

    CoreParentComponentPart getParentComponentPart();
}