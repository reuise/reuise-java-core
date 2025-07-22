package dev.reuise.core.checkbox;
public interface CoreBasicCheckboxFeatures {
    boolean isChecked();

    CoreBasicCheckboxFeatures setChecked(Boolean checked);

    CheckboxSize getSize();

    CoreBasicCheckboxFeatures setSize(CheckboxSize size);
}