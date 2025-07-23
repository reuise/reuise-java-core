package dev.reuise.core.table;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreTableHeaderPartOptions {
    boolean isFixed();

    ComponentOption<Boolean> getFixedOption();

    CoreTableHeaderPartOptions setFixed(Boolean fixed);

    List<CoreTableColumnOptions> getColumns();

    ComponentOption<List<CoreTableColumnOptions>> getColumnsOption();

    CoreTableHeaderPartOptions setColumns(List<CoreTableColumnOptions> columns);

    CoreTableHeaderPartOptions addColumn(CoreTableColumnOptions column);

    CoreTableHeaderPartOptions removeColumn(CoreTableColumnOptions column);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreTableHeaderRowOptions getRowOptions();

    CoreTableHeaderPartOptions setRowOptions(CoreTableHeaderRowOptions rowOptions);

    boolean hasRowOptions();

    ComponentCreator<? extends CoreTableHeaderRow, ? extends CoreTableHeaderRowOptions> getRowCreator();

    CoreComponentFactory getComponentFactory();

    CoreTableHeader getComponent();
}