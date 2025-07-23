package dev.reuise.core.chip;
public interface CoreChipFeatures {
    String getLabel();

    CoreChipFeatures setLabel(String label);

    String getValue();

    CoreChipFeatures setValue(String value);

    ChipSize getSize();

    CoreChipFeatures setSize(ChipSize size);
}