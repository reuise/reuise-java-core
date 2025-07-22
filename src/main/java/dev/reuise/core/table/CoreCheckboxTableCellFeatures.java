package dev.reuise.core.table;
public interface CoreCheckboxTableCellFeatures {
    boolean isChecked();

    CoreCheckboxTableCellFeatures setChecked(Boolean checked);

    String getLabel();

    CoreCheckboxTableCellFeatures setLabel(String label);
}