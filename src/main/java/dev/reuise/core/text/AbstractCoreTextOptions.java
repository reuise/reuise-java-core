package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import java.util.Collection;
import static dev.reuise.core.text.AbstractCoreTextOptionsImpl.self;
public abstract class AbstractCoreTextOptions<S extends AbstractCoreTextOptions<S>> implements CoreTextOptions , CoreComponentOptions {
    @Override
    public S setText(Html html) {
        if (html != null)
            setText(html.toString());

        return self();
    }

    protected AbstractCoreTextOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isLoading() {
        return Boolean.TRUE.equals(getOptionValue("loading"));
    }

    @Override
    public ComponentOption<Boolean> getLoadingOption() {
        return ((ComponentOption<Boolean>) (getOption("loading")));
    }

    @Override
    public S setLoading(Boolean loading) {
        setOption("loading", loading);
        return self();
    }

    private void setDefaultLoading(Boolean loading) {
        setDefaultOption("loading", loading);
    }

    @Override
    public CoreSkeletonOptions getSkeletonOptions() {
        return ((CoreSkeletonOptions) (getOptionValue("skeletonOptions")));
    }

    @Override
    public ComponentOption<CoreSkeletonOptions> getSkeletonOptionsOption() {
        return ((ComponentOption<CoreSkeletonOptions>) (getOption("skeletonOptions")));
    }

    @Override
    public S setSkeletonOptions(CoreSkeletonOptions skeletonOptions) {
        setOption("skeletonOptions", skeletonOptions);
        return self();
    }

    private void setDefaultSkeletonOptions(CoreSkeletonOptions skeletonOptions) {
        setDefaultOption("skeletonOptions", skeletonOptions);
    }

    @Override
    public String getText() {
        return ((String) (getOptionValue("text")));
    }

    @Override
    public ComponentOption<String> getTextOption() {
        return ((ComponentOption<String>) (getOption("text")));
    }

    @Override
    public S setText(String text) {
        setOption("text", text);
        return self();
    }

    private void setDefaultText(String text) {
        setDefaultOption("text", text);
    }

    @Override
    public Object getFontSize() {
        return ((Object) (getOptionValue("fontSize")));
    }

    @Override
    public ComponentOption<Object> getFontSizeOption() {
        return ((ComponentOption<Object>) (getOption("fontSize")));
    }

    @Override
    public S setFontSize(Object fontSize) {
        setOption("fontSize", fontSize);
        return self();
    }

    @Override
    public S setFontSize(Object fontSize, State state) {
        setOption("fontSize", fontSize, state);
        return self();
    }

    @Override
    public S setFontSizeAllStates(Object fontSize) {
        // HIMADDIE!!
        clearOptionStates("fontSize");
        setFontSize(fontSize);
        return self();
    }

    @Override
    public S setFontSize(ScreenSizeValues<Object> screenValues) {
        clearOption("fontSize", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setFontSize(v, s));
        return self();
    }

    @Override
    public Object getFontSize(State state) {
        return ((Object) (getOptionValue("fontSize", state)));
    }

    @Override
    public Collection<State> getFontSizeStates() {
        return getOptionStates("fontSize");
    }

    @Override
    public ComponentOption<Object> getFontSizeOption(State state) {
        return ((ComponentOption<Object>) (getOption("fontSize", state)));
    }

    private void setDefaultFontSize(Object fontSize) {
        setDefaultOption("fontSize", fontSize);
    }

    private void setDefaultFontSize(Object fontSize, State state) {
        setDefaultOption("fontSize", fontSize, state);
    }

    private void setDefaultFontSizeAllStates(Object fontSize) {
        // HIMADDIE!!
        clearOptionStates("fontSize");
        setFontSize(fontSize);
    }

    @Override
    public Object getLineHeight() {
        return ((Object) (getOptionValue("lineHeight")));
    }

    @Override
    public ComponentOption<Object> getLineHeightOption() {
        return ((ComponentOption<Object>) (getOption("lineHeight")));
    }

    @Override
    public S setLineHeight(Object lineHeight) {
        setOption("lineHeight", lineHeight);
        return self();
    }

    @Override
    public S setLineHeight(Object lineHeight, State state) {
        setOption("lineHeight", lineHeight, state);
        return self();
    }

    @Override
    public S setLineHeightAllStates(Object lineHeight) {
        // HIMADDIE!!
        clearOptionStates("lineHeight");
        setLineHeight(lineHeight);
        return self();
    }

    @Override
    public S setLineHeight(ScreenSizeValues<Object> screenValues) {
        clearOption("lineHeight", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setLineHeight(v, s));
        return self();
    }

    @Override
    public Object getLineHeight(State state) {
        return ((Object) (getOptionValue("lineHeight", state)));
    }

