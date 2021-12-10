package dev.reuise.core.component;
/**
 * Implementation of Component (Core).
 */
public class CoreComponentImpl<S extends CoreComponentImpl<S, A>, A extends CoreComponentAdapter> implements CoreComponent {
    /**
     * Implementation of Component options.
     */
    public static class Options<S extends Options<S>> implements CoreComponentOptions {
        public Options() {
        }

        protected S self() {
            return null;
        }
    }

    public CoreComponentImpl(CoreComponentAdapter adapter, CoreComponentOptions options) {
    }

    protected S self() {
        return null;
    }
}