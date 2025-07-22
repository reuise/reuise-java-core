package dev.reuise.core.dialog;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import java.util.List;
public interface CoreDialogFeatures {
    String getTitle();

    CoreDialogFeatures setTitle(String title);

    boolean isOpen();

    CoreDialogFeatures setOpen(Boolean open);

    DialogSize getSize();

    CoreDialogFeatures setSize(DialogSize size);

    CoreDialogFeatures setSize(DialogSize size, State state);

    CoreDialogFeatures setSizeAllStates(DialogSize size);

    CoreDialogFeatures setSize(ScreenSizeValues<DialogSize> size);

    DialogSize getSize(State state);

    boolean isRemoveOnClose();

    CoreDialogFeatures setRemoveOnClose(Boolean removeOnClose);

    boolean isModal();

    CoreDialogFeatures setModal(Boolean modal);

    List<CoreButton> getActions();

    CoreDialogFeatures setActions(List<CoreButton> actions);

    CoreDialogFeatures addAction(CoreButton action);

    CoreDialogFeatures setAction(CoreButton action);

    CoreDialogFeatures removeAction(CoreButton action);

    boolean isHasAcceptButton();

    CoreDialogFeatures setHasAcceptButton(Boolean hasAcceptButton);

    boolean isHasCancelButton();

    CoreDialogFeatures setHasCancelButton(Boolean hasCancelButton);
}