package dev.reuise.core.accordion;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreAccordionItemPartOptions {
    boolean isExpanded();

    ComponentOption<Boolean> getExpandedOption();

    CoreAccordionItemPartOptions setExpanded(Boolean expanded);

    boolean isToggleAtEnd();

    ComponentOption<Boolean> getToggleAtEndOption();

    CoreAccordionItemPartOptions setToggleAtEnd(Boolean toggleAtEnd);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreFlexContainerOptions getHeaderOptions();

    CoreAccordionItemPartOptions setHeaderOptions(CoreFlexContainerOptions headerOptions);

    boolean hasHeaderOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getHeaderCreator();

    CoreButtonOptions getToggleOptions();

    CoreAccordionItemPartOptions setToggleOptions(CoreButtonOptions toggleOptions);

    boolean hasToggleOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getToggleCreator();

    CoreContainerOptions getContentOptions();

    CoreAccordionItemPartOptions setContentOptions(CoreContainerOptions contentOptions);

    boolean hasContentOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getContentCreator();

    CoreComponentFactory getComponentFactory();

    CoreAccordionItem getComponent();
}
