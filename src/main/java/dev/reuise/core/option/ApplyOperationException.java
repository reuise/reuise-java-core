package dev.reuise.core.option;

public class ApplyOperationException extends Exception {
    private ComponentOption<?> option;
    private Throwable originalException;

    public ApplyOperationException(ComponentOption<?> option) {
        super("Cannot set "+option.getName()+" value"+(option.getValue() != null ? " ("+option.getValue().getClass().getSimpleName()+")" : "")+": "+option.getValue());
        this.option = option;
    }
    
    public ComponentOption<?> getOption() {
        return option;
    }

    public void setOption(ComponentOption<?> option) {
        this.option = option;
    }

    public Throwable getOriginalException() {
        return originalException;
    }

    public void setOriginalException(Throwable originalException) {
        this.originalException = originalException;
    }
}
