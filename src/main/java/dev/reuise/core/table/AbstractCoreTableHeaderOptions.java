package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreTableHeaderOptions<S extends AbstractCoreTableHeaderOptions<S>> implements CoreTableHeaderOptions , CoreComponentOptions {
    protected dev.reuise.core.table.CoreTableHeaderRowOptions rowOptions;

    protected AbstractCoreTableHeaderOptions() {
        rowOptions = createDefaultRowOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultFixed(true);
        setDefaultColumns(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isFixed() {
        return Boolean.TRUE.equals(getOptionValue("fixed"));
    }

    @Override
    public ComponentOption<Boolean> getFixedOption() {
        return ((ComponentOption<Boolean>) (getOption("fixed")));
    }

    @Override
    public S setFixed(Boolean fixed) {
        setOption("fixed", fixed);
        setLayoutChildrenFixed(fixed);
        return self();
    }

    protected void setLayoutChildrenFixed(Boolean fixed) {
    }

    private void setDefaultFixed(Boolean fixed) {
        setDefaultOption("fixed", fixed);
        setLayoutChildrenFixed(fixed);
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
        setOption("columns", columns, true);
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
        setDefaultOption("columns", columns, true);
    }

    @Override
    public dev.reuise.core.table.CoreTableHeaderRowOptions getRowOptions() {
        return rowOptions;
    }

    @Override
    public boolean hasRowOptions() {
        return rowOptions != null;
    }

    @Override
    public S setRowOptions(dev.reuise.core.table.CoreTableHeaderRowOptions rowOptions) {
        if (!hasRowOptions())
            this.rowOptions = createDefaultRowOptions();

        // Merge with default options
        this.rowOptions.merge(rowOptions);
        return self();
    }

    protected CoreTableHeaderRowOptions createDefaultRowOptions() {
        CoreTableHeaderRowOptions options = getComponentFactory().createTableHeaderRowOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}