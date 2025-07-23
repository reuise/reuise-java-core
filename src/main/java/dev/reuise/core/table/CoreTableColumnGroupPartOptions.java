package dev.reuise.core.table;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreTableColumnGroupPartOptions {
    List<CoreTableColumnOptions> getColumns();

    ComponentOption<List<CoreTableColumnOptions>> getColumnsOption();

    CoreTableColumnGroupPartOptions setColumns(List<CoreTableColumnOptions> columns);

    CoreTableColumnGroupPartOptions addColumn(CoreTableColumnOptions column);

    CoreTableColumnGroupPartOptions removeColumn(CoreTableColumnOptions column);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreTableColumnGroup getComponent();
}