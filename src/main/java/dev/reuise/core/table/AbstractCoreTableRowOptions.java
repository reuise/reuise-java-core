package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreTableRowOptions<S extends AbstractCoreTableRowOptions<S>> implements CoreComponentOptions , CoreTableRowOptions {
    protected AbstractCoreTableRowOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    protected abstract S self();
}