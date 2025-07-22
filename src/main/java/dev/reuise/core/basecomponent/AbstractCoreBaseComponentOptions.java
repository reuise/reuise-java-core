package dev.reuise.core.basecomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.option.DefaultComponentOption;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.theme.Theme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public abstract class AbstractCoreBaseComponentOptions<S extends AbstractCoreBaseComponentOptions<S>> implements CoreBaseComponentOptions , CoreComponentOptions {
    private CoreBaseComponent component;

    @Override
    public void setComponent(CoreBaseComponent component) {
        this.component = component;
    }

    private <T, O extends ComponentOption<?>> O mergeOptions(O v1, O v2) {
        Object v1Value = v1.getValue();
        Object v2Value = v2.getValue();
        if ((v1Value instanceof Collection) && (v2Value instanceof Collection)) {
            T mergedList = ((T) (new ArrayList<>(mergeLists(((Collection<?>) (v1Value)), ((Collection<?>) (v2Value))))));
            return ((O) (new ComponentOption<T>(v1.getName(), mergedList, v1.getIndex(), v1.isForce())));
        }
        return v2 instanceof DefaultComponentOption ? v1 : v2;
    }

    private <T extends Collection<?>> List<?> mergeLists(T list1, T list2) {
        return Stream.of(list1, list2).flatMap(Collection::stream).collect(Collectors.toList());
    }

    protected Map<String, ComponentOption<?>> options;

    private Map<State, Map<String, ComponentOption<?>>> stateOptions;

    private int numOptions = 0;

    public Map<String, ComponentOption<?>> getOptions() {
        return options;
    }

    public Map<String, ComponentOption<?>> getOptions(State state) {
        if (state == null)
            return getOptions();

        if (stateOptions == null)
            stateOptions = new HashMap<>();

        if (stateOptions.containsKey(state))
            return stateOptions.get(state);

        Map<String, ComponentOption<?>> stateOpts = new LinkedHashMap<>();
        stateOptions.put(state, stateOpts);
        return stateOpts;
    }

    protected AbstractCoreBaseComponentOptions() {
        options = new LinkedHashMap<>();
    }

    public ComponentOption<?> getOption(String option) {
        return options.get(option);
    }

    public Collection<State> getOptionStates(String option) {
        Collection<State> states = new ArrayList();
        // Add default state (todo: change to a DefaultState)
        if (options.containsKey(option))
            states.add(null);

        if (stateOptions != null)
            stateOptions.entrySet().stream().filter(e -> e.getValue().containsKey(option)).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(states::add);

        return states;
    }

    public Collection<ComponentOption<?>> getOptionValues(String option) {
        Collection<ComponentOption<?>> values = new ArrayList();
        // Add default state (todo: change to a DefaultState)
        if (options.containsKey(option))
            values.add(options.get(option));

        if (stateOptions != null)
            stateOptions.values().stream().filter(e -> e.containsKey(option)).map(e -> e.get(option)).collect(Collectors.toList()).forEach(values::add);

        return values;
    }

    public Object getOptionValue(String option) {
        ComponentOption<?> value = getOption(option);
        if (value == null)
            return null;

        return value.getValue();
    }

    public ComponentOption<?> getOption(String option, State state) {
        return getOptions(state).get(option);
    }

    public Object getOptionValue(String option, State state) {
        ComponentOption<?> value = getOption(option, state);
        if (value == null)
            return null;

        return value.getValue();
    }

    // Implementation
    public void merge(CoreComponentOptions other) {
        if (other == null)
            return;

        this.options = Stream.of(this.options, other.getOptions()).flatMap(map -> map.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, this::mergeOptions));
    }

    private void setOption(String option, ComponentOption<?> value) {
        options.put(option, value);
        numOptions += 1;
    }

    private <T> void setOption(String option, ComponentOption<T> value, State state) {
        getOptions(state).put(option, value);
        numOptions += 1;
    }

    public <T> void setOption(String option, T value, boolean force) {
        if (checkStateValues(option, value, force, false))
            return;

        setOption(option, new ComponentOption<T>(option, value, numOptions, force));
    }

    public <T> void setDefaultOption(String option, T value, boolean force) {
        if (checkStateValues(option, value, force, true))
            return;

        setOption(option, new DefaultComponentOption<T>(option, value, numOptions, force));
    }

    public <T> void setOption(String option, T value) {
        setOption(option, value, false);
    }

    public <T> void setDefaultOption(String option, T value) {
        setDefaultOption(option, value, false);
    }

    public <T> void setOption(String option, T value, State state, boolean force) {
        if (checkStateValues(option, value, force, false))
            return;

        setOption(option, new ComponentOption<T>(option, value, numOptions, force), state);
    }

    public <T> void setDefaultOption(String option, T value, State state, boolean force) {
        if (checkStateValues(option, value, force, true))
            return;

        setOption(option, new DefaultComponentOption<T>(option, value, numOptions, force), state);
    }

    public <T> void setOption(String option, T value, State state) {
        setOption(option, value, state, false);
    }

    public <T> void setDefaultOption(String option, T value, State state) {
        setDefaultOption(option, value, state, false);
    }

    public void clearOption(String option, State state) {
        getOptions(state).remove(option);
        numOptions -= 1;
    }

    public void clearOption(String option, boolean clearStates) {
        clearOption(option, null);
        if (clearStates)
            clearOptionStates(option);

    }

    public void clearOption(String option) {
        clearOption(option, false);
    }

    public void clearOptionStates(String option) {
        getOptionStates(option).forEach(s -> clearOption(option, s));
    }

    private boolean checkStateValues(String option, Object value, boolean force, boolean isDefaultValue) {
        if (value instanceof ScreenSizeValues) {
            ((ScreenSizeValues<Object>) (value)).iterate((ScreenSize s,Object v) -> {
                if (isDefaultValue)
                    setDefaultOption(option, v, s, force);
                else
                    setOption(option, v, s, force);

            });
            return true;
        }
        return false;
    }

    public Collection<State> getStates() {
        if (stateOptions != null)
            return stateOptions.keySet();

        return null;
    }

    // Implementation
    public <O extends CoreComponentOptions> void initialize(O options) {
        options.onPreInitialize();
    }

    public boolean onPreInitialize() {
        setDefaultRequiredLayoutComponent(false);
        setDefaultDebug(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isMounted() {
        return Boolean.TRUE.equals(getOptionValue("mounted"));
    }

    @Override
    public ComponentOption<Boolean> getMountedOption() {
        return ((ComponentOption<Boolean>) (getOption("mounted")));
    }

    @Override
    public S setMounted(Boolean mounted) {
        setOption("mounted", mounted);
        return self();
    }

    private void setDefaultMounted(Boolean mounted) {
        setDefaultOption("mounted", mounted);
    }

    @Override
    public Object getMargin() {
        return ((Object) (getOptionValue("margin")));
    }

    @Override
    public ComponentOption<Object> getMarginOption() {
        return ((ComponentOption<Object>) (getOption("margin")));
    }

    @Override
    public S setMargin(Object margin) {
        setOption("margin", margin);
        return self();
    }

    @Override
    public S setMargin(Object margin, State state) {
        setOption("margin", margin, state);
        return self();
    }

    @Override
    public S setMarginAllStates(Object margin) {
        // HIMADDIE!!
        clearOptionStates("margin");
        setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(ScreenSizeValues<Object> screenValues) {
        clearOption("margin", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMargin(v, s));
        return self();
    }

    @Override
    public Object getMargin(State state) {
        return ((Object) (getOptionValue("margin", state)));
    }

    @Override
    public Collection<State> getMarginStates() {
        return getOptionStates("margin");
    }

    @Override
    public ComponentOption<Object> getMarginOption(State state) {
        return ((ComponentOption<Object>) (getOption("margin", state)));
    }

    private void setDefaultMargin(Object margin) {
        setDefaultOption("margin", margin);
    }

    private void setDefaultMargin(Object margin, State state) {
        setDefaultOption("margin", margin, state);
    }

    private void setDefaultMarginAllStates(Object margin) {
        // HIMADDIE!!
        clearOptionStates("margin");
        setMargin(margin);
    }

    @Override
    public Object getMarginTop() {
        return ((Object) (getOptionValue("marginTop")));
    }

    @Override
    public ComponentOption<Object> getMarginTopOption() {
        return ((ComponentOption<Object>) (getOption("marginTop")));
    }

    @Override
    public S setMarginTop(Object marginTop) {
        setOption("marginTop", marginTop);
        return self();
    }

    @Override
    public S setMarginTop(Object marginTop, State state) {
        setOption("marginTop", marginTop, state);
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        // HIMADDIE!!
        clearOptionStates("marginTop");
        setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(ScreenSizeValues<Object> screenValues) {
        clearOption("marginTop", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginTop(v, s));
        return self();
    }

    @Override
    public Object getMarginTop(State state) {
        return ((Object) (getOptionValue("marginTop", state)));
    }

    @Override
    public Collection<State> getMarginTopStates() {
        return getOptionStates("marginTop");
    }

    @Override
    public ComponentOption<Object> getMarginTopOption(State state) {
        return ((ComponentOption<Object>) (getOption("marginTop", state)));
    }

    private void setDefaultMarginTop(Object marginTop) {
        setDefaultOption("marginTop", marginTop);
    }

    private void setDefaultMarginTop(Object marginTop, State state) {
        setDefaultOption("marginTop", marginTop, state);
    }

    private void setDefaultMarginTopAllStates(Object marginTop) {
        // HIMADDIE!!
        clearOptionStates("marginTop");
        setMarginTop(marginTop);
    }

    @Override
    public Object getMarginRight() {
        return ((Object) (getOptionValue("marginRight")));
    }

    @Override
    public ComponentOption<Object> getMarginRightOption() {
        return ((ComponentOption<Object>) (getOption("marginRight")));
    }

    @Override
    public S setMarginRight(Object marginRight) {
        setOption("marginRight", marginRight);
        return self();
    }

    @Override
    public S setMarginRight(Object marginRight, State state) {
        setOption("marginRight", marginRight, state);
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        // HIMADDIE!!
        clearOptionStates("marginRight");
        setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(ScreenSizeValues<Object> screenValues) {
        clearOption("marginRight", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginRight(v, s));
        return self();
    }

    @Override
    public Object getMarginRight(State state) {
        return ((Object) (getOptionValue("marginRight", state)));
    }

    @Override
    public Collection<State> getMarginRightStates() {
        return getOptionStates("marginRight");
    }

    @Override
    public ComponentOption<Object> getMarginRightOption(State state) {
        return ((ComponentOption<Object>) (getOption("marginRight", state)));
    }

    private void setDefaultMarginRight(Object marginRight) {
        setDefaultOption("marginRight", marginRight);
    }

    private void setDefaultMarginRight(Object marginRight, State state) {
        setDefaultOption("marginRight", marginRight, state);
    }

    private void setDefaultMarginRightAllStates(Object marginRight) {
        // HIMADDIE!!
        clearOptionStates("marginRight");
        setMarginRight(marginRight);
    }

    @Override
    public Object getMarginBottom() {
        return ((Object) (getOptionValue("marginBottom")));
    }

    @Override
    public ComponentOption<Object> getMarginBottomOption() {
        return ((ComponentOption<Object>) (getOption("marginBottom")));
    }

    @Override
    public S setMarginBottom(Object marginBottom) {
        setOption("marginBottom", marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(Object marginBottom, State state) {
        setOption("marginBottom", marginBottom, state);
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        // HIMADDIE!!
        clearOptionStates("marginBottom");
        setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(ScreenSizeValues<Object> screenValues) {
        clearOption("marginBottom", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginBottom(v, s));
        return self();
    }

    @Override
    public Object getMarginBottom(State state) {
        return ((Object) (getOptionValue("marginBottom", state)));
    }

    @Override
    public Collection<State> getMarginBottomStates() {
        return getOptionStates("marginBottom");
    }

    @Override
    public ComponentOption<Object> getMarginBottomOption(State state) {
        return ((ComponentOption<Object>) (getOption("marginBottom", state)));
    }

    private void setDefaultMarginBottom(Object marginBottom) {
        setDefaultOption("marginBottom", marginBottom);
    }

    private void setDefaultMarginBottom(Object marginBottom, State state) {
        setDefaultOption("marginBottom", marginBottom, state);
    }

    private void setDefaultMarginBottomAllStates(Object marginBottom) {
        // HIMADDIE!!
        clearOptionStates("marginBottom");
        setMarginBottom(marginBottom);
    }

    @Override
    public Object getMarginLeft() {
        return ((Object) (getOptionValue("marginLeft")));
    }

    @Override
    public ComponentOption<Object> getMarginLeftOption() {
        return ((ComponentOption<Object>) (getOption("marginLeft")));
    }

    @Override
    public S setMarginLeft(Object marginLeft) {
        setOption("marginLeft", marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(Object marginLeft, State state) {
        setOption("marginLeft", marginLeft, state);
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        // HIMADDIE!!
        clearOptionStates("marginLeft");
        setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(ScreenSizeValues<Object> screenValues) {
        clearOption("marginLeft", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMarginLeft(v, s));
        return self();
    }

    @Override
    public Object getMarginLeft(State state) {
        return ((Object) (getOptionValue("marginLeft", state)));
    }

    @Override
    public Collection<State> getMarginLeftStates() {
        return getOptionStates("marginLeft");
    }

    @Override
    public ComponentOption<Object> getMarginLeftOption(State state) {
        return ((ComponentOption<Object>) (getOption("marginLeft", state)));
    }

    private void setDefaultMarginLeft(Object marginLeft) {
        setDefaultOption("marginLeft", marginLeft);
    }

    private void setDefaultMarginLeft(Object marginLeft, State state) {
        setDefaultOption("marginLeft", marginLeft, state);
    }

    private void setDefaultMarginLeftAllStates(Object marginLeft) {
        // HIMADDIE!!
        clearOptionStates("marginLeft");
        setMarginLeft(marginLeft);
    }

    @Override
    public Object getWidth() {
        return ((Object) (getOptionValue("width")));
    }

    @Override
    public ComponentOption<Object> getWidthOption() {
        return ((ComponentOption<Object>) (getOption("width")));
    }

    @Override
    public S setWidth(Object width) {
        setOption("width", width);
        return self();
    }

    @Override
    public S setWidth(Object width, State state) {
        setOption("width", width, state);
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        // HIMADDIE!!
        clearOptionStates("width");
        setWidth(width);
        return self();
    }

    @Override
    public S setWidth(ScreenSizeValues<Object> screenValues) {
        clearOption("width", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setWidth(v, s));
        return self();
    }

    @Override
    public Object getWidth(State state) {
        return ((Object) (getOptionValue("width", state)));
    }

    @Override
    public Collection<State> getWidthStates() {
        return getOptionStates("width");
    }

    @Override
    public ComponentOption<Object> getWidthOption(State state) {
        return ((ComponentOption<Object>) (getOption("width", state)));
    }

    private void setDefaultWidth(Object width) {
        setDefaultOption("width", width);
    }

    private void setDefaultWidth(Object width, State state) {
        setDefaultOption("width", width, state);
    }

    private void setDefaultWidthAllStates(Object width) {
        // HIMADDIE!!
        clearOptionStates("width");
        setWidth(width);
    }

    @Override
    public Object getMinWidth() {
        return ((Object) (getOptionValue("minWidth")));
    }

    @Override
    public ComponentOption<Object> getMinWidthOption() {
        return ((ComponentOption<Object>) (getOption("minWidth")));
    }

    @Override
    public S setMinWidth(Object minWidth) {
        setOption("minWidth", minWidth);
        return self();
    }

    @Override
    public S setMinWidth(Object minWidth, State state) {
        setOption("minWidth", minWidth, state);
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        // HIMADDIE!!
        clearOptionStates("minWidth");
        setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(ScreenSizeValues<Object> screenValues) {
        clearOption("minWidth", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMinWidth(v, s));
        return self();
    }

    @Override
    public Object getMinWidth(State state) {
        return ((Object) (getOptionValue("minWidth", state)));
    }

    @Override
    public Collection<State> getMinWidthStates() {
        return getOptionStates("minWidth");
    }

    @Override
    public ComponentOption<Object> getMinWidthOption(State state) {
        return ((ComponentOption<Object>) (getOption("minWidth", state)));
    }

    private void setDefaultMinWidth(Object minWidth) {
        setDefaultOption("minWidth", minWidth);
    }

    private void setDefaultMinWidth(Object minWidth, State state) {
        setDefaultOption("minWidth", minWidth, state);
    }

    private void setDefaultMinWidthAllStates(Object minWidth) {
        // HIMADDIE!!
        clearOptionStates("minWidth");
        setMinWidth(minWidth);
    }

    @Override
    public Object getMaxWidth() {
        return ((Object) (getOptionValue("maxWidth")));
    }

    @Override
    public ComponentOption<Object> getMaxWidthOption() {
        return ((ComponentOption<Object>) (getOption("maxWidth")));
    }

    @Override
    public S setMaxWidth(Object maxWidth) {
        setOption("maxWidth", maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(Object maxWidth, State state) {
        setOption("maxWidth", maxWidth, state);
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        // HIMADDIE!!
        clearOptionStates("maxWidth");
        setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(ScreenSizeValues<Object> screenValues) {
        clearOption("maxWidth", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMaxWidth(v, s));
        return self();
    }

    @Override
    public Object getMaxWidth(State state) {
        return ((Object) (getOptionValue("maxWidth", state)));
    }

    @Override
    public Collection<State> getMaxWidthStates() {
        return getOptionStates("maxWidth");
    }

    @Override
    public ComponentOption<Object> getMaxWidthOption(State state) {
        return ((ComponentOption<Object>) (getOption("maxWidth", state)));
    }

    private void setDefaultMaxWidth(Object maxWidth) {
        setDefaultOption("maxWidth", maxWidth);
    }

    private void setDefaultMaxWidth(Object maxWidth, State state) {
        setDefaultOption("maxWidth", maxWidth, state);
    }

    private void setDefaultMaxWidthAllStates(Object maxWidth) {
        // HIMADDIE!!
        clearOptionStates("maxWidth");
        setMaxWidth(maxWidth);
    }

    @Override
    public Object getHeight() {
        return ((Object) (getOptionValue("height")));
    }

    @Override
    public ComponentOption<Object> getHeightOption() {
        return ((ComponentOption<Object>) (getOption("height")));
    }

    @Override
    public S setHeight(Object height) {
        setOption("height", height);
        return self();
    }

    @Override
    public S setHeight(Object height, State state) {
        setOption("height", height, state);
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        // HIMADDIE!!
        clearOptionStates("height");
        setHeight(height);
        return self();
    }

    @Override
    public S setHeight(ScreenSizeValues<Object> screenValues) {
        clearOption("height", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setHeight(v, s));
        return self();
    }

    @Override
    public Object getHeight(State state) {
        return ((Object) (getOptionValue("height", state)));
    }

    @Override
    public Collection<State> getHeightStates() {
        return getOptionStates("height");
    }

    @Override
    public ComponentOption<Object> getHeightOption(State state) {
        return ((ComponentOption<Object>) (getOption("height", state)));
    }

    private void setDefaultHeight(Object height) {
        setDefaultOption("height", height);
    }

    private void setDefaultHeight(Object height, State state) {
        setDefaultOption("height", height, state);
    }

    private void setDefaultHeightAllStates(Object height) {
        // HIMADDIE!!
        clearOptionStates("height");
        setHeight(height);
    }

    @Override
    public Object getMinHeight() {
        return ((Object) (getOptionValue("minHeight")));
    }

    @Override
    public ComponentOption<Object> getMinHeightOption() {
        return ((ComponentOption<Object>) (getOption("minHeight")));
    }

    @Override
    public S setMinHeight(Object minHeight) {
        setOption("minHeight", minHeight);
        return self();
    }

    @Override
    public S setMinHeight(Object minHeight, State state) {
        setOption("minHeight", minHeight, state);
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        // HIMADDIE!!
        clearOptionStates("minHeight");
        setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(ScreenSizeValues<Object> screenValues) {
        clearOption("minHeight", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMinHeight(v, s));
        return self();
    }

    @Override
    public Object getMinHeight(State state) {
        return ((Object) (getOptionValue("minHeight", state)));
    }

    @Override
    public Collection<State> getMinHeightStates() {
        return getOptionStates("minHeight");
    }

    @Override
    public ComponentOption<Object> getMinHeightOption(State state) {
        return ((ComponentOption<Object>) (getOption("minHeight", state)));
    }

    private void setDefaultMinHeight(Object minHeight) {
        setDefaultOption("minHeight", minHeight);
    }

    private void setDefaultMinHeight(Object minHeight, State state) {
        setDefaultOption("minHeight", minHeight, state);
    }

    private void setDefaultMinHeightAllStates(Object minHeight) {
        // HIMADDIE!!
        clearOptionStates("minHeight");
        setMinHeight(minHeight);
    }

    @Override
    public Object getMaxHeight() {
        return ((Object) (getOptionValue("maxHeight")));
    }

    @Override
    public ComponentOption<Object> getMaxHeightOption() {
        return ((ComponentOption<Object>) (getOption("maxHeight")));
    }

    @Override
    public S setMaxHeight(Object maxHeight) {
        setOption("maxHeight", maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(Object maxHeight, State state) {
        setOption("maxHeight", maxHeight, state);
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        // HIMADDIE!!
        clearOptionStates("maxHeight");
        setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(ScreenSizeValues<Object> screenValues) {
        clearOption("maxHeight", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setMaxHeight(v, s));
        return self();
    }

    @Override
    public Object getMaxHeight(State state) {
        return ((Object) (getOptionValue("maxHeight", state)));
    }

    @Override
    public Collection<State> getMaxHeightStates() {
        return getOptionStates("maxHeight");
    }

    @Override
    public ComponentOption<Object> getMaxHeightOption(State state) {
        return ((ComponentOption<Object>) (getOption("maxHeight", state)));
    }

    private void setDefaultMaxHeight(Object maxHeight) {
        setDefaultOption("maxHeight", maxHeight);
    }

    private void setDefaultMaxHeight(Object maxHeight, State state) {
        setDefaultOption("maxHeight", maxHeight, state);
    }

    private void setDefaultMaxHeightAllStates(Object maxHeight) {
        // HIMADDIE!!
        clearOptionStates("maxHeight");
        setMaxHeight(maxHeight);
    }

    @Override
    public boolean isRequiredLayoutComponent() {
        return Boolean.TRUE.equals(getOptionValue("requiredLayoutComponent"));
    }

    @Override
    public ComponentOption<Boolean> getRequiredLayoutComponentOption() {
        return ((ComponentOption<Boolean>) (getOption("requiredLayoutComponent")));
    }

    @Override
    public S setRequiredLayoutComponent(Boolean requiredLayoutComponent) {
        setOption("requiredLayoutComponent", requiredLayoutComponent);
        return self();
    }

    private void setDefaultRequiredLayoutComponent(Boolean requiredLayoutComponent) {
        setDefaultOption("requiredLayoutComponent", requiredLayoutComponent);
    }

    @Override
    public CoreComponent getParent() {
        return ((CoreComponent) (getOptionValue("parent")));
    }

    @Override
    public ComponentOption<CoreComponent> getParentOption() {
        return ((ComponentOption<CoreComponent>) (getOption("parent")));
    }

    @Override
    public S setParent(CoreComponent parent) {
        setOption("parent", parent);
        return self();
    }

    private void setDefaultParent(CoreComponent parent) {
        setDefaultOption("parent", parent);
    }

    @Override
    public CoreParentComponent getWrapper() {
        return ((CoreParentComponent) (getOptionValue("wrapper")));
    }

    @Override
    public ComponentOption<CoreParentComponent> getWrapperOption() {
        return ((ComponentOption<CoreParentComponent>) (getOption("wrapper")));
    }

    @Override
    public S setWrapper(CoreParentComponent wrapper) {
        setOption("wrapper", wrapper);
        return self();
    }

    private void setDefaultWrapper(CoreParentComponent wrapper) {
        setDefaultOption("wrapper", wrapper);
    }

    @Override
    public Theme getTheme() {
        return ((Theme) (getOptionValue("theme")));
    }

    @Override
    public ComponentOption<Theme> getThemeOption() {
        return ((ComponentOption<Theme>) (getOption("theme")));
    }

    @Override
    public S setTheme(Theme theme) {
        setOption("theme", theme);
        return self();
    }

    private void setDefaultTheme(Theme theme) {
        setDefaultOption("theme", theme);
    }

    @Override
    public boolean isVisible() {
        return Boolean.TRUE.equals(getOptionValue("visible"));
    }

    @Override
    public ComponentOption<Boolean> getVisibleOption() {
        return ((ComponentOption<Boolean>) (getOption("visible")));
    }

    @Override
    public S setVisible(Boolean visible) {
        setOption("visible", visible);
        return self();
    }

    @Override
    public S setVisible(Boolean visible, State state) {
        setOption("visible", visible, state);
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        // HIMADDIE!!
        clearOptionStates("visible");
        setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(ScreenSizeValues<Boolean> screenValues) {
        clearOption("visible", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setVisible(v, s));
        return self();
    }

    @Override
    public boolean isVisible(State state) {
        return Boolean.TRUE.equals(getOptionValue("visible", state));
    }

    @Override
    public Collection<State> getVisibleStates() {
        return getOptionStates("visible");
    }

    @Override
    public ComponentOption<Boolean> getVisibleOption(State state) {
        return ((ComponentOption<Boolean>) (getOption("visible", state)));
    }

    @Override
    public boolean isVisibleAnyState() {
        Collection<ComponentOption<?>> values = getOptionValues("visible");
        if ((values == null) || values.isEmpty())
            return false;

        return values.stream().anyMatch(e -> ((boolean) (e.getValue())));
    }

    private void setDefaultVisible(Boolean visible) {
        setDefaultOption("visible", visible);
    }

    private void setDefaultVisible(Boolean visible, State state) {
        setDefaultOption("visible", visible, state);
    }

    private void setDefaultVisibleAllStates(Boolean visible) {
        // HIMADDIE!!
        clearOptionStates("visible");
        setVisible(visible);
    }

    @Override
    public boolean isEnabled() {
        return Boolean.TRUE.equals(getOptionValue("enabled"));
    }

    @Override
    public ComponentOption<Boolean> getEnabledOption() {
        return ((ComponentOption<Boolean>) (getOption("enabled")));
    }

    @Override
    public S setEnabled(Boolean enabled) {
        setOption("enabled", enabled);
        return self();
    }

    private void setDefaultEnabled(Boolean enabled) {
        setDefaultOption("enabled", enabled);
    }

    @Override
    public boolean isFocused() {
        return Boolean.TRUE.equals(getOptionValue("focused"));
    }

    @Override
    public ComponentOption<Boolean> getFocusedOption() {
        return ((ComponentOption<Boolean>) (getOption("focused")));
    }

    @Override
    public S setFocused(Boolean focused) {
        setOption("focused", focused);
        return self();
    }

    private void setDefaultFocused(Boolean focused) {
        setDefaultOption("focused", focused);
    }

    @Override
    public boolean isDebug() {
        return Boolean.TRUE.equals(getOptionValue("debug"));
    }

    @Override
    public ComponentOption<Boolean> getDebugOption() {
        return ((ComponentOption<Boolean>) (getOption("debug")));
    }

    @Override
    public S setDebug(Boolean debug) {
        setOption("debug", debug, true);
        return self();
    }

    private void setDefaultDebug(Boolean debug) {
        setDefaultOption("debug", debug, true);
    }

    @Override
    public String getDebugId() {
        return ((String) (getOptionValue("debugId")));
    }

    @Override
    public ComponentOption<String> getDebugIdOption() {
        return ((ComponentOption<String>) (getOption("debugId")));
    }

    @Override
    public S setDebugId(String debugId) {
        setOption("debugId", debugId, true);
        return self();
    }

    private void setDefaultDebugId(String debugId) {
        setDefaultOption("debugId", debugId, true);
    }

    protected abstract S self();

    // Implementation
    public CoreBaseComponent getComponent() {
        return component;
    }

    public void setComponent(CoreComponent component) {
    }
}