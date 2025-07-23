package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreTableOptions<S extends AbstractCoreTableOptions<S>> implements CoreTableOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions tableOptions;

    protected dev.reuise.core.table.CoreTableColumnGroupOptions columnGroupOptions;

    protected dev.reuise.core.table.CoreTableHeaderOptions headerOptions;

    protected dev.reuise.core.table.CoreTableBodyOptions bodyOptions;

    protected dev.reuise.core.table.CoreTableFooterOptions footerOptions;

    protected AbstractCoreTableOptions() {
        tableOptions = createDefaultTableOptions();
        columnGroupOptions = createDefaultColumnGroupOptions();
        bodyOptions = createDefaultBodyOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultHasHeader(true);
        setDefaultFixedFooter(true);
        setDefaultHasFooter(false);
        setColumns(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isHasHeader() {
        return Boolean.TRUE.equals(getOptionValue("hasHeader"));
    }

    @Override
    public ComponentOption<Boolean> getHasHeaderOption() {
        return ((ComponentOption<Boolean>) (getOption("hasHeader")));
    }

    @Override
    public S setHasHeader(Boolean hasHeader) {
        setOption("hasHeader", hasHeader);
        setLayoutChildrenHasHeader(hasHeader);
        return self();
    }

    protected void setLayoutChildrenHasHeader(Boolean hasHeader) {
    }

    private void setDefaultHasHeader(Boolean hasHeader) {
        setDefaultOption("hasHeader", hasHeader);
        setLayoutChildrenHasHeader(hasHeader);
    }

    @Override
    public boolean isFixedHeader() {
        return Boolean.TRUE.equals(getOptionValue("fixedHeader"));
    }

    @Override
    public ComponentOption<Boolean> getFixedHeaderOption() {
        return ((ComponentOption<Boolean>) (getOption("fixedHeader")));
    }

    @Override
    public S setFixedHeader(Boolean fixedHeader) {
        setOption("fixedHeader", fixedHeader);
        setLayoutChildrenFixedHeader(fixedHeader);
        return self();
    }

    protected void setLayoutChildrenFixedHeader(Boolean fixedHeader) {
        if (headerOptions == null)
            headerOptions = createDefaultHeaderOptions();

        headerOptions.setFixed(fixedHeader);
    }

    private void setDefaultFixedHeader(Boolean fixedHeader) {
        setDefaultOption("fixedHeader", fixedHeader);
        setLayoutChildrenFixedHeader(fixedHeader);
    }

    @Override
    public boolean isFixedFooter() {
        return Boolean.TRUE.equals(getOptionValue("fixedFooter"));
    }

    @Override
    public ComponentOption<Boolean> getFixedFooterOption() {
        return ((ComponentOption<Boolean>) (getOption("fixedFooter")));
    }

    @Override
    public S setFixedFooter(Boolean fixedFooter) {
        setOption("fixedFooter", fixedFooter);
        setLayoutChildrenFixedFooter(fixedFooter);
        return self();
    }

    protected void setLayoutChildrenFixedFooter(Boolean fixedFooter) {
        if (footerOptions == null)
            footerOptions = createDefaultFooterOptions();

        footerOptions.setFixed(fixedFooter);
    }

    private void setDefaultFixedFooter(Boolean fixedFooter) {
        setDefaultOption("fixedFooter", fixedFooter);
        setLayoutChildrenFixedFooter(fixedFooter);
    }

    @Override
    public boolean isHasFooter() {
        return Boolean.TRUE.equals(getOptionValue("hasFooter"));
    }

    @Override
    public ComponentOption<Boolean> getHasFooterOption() {
        return ((ComponentOption<Boolean>) (getOption("hasFooter")));
    }

    @Override
    public S setHasFooter(Boolean hasFooter) {
        setOption("hasFooter", hasFooter);
        setLayoutChildrenHasFooter(hasFooter);
        return self();
    }

    protected void setLayoutChildrenHasFooter(Boolean hasFooter) {
    }

    private void setDefaultHasFooter(Boolean hasFooter) {
        setDefaultOption("hasFooter", hasFooter);
        setLayoutChildrenHasFooter(hasFooter);
    }

    @Override
    public List<CoreTableColumnOptions> getColumns() {
        return ((List<CoreTableColumnOptions>) (getOptionValue("columns")));
    }

    @Override
    public ComponentOption<List<CoreTableColumnOptions>> getColumnsOption() {
        return ((ComponentOption<List<CoreTableColumnOptions>>) (getOption("columns")));
    }

    @Override
    public S setColumns(List<CoreTableColumnOptions> columns) {
        setOption("columns", columns);
        return self();
    }

    @Override
    public S addColumn(CoreTableColumnOptions column) {
        List<CoreTableColumnOptions> list = getColumns();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setColumns(list);
        }
        list.add(column);
        return self();
    }

    @Override
    public S removeColumn(CoreTableColumnOptions column) {
        List<CoreTableColumnOptions> list = getColumns();
        if (list == null) {
            return self();
        }
        list.remove(column);
        return self();
    }

    private void setDefaultColumns(List<CoreTableColumnOptions> columns) {
        setDefaultOption("columns", columns);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getTableOptions() {
        return tableOptions;
    }

    @Override
    public boolean hasTableOptions() {
        return tableOptions != null;
    }

    @Override
    public S setTableOptions(dev.reuise.core.layout.CoreContainerOptions tableOptions) {
        if (!hasTableOptions())
            this.tableOptions = createDefaultTableOptions();

        // Merge with default options
        this.tableOptions.merge(tableOptions);
        return self();
    }

    @Override
    public dev.reuise.core.table.CoreTableColumnGroupOptions getColumnGroupOptions() {
        return columnGroupOptions;
    }

    @Override
    public boolean hasColumnGroupOptions() {
        return columnGroupOptions != null;
    }

    @Override
    public S setColumnGroupOptions(dev.reuise.core.table.CoreTableColumnGroupOptions columnGroupOptions) {
        if (!hasColumnGroupOptions())
            this.columnGroupOptions = createDefaultColumnGroupOptions();

        // Merge with default options
        this.columnGroupOptions.merge(columnGroupOptions);
        return self();
    }

    @Override
    public dev.reuise.core.table.CoreTableHeaderOptions getHeaderOptions() {
        return headerOptions;
    }

    @Override
    public boolean hasHeaderOptions() {
        return headerOptions != null;
    }

    @Override
    public dev.reuise.core.table.CoreTableHeaderOptions getOrCreateHeaderOptions() {
        if (!hasHeaderOptions())
            headerOptions = createDefaultHeaderOptions();

        return headerOptions;
    }

    @Override
    public S setHeaderOptions(dev.reuise.core.table.CoreTableHeaderOptions headerOptions) {
        if (!hasHeaderOptions())
            this.headerOptions = createDefaultHeaderOptions();

        // Merge with default options
        this.headerOptions.merge(headerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.table.CoreTableBodyOptions getBodyOptions() {
        return bodyOptions;
    }

    @Override
    public boolean hasBodyOptions() {
        return bodyOptions != null;
    }

    @Override
    public S setBodyOptions(dev.reuise.core.table.CoreTableBodyOptions bodyOptions) {
        if (!hasBodyOptions())
            this.bodyOptions = createDefaultBodyOptions();

        // Merge with default options
        this.bodyOptions.merge(bodyOptions);
        return self();
    }

    @Override
    public dev.reuise.core.table.CoreTableFooterOptions getFooterOptions() {
        return footerOptions;
    }

    @Override
    public boolean hasFooterOptions() {
        return footerOptions != null;
    }

    @Override
    public dev.reuise.core.table.CoreTableFooterOptions getOrCreateFooterOptions() {
        if (!hasFooterOptions())
            footerOptions = createDefaultFooterOptions();

        return footerOptions;
    }

    @Override
    public S setFooterOptions(dev.reuise.core.table.CoreTableFooterOptions footerOptions) {
        if (!hasFooterOptions())
            this.footerOptions = createDefaultFooterOptions();

        // Merge with default options
        this.footerOptions.merge(footerOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultTableOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreTableColumnGroupOptions createDefaultColumnGroupOptions() {
        CoreTableColumnGroupOptions options = getComponentFactory().createTableColumnGroupOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreTableHeaderOptions createDefaultHeaderOptions() {
        CoreTableHeaderOptions options = getComponentFactory().createTableHeaderOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreTableBodyOptions createDefaultBodyOptions() {
        CoreTableBodyOptions options = getComponentFactory().createTableBodyOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreTableFooterOptions createDefaultFooterOptions() {
        CoreTableFooterOptions options = getComponentFactory().createTableFooterOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected abstract S self();
}