package dev.reuise.core.input;

public interface InputValidator {
    public enum ValidationMode {
        WHOLE_FIELD,     // Validate the whole field value as a single unit
        EACH_VALUE,      // Validate each individual value in the field
        BOTH;            // Validate both the whole field and each individual value
    }

    String validate(String value);
    String getErrorMessage();
    boolean isFocusOnError();
    boolean isMode(ValidationMode... modes);
    InputValidator setMode(ValidationMode mode);
    ValidationMode getMode();
}
