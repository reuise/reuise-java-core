package dev.reuise.core.card;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreCardGridFeatures {
    Integer getColumnGap();

    CoreCardGridFeatures setColumnGap(Integer columnGap);

    CoreCardGridFeatures setColumnGap(Integer columnGap, State state);

    CoreCardGridFeatures setColumnGapAllStates(Integer columnGap);

    CoreCardGridFeatures setColumnGap(ScreenSizeValues<Integer> columnGap);

    Integer getColumnGap(State state);

    Integer getRowGap();

    CoreCardGridFeatures setRowGap(Integer rowGap);

    CoreCardGridFeatures setRowGap(Integer rowGap, State state);

    CoreCardGridFeatures setRowGapAllStates(Integer rowGap);

    CoreCardGridFeatures setRowGap(ScreenSizeValues<Integer> rowGap);

    Integer getRowGap(State state);

    Integer getGap();

    CoreCardGridFeatures setGap(Integer gap);

    CoreCardGridFeatures setGap(Integer gap, State state);

    CoreCardGridFeatures setGapAllStates(Integer gap);

    CoreCardGridFeatures setGap(ScreenSizeValues<Integer> gap);

    Integer getGap(State state);

    Integer getCardWidth();

    CoreCardGridFeatures setCardWidth(Integer cardWidth);

    CoreCardGridFeatures setCardWidth(Integer cardWidth, State state);

    CoreCardGridFeatures setCardWidthAllStates(Integer cardWidth);

    CoreCardGridFeatures setCardWidth(ScreenSizeValues<Integer> cardWidth);

    Integer getCardWidth(State state);

    Integer getCardHeight();

    CoreCardGridFeatures setCardHeight(Integer cardHeight);

    CoreCardGridFeatures setCardHeight(Integer cardHeight, State state);

    CoreCardGridFeatures setCardHeightAllStates(Integer cardHeight);

    CoreCardGridFeatures setCardHeight(ScreenSizeValues<Integer> cardHeight);

    Integer getCardHeight(State state);

    CardGridPositionMode getPositionMode();

    CoreCardGridFeatures setPositionMode(CardGridPositionMode positionMode);

    boolean isAnimationEnabled();

    CoreCardGridFeatures setAnimationEnabled(Boolean animationEnabled);

    boolean isExpandableCards();

    CoreCardGridFeatures setExpandableCards(Boolean expandableCards);
}