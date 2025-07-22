package dev.reuise.core.table;
import java.util.List;
public interface CoreTableColumnGroupFeatures {
    List<CoreTableColumnOptions> getColumns();

    CoreTableColumnGroupFeatures setColumns(List<CoreTableColumnOptions> columns);

    CoreTableColumnGroupFeatures addColumn(CoreTableColumnOptions column);

    CoreTableColumnGroupFeatures removeColumn(CoreTableColumnOptions column);
}