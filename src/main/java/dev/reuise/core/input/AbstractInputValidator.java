package dev.reuise.core.input;

public abstract class AbstractInputValidator<S> implements InputValidator {
    protected String errorMessage;
    private boolean focusOnError;

    public boolean isFocusOnError() {
        return focusOnError;
    }

    public S setFocusOnError(boolean focusOnError) {
        this.focusOnError = focusOnError;
        return self();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public S setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return self();
    }

    protected abstract S self();
}
