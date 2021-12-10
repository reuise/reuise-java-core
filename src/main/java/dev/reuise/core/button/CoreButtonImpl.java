package dev.reuise.core.button;
import dev.reuise.core.component.CoreComponentImpl;
/**
 * Implementation of Button (Core).
 */
public class CoreButtonImpl<A extends CoreButtonAdapter> extends CoreComponentImpl<CoreButtonImpl<A>, A> implements CoreButton {
    /**
     * Implementation of Button options.
     */
    public static class Options<S extends Options<S>> extends CoreComponentImpl.Options<S> implements CoreButtonOptions {
        private String label;

        /**
         * Gets the label on the button
         *
         * @return Label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * Sets the label on the button
         *
         * @param label:
         * 		Label
         * @return Options instance
         */
        public S setLabel(String label) {
            this.label = label;
            return self();
        }

        public Options() {
        }
    }

    public CoreButtonImpl(CoreButtonAdapter adapter, CoreButtonOptions options) {
        super(adapter, options);
    }
}