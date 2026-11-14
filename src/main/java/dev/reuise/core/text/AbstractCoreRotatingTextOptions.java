package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
import java.util.Map;
public abstract class AbstractCoreRotatingTextOptions<S extends AbstractCoreRotatingTextOptions<S>> implements CoreRotatingTextOptions , CoreComponentOptions {
    protected AbstractCoreRotatingTextOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultDwellMillis(3000);
        setDefaultTransitionMillis(350);
        setDefaultPaused(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public List<Map<String, String>> getItems() {
        return ((List<Map<String, String>>) (getOptionValue("items")));
    }

    @Override
    public ComponentOption<List<Map<String, String>>> getItemsOption() {
        return ((ComponentOption<List<Map<String, String>>>) (getOption("items")));
    }

    @Override
    public S setItems(List<Map<String, String>> items) {
        setOption("items", items);
        return self();
    }

    private void setDefaultItems(List<Map<String, String>> items) {
        setDefaultOption("items", items);
    }

    @Override
    public Integer getDwellMillis() {
        return ((Integer) (getOptionValue("dwellMillis")));
    }

    @Override
    public ComponentOption<Integer> getDwellMillisOption() {
        return ((ComponentOption<Integer>) (getOption("dwellMillis")));
    }

    @Override
    public S setDwellMillis(Integer dwellMillis) {
        setOption("dwellMillis", dwellMillis);
        return self();
    }

    private void setDefaultDwellMillis(Integer dwellMillis) {
        setDefaultOption("dwellMillis", dwellMillis);
    }

    @Override
    public Integer getTransitionMillis() {
        return ((Integer) (getOptionValue("transitionMillis")));
    }

    @Override
    public ComponentOption<Integer> getTransitionMillisOption() {
        return ((ComponentOption<Integer>) (getOption("transitionMillis")));
    }

    @Override
    public S setTransitionMillis(Integer transitionMillis) {
        setOption("transitionMillis", transitionMillis);
        return self();
    }

    private void setDefaultTransitionMillis(Integer transitionMillis) {
        setDefaultOption("transitionMillis", transitionMillis);
    }

    @Override
    public boolean isPaused() {
        return Boolean.TRUE.equals(getOptionValue("paused"));
    }

    @Override
    public ComponentOption<Boolean> getPausedOption() {
        return ((ComponentOption<Boolean>) (getOption("paused")));
    }

    @Override
    public S setPaused(Boolean paused) {
        setOption("paused", paused);
        return self();
    }

    private void setDefaultPaused(Boolean paused) {
        setDefaultOption("paused", paused);
    }

    protected abstract S self();
}
