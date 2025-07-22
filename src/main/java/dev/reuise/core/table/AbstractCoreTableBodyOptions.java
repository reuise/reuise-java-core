package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreTableBodyOptions<S extends AbstractCoreTableBodyOptions<S>> implements CoreTableBodyOptions , CoreComponentOptions {
    protected AbstractCoreTableBodyOptions() {
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