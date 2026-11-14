package dev.reuise.core.banner;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreParagraph;
import dev.reuise.core.text.CoreParagraphOptions;
public interface CoreBannerPartOptions {
    String getMessage();

    ComponentOption<String> getMessageOption();

    CoreBannerPartOptions setMessage(String message);

    String getCampaignId();

    ComponentOption<String> getCampaignIdOption();

    CoreBannerPartOptions setCampaignId(String campaignId);

    String getTone();

    ComponentOption<String> getToneOption();

    CoreBannerPartOptions setTone(String tone);

    String getDismissLabel();

    ComponentOption<String> getDismissLabelOption();

    CoreBannerPartOptions setDismissLabel(String dismissLabel);

    boolean isDismissible();

    ComponentOption<Boolean> getDismissibleOption();

    CoreBannerPartOptions setDismissible(Boolean dismissible);

    BannerDismissHandler getDismissHandler();

    ComponentOption<BannerDismissHandler> getDismissHandlerOption();

    CoreBannerPartOptions setDismissHandler(BannerDismissHandler dismissHandler);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreIconOptions getIconOptions();

    CoreBannerPartOptions setIconOptions(CoreIconOptions iconOptions);

    boolean hasIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getIconCreator();

    CoreContainerOptions getContentOptions();

    CoreBannerPartOptions setContentOptions(CoreContainerOptions contentOptions);

    boolean hasContentOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContentCreator();

    CoreParagraphOptions getMessageParagraphOptions();

    CoreBannerPartOptions setMessageParagraphOptions(CoreParagraphOptions messageParagraphOptions);

    boolean hasMessageParagraphOptions();

    ComponentCreator<? extends CoreParagraph, ? extends CoreParagraphOptions> getMessageParagraphCreator();

    CoreFlexContainerOptions getActionsOptions();

    CoreBannerPartOptions setActionsOptions(CoreFlexContainerOptions actionsOptions);

    boolean hasActionsOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getActionsCreator();

    CoreButtonOptions getDismissButtonOptions();

    CoreBannerPartOptions setDismissButtonOptions(CoreButtonOptions dismissButtonOptions);

    boolean hasDismissButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getDismissButtonCreator();

    CoreComponentFactory getComponentFactory();

    CoreBanner getComponent();
}
