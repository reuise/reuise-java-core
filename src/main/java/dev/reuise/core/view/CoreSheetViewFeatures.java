package dev.reuise.core.view;
public interface CoreSheetViewFeatures {
    Object getSize();

    CoreSheetViewFeatures setSize(Object size);

    Object getMinSize();

    CoreSheetViewFeatures setMinSize(Object minSize);

    Object getMaxSize();

    CoreSheetViewFeatures setMaxSize(Object maxSize);

    CoreSheetViewFeatures setSize(SheetSize size);
}