package dev.reuise.core.table;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreTablePartOptions {
    boolean isHasHeader();

    ComponentOption<Boolean> getHasHeaderOption();

    CoreTablePartOptions setHasHeader(Boolean hasHeader);

    boolean isFixedHeader();

    ComponentOption<Boolean> getFixedHeaderOption();

    CoreTablePartOptions setFixedHeader(Boolean fixedHeader);

    boolean isFixedFooter();

    ComponentOption<Boolean> getFixedFooterOption();

    CoreTablePartOptions setFixedFooter(Boolean fixedFooter);

    boolean isHasFooter();

    ComponentOption<Boolean> getHasFooterOption();

    CoreTablePartOptions setHasFooter(Boolean hasFooter);

    List<CoreTableColumnOptions> getColumns();

    ComponentOption<List<CoreTableColumnOptions>> getColumnsOption();

    CoreTablePartOptions setColumns(List<CoreTableColumnOptions> columns);

    CoreTablePartOptions addColumn(CoreTableColumnOptions column);

    CoreTablePartOptions removeColumn(CoreTableColumnOptions column);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getTableOptions();

    CoreTablePartOptions setTableOptions(CoreContainerOptions tableOptions);

    boolean hasTableOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getTableCreator();

    CoreTableColumnGroupOptions getColumnGroupOptions();

    CoreTablePartOptions setColumnGroupOptions(CoreTableColumnGroupOptions columnGroupOptions);

    boolean hasColumnGroupOptions();

    ComponentCreator<? extends CoreTableColumnGroup, ? extends CoreTableColumnGroupOptions> getColumnGroupCreator();

    CoreTableHeaderOptions getHeaderOptions();

    CoreTableHeaderOptions getOrCreateHeaderOptions();

    CoreTablePartOptions setHeaderOptions(CoreTableHeaderOptions headerOptions);

    boolean hasHeaderOptions();

    ComponentCreator<? extends CoreTableHeader, ? extends CoreTableHeaderOptions> getHeaderCreator();

    CoreTableBodyOptions getBodyOptions();

    CoreTablePartOptions setBodyOptions(CoreTableBodyOptions bodyOptions);

    boolean hasBodyOptions();

    ComponentCreator<? extends CoreTableBody, ? extends CoreTableBodyOptions> getBodyCreator();

    CoreTableFooterOptions getFooterOptions();

    CoreTableFooterOptions getOrCreateFooterOptions();

    CoreTablePartOptions setFooterOptions(CoreTableFooterOptions footerOptions);

    boolean hasFooterOptions();

    ComponentCreator<? extends CoreTableFooter, ? extends CoreTableFooterOptions> getFooterCreator();

    CoreComponentFactory getComponentFactory();

    CoreTable getComponent();
}