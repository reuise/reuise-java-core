package dev.reuise.core.option;

public class ComponentOptionOperation<T> extends AbstractComponentOptionOperation<T> {
    protected ApplyOperation<T> operation;

    public ComponentOptionOperation(ComponentOption<T> option, ApplyOperation<T> operation) {
        super(option);
        this.operation = operation;
    }

    public ApplyOperation<T> getOperation() {
        return operation;
    }

    public void setOperation(ApplyOperation<T> operation) {
        this.operation = operation;
    }

    public void apply() throws ApplyOperationException {
        try {
            operation.apply(option.getValue());
        }
        catch(Exception e) {
            ApplyOperationException exception = new ApplyOperationException(option);
            exception.setStackTrace(e.getStackTrace());
            exception.setOriginalException(e);
            throw exception;
        }
    }
}
