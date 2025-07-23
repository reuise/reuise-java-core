package dev.reuise.core.text;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreTextPartOptions {
    String getText();

    ComponentOption<String> getTextOption();

    CoreTextPartOptions setText(String text);

    Object getFontSize();

    ComponentOption<Object> getFontSizeOption();

    CoreTextPartOptions setFontSize(Object fontSize);

    CoreTextPartOptions setFontSize(Object fontSize, State state);

    CoreTextPartOptions setFontSizeAllStates(Object fontSize);

    CoreTextPartOptions setFontSize(ScreenSizeValues<Object> fontSize);

    Object getFontSize(State state);

    ComponentOption<Object> getFontSizeOption(State state);

    Collection<State> getFontSizeStates();

    Object getLineHeight();

    ComponentOption<Object> getLineHeightOption();

    CoreTextPartOptions setLineHeight(Object lineHeight);

    CoreTextPartOptions setLineHeight(Object lineHeight, State state);

    CoreTextPartOptions setLineHeightAllStates(Object lineHeight);

    CoreTextPartOptions setLineHeight(ScreenSizeValues<Object> lineHeight);

    Object getLineHeight(State state);

    ComponentOption<Object> getLineHeightOption(State state);

    Collection<State> getLineHeightStates();

    String getHighlightText();

    ComponentOption<String> getHighlightTextOption();

    CoreTextPartOptions setHighlightText(String highlightText);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreTextPartOptions setText(Html html);

    CoreComponentFactory getComponentFactory();

    CoreText getComponent();
}