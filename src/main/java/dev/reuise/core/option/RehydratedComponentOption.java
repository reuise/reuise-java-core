package dev.reuise.core.option;

/**
 * An option restored from server markup rather than supplied by the caller.
 */
public final class RehydratedComponentOption<T> extends DefaultComponentOption<T> {
    private RehydratedComponentOption(ComponentOption<T> option) {
        super(option.getName(), option.getValue(), option.getIndex(), option.isForce());
    }

    public static <T> RehydratedComponentOption<T> from(ComponentOption<T> option) {
        return new RehydratedComponentOption<>(option);
    }
}
