package dev.reuise.core.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreSlideContainerEdgeOptions<S extends AbstractCoreSlideContainerEdgeOptions<S>> implements CoreSlideContainerEdgeOptions , CoreComponentOptions {
    protected AbstractCoreSlideContainerEdgeOptions() {
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