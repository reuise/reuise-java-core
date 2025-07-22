package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreInlineTextOptions<S extends AbstractCoreInlineTextOptions<S>> implements CoreInlineTextOptions , CoreComponentOptions {
    protected AbstractCoreInlineTextOptions() {
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