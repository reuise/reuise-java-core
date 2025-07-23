package dev.reuise.core.list;
public interface CoreListItemFeatures {
    String getLabel();

    CoreListItemFeatures setLabel(String label);

    String getSecondaryLabel();

    CoreListItemFeatures setSecondaryLabel(String secondaryLabel);

    boolean isHasCheckbox();

    CoreListItemFeatures setHasCheckbox(Boolean hasCheckbox);

    boolean isToggleCheckboxOnClick();

    CoreListItemFeatures setToggleCheckboxOnClick(Boolean toggleCheckboxOnClick);
}