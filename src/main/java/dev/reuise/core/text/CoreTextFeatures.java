package dev.reuise.core.text;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreTextFeatures {
    String getText();

    CoreTextFeatures setText(String text);

    Object getFontSize();

    CoreTextFeatures setFontSize(Object fontSize);

    CoreTextFeatures setFontSize(Object fontSize, State state);

    CoreTextFeatures setFontSizeAllStates(Object fontSize);

    CoreTextFeatures setFontSize(ScreenSizeValues<Object> fontSize);

    Object getFontSize(State state);

    Object getLineHeight();

    CoreTextFeatures setLineHeight(Object lineHeight);

    CoreTextFeatures setLineHeight(Object lineHeight, State state);

    CoreTextFeatures setLineHeightAllStates(Object lineHeight);

    CoreTextFeatures setLineHeight(ScreenSizeValues<Object> lineHeight);

    Object getLineHeight(State state);

    String getHighlightText();

    CoreTextFeatures setHighlightText(String highlightText);

    CoreTextFeatures setText(Html html);
}