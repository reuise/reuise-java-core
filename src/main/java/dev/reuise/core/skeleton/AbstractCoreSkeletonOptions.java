package dev.reuise.core.skeleton;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreSkeletonOptions<S extends AbstractCoreSkeletonOptions<S>> implements CoreComponentOptions , CoreSkeletonOptions {
    protected AbstractCoreSkeletonOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultShape(SkeletonShape.RECTANGULAR);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public SkeletonShape getShape() {
        return ((SkeletonShape) (getOptionValue("shape")));
    }

    @Override
    public ComponentOption<SkeletonShape> getShapeOption() {
        return ((ComponentOption<SkeletonShape>) (getOption("shape")));
    }

    @Override
    public S setShape(SkeletonShape shape) {
        setOption("shape", shape);
        return self();
    }

    private void setDefaultShape(SkeletonShape shape) {
        setDefaultOption("shape", shape);
    }

    protected abstract S self();
}