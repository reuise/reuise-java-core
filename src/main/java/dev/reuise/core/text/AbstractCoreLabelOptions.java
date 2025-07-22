package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreLabelOptions<S extends AbstractCoreLabelOptions<S>> implements CoreComponentOptions , CoreLabelOptions {
    protected AbstractCoreLabelOptions() {
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