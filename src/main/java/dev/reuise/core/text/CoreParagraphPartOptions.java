package dev.reuise.core.text;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreParagraphPartOptions {
    String getText();

    ComponentOption<String> getTextOption();

    CoreParagraphPartOptions setText(String text);

    Object getFontSize();

    ComponentOption<Object> getFontSizeOption();

    CoreParagraphPartOptions setFontSize(Object fontSize);

    CoreParagraphPartOptions setFontSize(Object fontSize, State state);

    CoreParagraphPartOptions setFontSizeAllStates(Object fontSize);

    CoreParagraphPartOptions setFontSize(ScreenSizeValues<Object> fontSize);

    Object getFontSize(State state);

    ComponentOption<Object> getFontSizeOption(State state);

    Collection<State> getFontSizeStates();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreParagraphPartOptions setText(Html html);

    CoreComponentFactory getComponentFactory();

    CoreParagraph getComponent();
}