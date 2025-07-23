package dev.reuise.core.dropzone;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreDropZoneOptions<S extends AbstractCoreDropZoneOptions<S>> implements CoreComponentOptions , CoreDropZoneOptions {
    protected AbstractCoreDropZoneOptions() {
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