package dev.reuise.core.chip;
public interface CoreFilterChipFeatures {
    boolean isSelected();

    CoreFilterChipFeatures setSelected(Boolean selected);

    boolean isHasCheckIcon();

    CoreFilterChipFeatures setHasCheckIcon(Boolean hasCheckIcon);

    boolean isHasRemoveIcon();

    CoreFilterChipFeatures setHasRemoveIcon(Boolean hasRemoveIcon);
}