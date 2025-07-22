package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreSplitContainerOptions<S extends AbstractCoreSplitContainerOptions<S>> implements CoreComponentOptions , CoreSplitContainerOptions {
    protected dev.reuise.core.layout.CoreContainerOptions containerOptions;

    protected dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions startPanelOptions;

    protected dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions dividerOptions;

    protected dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions endPanelOptions;

    protected AbstractCoreSplitContainerOptions() {
        containerOptions = createDefaultContainerOptions();
        startPanelOptions = createDefaultStartPanelOptions();
        dividerOptions = createDefaultDividerOptions();
        endPanelOptions = createDefaultEndPanelOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultDirection(SplitDirection.VERTICAL);
        setDefaultReverseDirection(false);
        setDefaultResizable(false);
        setDefaultSplitPosition(200);
        return true;
    }

    public void onInitialize() {
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
        setLayoutChildrenDirection(direction);
        return self();
    }

    @Override
    public S setDirection(SplitDirection direction, State state) {
        setOption("direction", direction, state, true);
        setLayoutChildrenDirection(direction, state);
        return self();
    }

    @Override
    public S setDirectionAllStates(SplitDirection direction) {
        // HIMADDIE!!
        clearOptionStates("direction");
        setDirection(direction);
        setLayoutChildrenDirection(direction);
        return self();
    }

    @Override
    public S setDirection(ScreenSizeValues<SplitDirection> screenValues) {
        clearOption("direction", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,SplitDirection v) -> setDirection(v, s));
        setLayoutChildrenDirection(screenValues);
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

    protected void setLayoutChildrenDirection(SplitDirection direction) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setDirection(direction);
    }

    protected void setLayoutChildrenDirection(SplitDirection direction, State state) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setDirection(direction, state);
    }

    protected void setLayoutChildrenDirection(ScreenSizeValues<SplitDirection> direction) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setDirection(direction);
    }

    private void setDefaultDirection(SplitDirection direction) {
        setDefaultOption("direction", direction, true);
        setLayoutChildrenDirection(direction);
    }

    private void setDefaultDirection(SplitDirection direction, State state) {
        setDefaultOption("direction", direction, state, true);
        setLayoutChildrenDirection(direction, state);
    }

    private void setDefaultDirectionAllStates(SplitDirection direction) {
        // HIMADDIE!!
        clearOptionStates("direction");
        setDirection(direction);
        setLayoutChildrenDirection(direction);
    }

    @Override
    public boolean isReverseDirection() {
        return Boolean.TRUE.equals(getOptionValue("reverseDirection"));
    }

    @Override
    public ComponentOption<Boolean> getReverseDirectionOption() {
        return ((ComponentOption<Boolean>) (getOption("reverseDirection")));
    }

    @Override
    public S setReverseDirection(Boolean reverseDirection) {
        setOption("reverseDirection", reverseDirection, true);
        setLayoutChildrenReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public S setReverseDirection(Boolean reverseDirection, State state) {
        setOption("reverseDirection", reverseDirection, state, true);
        setLayoutChildrenReverseDirection(reverseDirection, state);
        return self();
    }

    @Override
    public S setReverseDirectionAllStates(Boolean reverseDirection) {
        // HIMADDIE!!
        clearOptionStates("reverseDirection");
        setReverseDirection(reverseDirection);
        setLayoutChildrenReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public S setReverseDirection(ScreenSizeValues<Boolean> screenValues) {
        clearOption("reverseDirection", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setReverseDirection(v, s));
        setLayoutChildrenReverseDirection(screenValues);
        return self();
    }

    @Override
    public boolean isReverseDirection(State state) {
        return Boolean.TRUE.equals(getOptionValue("reverseDirection", state));
    }

    @Override
    public Collection<State> getReverseDirectionStates() {
        return getOptionStates("reverseDirection");
    }

    @Override
    public ComponentOption<Boolean> getReverseDirectionOption(State state) {
        return ((ComponentOption<Boolean>) (getOption("reverseDirection", state)));
    }

    @Override
    public boolean isReverseDirectionAnyState() {
        Collection<ComponentOption<?>> values = getOptionValues("reverseDirection");
        if ((values == null) || values.isEmpty())
            return false;

        return values.stream().anyMatch(e -> ((boolean) (e.getValue())));
    }

    protected void setLayoutChildrenReverseDirection(Boolean reverseDirection) {
    }

    protected void setLayoutChildrenReverseDirection(Boolean reverseDirection, State state) {
    }

    protected void setLayoutChildrenReverseDirection(ScreenSizeValues<Boolean> reverseDirection) {
    }

    private void setDefaultReverseDirection(Boolean reverseDirection) {
        setDefaultOption("reverseDirection", reverseDirection, true);
        setLayoutChildrenReverseDirection(reverseDirection);
    }

    private void setDefaultReverseDirection(Boolean reverseDirection, State state) {
        setDefaultOption("reverseDirection", reverseDirection, state, true);
        setLayoutChildrenReverseDirection(reverseDirection, state);
    }

    private void setDefaultReverseDirectionAllStates(Boolean reverseDirection) {
        // HIMADDIE!!
        clearOptionStates("reverseDirection");
        setReverseDirection(reverseDirection);
        setLayoutChildrenReverseDirection(reverseDirection);
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
        setLayoutChildrenResizable(resizable);
        return self();
    }

    protected void setLayoutChildrenResizable(Boolean resizable) {
    }

    private void setDefaultResizable(Boolean resizable) {
        setDefaultOption("resizable", resizable, true);
        setLayoutChildrenResizable(resizable);
    }

    @Override
    public Object getSplitPosition() {
        return ((Object) (getOptionValue("splitPosition")));
    }

    @Override
    public ComponentOption<Object> getSplitPositionOption() {
        return ((ComponentOption<Object>) (getOption("splitPosition")));
    }

    @Override
    public S setSplitPosition(Object splitPosition) {
        setOption("splitPosition", splitPosition);
        setLayoutChildrenSplitPosition(splitPosition);
        return self();
    }

    @Override
    public S setSplitPosition(Object splitPosition, State state) {
        setOption("splitPosition", splitPosition, state);
        setLayoutChildrenSplitPosition(splitPosition, state);
        return self();
    }

    @Override
    public S setSplitPositionAllStates(Object splitPosition) {
        // HIMADDIE!!
        clearOptionStates("splitPosition");
        setSplitPosition(splitPosition);
        setLayoutChildrenSplitPosition(splitPosition);
        return self();
    }

    @Override
    public S setSplitPosition(ScreenSizeValues<Object> screenValues) {
        clearOption("splitPosition", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setSplitPosition(v, s));
        setLayoutChildrenSplitPosition(screenValues);
        return self();
    }

    @Override
    public Object getSplitPosition(State state) {
        return ((Object) (getOptionValue("splitPosition", state)));
    }

    @Override
    public Collection<State> getSplitPositionStates() {
        return getOptionStates("splitPosition");
    }

    @Override
    public ComponentOption<Object> getSplitPositionOption(State state) {
        return ((ComponentOption<Object>) (getOption("splitPosition", state)));
    }

    protected void setLayoutChildrenSplitPosition(Object splitPosition) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setSize(splitPosition);
    }

    protected void setLayoutChildrenSplitPosition(Object splitPosition, State state) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setSize(splitPosition, state);
    }

    protected void setLayoutChildrenSplitPosition(ScreenSizeValues<Object> splitPosition) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setSize(splitPosition);
    }

    private void setDefaultSplitPosition(Object splitPosition) {
        setDefaultOption("splitPosition", splitPosition);
        setLayoutChildrenSplitPosition(splitPosition);
    }

    private void setDefaultSplitPosition(Object splitPosition, State state) {
        setDefaultOption("splitPosition", splitPosition, state);
        setLayoutChildrenSplitPosition(splitPosition, state);
    }

    private void setDefaultSplitPositionAllStates(Object splitPosition) {
        // HIMADDIE!!
        clearOptionStates("splitPosition");
        setSplitPosition(splitPosition);
        setLayoutChildrenSplitPosition(splitPosition);
    }

    @Override
    public Object getMinSplitPosition() {
        return ((Object) (getOptionValue("minSplitPosition")));
    }

    @Override
    public ComponentOption<Object> getMinSplitPositionOption() {
        return ((ComponentOption<Object>) (getOption("minSplitPosition")));
    }

    @Override
    public S setMinSplitPosition(Object minSplitPosition) {
        setOption("minSplitPosition", minSplitPosition);
        setLayoutChildrenMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public S setMinSplitPosition(Object minSplitPosition, State state) {
        setOption("minSplitPosition", minSplitPosition, state);
        setLayoutChildrenMinSplitPosition(minSplitPosition, state);
        return self();
    }

    @Override
    public S setMinSplitPositionAllStates(Object minSplitPosition) {
        // HIMADDIE!!
        clearOptionStates("minSplitPosition");
        setMinSplitPosition(minSplitPosition);
        setLayoutChildrenMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public S setMinSplitPosition(ScreenSizeValues<Object> screenValues) {
        clearOption("minSplitPosition", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMinSplitPosition(v, s));
        setLayoutChildrenMinSplitPosition(screenValues);
        return self();
    }

    @Override
    public Object getMinSplitPosition(State state) {
        return ((Object) (getOptionValue("minSplitPosition", state)));
    }

    @Override
    public Collection<State> getMinSplitPositionStates() {
        return getOptionStates("minSplitPosition");
    }

    @Override
    public ComponentOption<Object> getMinSplitPositionOption(State state) {
        return ((ComponentOption<Object>) (getOption("minSplitPosition", state)));
    }

    protected void setLayoutChildrenMinSplitPosition(Object minSplitPosition) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setMinSize(minSplitPosition);
    }

    protected void setLayoutChildrenMinSplitPosition(Object minSplitPosition, State state) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setMinSize(minSplitPosition, state);
    }

    protected void setLayoutChildrenMinSplitPosition(ScreenSizeValues<Object> minSplitPosition) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setMinSize(minSplitPosition);
    }

    private void setDefaultMinSplitPosition(Object minSplitPosition) {
        setDefaultOption("minSplitPosition", minSplitPosition);
        setLayoutChildrenMinSplitPosition(minSplitPosition);
    }

    private void setDefaultMinSplitPosition(Object minSplitPosition, State state) {
        setDefaultOption("minSplitPosition", minSplitPosition, state);
        setLayoutChildrenMinSplitPosition(minSplitPosition, state);
    }

    private void setDefaultMinSplitPositionAllStates(Object minSplitPosition) {
        // HIMADDIE!!
        clearOptionStates("minSplitPosition");
        setMinSplitPosition(minSplitPosition);
        setLayoutChildrenMinSplitPosition(minSplitPosition);
    }

    @Override
    public Object getMaxSplitPosition() {
        return ((Object) (getOptionValue("maxSplitPosition")));
    }

    @Override
    public ComponentOption<Object> getMaxSplitPositionOption() {
        return ((ComponentOption<Object>) (getOption("maxSplitPosition")));
    }

    @Override
    public S setMaxSplitPosition(Object maxSplitPosition) {
        setOption("maxSplitPosition", maxSplitPosition);
        setLayoutChildrenMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public S setMaxSplitPosition(Object maxSplitPosition, State state) {
        setOption("maxSplitPosition", maxSplitPosition, state);
        setLayoutChildrenMaxSplitPosition(maxSplitPosition, state);
        return self();
    }

    @Override
    public S setMaxSplitPositionAllStates(Object maxSplitPosition) {
        // HIMADDIE!!
        clearOptionStates("maxSplitPosition");
        setMaxSplitPosition(maxSplitPosition);
        setLayoutChildrenMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public S setMaxSplitPosition(ScreenSizeValues<Object> screenValues) {
        clearOption("maxSplitPosition", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMaxSplitPosition(v, s));
        setLayoutChildrenMaxSplitPosition(screenValues);
        return self();
    }

    @Override
    public Object getMaxSplitPosition(State state) {
        return ((Object) (getOptionValue("maxSplitPosition", state)));
    }

    @Override
    public Collection<State> getMaxSplitPositionStates() {
        return getOptionStates("maxSplitPosition");
    }

    @Override
    public ComponentOption<Object> getMaxSplitPositionOption(State state) {
        return ((ComponentOption<Object>) (getOption("maxSplitPosition", state)));
    }

    protected void setLayoutChildrenMaxSplitPosition(Object maxSplitPosition) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setMaxSize(maxSplitPosition);
    }

    protected void setLayoutChildrenMaxSplitPosition(Object maxSplitPosition, State state) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setMaxSize(maxSplitPosition, state);
    }

    protected void setLayoutChildrenMaxSplitPosition(ScreenSizeValues<Object> maxSplitPosition) {
        if (startPanelOptions == null)
            startPanelOptions = createDefaultStartPanelOptions();

        startPanelOptions.setMaxSize(maxSplitPosition);
    }

    private void setDefaultMaxSplitPosition(Object maxSplitPosition) {
        setDefaultOption("maxSplitPosition", maxSplitPosition);
        setLayoutChildrenMaxSplitPosition(maxSplitPosition);
    }

    private void setDefaultMaxSplitPosition(Object maxSplitPosition, State state) {
        setDefaultOption("maxSplitPosition", maxSplitPosition, state);
        setLayoutChildrenMaxSplitPosition(maxSplitPosition, state);
    }

    private void setDefaultMaxSplitPositionAllStates(Object maxSplitPosition) {
        // HIMADDIE!!
        clearOptionStates("maxSplitPosition");
        setMaxSplitPosition(maxSplitPosition);
        setLayoutChildrenMaxSplitPosition(maxSplitPosition);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getContainerOptions() {
        return containerOptions;
    }

    @Override
    public boolean hasContainerOptions() {
        return containerOptions != null;
    }

    @Override
    public S setContainerOptions(dev.reuise.core.layout.CoreContainerOptions containerOptions) {
        if (!hasContainerOptions())
            this.containerOptions = createDefaultContainerOptions();

        // Merge with default options
        this.containerOptions.merge(containerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions getStartPanelOptions() {
        return startPanelOptions;
    }

    @Override
    public boolean hasStartPanelOptions() {
        return startPanelOptions != null;
    }

    @Override
    public S setStartPanelOptions(dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions startPanelOptions) {
        if (!hasStartPanelOptions())
            this.startPanelOptions = createDefaultStartPanelOptions();

        // Merge with default options
        this.startPanelOptions.merge(startPanelOptions);
        return self();
    }

    @Override
    public dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions getDividerOptions() {
        return dividerOptions;
    }

    @Override
    public boolean hasDividerOptions() {
        return dividerOptions != null;
    }

    @Override
    public S setDividerOptions(dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions dividerOptions) {
        if (!hasDividerOptions())
            this.dividerOptions = createDefaultDividerOptions();

        // Merge with default options
        this.dividerOptions.merge(dividerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions getEndPanelOptions() {
        return endPanelOptions;
    }

    @Override
    public boolean hasEndPanelOptions() {
        return endPanelOptions != null;
    }

    @Override
    public S setEndPanelOptions(dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions endPanelOptions) {
        if (!hasEndPanelOptions())
            this.endPanelOptions = createDefaultEndPanelOptions();

        // Merge with default options
        this.endPanelOptions.merge(endPanelOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreSplitContainerPanelOptions createDefaultStartPanelOptions() {
        CoreSplitContainerPanelOptions options = getComponentFactory().createSplitContainerPanelOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreSplitContainerDividerOptions createDefaultDividerOptions() {
        CoreSplitContainerDividerOptions options = getComponentFactory().createSplitContainerDividerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreSplitContainerPanelOptions createDefaultEndPanelOptions() {
        CoreSplitContainerPanelOptions options = getComponentFactory().createSplitContainerPanelOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}