package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreTextBlockOptions<S extends AbstractCoreTextBlockOptions<S>> implements CoreTextBlockOptions , CoreComponentOptions {
    protected AbstractCoreTextBlockOptions() {
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