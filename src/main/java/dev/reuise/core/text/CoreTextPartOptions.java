package dev.reuise.core.text;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.Html;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import java.util.Collection;
public interface CoreTextPartOptions {
    boolean isLoading();

    ComponentOption<Boolean> getLoadingOption();

    CoreTextPartOptions setLoading(Boolean loading);

    CoreSkeletonOptions getSkeletonOptions();

    ComponentOption<CoreSkeletonOptions> getSkeletonOptionsOption();

    CoreTextPartOptions setSkeletonOptions(CoreSkeletonOptions skeletonOptions);

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

    Object getFontWeight();

    ComponentOption<Object> getFontWeightOption();

    CoreTextPartOptions setFontWeight(Object fontWeight);

    CoreTextPartOptions setFontWeight(Object fontWeight, State state);

    CoreTextPartOptions setFontWeightAllStates(Object fontWeight);

    CoreTextPartOptions setFontWeight(ScreenSizeValues<Object> fontWeight);

    Object getFontWeight(State state);

    ComponentOption<Object> getFontWeightOption(State state);

    Collection<State> getFontWeightStates();

    Object getFontStyle();

    ComponentOption<Object> getFontStyleOption();

    CoreTextPartOptions setFontStyle(Object fontStyle);

    CoreTextPartOptions setFontStyle(Object fontStyle, State state);

    CoreTextPartOptions setFontStyleAllStates(Object fontStyle);

    CoreTextPartOptions setFontStyle(ScreenSizeValues<Object> fontStyle);

    Object getFontStyle(State state);

    ComponentOption<Object> getFontStyleOption(State state);

    Collection<State> getFontStyleStates();

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
