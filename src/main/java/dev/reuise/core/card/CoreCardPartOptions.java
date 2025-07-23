package dev.reuise.core.card;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreTextBlock;
import dev.reuise.core.text.CoreTextBlockOptions;
import java.util.List;
public interface CoreCardPartOptions {
    String getHeading();

    ComponentOption<String> getHeadingOption();

    CoreCardPartOptions setHeading(String heading);

    String getSubHeading();

    ComponentOption<String> getSubHeadingOption();

    CoreCardPartOptions setSubHeading(String subHeading);

    String getText();

    ComponentOption<String> getTextOption();

    CoreCardPartOptions setText(String text);

    CardOrientation getOrientation();

    ComponentOption<CardOrientation> getOrientationOption();

    CoreCardPartOptions setOrientation(CardOrientation orientation);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreCardPartOptions setUrl(String url);

    String getImageUrl();

    ComponentOption<String> getImageUrlOption();

    CoreCardPartOptions setImageUrl(String imageUrl);

    List<CoreButton> getActions();

    ComponentOption<List<CoreButton>> getActionsOption();

    CoreCardPartOptions setActions(List<CoreButton> actions);

    CoreCardPartOptions addAction(CoreButton action);

    CoreCardPartOptions setAction(CoreButton action);

    CoreCardPartOptions removeAction(CoreButton action);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreLinkOptions getMediaLinkOptions();

    CoreLinkOptions getOrCreateMediaLinkOptions();

    CoreCardPartOptions setMediaLinkOptions(CoreLinkOptions mediaLinkOptions);

    boolean hasMediaLinkOptions();

    ComponentCreator<? extends CoreLink, ? extends CoreLinkOptions> getMediaLinkCreator();

    CoreFlexContainerOptions getMediaContainerOptions();

    CoreCardPartOptions setMediaContainerOptions(CoreFlexContainerOptions mediaContainerOptions);

    boolean hasMediaContainerOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getMediaContainerCreator();

    CoreImageOptions getImageOptions();

    CoreImageOptions getOrCreateImageOptions();

    CoreCardPartOptions setImageOptions(CoreImageOptions imageOptions);

    boolean hasImageOptions();

    ComponentCreator<? extends CoreImage, ? extends CoreImageOptions> getImageCreator();

    CoreFlexContainerOptions getTextContentOptions();

    CoreCardPartOptions setTextContentOptions(CoreFlexContainerOptions textContentOptions);

    boolean hasTextContentOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getTextContentCreator();

    CoreFlexContainerOptions getHeadlineOptions();

    CoreCardPartOptions setHeadlineOptions(CoreFlexContainerOptions headlineOptions);

    boolean hasHeadlineOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getHeadlineCreator();

    CoreLinkOptions getHeadingLinkOptions();

    CoreLinkOptions getOrCreateHeadingLinkOptions();

    CoreCardPartOptions setHeadingLinkOptions(CoreLinkOptions headingLinkOptions);

    boolean hasHeadingLinkOptions();

    ComponentCreator<? extends CoreLink, ? extends CoreLinkOptions> getHeadingLinkCreator();

    CoreTextBlockOptions getHeadingContainerOptions();

    CoreTextBlockOptions getOrCreateHeadingContainerOptions();

    CoreCardPartOptions setHeadingContainerOptions(CoreTextBlockOptions headingContainerOptions);

    boolean hasHeadingContainerOptions();

    ComponentCreator<? extends CoreTextBlock, ? extends CoreTextBlockOptions> getHeadingContainerCreator();

    CoreTextBlockOptions getSubHeadingContainerOptions();

    CoreTextBlockOptions getOrCreateSubHeadingContainerOptions();

    CoreCardPartOptions setSubHeadingContainerOptions(CoreTextBlockOptions subHeadingContainerOptions);

    boolean hasSubHeadingContainerOptions();

    ComponentCreator<? extends CoreTextBlock, ? extends CoreTextBlockOptions> getSubHeadingContainerCreator();

    CoreTextBlockOptions getTextContainerOptions();

    CoreTextBlockOptions getOrCreateTextContainerOptions();

    CoreCardPartOptions setTextContainerOptions(CoreTextBlockOptions textContainerOptions);

    boolean hasTextContainerOptions();

    ComponentCreator<? extends CoreTextBlock, ? extends CoreTextBlockOptions> getTextContainerCreator();

    CoreFlexContainerOptions getActionsContainerOptions();

    CoreCardPartOptions setActionsContainerOptions(CoreFlexContainerOptions actionsContainerOptions);

    boolean hasActionsContainerOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getActionsContainerCreator();

    CoreComponentFactory getComponentFactory();

    CoreCard getComponent();
}