package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreParagraphOptions<S extends AbstractCoreParagraphOptions<S>> implements CoreParagraphOptions , CoreComponentOptions {
    @Override
    public S setText(Html html) {
        if (html != null)
            setText(html.toString());

        return self();
    }

    protected AbstractCoreParagraphOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
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

    protected abstract S self();
}