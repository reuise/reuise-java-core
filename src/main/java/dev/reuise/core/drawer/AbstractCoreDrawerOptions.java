package dev.reuise.core.drawer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.applayout.CoreAppLayout;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreDrawerOptions<S extends AbstractCoreDrawerOptions<S>> implements CoreDrawerOptions , CoreComponentOptions {
    protected AbstractCoreDrawerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultTransitionDuration(300);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isResizable() {
        return Boolean.TRUE.equals(getOptionValue("resizable"));
    }

    @Override
    public ComponentOption<Boolean> getResizableOption() {
        return ((ComponentOption<Boolean>) (getOption("resizable")));
    }

    @Override
    public S setResizable(Boolean resizable) {
        setOption("resizable", resizable, true);
        return self();
    }

    private void setDefaultResizable(Boolean resizable) {
        setDefaultOption("resizable", resizable, true);
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
    public DrawerPosition getDrawerPosition() {
        return ((DrawerPosition) (getOptionValue("drawerPosition")));
    }

    @Override
    public ComponentOption<DrawerPosition> getDrawerPositionOption() {
        return ((ComponentOption<DrawerPosition>) (getOption("drawerPosition")));
    }

    @Override
    public S setDrawerPosition(DrawerPosition drawerPosition) {
        setOption("drawerPosition", drawerPosition);
        return self();
    }

    @Override
    public S setDrawerPosition(DrawerPosition drawerPosition, State state) {
        setOption("drawerPosition", drawerPosition, state);
        return self();
    }

    @Override
    public S setDrawerPositionAllStates(DrawerPosition drawerPosition) {
        // HIMADDIE!!
        clearOptionStates("drawerPosition");
        setDrawerPosition(drawerPosition);
        return self();
    }

    @Override
    public S setDrawerPosition(ScreenSizeValues<DrawerPosition> screenValues) {
        clearOption("drawerPosition", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,DrawerPosition v) -> setDrawerPosition(v, s));
        return self();
    }

    @Override
    public DrawerPosition getDrawerPosition(State state) {
        return ((DrawerPosition) (getOptionValue("drawerPosition", state)));
    }

    @Override
    public Collection<State> getDrawerPositionStates() {
        return getOptionStates("drawerPosition");
    }

    @Override
    public ComponentOption<DrawerPosition> getDrawerPositionOption(State state) {
        return ((ComponentOption<DrawerPosition>) (getOption("drawerPosition", state)));
    }

    private void setDefaultDrawerPosition(DrawerPosition drawerPosition) {
        setDefaultOption("drawerPosition", drawerPosition);
    }

    private void setDefaultDrawerPosition(DrawerPosition drawerPosition, State state) {
        setDefaultOption("drawerPosition", drawerPosition, state);
    }

    private void setDefaultDrawerPositionAllStates(DrawerPosition drawerPosition) {
        // HIMADDIE!!
        clearOptionStates("drawerPosition");
        setDrawerPosition(drawerPosition);
    }

    @Override
    public boolean isOpen() {
        return Boolean.TRUE.equals(getOptionValue("open"));
    }

    @Override
    public ComponentOption<Boolean> getOpenOption() {
        return ((ComponentOption<Boolean>) (getOption("open")));
    }

    @Override
    public S setOpen(Boolean open) {
        setOption("open", open);
        return self();
    }

    private void setDefaultOpen(Boolean open) {
        setDefaultOption("open", open);
    }

    @Override
    public Integer getTransitionDuration() {
        return ((Integer) (getOptionValue("transitionDuration")));
    }

    @Override
    public ComponentOption<Integer> getTransitionDurationOption() {
        return ((ComponentOption<Integer>) (getOption("transitionDuration")));
    }

    @Override
    public S setTransitionDuration(Integer transitionDuration) {
        setOption("transitionDuration", transitionDuration, true);
        return self();
    }

    private void setDefaultTransitionDuration(Integer transitionDuration) {
        setDefaultOption("transitionDuration", transitionDuration, true);
    }

    @Override
    public CoreAppLayout getAppLayout() {
        return ((CoreAppLayout) (getOptionValue("appLayout")));
    }

    @Override
    public ComponentOption<CoreAppLayout> getAppLayoutOption() {
        return ((ComponentOption<CoreAppLayout>) (getOption("appLayout")));
    }

    @Override
    public S setAppLayout(CoreAppLayout appLayout) {
        setOption("appLayout", appLayout);
        return self();
    }

    private void setDefaultAppLayout(CoreAppLayout appLayout) {
        setDefaultOption("appLayout", appLayout);
    }

    protected abstract S self();
}