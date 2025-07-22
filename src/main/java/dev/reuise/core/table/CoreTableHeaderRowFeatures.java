package dev.reuise.core.table;
import java.util.List;
public interface CoreTableHeaderRowFeatures {
    List<CoreTableColumnOptions> getColumns();

    CoreTableHeaderRowFeatures setColumns(List<CoreTableColumnOptions> columns);

    CoreTableHeaderRowFeatures addColumn(CoreTableColumnOptions column);

    CoreTableHeaderRowFeatures removeColumn(CoreTableColumnOptions column);
}