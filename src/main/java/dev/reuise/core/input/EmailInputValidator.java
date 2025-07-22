package dev.reuise.core.input;

public class EmailInputValidator extends AbstractTextInputValidator<EmailInputValidator> {
    private String invalidEmailErrorMessage = "Invalid email address";

    public EmailInputValidator() {
        setLengthMin(5, "Email address is too short");
    }
    
    public String getInvalidEmailErrorMessage() {
        return invalidEmailErrorMessage;
    }

    public EmailInputValidator setInvalidEmailErrorMessage(String invalidEmailErrorMessage) {
        this.invalidEmailErrorMessage = invalidEmailErrorMessage;
        return this;
    }

    @Override
    public String validate(String value) {
        String error = super.validate(value);
        if(error != null) return error;

        if(!value.contains("@") || !value.contains(".")) return getErrorMessage(invalidEmailErrorMessage);
        return null;
    }

    public EmailInputValidator setErrorMessage(String errorMessage) {
        super.setErrorMessage(errorMessage);
        invalidEmailErrorMessage = errorMessage;
        return self();
    }

    @Override
    protected EmailInputValidator self() {
        return this;
    }
}
