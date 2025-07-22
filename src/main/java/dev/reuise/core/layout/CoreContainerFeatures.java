package dev.reuise.core.layout;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreContainerFeatures {
    Object getPadding();

    CoreContainerFeatures setPadding(Object padding);

    CoreContainerFeatures setPadding(Object padding, State state);

    CoreContainerFeatures setPaddingAllStates(Object padding);

    CoreContainerFeatures setPadding(ScreenSizeValues<Object> padding);

    Object getPadding(State state);

    Object getPaddingTop();

    CoreContainerFeatures setPaddingTop(Object paddingTop);

    CoreContainerFeatures setPaddingTop(Object paddingTop, State state);

    CoreContainerFeatures setPaddingTopAllStates(Object paddingTop);

    CoreContainerFeatures setPaddingTop(ScreenSizeValues<Object> paddingTop);

    Object getPaddingTop(State state);

    Object getPaddingRight();

    CoreContainerFeatures setPaddingRight(Object paddingRight);

    CoreContainerFeatures setPaddingRight(Object paddingRight, State state);

    CoreContainerFeatures setPaddingRightAllStates(Object paddingRight);

    CoreContainerFeatures setPaddingRight(ScreenSizeValues<Object> paddingRight);

    Object getPaddingRight(State state);

    Object getPaddingBottom();

    CoreContainerFeatures setPaddingBottom(Object paddingBottom);

    CoreContainerFeatures setPaddingBottom(Object paddingBottom, State state);

    CoreContainerFeatures setPaddingBottomAllStates(Object paddingBottom);

    CoreContainerFeatures setPaddingBottom(ScreenSizeValues<Object> paddingBottom);

    Object getPaddingBottom(State state);

    Object getPaddingLeft();

    CoreContainerFeatures setPaddingLeft(Object paddingLeft);

    CoreContainerFeatures setPaddingLeft(Object paddingLeft, State state);

    CoreContainerFeatures setPaddingLeftAllStates(Object paddingLeft);

    CoreContainerFeatures setPaddingLeft(ScreenSizeValues<Object> paddingLeft);

    Object getPaddingLeft(State state);

    String getPosition();

    CoreContainerFeatures setPosition(String position);

    CoreContainerFeatures setPosition(String position, State state);

    CoreContainerFeatures setPositionAllStates(String position);

    CoreContainerFeatures setPosition(ScreenSizeValues<String> position);

    String getPosition(State state);

    Object getInset();

    CoreContainerFeatures setInset(Object inset);

    CoreContainerFeatures setInset(Object inset, State state);

    CoreContainerFeatures setInsetAllStates(Object inset);

    CoreContainerFeatures setInset(ScreenSizeValues<Object> inset);

    Object getInset(State state);

    BackdropFilterSetting getBackdropFilter();

    CoreContainerFeatures setBackdropFilter(BackdropFilterSetting backdropFilter);

    CoreContainerFeatures setBackdropFilter(BackdropFilterSetting backdropFilter, State state);

    CoreContainerFeatures setBackdropFilterAllStates(BackdropFilterSetting backdropFilter);

    CoreContainerFeatures setBackdropFilter(ScreenSizeValues<BackdropFilterSetting> backdropFilter);

    BackdropFilterSetting getBackdropFilter(State state);

    CoreContainerFeatures setBackdropFilter(BackdropFilter backdropFilter, Object value);
}