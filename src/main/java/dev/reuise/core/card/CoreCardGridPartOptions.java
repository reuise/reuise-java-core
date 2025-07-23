package dev.reuise.core.card;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreCardGridPartOptions {
    Integer getColumnGap();

    ComponentOption<Integer> getColumnGapOption();

    CoreCardGridPartOptions setColumnGap(Integer columnGap);

    CoreCardGridPartOptions setColumnGap(Integer columnGap, State state);

    CoreCardGridPartOptions setColumnGapAllStates(Integer columnGap);

    CoreCardGridPartOptions setColumnGap(ScreenSizeValues<Integer> columnGap);

    Integer getColumnGap(State state);

    ComponentOption<Integer> getColumnGapOption(State state);

    Collection<State> getColumnGapStates();

    Integer getRowGap();

    ComponentOption<Integer> getRowGapOption();

    CoreCardGridPartOptions setRowGap(Integer rowGap);

    CoreCardGridPartOptions setRowGap(Integer rowGap, State state);

    CoreCardGridPartOptions setRowGapAllStates(Integer rowGap);

    CoreCardGridPartOptions setRowGap(ScreenSizeValues<Integer> rowGap);

    Integer getRowGap(State state);

    ComponentOption<Integer> getRowGapOption(State state);

    Collection<State> getRowGapStates();

    Integer getGap();

    ComponentOption<Integer> getGapOption();

    CoreCardGridPartOptions setGap(Integer gap);

    CoreCardGridPartOptions setGap(Integer gap, State state);

    CoreCardGridPartOptions setGapAllStates(Integer gap);

    CoreCardGridPartOptions setGap(ScreenSizeValues<Integer> gap);

    Integer getGap(State state);

    ComponentOption<Integer> getGapOption(State state);

    Collection<State> getGapStates();

    Integer getCardWidth();

    ComponentOption<Integer> getCardWidthOption();

    CoreCardGridPartOptions setCardWidth(Integer cardWidth);

    CoreCardGridPartOptions setCardWidth(Integer cardWidth, State state);

    CoreCardGridPartOptions setCardWidthAllStates(Integer cardWidth);

    CoreCardGridPartOptions setCardWidth(ScreenSizeValues<Integer> cardWidth);

    Integer getCardWidth(State state);

    ComponentOption<Integer> getCardWidthOption(State state);

    Collection<State> getCardWidthStates();

    Integer getCardHeight();

    ComponentOption<Integer> getCardHeightOption();

    CoreCardGridPartOptions setCardHeight(Integer cardHeight);

    CoreCardGridPartOptions setCardHeight(Integer cardHeight, State state);

    CoreCardGridPartOptions setCardHeightAllStates(Integer cardHeight);

    CoreCardGridPartOptions setCardHeight(ScreenSizeValues<Integer> cardHeight);

    Integer getCardHeight(State state);

    ComponentOption<Integer> getCardHeightOption(State state);

    Collection<State> getCardHeightStates();

    CardGridPositionMode getPositionMode();

    ComponentOption<CardGridPositionMode> getPositionModeOption();

    CoreCardGridPartOptions setPositionMode(CardGridPositionMode positionMode);

    boolean isAnimationEnabled();

    ComponentOption<Boolean> getAnimationEnabledOption();

    CoreCardGridPartOptions setAnimationEnabled(Boolean animationEnabled);

    boolean isExpandableCards();

    ComponentOption<Boolean> getExpandableCardsOption();

    CoreCardGridPartOptions setExpandableCards(Boolean expandableCards);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getScrimOptions();

    CoreCardGridPartOptions setScrimOptions(CoreContainerOptions scrimOptions);

    boolean hasScrimOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrimCreator();

    CoreContainerOptions getCardContainerOptions();

    CoreCardGridPartOptions setCardContainerOptions(CoreContainerOptions cardContainerOptions);

    boolean hasCardContainerOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getCardContainerCreator();

    CoreComponentFactory getComponentFactory();

    CoreCardGrid getComponent();
}