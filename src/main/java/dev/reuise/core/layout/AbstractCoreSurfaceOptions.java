package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreSurfaceOptions<S extends AbstractCoreSurfaceOptions<S>> implements CoreComponentOptions , CoreSurfaceOptions {
    protected AbstractCoreSurfaceOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public SurfaceType getType() {
        return ((SurfaceType) (getOptionValue("type")));
    }

    @Override
    public ComponentOption<SurfaceType> getTypeOption() {
        return ((ComponentOption<SurfaceType>) (getOption("type")));
    }

    @Override
    public S setType(SurfaceType type) {
        setOption("type", type);
        return self();
    }

    private void setDefaultType(SurfaceType type) {
        setDefaultOption("type", type);
    }

    protected abstract S self();
}