package dev.reuise.core.layout;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreFlexContainerFeatures {
    FlexDirection getDirection();

    CoreFlexContainerFeatures setDirection(FlexDirection direction);

    CoreFlexContainerFeatures setDirection(FlexDirection direction, State state);

    CoreFlexContainerFeatures setDirectionAllStates(FlexDirection direction);

    CoreFlexContainerFeatures setDirection(ScreenSizeValues<FlexDirection> direction);

    FlexDirection getDirection(State state);

    JustifyContent getJustifyContent();

    CoreFlexContainerFeatures setJustifyContent(JustifyContent justifyContent);

    CoreFlexContainerFeatures setJustifyContent(JustifyContent justifyContent, State state);

    CoreFlexContainerFeatures setJustifyContentAllStates(JustifyContent justifyContent);

    CoreFlexContainerFeatures setJustifyContent(ScreenSizeValues<JustifyContent> justifyContent);

    JustifyContent getJustifyContent(State state);

    AlignItems getAlignItems();

    CoreFlexContainerFeatures setAlignItems(AlignItems alignItems);

    CoreFlexContainerFeatures setAlignItems(AlignItems alignItems, State state);

    CoreFlexContainerFeatures setAlignItemsAllStates(AlignItems alignItems);

    CoreFlexContainerFeatures setAlignItems(ScreenSizeValues<AlignItems> alignItems);

    AlignItems getAlignItems(State state);

    Object getColumnGap();

    CoreFlexContainerFeatures setColumnGap(Object columnGap);

    CoreFlexContainerFeatures setColumnGap(Object columnGap, State state);

    CoreFlexContainerFeatures setColumnGapAllStates(Object columnGap);

    CoreFlexContainerFeatures setColumnGap(ScreenSizeValues<Object> columnGap);

    Object getColumnGap(State state);

    Object getRowGap();

    CoreFlexContainerFeatures setRowGap(Object rowGap);

    CoreFlexContainerFeatures setRowGap(Object rowGap, State state);

    CoreFlexContainerFeatures setRowGapAllStates(Object rowGap);

    CoreFlexContainerFeatures setRowGap(ScreenSizeValues<Object> rowGap);

    Object getRowGap(State state);

    Object getGap();

    CoreFlexContainerFeatures setGap(Object gap);

    CoreFlexContainerFeatures setGap(Object gap, State state);

    CoreFlexContainerFeatures setGapAllStates(Object gap);

    CoreFlexContainerFeatures setGap(ScreenSizeValues<Object> gap);

    Object getGap(State state);

    boolean isWrap();

    CoreFlexContainerFeatures setWrap(Boolean wrap);

    CoreFlexContainerFeatures setWrap(Boolean wrap, State state);

    CoreFlexContainerFeatures setWrapAllStates(Boolean wrap);

    CoreFlexContainerFeatures setWrap(ScreenSizeValues<Boolean> wrap);

    boolean isWrap(State state);
}