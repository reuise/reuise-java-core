package dev.reuise.core.bottomappbar;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreBottomAppBarOptions<S extends AbstractCoreBottomAppBarOptions<S>> implements CoreComponentOptions , CoreBottomAppBarOptions {
    protected AbstractCoreBottomAppBarOptions() {
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