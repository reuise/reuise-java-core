package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreContainerOptions<S extends AbstractCoreContainerOptions<S>> implements CoreContainerOptions , CoreComponentOptions {
    @Override
    public CoreContainerPartOptions setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        return setBackdropFilter(new BackdropFilterSetting(backdropFilter, value));
    }

    protected AbstractCoreContainerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Object getPadding() {
        return ((Object) (getOptionValue("padding")));
    }

    @Override
    public ComponentOption<Object> getPaddingOption() {
        return ((ComponentOption<Object>) (getOption("padding")));
    }

    @Override
    public S setPadding(Object padding) {
        setOption("padding", padding);
        return self();
    }

    @Override
    public S setPadding(Object padding, State state) {
        setOption("padding", padding, state);
        return self();
    }

    @Override
    public S setPaddingAllStates(Object padding) {
        // HIMADDIE!!
        clearOptionStates("padding");
        setPadding(padding);
        return self();
    }

    @Override
    public S setPadding(ScreenSizeValues<Object> screenValues) {
        clearOption("padding", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setPadding(v, s));
        return self();
    }

    @Override
    public Object getPadding(State state) {
        return ((Object) (getOptionValue("padding", state)));
    }

    @Override
    public Collection<State> getPaddingStates() {
        return getOptionStates("padding");
    }

    @Override
    public ComponentOption<Object> getPaddingOption(State state) {
        return ((ComponentOption<Object>) (getOption("padding", state)));
    }

    private void setDefaultPadding(Object padding) {
        setDefaultOption("padding", padding);
    }

    private void setDefaultPadding(Object padding, State state) {
        setDefaultOption("padding", padding, state);
    }

    private void setDefaultPaddingAllStates(Object padding) {
        // HIMADDIE!!
        clearOptionStates("padding");
        setPadding(padding);
    }

    @Override
    public Object getPaddingTop() {
        return ((Object) (getOptionValue("paddingTop")));
    }

    @Override
    public ComponentOption<Object> getPaddingTopOption() {
        return ((ComponentOption<Object>) (getOption("paddingTop")));
    }

    @Override
    public S setPaddingTop(Object paddingTop) {
        setOption("paddingTop", paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(Object paddingTop, State state) {
        setOption("paddingTop", paddingTop, state);
        return self();
    }

    @Override
    public S setPaddingTopAllStates(Object paddingTop) {
        // HIMADDIE!!
        clearOptionStates("paddingTop");
        setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(ScreenSizeValues<Object> screenValues) {
        clearOption("paddingTop", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setPaddingTop(v, s));
        return self();
    }

    @Override
    public Object getPaddingTop(State state) {
        return ((Object) (getOptionValue("paddingTop", state)));
    }

    @Override
    public Collection<State> getPaddingTopStates() {
        return getOptionStates("paddingTop");
    }

    @Override
    public ComponentOption<Object> getPaddingTopOption(State state) {
        return ((ComponentOption<Object>) (getOption("paddingTop", state)));
    }

    private void setDefaultPaddingTop(Object paddingTop) {
        setDefaultOption("paddingTop", paddingTop);
    }

    private void setDefaultPaddingTop(Object paddingTop, State state) {
        setDefaultOption("paddingTop", paddingTop, state);
    }

    private void setDefaultPaddingTopAllStates(Object paddingTop) {
        // HIMADDIE!!
        clearOptionStates("paddingTop");
        setPaddingTop(paddingTop);
    }

    @Override
    public Object getPaddingRight() {
        return ((Object) (getOptionValue("paddingRight")));
    }

    @Override
    public ComponentOption<Object> getPaddingRightOption() {
        return ((ComponentOption<Object>) (getOption("paddingRight")));
    }

    @Override
    public S setPaddingRight(Object paddingRight) {
        setOption("paddingRight", paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(Object paddingRight, State state) {
        setOption("paddingRight", paddingRight, state);
        return self();
    }

    @Override
    public S setPaddingRightAllStates(Object paddingRight) {
        // HIMADDIE!!
        clearOptionStates("paddingRight");
        setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(ScreenSizeValues<Object> screenValues) {
        clearOption("paddingRight", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setPaddingRight(v, s));
        return self();
    }

    @Override
    public Object getPaddingRight(State state) {
        return ((Object) (getOptionValue("paddingRight", state)));
    }

    @Override
    public Collection<State> getPaddingRightStates() {
        return getOptionStates("paddingRight");
    }

    @Override
    public ComponentOption<Object> getPaddingRightOption(State state) {
        return ((ComponentOption<Object>) (getOption("paddingRight", state)));
    }

    private void setDefaultPaddingRight(Object paddingRight) {
        setDefaultOption("paddingRight", paddingRight);
    }

    private void setDefaultPaddingRight(Object paddingRight, State state) {
        setDefaultOption("paddingRight", paddingRight, state);
    }

    private void setDefaultPaddingRightAllStates(Object paddingRight) {
        // HIMADDIE!!
        clearOptionStates("paddingRight");
        setPaddingRight(paddingRight);
    }

    @Override
    public Object getPaddingBottom() {
        return ((Object) (getOptionValue("paddingBottom")));
    }

    @Override
    public ComponentOption<Object> getPaddingBottomOption() {
        return ((ComponentOption<Object>) (getOption("paddingBottom")));
    }

    @Override
    public S setPaddingBottom(Object paddingBottom) {
        setOption("paddingBottom", paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(Object paddingBottom, State state) {
        setOption("paddingBottom", paddingBottom, state);
        return self();
    }

    @Override
    public S setPaddingBottomAllStates(Object paddingBottom) {
        // HIMADDIE!!
        clearOptionStates("paddingBottom");
        setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(ScreenSizeValues<Object> screenValues) {
        clearOption("paddingBottom", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setPaddingBottom(v, s));
        return self();
    }

    @Override
    public Object getPaddingBottom(State state) {
        return ((Object) (getOptionValue("paddingBottom", state)));
    }

    @Override
    public Collection<State> getPaddingBottomStates() {
        return getOptionStates("paddingBottom");
    }

    @Override
    public ComponentOption<Object> getPaddingBottomOption(State state) {
        return ((ComponentOption<Object>) (getOption("paddingBottom", state)));
    }

    private void setDefaultPaddingBottom(Object paddingBottom) {
        setDefaultOption("paddingBottom", paddingBottom);
    }

    private void setDefaultPaddingBottom(Object paddingBottom, State state) {
        setDefaultOption("paddingBottom", paddingBottom, state);
    }

    private void setDefaultPaddingBottomAllStates(Object paddingBottom) {
        // HIMADDIE!!
        clearOptionStates("paddingBottom");
        setPaddingBottom(paddingBottom);
    }

    @Override
    public Object getPaddingLeft() {
        return ((Object) (getOptionValue("paddingLeft")));
    }

    @Override
    public ComponentOption<Object> getPaddingLeftOption() {
        return ((ComponentOption<Object>) (getOption("paddingLeft")));
    }

    @Override
    public S setPaddingLeft(Object paddingLeft) {
        setOption("paddingLeft", paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(Object paddingLeft, State state) {
        setOption("paddingLeft", paddingLeft, state);
        return self();
    }

    @Override
    public S setPaddingLeftAllStates(Object paddingLeft) {
        // HIMADDIE!!
        clearOptionStates("paddingLeft");
        setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(ScreenSizeValues<Object> screenValues) {
        clearOption("paddingLeft", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setPaddingLeft(v, s));
        return self();
    }

    @Override
    public Object getPaddingLeft(State state) {
        return ((Object) (getOptionValue("paddingLeft", state)));
    }

    @Override
    public Collection<State> getPaddingLeftStates() {
        return getOptionStates("paddingLeft");
    }

    @Override
    public ComponentOption<Object> getPaddingLeftOption(State state) {
        return ((ComponentOption<Object>) (getOption("paddingLeft", state)));
    }

    private void setDefaultPaddingLeft(Object paddingLeft) {
        setDefaultOption("paddingLeft", paddingLeft);
    }

    private void setDefaultPaddingLeft(Object paddingLeft, State state) {
        setDefaultOption("paddingLeft", paddingLeft, state);
    }

    private void setDefaultPaddingLeftAllStates(Object paddingLeft) {
        // HIMADDIE!!
        clearOptionStates("paddingLeft");
        setPaddingLeft(paddingLeft);
    }

    @Override
    public String getPosition() {
        return ((String) (getOptionValue("position")));
    }

    @Override
    public ComponentOption<String> getPositionOption() {
        return ((ComponentOption<String>) (getOption("position")));
    }

    @Override
    public S setPosition(String position) {
        setOption("position", position);
        return self();
    }

    @Override
    public S setPosition(String position, State state) {
        setOption("position", position, state);
        return self();
    }

    @Override
    public S setPositionAllStates(String position) {
        // HIMADDIE!!
        clearOptionStates("position");
        setPosition(position);
        return self();
    }

    @Override
    public S setPosition(ScreenSizeValues<String> screenValues) {
        clearOption("position", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,String v) -> setPosition(v, s));
        return self();
    }

    @Override
    public String getPosition(State state) {
        return ((String) (getOptionValue("position", state)));
    }

    @Override
    public Collection<State> getPositionStates() {
        return getOptionStates("position");
    }

    @Override
    public ComponentOption<String> getPositionOption(State state) {
        return ((ComponentOption<String>) (getOption("position", state)));
    }

    private void setDefaultPosition(String position) {
        setDefaultOption("position", position);
    }

    private void setDefaultPosition(String position, State state) {
        setDefaultOption("position", position, state);
    }

    private void setDefaultPositionAllStates(String position) {
        // HIMADDIE!!
        clearOptionStates("position");
        setPosition(position);
    }

    @Override
    public Object getInset() {
        return ((Object) (getOptionValue("inset")));
    }

    @Override
    public ComponentOption<Object> getInsetOption() {
        return ((ComponentOption<Object>) (getOption("inset")));
    }

    @Override
    public S setInset(Object inset) {
        setOption("inset", inset);
        return self();
    }

    @Override
    public S setInset(Object inset, State state) {
        setOption("inset", inset, state);
        return self();
    }

    @Override
    public S setInsetAllStates(Object inset) {
        // HIMADDIE!!
        clearOptionStates("inset");
        setInset(inset);
        return self();
    }

    @Override
    public S setInset(ScreenSizeValues<Object> screenValues) {
        clearOption("inset", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setInset(v, s));
        return self();
    }

    @Override
    public Object getInset(State state) {
        return ((Object) (getOptionValue("inset", state)));
    }

    @Override
    public Collection<State> getInsetStates() {
        return getOptionStates("inset");
    }

    @Override
    public ComponentOption<Object> getInsetOption(State state) {
        return ((ComponentOption<Object>) (getOption("inset", state)));
    }

    private void setDefaultInset(Object inset) {
        setDefaultOption("inset", inset);
    }

    private void setDefaultInset(Object inset, State state) {
        setDefaultOption("inset", inset, state);
    }

    private void setDefaultInsetAllStates(Object inset) {
        // HIMADDIE!!
        clearOptionStates("inset");
        setInset(inset);
    }

    @Override
    public BackdropFilterSetting getBackdropFilter() {
        return ((BackdropFilterSetting) (getOptionValue("backdropFilter")));
    }

    @Override
    public ComponentOption<BackdropFilterSetting> getBackdropFilterOption() {
        return ((ComponentOption<BackdropFilterSetting>) (getOption("backdropFilter")));
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter) {
        setOption("backdropFilter", backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter, State state) {
        setOption("backdropFilter", backdropFilter, state);
        return self();
    }

    @Override
    public S setBackdropFilterAllStates(BackdropFilterSetting backdropFilter) {
        // HIMADDIE!!
        clearOptionStates("backdropFilter");
        setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(ScreenSizeValues<BackdropFilterSetting> screenValues) {
        clearOption("backdropFilter", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,BackdropFilterSetting v) -> setBackdropFilter(v, s));
        return self();
    }

    @Override
    public BackdropFilterSetting getBackdropFilter(State state) {
        return ((BackdropFilterSetting) (getOptionValue("backdropFilter", state)));
    }

    @Override
    public Collection<State> getBackdropFilterStates() {
        return getOptionStates("backdropFilter");
    }

    @Override
    public ComponentOption<BackdropFilterSetting> getBackdropFilterOption(State state) {
        return ((ComponentOption<BackdropFilterSetting>) (getOption("backdropFilter", state)));
    }

    private void setDefaultBackdropFilter(BackdropFilterSetting backdropFilter) {
        setDefaultOption("backdropFilter", backdropFilter);
    }

    private void setDefaultBackdropFilter(BackdropFilterSetting backdropFilter, State state) {
        setDefaultOption("backdropFilter", backdropFilter, state);
    }

    private void setDefaultBackdropFilterAllStates(BackdropFilterSetting backdropFilter) {
        // HIMADDIE!!
        clearOptionStates("backdropFilter");
        setBackdropFilter(backdropFilter);
    }

    protected abstract S self();
}