package dev.reuise.core.divider;
import dev.reuise.core.Alignment;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreDividerPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreDividerPartOptions setLabel(String label);

    Alignment getLabelAlignment();

    ComponentOption<Alignment> getLabelAlignmentOption();

    CoreDividerPartOptions setLabelAlignment(Alignment labelAlignment);

    Integer getThickness();

    ComponentOption<Integer> getThicknessOption();

    CoreDividerPartOptions setThickness(Integer thickness);

    DividerDirection getDirection();

    ComponentOption<DividerDirection> getDirectionOption();

    CoreDividerPartOptions setDirection(DividerDirection direction);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getStartLineOptions();

    CoreDividerPartOptions setStartLineOptions(CoreContainerOptions startLineOptions);

    boolean hasStartLineOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getStartLineCreator();

    CoreInlineTextOptions getLabelContainerOptions();

    CoreDividerPartOptions setLabelContainerOptions(CoreInlineTextOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getLabelContainerCreator();

    CoreContainerOptions getEndLineOptions();

    CoreDividerPartOptions setEndLineOptions(CoreContainerOptions endLineOptions);

    boolean hasEndLineOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getEndLineCreator();

    CoreComponentFactory getComponentFactory();

    CoreDivider getComponent();
}