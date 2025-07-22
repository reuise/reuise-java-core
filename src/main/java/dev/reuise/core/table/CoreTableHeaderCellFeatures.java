package dev.reuise.core.table;
public interface CoreTableHeaderCellFeatures {
    String getLabel();

    CoreTableHeaderCellFeatures setLabel(String label);

    boolean isHasMenuButton();

    CoreTableHeaderCellFeatures setHasMenuButton(Boolean hasMenuButton);
}