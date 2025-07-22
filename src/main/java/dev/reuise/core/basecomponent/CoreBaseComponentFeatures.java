package dev.reuise.core.basecomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.theme.Theme;
public interface CoreBaseComponentFeatures {
    boolean isMounted();

    CoreBaseComponentFeatures setMounted(Boolean mounted);

    Object getMargin();

    CoreBaseComponentFeatures setMargin(Object margin);

    CoreBaseComponentFeatures setMargin(Object margin, State state);

    CoreBaseComponentFeatures setMarginAllStates(Object margin);

    CoreBaseComponentFeatures setMargin(ScreenSizeValues<Object> margin);

    Object getMargin(State state);

    Object getMarginTop();

    CoreBaseComponentFeatures setMarginTop(Object marginTop);

    CoreBaseComponentFeatures setMarginTop(Object marginTop, State state);

    CoreBaseComponentFeatures setMarginTopAllStates(Object marginTop);

    CoreBaseComponentFeatures setMarginTop(ScreenSizeValues<Object> marginTop);

    Object getMarginTop(State state);

    Object getMarginRight();

    CoreBaseComponentFeatures setMarginRight(Object marginRight);

    CoreBaseComponentFeatures setMarginRight(Object marginRight, State state);

    CoreBaseComponentFeatures setMarginRightAllStates(Object marginRight);

    CoreBaseComponentFeatures setMarginRight(ScreenSizeValues<Object> marginRight);

    Object getMarginRight(State state);

    Object getMarginBottom();

    CoreBaseComponentFeatures setMarginBottom(Object marginBottom);

    CoreBaseComponentFeatures setMarginBottom(Object marginBottom, State state);

    CoreBaseComponentFeatures setMarginBottomAllStates(Object marginBottom);

    CoreBaseComponentFeatures setMarginBottom(ScreenSizeValues<Object> marginBottom);

    Object getMarginBottom(State state);

    Object getMarginLeft();

    CoreBaseComponentFeatures setMarginLeft(Object marginLeft);

    CoreBaseComponentFeatures setMarginLeft(Object marginLeft, State state);

    CoreBaseComponentFeatures setMarginLeftAllStates(Object marginLeft);

    CoreBaseComponentFeatures setMarginLeft(ScreenSizeValues<Object> marginLeft);

    Object getMarginLeft(State state);

    Object getWidth();

    CoreBaseComponentFeatures setWidth(Object width);

    CoreBaseComponentFeatures setWidth(Object width, State state);

    CoreBaseComponentFeatures setWidthAllStates(Object width);

    CoreBaseComponentFeatures setWidth(ScreenSizeValues<Object> width);

    Object getWidth(State state);

    Object getMinWidth();

    CoreBaseComponentFeatures setMinWidth(Object minWidth);

    CoreBaseComponentFeatures setMinWidth(Object minWidth, State state);

    CoreBaseComponentFeatures setMinWidthAllStates(Object minWidth);

    CoreBaseComponentFeatures setMinWidth(ScreenSizeValues<Object> minWidth);

    Object getMinWidth(State state);

    Object getMaxWidth();

    CoreBaseComponentFeatures setMaxWidth(Object maxWidth);

    CoreBaseComponentFeatures setMaxWidth(Object maxWidth, State state);

    CoreBaseComponentFeatures setMaxWidthAllStates(Object maxWidth);

    CoreBaseComponentFeatures setMaxWidth(ScreenSizeValues<Object> maxWidth);

    Object getMaxWidth(State state);

    Object getHeight();

    CoreBaseComponentFeatures setHeight(Object height);

    CoreBaseComponentFeatures setHeight(Object height, State state);

    CoreBaseComponentFeatures setHeightAllStates(Object height);

    CoreBaseComponentFeatures setHeight(ScreenSizeValues<Object> height);

    Object getHeight(State state);

    Object getMinHeight();

    CoreBaseComponentFeatures setMinHeight(Object minHeight);

    CoreBaseComponentFeatures setMinHeight(Object minHeight, State state);

    CoreBaseComponentFeatures setMinHeightAllStates(Object minHeight);

    CoreBaseComponentFeatures setMinHeight(ScreenSizeValues<Object> minHeight);

    Object getMinHeight(State state);

    Object getMaxHeight();

    CoreBaseComponentFeatures setMaxHeight(Object maxHeight);

    CoreBaseComponentFeatures setMaxHeight(Object maxHeight, State state);

    CoreBaseComponentFeatures setMaxHeightAllStates(Object maxHeight);

    CoreBaseComponentFeatures setMaxHeight(ScreenSizeValues<Object> maxHeight);

    Object getMaxHeight(State state);

    boolean isRequiredLayoutComponent();

    CoreBaseComponentFeatures setRequiredLayoutComponent(Boolean requiredLayoutComponent);

    CoreComponent getParent();

    CoreBaseComponentFeatures setParent(CoreComponent parent);

    CoreParentComponent getWrapper();

    CoreBaseComponentFeatures setWrapper(CoreParentComponent wrapper);

    Theme getTheme();

    CoreBaseComponentFeatures setTheme(Theme theme);

    boolean isVisible();

    CoreBaseComponentFeatures setVisible(Boolean visible);

    CoreBaseComponentFeatures setVisible(Boolean visible, State state);

    CoreBaseComponentFeatures setVisibleAllStates(Boolean visible);

    CoreBaseComponentFeatures setVisible(ScreenSizeValues<Boolean> visible);

    boolean isVisible(State state);

    boolean isEnabled();

    CoreBaseComponentFeatures setEnabled(Boolean enabled);

    boolean isFocused();

    CoreBaseComponentFeatures setFocused(Boolean focused);

    boolean isDebug();

    CoreBaseComponentFeatures setDebug(Boolean debug);

    String getDebugId();

    CoreBaseComponentFeatures setDebugId(String debugId);
}