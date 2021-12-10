package dev.reuise.core.label;
import dev.reuise.core.component.CoreComponentImpl;
/**
 * Implementation of Label (Core).
 */
public class CoreLabelImpl<A extends CoreLabelAdapter> extends CoreComponentImpl<CoreLabelImpl<A>, A> implements CoreLabel {
    /**
     * Implementation of Label options.
     */
    public static class Options<S extends Options<S>> extends CoreComponentImpl.Options<S> implements CoreLabelOptions {
        public Options() {
        }
    }

    public CoreLabelImpl(CoreLabelAdapter adapter, CoreLabelOptions options) {
        super(adapter, options);
    }
}