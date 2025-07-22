package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreScrollableContainerEdgeOptions<S extends AbstractCoreScrollableContainerEdgeOptions<S>> implements CoreScrollableContainerEdgeOptions , CoreComponentOptions {
    protected AbstractCoreScrollableContainerEdgeOptions() {
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