package dev.reuise.core.input;
public interface CoreTextFieldFeatures {
    TextFieldSize getSize();

    CoreTextFieldFeatures setSize(TextFieldSize size);

    boolean isError();

    CoreTextFieldFeatures setError(Boolean error);

    String getSupportingText();

    CoreTextFieldFeatures setSupportingText(String supportingText);

    String getLabel();

    CoreTextFieldFeatures setLabel(String label);

    TextFieldLabelPlacement getLabelPlacement();

    CoreTextFieldFeatures setLabelPlacement(TextFieldLabelPlacement labelPlacement);

    CoreTextFieldFeatures setError(String message);
}