    @Override
    public Collection<State> getLineHeightStates() {
        return getOptionStates("lineHeight");
    }

    @Override
    public ComponentOption<Object> getLineHeightOption(State state) {
        return ((ComponentOption<Object>) (getOption("lineHeight", state)));
    }

    private void setDefaultLineHeight(Object lineHeight) {
        setDefaultOption("lineHeight", lineHeight);
    }

    private void setDefaultLineHeight(Object lineHeight, State state) {
        setDefaultOption("lineHeight", lineHeight, state);
    }

    private void setDefaultLineHeightAllStates(Object lineHeight) {
        // HIMADDIE!!
        clearOptionStates("lineHeight");
        setLineHeight(lineHeight);
    }

    @Override
    public Object getFontWeight() {
        return ((Object) (getOptionValue("fontWeight")));
    }

    @Override
    public ComponentOption<Object> getFontWeightOption() {
        return ((ComponentOption<Object>) (getOption("fontWeight")));
    }

    @Override
    public S setFontWeight(Object fontWeight) {
        setOption("fontWeight", fontWeight);
        return self();
    }

    @Override
    public S setFontWeight(Object fontWeight, State state) {
        setOption("fontWeight", fontWeight, state);
        return self();
    }

    @Override
    public S setFontWeightAllStates(Object fontWeight) {
        // HIMADDIE!!
        clearOptionStates("fontWeight");
        setFontWeight(fontWeight);
        return self();
    }

    @Override
    public S setFontWeight(ScreenSizeValues<Object> screenValues) {
        clearOption("fontWeight", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setFontWeight(v, s));
        return self();
    }

    @Override
    public Object getFontWeight(State state) {
        return ((Object) (getOptionValue("fontWeight", state)));
    }

    @Override
    public Collection<State> getFontWeightStates() {
        return getOptionStates("fontWeight");
    }

    @Override
    public ComponentOption<Object> getFontWeightOption(State state) {
        return ((ComponentOption<Object>) (getOption("fontWeight", state)));
    }

    private void setDefaultFontWeight(Object fontWeight) {
        setDefaultOption("fontWeight", fontWeight);
    }

    private void setDefaultFontWeight(Object fontWeight, State state) {
        setDefaultOption("fontWeight", fontWeight, state);
    }

    private void setDefaultFontWeightAllStates(Object fontWeight) {
        // HIMADDIE!!
        clearOptionStates("fontWeight");
        setFontWeight(fontWeight);
    }

    @Override
    public Object getFontStyle() {
        return ((Object) (getOptionValue("fontStyle")));
    }

    @Override
    public ComponentOption<Object> getFontStyleOption() {
        return ((ComponentOption<Object>) (getOption("fontStyle")));
    }

    @Override
    public S setFontStyle(Object fontStyle) {
        setOption("fontStyle", fontStyle);
        return self();
    }

    @Override
    public S setFontStyle(Object fontStyle, State state) {
        setOption("fontStyle", fontStyle, state);
        return self();
    }

    @Override
    public S setFontStyleAllStates(Object fontStyle) {
        // HIMADDIE!!
        clearOptionStates("fontStyle");
        setFontStyle(fontStyle);
        return self();
    }

    @Override
    public S setFontStyle(ScreenSizeValues<Object> screenValues) {
        clearOption("fontStyle", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Object v) -> setFontStyle(v, s));
        return self();
    }

    @Override
    public Object getFontStyle(State state) {
        return ((Object) (getOptionValue("fontStyle", state)));
    }

    @Override
    public Collection<State> getFontStyleStates() {
        return getOptionStates("fontStyle");
    }

    @Override
    public ComponentOption<Object> getFontStyleOption(State state) {
        return ((ComponentOption<Object>) (getOption("fontStyle", state)));
    }

    private void setDefaultFontStyle(Object fontStyle) {
        setDefaultOption("fontStyle", fontStyle);
    }

    private void setDefaultFontStyle(Object fontStyle, State state) {
        setDefaultOption("fontStyle", fontStyle, state);
    }

    private void setDefaultFontStyleAllStates(Object fontStyle) {
        // HIMADDIE!!
        clearOptionStates("fontStyle");
        setFontStyle(fontStyle);
    }

    @Override
    public String getHighlightText() {
        return ((String) (getOptionValue("highlightText")));
    }

    @Override
    public ComponentOption<String> getHighlightTextOption() {
        return ((ComponentOption<String>) (getOption("highlightText")));
    }

    @Override
    public S setHighlightText(String highlightText) {
        setOption("highlightText", highlightText);
        return self();
    }

    private void setDefaultHighlightText(String highlightText) {
        setDefaultOption("highlightText", highlightText);
    }

    protected abstract S self();
}
