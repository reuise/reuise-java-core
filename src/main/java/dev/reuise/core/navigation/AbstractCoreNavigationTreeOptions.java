package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreNavigationTreeOptions<S extends AbstractCoreNavigationTreeOptions<S>> implements CoreNavigationTreeOptions , CoreComponentOptions {
    protected AbstractCoreNavigationTreeOptions() {
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
