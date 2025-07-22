package dev.reuise.core.input;

public class RequiredInputValidator extends AbstractTextInputValidator<RequiredInputValidator> {
    public RequiredInputValidator() {
        setLengthMin(1);
        setErrorMessage("This field is required");
    }

    @Override
    protected RequiredInputValidator self() {
        return this;
    }
}
