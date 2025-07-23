package dev.reuise.core.applayout;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreAppLayoutBodyOptions<S extends AbstractCoreAppLayoutBodyOptions<S>> implements CoreAppLayoutBodyOptions , CoreComponentOptions {
    protected AbstractCoreAppLayoutBodyOptions() {
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