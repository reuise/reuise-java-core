package dev.reuise.core.parentcomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreParentComponentOptions<S extends AbstractCoreParentComponentOptions<S>> implements CoreComponentOptions , CoreParentComponentOptions {
    protected AbstractCoreParentComponentOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultChildren(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public List<CoreComponent> getChildren() {
        return ((List<CoreComponent>) (getOptionValue("children")));
    }

    @Override
    public ComponentOption<List<CoreComponent>> getChildrenOption() {
        return ((ComponentOption<List<CoreComponent>>) (getOption("children")));
    }

    @Override
    public S setChildren(List<CoreComponent> children) {
        setOption("children", children);
        return self();
    }

    @Override
    public S setChild(CoreComponent child) {
        setChildren(new ArrayList<CoreComponent>(Arrays.asList(child)));
        return self();
    }

    @Override
    public S removeChild(CoreComponent child) {
        List<CoreComponent> list = getChildren();
        if (list == null) {
            return self();
        }
        list.remove(child);
        return self();
    }

    private void setDefaultChildren(List<CoreComponent> children) {
        setDefaultOption("children", children);
    }

    protected abstract S self();
}