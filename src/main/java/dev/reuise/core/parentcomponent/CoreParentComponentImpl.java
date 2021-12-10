package dev.reuise.core.parentcomponent;
import dev.reuise.core.component.CoreComponent;
import dev.reuise.core.component.CoreComponentImpl;
/**
 * Implementation of ParentComponent (Core).
 */
public class CoreParentComponentImpl<A extends CoreParentComponentAdapter> extends CoreComponentImpl<CoreParentComponentImpl<A>, A> implements CoreParentComponent {
    /**
     * Implementation of ParentComponent options.
     */
    public static class Options<S extends Options<S>> extends CoreComponentImpl.Options<S> implements CoreParentComponentOptions {
        public Options() {
        }
    }

    public CoreParentComponentImpl(CoreParentComponentAdapter adapter, CoreParentComponentOptions options) {
        super(adapter, options);
    }

    /**
     * Add a child component.
     *
     * @param child
     * 		
     */
    public void add(CoreComponent child) {
    }
}