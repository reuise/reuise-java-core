package dev.reuise.core.table;
import java.util.List;
public interface CoreTableFeatures {
    boolean isHasHeader();

    CoreTableFeatures setHasHeader(Boolean hasHeader);

    boolean isFixedHeader();

    CoreTableFeatures setFixedHeader(Boolean fixedHeader);

    boolean isFixedFooter();

    CoreTableFeatures setFixedFooter(Boolean fixedFooter);

    boolean isHasFooter();

    CoreTableFeatures setHasFooter(Boolean hasFooter);

    List<CoreTableColumnOptions> getColumns();

    CoreTableFeatures setColumns(List<CoreTableColumnOptions> columns);

    CoreTableFeatures addColumn(CoreTableColumnOptions column);

    CoreTableFeatures removeColumn(CoreTableColumnOptions column);
}