package dev.reuise.core.text;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreIconLabelPartOptions {
    String getText();

    ComponentOption<String> getTextOption();

    CoreIconLabelPartOptions setText(String text);

    String getLinkUrl();

    ComponentOption<String> getLinkUrlOption();

    CoreIconLabelPartOptions setLinkUrl(String linkUrl);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreLinkOptions getLinkOptions();

    CoreLinkOptions getOrCreateLinkOptions();

    CoreIconLabelPartOptions setLinkOptions(CoreLinkOptions linkOptions);

    boolean hasLinkOptions();

    ComponentCreator<? extends CoreLink, ? extends CoreLinkOptions> getLinkCreator();

    CoreIconOptions getStartIconOptions();

    CoreIconLabelPartOptions setStartIconOptions(CoreIconOptions startIconOptions);

    boolean hasStartIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getStartIconCreator();

    CoreInlineTextOptions getLabelContainerOptions();

    CoreIconLabelPartOptions setLabelContainerOptions(CoreInlineTextOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getLabelContainerCreator();

    CoreIconOptions getEndIconOptions();

    CoreIconLabelPartOptions setEndIconOptions(CoreIconOptions endIconOptions);

    boolean hasEndIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getEndIconCreator();

    CoreComponentFactory getComponentFactory();

    CoreIconLabel getComponent();
}