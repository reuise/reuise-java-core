package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreColumnLayoutOptions<S extends AbstractCoreColumnLayoutOptions<S>> implements CoreColumnLayoutOptions , CoreComponentOptions {
    protected AbstractCoreColumnLayoutOptions() {
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