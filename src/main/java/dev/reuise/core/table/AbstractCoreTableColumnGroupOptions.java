package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreTableColumnGroupOptions<S extends AbstractCoreTableColumnGroupOptions<S>> implements CoreTableColumnGroupOptions , CoreComponentOptions {
    protected AbstractCoreTableColumnGroupOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultColumns(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
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

    protected abstract S self();
}