package dev.reuise.core.table;
import java.util.List;
public interface CoreTableHeaderFeatures {
    boolean isFixed();

    CoreTableHeaderFeatures setFixed(Boolean fixed);

    List<CoreTableColumnOptions> getColumns();

    CoreTableHeaderFeatures setColumns(List<CoreTableColumnOptions> columns);

    CoreTableHeaderFeatures addColumn(CoreTableColumnOptions column);

    CoreTableHeaderFeatures removeColumn(CoreTableColumnOptions column);
}