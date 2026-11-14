package dev.reuise.core.button;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreButtonBarOptions<S extends AbstractCoreButtonBarOptions<S>> implements CoreButtonBarOptions , CoreComponentOptions {
    protected AbstractCoreButtonBarOptions() {
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
