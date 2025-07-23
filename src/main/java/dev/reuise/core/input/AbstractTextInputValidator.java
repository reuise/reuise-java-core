package dev.reuise.core.input;

import java.util.Arrays;

public abstract class AbstractTextInputValidator<S extends AbstractTextInputValidator<S>> extends AbstractInputValidator<S> {
    private boolean allowNull = false;
    private String nullErrorMessage = "Input is null";
    private boolean allowEmpty = false;
    private String emptyErrorMessage = "Input is empty";
    private int lengthMin = 0;
    private String lengthMinErrorMessage = "Input is too short";
    private int lengthMax = Integer.MAX_VALUE;
    private String lengthMaxErrorMessage = "Input is too long";
    private ValidationMode mode = ValidationMode.WHOLE_FIELD;

    public int getLengthMin() {
        return lengthMin;
    }

    public S setLengthMin(int lengthMin) {
        this.lengthMin = lengthMin;
        return self();
    }

    public S setLengthMin(int lengthMin, String errorMessage) {
        setLengthMin(lengthMin);
        setLengthMinErrorMessage(errorMessage);
        return self();
    }

    public int getLengthMax() {
        return lengthMax;
    }

    public S setLengthMax(int lengthMax) {
        this.lengthMax = lengthMax;
        return self();
    }

    public S setLengthMax(int lengthMax, String errorMessage) {
        setLengthMax(lengthMax);
        setLengthMaxErrorMessage(errorMessage);
        return self();
    }

    public boolean isAllowNull() {
        return allowNull;
    }

    public S setAllowNull(boolean allowNull) {
        this.allowNull = allowNull;
        return self();
    }

    public S setAllowNull(String errorMessage) {
        setAllowNull(true);
        setNullErrorMessage(errorMessage);
        return self();
    }

    public boolean isAllowEmpty() {
        return allowEmpty;
    }

    public S setAllowEmpty(boolean allowEmpty) {
        this.allowEmpty = allowEmpty;
        return self();
    }

    public S setAllowEmpty(String errorMessage) {
        setAllowEmpty(true);
        setEmptyErrorMessage(errorMessage);
        return self();
    }

    public S setAllowNullOrEmpty(boolean allowNullOrEmpty) {
        setAllowEmpty(allowNullOrEmpty);
        setAllowNull(allowNullOrEmpty);
        return self();
    }

    public S setAllowNullOrEmpty(String errorMessage) {
        setAllowNull(errorMessage);
        setAllowEmpty(errorMessage);
        return self();
    }

    public S setLenghtLimits(int lengthMin, int lengthMax) {
        setLengthMin(lengthMin);
        setLengthMax(lengthMax);
        return self();
    }

    public S setLenghtLimits(int lengthMin, int lengthMax, String errorMessage) {
        setLengthMin(lengthMin, errorMessage);
        setLengthMax(lengthMax, errorMessage);
        return self();
    }
    
    public String getNullErrorMessage() {
        return nullErrorMessage;
    }

    public S setNullErrorMessage(String nullErrorMessage) {
        this.nullErrorMessage = nullErrorMessage;
        return self();
    }

    public String getEmptyErrorMessage() {
        return emptyErrorMessage;
    }

    public S setEmptyErrorMessage(String emptyErrorMessage) {
        this.emptyErrorMessage = emptyErrorMessage;
        return self();
    }

    public String getLengthMinErrorMessage() {
        return lengthMinErrorMessage;
    }

    public S setLengthMinErrorMessage(String lengthMinErrorMessage) {
        this.lengthMinErrorMessage = lengthMinErrorMessage;
        return self();
    }

    public String getLengthMaxErrorMessage() {
        return lengthMaxErrorMessage;
    }

    public S setLengthMaxErrorMessage(String lengthMaxErrorMessage) {
        this.lengthMaxErrorMessage = lengthMaxErrorMessage;
        return self();
    }

    public S setErrorMessage(String errorMessage) {
        super.setErrorMessage(errorMessage);
        nullErrorMessage = errorMessage;
        emptyErrorMessage = errorMessage;
        lengthMinErrorMessage = errorMessage;
        lengthMaxErrorMessage = errorMessage;
        return self();
    }

    @Override
    public String validate(String value) {
        //Null
        if(allowNull && value == null) return getErrorMessage(nullErrorMessage);

        //Empty
        if(allowEmpty && value.isEmpty()) return getErrorMessage(emptyErrorMessage);

        //Length
        int length = value.length();
        if(lengthMin > 0 && length < lengthMin) return getErrorMessage(lengthMinErrorMessage);
        if(lengthMax != 0 && length > lengthMax) return getErrorMessage(lengthMaxErrorMessage);
        return null;
    }

    protected String getErrorMessage(String errorMessage) {
        if(errorMessage != null && !errorMessage.isEmpty()) return errorMessage;
        return this.errorMessage;
    }

    @Override
    public boolean isMode(ValidationMode... modes) {
        return Arrays.stream(modes).anyMatch(m -> this.mode.equals(m));
    }
    
    @Override
    public InputValidator setMode(ValidationMode mode) {
        this.mode = mode;
        return this;
    }

    @Override
    public ValidationMode getMode() {
        return mode;
    }
}
