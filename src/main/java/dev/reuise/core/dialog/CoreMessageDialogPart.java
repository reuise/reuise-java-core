package dev.reuise.core.dialog;
import dev.reuise.core.ComponentPart;
public interface CoreMessageDialogPart extends ComponentPart , CoreMessageDialogFeatures , CoreDialogPart {
    CoreDialogPart getDialogPart();
}