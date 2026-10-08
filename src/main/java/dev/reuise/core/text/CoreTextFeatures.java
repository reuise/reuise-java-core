package dev.reuise.core.text;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
public interface CoreTextFeatures {
    boolean isLoading();

    CoreTextFeatures setLoading(Boolean loading);

    CoreSkeletonOptions getSkeletonOptions();

    CoreTextFeatures setSkeletonOptions(CoreSkeletonOptions skeletonOptions);

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

    Object getFontWeight();

    CoreTextFeatures setFontWeight(Object fontWeight);

    CoreTextFeatures setFontWeight(Object fontWeight, State state);

    CoreTextFeatures setFontWeightAllStates(Object fontWeight);

    CoreTextFeatures setFontWeight(ScreenSizeValues<Object> fontWeight);

    Object getFontWeight(State state);

    Object getFontStyle();

    CoreTextFeatures setFontStyle(Object fontStyle);

    CoreTextFeatures setFontStyle(Object fontStyle, State state);

    CoreTextFeatures setFontStyleAllStates(Object fontStyle);

    CoreTextFeatures setFontStyle(ScreenSizeValues<Object> fontStyle);

    Object getFontStyle(State state);

    String getHighlightText();

    CoreTextFeatures setHighlightText(String highlightText);

    CoreTextFeatures setText(Html html);
}
