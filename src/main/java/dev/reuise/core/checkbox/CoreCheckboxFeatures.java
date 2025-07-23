package dev.reuise.core.checkbox;
public interface CoreCheckboxFeatures {
    String getLabel();

    CoreCheckboxFeatures setLabel(String label);

    boolean isChecked();

    CoreCheckboxFeatures setChecked(Boolean checked);
}