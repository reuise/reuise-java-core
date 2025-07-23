package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreRowLayoutOptions<S extends AbstractCoreRowLayoutOptions<S>> implements CoreComponentOptions , CoreRowLayoutOptions {
    protected AbstractCoreRowLayoutOptions() {
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