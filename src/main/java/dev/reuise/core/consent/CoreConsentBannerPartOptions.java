package dev.reuise.core.consent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.dialog.CoreDialog;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreParagraph;
import dev.reuise.core.text.CoreParagraphOptions;
public interface CoreConsentBannerPartOptions {
    String getMessage();

    ComponentOption<String> getMessageOption();

    CoreConsentBannerPartOptions setMessage(String message);

    String getAcceptLabel();

    ComponentOption<String> getAcceptLabelOption();

    CoreConsentBannerPartOptions setAcceptLabel(String acceptLabel);

    String getRejectLabel();

    ComponentOption<String> getRejectLabelOption();

    CoreConsentBannerPartOptions setRejectLabel(String rejectLabel);

    String getPreferencesLabel();

    ComponentOption<String> getPreferencesLabelOption();

    CoreConsentBannerPartOptions setPreferencesLabel(String preferencesLabel);

    String getPreferencesTitle();

    ComponentOption<String> getPreferencesTitleOption();

    CoreConsentBannerPartOptions setPreferencesTitle(String preferencesTitle);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreParagraphOptions getMessageParagraphOptions();

    CoreConsentBannerPartOptions setMessageParagraphOptions(CoreParagraphOptions messageParagraphOptions);

    boolean hasMessageParagraphOptions();

    ComponentCreator<? extends CoreParagraph, ? extends CoreParagraphOptions> getMessageParagraphCreator();

    CoreFlexContainerOptions getActionsOptions();

    CoreConsentBannerPartOptions setActionsOptions(CoreFlexContainerOptions actionsOptions);

    boolean hasActionsOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getActionsCreator();

    CoreButtonOptions getAcceptButtonOptions();

    CoreConsentBannerPartOptions setAcceptButtonOptions(CoreButtonOptions acceptButtonOptions);

    boolean hasAcceptButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getAcceptButtonCreator();

    CoreButtonOptions getRejectButtonOptions();

    CoreConsentBannerPartOptions setRejectButtonOptions(CoreButtonOptions rejectButtonOptions);

    boolean hasRejectButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getRejectButtonCreator();

    CoreButtonOptions getPreferencesButtonOptions();

    CoreConsentBannerPartOptions setPreferencesButtonOptions(CoreButtonOptions preferencesButtonOptions);

    boolean hasPreferencesButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getPreferencesButtonCreator();

    CoreDialogOptions getPreferencesDialogOptions();

    CoreConsentBannerPartOptions setPreferencesDialogOptions(CoreDialogOptions preferencesDialogOptions);

    boolean hasPreferencesDialogOptions();

    ComponentCreator<? extends CoreDialog, ? extends CoreDialogOptions> getPreferencesDialogCreator();

    CoreComponentFactory getComponentFactory();

    CoreConsentBanner getComponent();
}
