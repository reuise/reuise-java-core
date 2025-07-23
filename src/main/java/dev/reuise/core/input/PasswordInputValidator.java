package dev.reuise.core.input;

import dev.reuise.core.input.PasswordMode;

public class PasswordInputValidator extends AbstractTextInputValidator<PasswordInputValidator> {
    private String invalidEmailErrorMessage = "Please create a stronger password";
    private PasswordMode passwordMode;

    public PasswordInputValidator() {
        this(PasswordMode.CURRENT_PASSWORD);
    }

    public PasswordInputValidator(PasswordMode passwordMode) {
        this.passwordMode = passwordMode;
        setLengthMin(5, "Password is too short");
        setLengthMax(256, "Password is too long");

        switch (passwordMode) {
            case NEW_PASSWORD -> invalidEmailErrorMessage = "Please create a stronger password";
            case CURRENT_PASSWORD -> invalidEmailErrorMessage = "Invalid password";
        }
    }

    public String getInvalidEmailErrorMessage() {
        return invalidEmailErrorMessage;
    }

    public PasswordInputValidator setInvalidEmailErrorMessage(String invalidEmailErrorMessage) {
        this.invalidEmailErrorMessage = invalidEmailErrorMessage;
        return this;
    }

    @Override
    public String validate(String value) {
        String error = super.validate(value);
        if (error != null)
            return error;
        return null;
    }

    public PasswordInputValidator setErrorMessage(String errorMessage) {
        super.setErrorMessage(errorMessage);
        invalidEmailErrorMessage = errorMessage;
        return self();
    }

    public PasswordMode getPasswordMode() {
        return passwordMode;
    }

    public void setPasswordMode(PasswordMode passwordMode) {
        this.passwordMode = passwordMode;
    }

    @Override
    protected PasswordInputValidator self() {
        return this;
    }
}
