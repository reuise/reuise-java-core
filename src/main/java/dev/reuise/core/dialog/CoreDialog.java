package dev.reuise.core.dialog;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreDialog extends CoreComponent , CoreParentComponent , CoreDialogPart {
    CoreDialog getComponent();
}