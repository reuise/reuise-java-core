package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreSplitContainerPanelOptions<S extends AbstractCoreSplitContainerPanelOptions<S>> implements CoreComponentOptions , CoreSplitContainerPanelOptions {
    protected AbstractCoreSplitContainerPanelOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultCollapsed(false);
        setDefaultSize(180);
        setDefaultDirection(SplitDirection.VERTICAL);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isCollapsed() {
        return Boolean.TRUE.equals(getOptionValue("collapsed"));
    }

    @Override
    public ComponentOption<Boolean> getCollapsedOption() {
        return ((ComponentOption<Boolean>) (getOption("collapsed")));
    }

    @Override
    public S setCollapsed(Boolean collapsed) {
        setOption("collapsed", collapsed, true);
        return self();
    }

    @Override
    public S setCollapsed(Boolean collapsed, State state) {
        setOption("collapsed", collapsed, state, true);
        return self();
    }

    @Override
    public S setCollapsedAllStates(Boolean collapsed) {
        // HIMADDIE!!
        clearOptionStates("collapsed");
        setCollapsed(collapsed);
        return self();
    }

    @Override
    public S setCollapsed(ScreenSizeValues<Boolean> screenValues) {
        clearOption("collapsed", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setCollapsed(v, s));
        return self();
    }

    @Override
    public boolean isCollapsed(State state) {
        return Boolean.TRUE.equals(getOptionValue("collapsed", state));
    }

    @Override
    public Collection<State> getCollapsedStates() {
        return getOptionStates("collapsed");
    }

    @Override
    public ComponentOption<Boolean> getCollapsedOption(State state) {
        return ((ComponentOption<Boolean>) (getOption("collapsed", state)));
    }

    @Override
    public boolean isCollapsedAnyState() {
        Collection<ComponentOption<?>> values = getOptionValues("collapsed");
        if ((values == null) || values.isEmpty())
            return false;

        return values.stream().anyMatch(e -> ((boolean) (e.getValue())));
    }

    private void setDefaultCollapsed(Boolean collapsed) {
        setDefaultOption("collapsed", collapsed, true);
    }

    private void setDefaultCollapsed(Boolean collapsed, State state) {
        setDefaultOption("collapsed", collapsed, state, true);
    }

    private void setDefaultCollapsedAllStates(Boolean collapsed) {
        // HIMADDIE!!
        clearOptionStates("collapsed");
        setCollapsed(collapsed);
    }

    @Override
    public Object getSize() {
        return ((Object) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<Object> getSizeOption() {
        return ((ComponentOption<Object>) (getOption("size")));
    }

    @Override
    public S setSize(Object size) {
        setOption("size", size, true);
        return self();
    }

    @Override
    public S setSize(Object size, State state) {
        setOption("size", size, state, true);
        return self();
    }

    @Override
    public S setSizeAllStates(Object size) {
        // HIMADDIE!!
        clearOptionStates("size");
        setSize(size);
        return self();
    }

    @Override
    public S setSize(ScreenSizeValues<Object> screenValues) {
        clearOption("size", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setSize(v, s));
        return self();
    }

    @Override
    public Object getSize(State state) {
        return ((Object) (getOptionValue("size", state)));
    }

    @Override
    public Collection<State> getSizeStates() {
        return getOptionStates("size");
    }

    @Override
    public ComponentOption<Object> getSizeOption(State state) {
        return ((ComponentOption<Object>) (getOption("size", state)));
    }

    private void setDefaultSize(Object size) {
        setDefaultOption("size", size, true);
    }

    private void setDefaultSize(Object size, State state) {
        setDefaultOption("size", size, state, true);
    }

    private void setDefaultSizeAllStates(Object size) {
        // HIMADDIE!!
        clearOptionStates("size");
        setSize(size);
    }

    @Override
    public Object getMinSize() {
        return ((Object) (getOptionValue("minSize")));
    }

    @Override
    public ComponentOption<Object> getMinSizeOption() {
        return ((ComponentOption<Object>) (getOption("minSize")));
    }

    @Override
    public S setMinSize(Object minSize) {
        setOption("minSize", minSize, true);
        return self();
    }

    @Override
    public S setMinSize(Object minSize, State state) {
        setOption("minSize", minSize, state, true);
        return self();
    }

    @Override
    public S setMinSizeAllStates(Object minSize) {
        // HIMADDIE!!
        clearOptionStates("minSize");
        setMinSize(minSize);
        return self();
    }

    @Override
    public S setMinSize(ScreenSizeValues<Object> screenValues) {
        clearOption("minSize", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMinSize(v, s));
        return self();
    }

    @Override
    public Object getMinSize(State state) {
        return ((Object) (getOptionValue("minSize", state)));
    }

    @Override
    public Collection<State> getMinSizeStates() {
        return getOptionStates("minSize");
    }

    @Override
    public ComponentOption<Object> getMinSizeOption(State state) {
        return ((ComponentOption<Object>) (getOption("minSize", state)));
    }

    private void setDefaultMinSize(Object minSize) {
        setDefaultOption("minSize", minSize, true);
    }

    private void setDefaultMinSize(Object minSize, State state) {
        setDefaultOption("minSize", minSize, state, true);
    }

    private void setDefaultMinSizeAllStates(Object minSize) {
        // HIMADDIE!!
        clearOptionStates("minSize");
        setMinSize(minSize);
    }

    @Override
    public Object getMaxSize() {
        return ((Object) (getOptionValue("maxSize")));
    }

    @Override
    public ComponentOption<Object> getMaxSizeOption() {
        return ((ComponentOption<Object>) (getOption("maxSize")));
    }

    @Override
    public S setMaxSize(Object maxSize) {
        setOption("maxSize", maxSize, true);
        return self();
    }

    @Override
    public S setMaxSize(Object maxSize, State state) {
        setOption("maxSize", maxSize, state, true);
        return self();
    }

    @Override
    public S setMaxSizeAllStates(Object maxSize) {
        // HIMADDIE!!
        clearOptionStates("maxSize");
        setMaxSize(maxSize);
        return self();
    }

    @Override
    public S setMaxSize(ScreenSizeValues<Object> screenValues) {
        clearOption("maxSize", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMaxSize(v, s));
        return self();
    }

    @Override
    public Object getMaxSize(State state) {
        return ((Object) (getOptionValue("maxSize", state)));
    }

    @Override
    public Collection<State> getMaxSizeStates() {
        return getOptionStates("maxSize");
    }

    @Override
    public ComponentOption<Object> getMaxSizeOption(State state) {
        return ((ComponentOption<Object>) (getOption("maxSize", state)));
    }

    private void setDefaultMaxSize(Object maxSize) {
        setDefaultOption("maxSize", maxSize, true);
    }

    private void setDefaultMaxSize(Object maxSize, State state) {
        setDefaultOption("maxSize", maxSize, state, true);
    }

    private void setDefaultMaxSizeAllStates(Object maxSize) {
        // HIMADDIE!!
        clearOptionStates("maxSize");
        setMaxSize(maxSize);
    }

    @Override
    public SplitDirection getDirection() {
        return ((SplitDirection) (getOptionValue("direction")));
    }

    @Override
    public ComponentOption<SplitDirection> getDirectionOption() {
        return ((ComponentOption<SplitDirection>) (getOption("direction")));
    }

    @Override
    public S setDirection(SplitDirection direction) {
        setOption("direction", direction, true);
        return self();
    }

    @Override
    public S setDirection(SplitDirection direction, State state) {
        setOption("direction", direction, state, true);
        return self();
    }

    @Override
    public S setDirectionAllStates(SplitDirection direction) {
        // HIMADDIE!!
        clearOptionStates("direction");
        setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(ScreenSizeValues<SplitDirection> screenValues) {
        clearOption("direction", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,SplitDirection v) -> setDirection(v, s));
        return self();
    }

    @Override
    public SplitDirection getDirection(State state) {
        return ((SplitDirection) (getOptionValue("direction", state)));
    }

    @Override
    public Collection<State> getDirectionStates() {
        return getOptionStates("direction");
    }

    @Override
    public ComponentOption<SplitDirection> getDirectionOption(State state) {
        return ((ComponentOption<SplitDirection>) (getOption("direction", state)));
    }

    private void setDefaultDirection(SplitDirection direction) {
        setDefaultOption("direction", direction, true);
    }

    private void setDefaultDirection(SplitDirection direction, State state) {
        setDefaultOption("direction", direction, state, true);
    }

    private void setDefaultDirectionAllStates(SplitDirection direction) {
        // HIMADDIE!!
        clearOptionStates("direction");
        setDirection(direction);
    }

    protected abstract S self();
}