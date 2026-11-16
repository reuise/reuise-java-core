package dev.reuise.core.option;

/**
 * An option restored from server markup rather than supplied by the caller.
 */
public final class RehydratedComponentOption<T> extends DefaultComponentOption<T> {
    private RehydratedComponentOption(ComponentOption<T> option) {
        this(option, option.isForce());
    }

    private RehydratedComponentOption(ComponentOption<T> option, boolean force) {
        super(option.getName(), option.getValue(), option.getIndex(), force);
    }

    public static <T> RehydratedComponentOption<T> from(ComponentOption<T> option) {
        return new RehydratedComponentOption<>(option);
    }

    public static <T> RehydratedComponentOption<T> from(ComponentOption<T> option, boolean force) {
        return new RehydratedComponentOption<>(option, force);
    }
}
