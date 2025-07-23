package dev.reuise.core.text;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreParagraphFeatures {
    String getText();

    CoreParagraphFeatures setText(String text);

    Object getFontSize();

    CoreParagraphFeatures setFontSize(Object fontSize);

    CoreParagraphFeatures setFontSize(Object fontSize, State state);

    CoreParagraphFeatures setFontSizeAllStates(Object fontSize);

    CoreParagraphFeatures setFontSize(ScreenSizeValues<Object> fontSize);

    Object getFontSize(State state);

    CoreParagraphFeatures setText(Html html);
}