package dev.reuise.core.dialog;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreHeading;
import dev.reuise.core.text.CoreHeadingOptions;
import java.util.Collection;
import java.util.List;
public interface CoreDialogPartOptions {
    String getTitle();

    ComponentOption<String> getTitleOption();

    CoreDialogPartOptions setTitle(String title);

    boolean isOpen();

    ComponentOption<Boolean> getOpenOption();

    CoreDialogPartOptions setOpen(Boolean open);

    DialogSize getSize();

    ComponentOption<DialogSize> getSizeOption();

    CoreDialogPartOptions setSize(DialogSize size);

    CoreDialogPartOptions setSize(DialogSize size, State state);

    CoreDialogPartOptions setSizeAllStates(DialogSize size);

    CoreDialogPartOptions setSize(ScreenSizeValues<DialogSize> size);

    DialogSize getSize(State state);

    ComponentOption<DialogSize> getSizeOption(State state);

    Collection<State> getSizeStates();

    boolean isRemoveOnClose();

    ComponentOption<Boolean> getRemoveOnCloseOption();

    CoreDialogPartOptions setRemoveOnClose(Boolean removeOnClose);

    boolean isModal();

    ComponentOption<Boolean> getModalOption();

    CoreDialogPartOptions setModal(Boolean modal);

    List<CoreButton> getActions();

    ComponentOption<List<CoreButton>> getActionsOption();

    CoreDialogPartOptions setActions(List<CoreButton> actions);

    CoreDialogPartOptions addAction(CoreButton action);

    CoreDialogPartOptions setAction(CoreButton action);

    CoreDialogPartOptions removeAction(CoreButton action);

    boolean isHasAcceptButton();

    ComponentOption<Boolean> getHasAcceptButtonOption();

    CoreDialogPartOptions setHasAcceptButton(Boolean hasAcceptButton);

    boolean isHasCancelButton();

    ComponentOption<Boolean> getHasCancelButtonOption();

    CoreDialogPartOptions setHasCancelButton(Boolean hasCancelButton);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getContainerOptions();

    CoreDialogPartOptions setContainerOptions(CoreContainerOptions containerOptions);

    boolean hasContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContainerCreator();

    CoreContainerOptions getHeaderOptions();

    CoreDialogPartOptions setHeaderOptions(CoreContainerOptions headerOptions);

    boolean hasHeaderOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getHeaderCreator();

    CoreHeadingOptions getTitleHeadingOptions();

    CoreDialogPartOptions setTitleHeadingOptions(CoreHeadingOptions titleHeadingOptions);

    boolean hasTitleHeadingOptions();

    ComponentCreator<? extends CoreHeading, ? extends CoreHeadingOptions> getTitleHeadingCreator();

    CoreFlexContainerOptions getBodyOptions();

    CoreDialogPartOptions setBodyOptions(CoreFlexContainerOptions bodyOptions);

    boolean hasBodyOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getBodyCreator();

    CoreFlexContainerOptions getFooterOptions();

    CoreDialogPartOptions setFooterOptions(CoreFlexContainerOptions footerOptions);

    boolean hasFooterOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getFooterCreator();

    CoreContainerOptions getScrimOptions();

    CoreDialogPartOptions setScrimOptions(CoreContainerOptions scrimOptions);

    boolean hasScrimOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrimCreator();

    CoreButtonOptions getAcceptButtonOptions();

    CoreDialogPartOptions setAcceptButtonOptions(CoreButtonOptions acceptButtonOptions);

    boolean hasAcceptButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getAcceptButtonCreator();

    CoreButtonOptions getCancelButtonOptions();

    CoreDialogPartOptions setCancelButtonOptions(CoreButtonOptions cancelButtonOptions);

    boolean hasCancelButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getCancelButtonCreator();

    CoreComponentFactory getComponentFactory();

    CoreDialog getComponent();
}