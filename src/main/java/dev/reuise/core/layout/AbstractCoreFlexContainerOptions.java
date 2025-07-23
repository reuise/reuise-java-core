package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreFlexContainerOptions<S extends AbstractCoreFlexContainerOptions<S>> implements CoreComponentOptions , CoreFlexContainerOptions {
    protected AbstractCoreFlexContainerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultDirection(FlexDirection.ROW);
        setDefaultWrap(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public FlexDirection getDirection() {
        return ((FlexDirection) (getOptionValue("direction")));
    }

    @Override
    public ComponentOption<FlexDirection> getDirectionOption() {
        return ((ComponentOption<FlexDirection>) (getOption("direction")));
    }

    @Override
    public S setDirection(FlexDirection direction) {
        setOption("direction", direction);
        return self();
    }

    @Override
    public S setDirection(FlexDirection direction, State state) {
        setOption("direction", direction, state);
        return self();
    }

    @Override
    public S setDirectionAllStates(FlexDirection direction) {
        // HIMADDIE!!
        clearOptionStates("direction");
        setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(ScreenSizeValues<FlexDirection> screenValues) {
        clearOption("direction", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,FlexDirection v) -> setDirection(v, s));
        return self();
    }

    @Override
    public FlexDirection getDirection(State state) {
        return ((FlexDirection) (getOptionValue("direction", state)));
    }

    @Override
    public Collection<State> getDirectionStates() {
        return getOptionStates("direction");
    }

    @Override
    public ComponentOption<FlexDirection> getDirectionOption(State state) {
        return ((ComponentOption<FlexDirection>) (getOption("direction", state)));
    }

    private void setDefaultDirection(FlexDirection direction) {
        setDefaultOption("direction", direction);
    }

    private void setDefaultDirection(FlexDirection direction, State state) {
        setDefaultOption("direction", direction, state);
    }

    private void setDefaultDirectionAllStates(FlexDirection direction) {
        // HIMADDIE!!
        clearOptionStates("direction");
        setDirection(direction);
    }

    @Override
    public JustifyContent getJustifyContent() {
        return ((JustifyContent) (getOptionValue("justifyContent")));
    }

    @Override
    public ComponentOption<JustifyContent> getJustifyContentOption() {
        return ((ComponentOption<JustifyContent>) (getOption("justifyContent")));
    }

    @Override
    public S setJustifyContent(JustifyContent justifyContent) {
        setOption("justifyContent", justifyContent);
        return self();
    }

    @Override
    public S setJustifyContent(JustifyContent justifyContent, State state) {
        setOption("justifyContent", justifyContent, state);
        return self();
    }

    @Override
    public S setJustifyContentAllStates(JustifyContent justifyContent) {
        // HIMADDIE!!
        clearOptionStates("justifyContent");
        setJustifyContent(justifyContent);
        return self();
    }

    @Override
    public S setJustifyContent(ScreenSizeValues<JustifyContent> screenValues) {
        clearOption("justifyContent", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,JustifyContent v) -> setJustifyContent(v, s));
        return self();
    }

    @Override
    public JustifyContent getJustifyContent(State state) {
        return ((JustifyContent) (getOptionValue("justifyContent", state)));
    }

    @Override
    public Collection<State> getJustifyContentStates() {
        return getOptionStates("justifyContent");
    }

    @Override
    public ComponentOption<JustifyContent> getJustifyContentOption(State state) {
        return ((ComponentOption<JustifyContent>) (getOption("justifyContent", state)));
    }

    private void setDefaultJustifyContent(JustifyContent justifyContent) {
        setDefaultOption("justifyContent", justifyContent);
    }

    private void setDefaultJustifyContent(JustifyContent justifyContent, State state) {
        setDefaultOption("justifyContent", justifyContent, state);
    }

    private void setDefaultJustifyContentAllStates(JustifyContent justifyContent) {
        // HIMADDIE!!
        clearOptionStates("justifyContent");
        setJustifyContent(justifyContent);
    }

    @Override
    public AlignItems getAlignItems() {
        return ((AlignItems) (getOptionValue("alignItems")));
    }

    @Override
    public ComponentOption<AlignItems> getAlignItemsOption() {
        return ((ComponentOption<AlignItems>) (getOption("alignItems")));
    }

    @Override
    public S setAlignItems(AlignItems alignItems) {
        setOption("alignItems", alignItems);
        return self();
    }

    @Override
    public S setAlignItems(AlignItems alignItems, State state) {
        setOption("alignItems", alignItems, state);
        return self();
    }

    @Override
    public S setAlignItemsAllStates(AlignItems alignItems) {
        // HIMADDIE!!
        clearOptionStates("alignItems");
        setAlignItems(alignItems);
        return self();
    }

    @Override
    public S setAlignItems(ScreenSizeValues<AlignItems> screenValues) {
        clearOption("alignItems", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,AlignItems v) -> setAlignItems(v, s));
        return self();
    }

    @Override
    public AlignItems getAlignItems(State state) {
        return ((AlignItems) (getOptionValue("alignItems", state)));
    }

    @Override
    public Collection<State> getAlignItemsStates() {
        return getOptionStates("alignItems");
    }

    @Override
    public ComponentOption<AlignItems> getAlignItemsOption(State state) {
        return ((ComponentOption<AlignItems>) (getOption("alignItems", state)));
    }

    private void setDefaultAlignItems(AlignItems alignItems) {
        setDefaultOption("alignItems", alignItems);
    }

    private void setDefaultAlignItems(AlignItems alignItems, State state) {
        setDefaultOption("alignItems", alignItems, state);
    }

    private void setDefaultAlignItemsAllStates(AlignItems alignItems) {
        // HIMADDIE!!
        clearOptionStates("alignItems");
        setAlignItems(alignItems);
    }

    @Override
    public Object getColumnGap() {
        return ((Object) (getOptionValue("columnGap")));
    }

    @Override
    public ComponentOption<Object> getColumnGapOption() {
        return ((ComponentOption<Object>) (getOption("columnGap")));
    }

    @Override
    public S setColumnGap(Object columnGap) {
        setOption("columnGap", columnGap);
        return self();
    }

    @Override
    public S setColumnGap(Object columnGap, State state) {
        setOption("columnGap", columnGap, state);
        return self();
    }

    @Override
    public S setColumnGapAllStates(Object columnGap) {
        // HIMADDIE!!
        clearOptionStates("columnGap");
        setColumnGap(columnGap);
        return self();
    }

    @Override
    public S setColumnGap(ScreenSizeValues<Object> screenValues) {
        clearOption("columnGap", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setColumnGap(v, s));
        return self();
    }

    @Override
    public Object getColumnGap(State state) {
        return ((Object) (getOptionValue("columnGap", state)));
    }

    @Override
    public Collection<State> getColumnGapStates() {
        return getOptionStates("columnGap");
    }

    @Override
    public ComponentOption<Object> getColumnGapOption(State state) {
        return ((ComponentOption<Object>) (getOption("columnGap", state)));
    }

    private void setDefaultColumnGap(Object columnGap) {
        setDefaultOption("columnGap", columnGap);
    }

    private void setDefaultColumnGap(Object columnGap, State state) {
        setDefaultOption("columnGap", columnGap, state);
    }

    private void setDefaultColumnGapAllStates(Object columnGap) {
        // HIMADDIE!!
        clearOptionStates("columnGap");
        setColumnGap(columnGap);
    }

    @Override
    public Object getRowGap() {
        return ((Object) (getOptionValue("rowGap")));
    }

    @Override
    public ComponentOption<Object> getRowGapOption() {
        return ((ComponentOption<Object>) (getOption("rowGap")));
    }

    @Override
    public S setRowGap(Object rowGap) {
        setOption("rowGap", rowGap);
        return self();
    }

    @Override
    public S setRowGap(Object rowGap, State state) {
        setOption("rowGap", rowGap, state);
        return self();
    }

    @Override
    public S setRowGapAllStates(Object rowGap) {
        // HIMADDIE!!
        clearOptionStates("rowGap");
        setRowGap(rowGap);
        return self();
    }

    @Override
    public S setRowGap(ScreenSizeValues<Object> screenValues) {
        clearOption("rowGap", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setRowGap(v, s));
        return self();
    }

    @Override
    public Object getRowGap(State state) {
        return ((Object) (getOptionValue("rowGap", state)));
    }

    @Override
    public Collection<State> getRowGapStates() {
        return getOptionStates("rowGap");
    }

    @Override
    public ComponentOption<Object> getRowGapOption(State state) {
        return ((ComponentOption<Object>) (getOption("rowGap", state)));
    }

    private void setDefaultRowGap(Object rowGap) {
        setDefaultOption("rowGap", rowGap);
    }

    private void setDefaultRowGap(Object rowGap, State state) {
        setDefaultOption("rowGap", rowGap, state);
    }

    private void setDefaultRowGapAllStates(Object rowGap) {
        // HIMADDIE!!
        clearOptionStates("rowGap");
        setRowGap(rowGap);
    }

    @Override
    public Object getGap() {
        return ((Object) (getOptionValue("gap")));
    }

    @Override
    public ComponentOption<Object> getGapOption() {
        return ((ComponentOption<Object>) (getOption("gap")));
    }

    @Override
    public S setGap(Object gap) {
        setOption("gap", gap);
        return self();
    }

    @Override
    public S setGap(Object gap, State state) {
        setOption("gap", gap, state);
        return self();
    }

    @Override
    public S setGapAllStates(Object gap) {
        // HIMADDIE!!
        clearOptionStates("gap");
        setGap(gap);
        return self();
    }

    @Override
    public S setGap(ScreenSizeValues<Object> screenValues) {
        clearOption("gap", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setGap(v, s));
        return self();
    }

    @Override
    public Object getGap(State state) {
        return ((Object) (getOptionValue("gap", state)));
    }

    @Override
    public Collection<State> getGapStates() {
        return getOptionStates("gap");
    }

    @Override
    public ComponentOption<Object> getGapOption(State state) {
        return ((ComponentOption<Object>) (getOption("gap", state)));
    }

    private void setDefaultGap(Object gap) {
        setDefaultOption("gap", gap);
    }

    private void setDefaultGap(Object gap, State state) {
        setDefaultOption("gap", gap, state);
    }

    private void setDefaultGapAllStates(Object gap) {
        // HIMADDIE!!
        clearOptionStates("gap");
        setGap(gap);
    }

    @Override
    public boolean isWrap() {
        return Boolean.TRUE.equals(getOptionValue("wrap"));
    }

    @Override
    public ComponentOption<Boolean> getWrapOption() {
        return ((ComponentOption<Boolean>) (getOption("wrap")));
    }

    @Override
    public S setWrap(Boolean wrap) {
        setOption("wrap", wrap);
        return self();
    }

    @Override
    public S setWrap(Boolean wrap, State state) {
        setOption("wrap", wrap, state);
        return self();
    }

    @Override
    public S setWrapAllStates(Boolean wrap) {
        // HIMADDIE!!
        clearOptionStates("wrap");
        setWrap(wrap);
        return self();
    }

    @Override
    public S setWrap(ScreenSizeValues<Boolean> screenValues) {
        clearOption("wrap", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setWrap(v, s));
        return self();
    }

    @Override
    public boolean isWrap(State state) {
        return Boolean.TRUE.equals(getOptionValue("wrap", state));
    }

    @Override
    public Collection<State> getWrapStates() {
        return getOptionStates("wrap");
    }

    @Override
    public ComponentOption<Boolean> getWrapOption(State state) {
        return ((ComponentOption<Boolean>) (getOption("wrap", state)));
    }

    @Override
    public boolean isWrapAnyState() {
        Collection<ComponentOption<?>> values = getOptionValues("wrap");
        if ((values == null) || values.isEmpty())
            return false;

        return values.stream().anyMatch(e -> ((boolean) (e.getValue())));
    }

    private void setDefaultWrap(Boolean wrap) {
        setDefaultOption("wrap", wrap);
    }

    private void setDefaultWrap(Boolean wrap, State state) {
        setDefaultOption("wrap", wrap, state);
    }

    private void setDefaultWrapAllStates(Boolean wrap) {
        // HIMADDIE!!
        clearOptionStates("wrap");
        setWrap(wrap);
    }

    protected abstract S self();
}