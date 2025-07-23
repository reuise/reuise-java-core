package dev.reuise.core.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeRange;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreCardGridOptions<S extends AbstractCoreCardGridOptions<S>> implements CoreCardGridOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions scrimOptions;

    protected dev.reuise.core.layout.CoreContainerOptions cardContainerOptions;

    protected AbstractCoreCardGridOptions() {
        scrimOptions = createDefaultScrimOptions();
        cardContainerOptions = createDefaultCardContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultColumnGap(24);
        setColumnGap(24, ScreenSizeRange.from(ScreenSize.MEDIUM).to(ScreenSize.EXTRA_LARGE));
        setColumnGap(16, ScreenSizeRange.from(ScreenSize.EXTRA_SMALL).to(ScreenSize.SMALL));
        setDefaultRowGap(24);
        setRowGap(24, ScreenSizeRange.from(ScreenSize.MEDIUM).to(ScreenSize.EXTRA_LARGE));
        setRowGap(16, ScreenSizeRange.from(ScreenSize.EXTRA_SMALL).to(ScreenSize.SMALL));
        setDefaultCardWidth(220);
        setDefaultCardHeight(360);
        setDefaultPositionMode(CardGridPositionMode.FLEX);
        setDefaultAnimationEnabled(false);
        setDefaultExpandableCards(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Integer getColumnGap() {
        return ((Integer) (getOptionValue("columnGap")));
    }

    @Override
    public ComponentOption<Integer> getColumnGapOption() {
        return ((ComponentOption<Integer>) (getOption("columnGap")));
    }

    @Override
    public S setColumnGap(Integer columnGap) {
        setOption("columnGap", columnGap, true);
        setLayoutChildrenColumnGap(columnGap);
        return self();
    }

    @Override
    public S setColumnGap(Integer columnGap, State state) {
        setOption("columnGap", columnGap, state, true);
        setLayoutChildrenColumnGap(columnGap, state);
        return self();
    }

    @Override
    public S setColumnGapAllStates(Integer columnGap) {
        // HIMADDIE!!
        clearOptionStates("columnGap");
        setColumnGap(columnGap);
        setLayoutChildrenColumnGap(columnGap);
        return self();
    }

    @Override
    public S setColumnGap(ScreenSizeValues<Integer> screenValues) {
        clearOption("columnGap", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Integer v) -> setColumnGap(v, s));
        setLayoutChildrenColumnGap(screenValues);
        return self();
    }

    @Override
    public Integer getColumnGap(State state) {
        return ((Integer) (getOptionValue("columnGap", state)));
    }

    @Override
    public Collection<State> getColumnGapStates() {
        return getOptionStates("columnGap");
    }

    @Override
    public ComponentOption<Integer> getColumnGapOption(State state) {
        return ((ComponentOption<Integer>) (getOption("columnGap", state)));
    }

    protected void setLayoutChildrenColumnGap(Integer columnGap) {
    }

    protected void setLayoutChildrenColumnGap(Integer columnGap, State state) {
    }

    protected void setLayoutChildrenColumnGap(ScreenSizeValues<Integer> columnGap) {
    }

    private void setDefaultColumnGap(Integer columnGap) {
        setDefaultOption("columnGap", columnGap, true);
        setLayoutChildrenColumnGap(columnGap);
    }

    private void setDefaultColumnGap(Integer columnGap, State state) {
        setDefaultOption("columnGap", columnGap, state, true);
        setLayoutChildrenColumnGap(columnGap, state);
    }

    private void setDefaultColumnGapAllStates(Integer columnGap) {
        // HIMADDIE!!
        clearOptionStates("columnGap");
        setColumnGap(columnGap);
        setLayoutChildrenColumnGap(columnGap);
    }

    @Override
    public Integer getRowGap() {
        return ((Integer) (getOptionValue("rowGap")));
    }

    @Override
    public ComponentOption<Integer> getRowGapOption() {
        return ((ComponentOption<Integer>) (getOption("rowGap")));
    }

    @Override
    public S setRowGap(Integer rowGap) {
        setOption("rowGap", rowGap, true);
        setLayoutChildrenRowGap(rowGap);
        return self();
    }

    @Override
    public S setRowGap(Integer rowGap, State state) {
        setOption("rowGap", rowGap, state, true);
        setLayoutChildrenRowGap(rowGap, state);
        return self();
    }

    @Override
    public S setRowGapAllStates(Integer rowGap) {
        // HIMADDIE!!
        clearOptionStates("rowGap");
        setRowGap(rowGap);
        setLayoutChildrenRowGap(rowGap);
        return self();
    }

    @Override
    public S setRowGap(ScreenSizeValues<Integer> screenValues) {
        clearOption("rowGap", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Integer v) -> setRowGap(v, s));
        setLayoutChildrenRowGap(screenValues);
        return self();
    }

    @Override
    public Integer getRowGap(State state) {
        return ((Integer) (getOptionValue("rowGap", state)));
    }

    @Override
    public Collection<State> getRowGapStates() {
        return getOptionStates("rowGap");
    }

    @Override
    public ComponentOption<Integer> getRowGapOption(State state) {
        return ((ComponentOption<Integer>) (getOption("rowGap", state)));
    }

    protected void setLayoutChildrenRowGap(Integer rowGap) {
    }

    protected void setLayoutChildrenRowGap(Integer rowGap, State state) {
    }

    protected void setLayoutChildrenRowGap(ScreenSizeValues<Integer> rowGap) {
    }

    private void setDefaultRowGap(Integer rowGap) {
        setDefaultOption("rowGap", rowGap, true);
        setLayoutChildrenRowGap(rowGap);
    }

    private void setDefaultRowGap(Integer rowGap, State state) {
        setDefaultOption("rowGap", rowGap, state, true);
        setLayoutChildrenRowGap(rowGap, state);
    }

    private void setDefaultRowGapAllStates(Integer rowGap) {
        // HIMADDIE!!
        clearOptionStates("rowGap");
        setRowGap(rowGap);
        setLayoutChildrenRowGap(rowGap);
    }

    @Override
    public Integer getGap() {
        return ((Integer) (getOptionValue("gap")));
    }

    @Override
    public ComponentOption<Integer> getGapOption() {
        return ((ComponentOption<Integer>) (getOption("gap")));
    }

    @Override
    public S setGap(Integer gap) {
        setOption("gap", gap);
        setLayoutChildrenGap(gap);
        return self();
    }

    @Override
    public S setGap(Integer gap, State state) {
        setOption("gap", gap, state);
        setLayoutChildrenGap(gap, state);
        return self();
    }

    @Override
    public S setGapAllStates(Integer gap) {
        // HIMADDIE!!
        clearOptionStates("gap");
        setGap(gap);
        setLayoutChildrenGap(gap);
        return self();
    }

    @Override
    public S setGap(ScreenSizeValues<Integer> screenValues) {
        clearOption("gap", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Integer v) -> setGap(v, s));
        setLayoutChildrenGap(screenValues);
        return self();
    }

    @Override
    public Integer getGap(State state) {
        return ((Integer) (getOptionValue("gap", state)));
    }

    @Override
    public Collection<State> getGapStates() {
        return getOptionStates("gap");
    }

    @Override
    public ComponentOption<Integer> getGapOption(State state) {
        return ((ComponentOption<Integer>) (getOption("gap", state)));
    }

    protected void setLayoutChildrenGap(Integer gap) {
    }

    protected void setLayoutChildrenGap(Integer gap, State state) {
    }

    protected void setLayoutChildrenGap(ScreenSizeValues<Integer> gap) {
    }

    private void setDefaultGap(Integer gap) {
        setDefaultOption("gap", gap);
        setLayoutChildrenGap(gap);
    }

    private void setDefaultGap(Integer gap, State state) {
        setDefaultOption("gap", gap, state);
        setLayoutChildrenGap(gap, state);
    }

    private void setDefaultGapAllStates(Integer gap) {
        // HIMADDIE!!
        clearOptionStates("gap");
        setGap(gap);
        setLayoutChildrenGap(gap);
    }

    @Override
    public Integer getCardWidth() {
        return ((Integer) (getOptionValue("cardWidth")));
    }

    @Override
    public ComponentOption<Integer> getCardWidthOption() {
        return ((ComponentOption<Integer>) (getOption("cardWidth")));
    }

    @Override
    public S setCardWidth(Integer cardWidth) {
        setOption("cardWidth", cardWidth, true);
        setLayoutChildrenCardWidth(cardWidth);
        return self();
    }

    @Override
    public S setCardWidth(Integer cardWidth, State state) {
        setOption("cardWidth", cardWidth, state, true);
        setLayoutChildrenCardWidth(cardWidth, state);
        return self();
    }

    @Override
    public S setCardWidthAllStates(Integer cardWidth) {
        // HIMADDIE!!
        clearOptionStates("cardWidth");
        setCardWidth(cardWidth);
        setLayoutChildrenCardWidth(cardWidth);
        return self();
    }

    @Override
    public S setCardWidth(ScreenSizeValues<Integer> screenValues) {
        clearOption("cardWidth", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Integer v) -> setCardWidth(v, s));
        setLayoutChildrenCardWidth(screenValues);
        return self();
    }

    @Override
    public Integer getCardWidth(State state) {
        return ((Integer) (getOptionValue("cardWidth", state)));
    }

    @Override
    public Collection<State> getCardWidthStates() {
        return getOptionStates("cardWidth");
    }

    @Override
    public ComponentOption<Integer> getCardWidthOption(State state) {
        return ((ComponentOption<Integer>) (getOption("cardWidth", state)));
    }

    protected void setLayoutChildrenCardWidth(Integer cardWidth) {
    }

    protected void setLayoutChildrenCardWidth(Integer cardWidth, State state) {
    }

    protected void setLayoutChildrenCardWidth(ScreenSizeValues<Integer> cardWidth) {
    }

    private void setDefaultCardWidth(Integer cardWidth) {
        setDefaultOption("cardWidth", cardWidth, true);
        setLayoutChildrenCardWidth(cardWidth);
    }

    private void setDefaultCardWidth(Integer cardWidth, State state) {
        setDefaultOption("cardWidth", cardWidth, state, true);
        setLayoutChildrenCardWidth(cardWidth, state);
    }

    private void setDefaultCardWidthAllStates(Integer cardWidth) {
        // HIMADDIE!!
        clearOptionStates("cardWidth");
        setCardWidth(cardWidth);
        setLayoutChildrenCardWidth(cardWidth);
    }

    @Override
    public Integer getCardHeight() {
        return ((Integer) (getOptionValue("cardHeight")));
    }

    @Override
    public ComponentOption<Integer> getCardHeightOption() {
        return ((ComponentOption<Integer>) (getOption("cardHeight")));
    }

    @Override
    public S setCardHeight(Integer cardHeight) {
        setOption("cardHeight", cardHeight, true);
        setLayoutChildrenCardHeight(cardHeight);
        return self();
    }

    @Override
    public S setCardHeight(Integer cardHeight, State state) {
        setOption("cardHeight", cardHeight, state, true);
        setLayoutChildrenCardHeight(cardHeight, state);
        return self();
    }

    @Override
    public S setCardHeightAllStates(Integer cardHeight) {
        // HIMADDIE!!
        clearOptionStates("cardHeight");
        setCardHeight(cardHeight);
        setLayoutChildrenCardHeight(cardHeight);
        return self();
    }

    @Override
    public S setCardHeight(ScreenSizeValues<Integer> screenValues) {
        clearOption("cardHeight", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Integer v) -> setCardHeight(v, s));
        setLayoutChildrenCardHeight(screenValues);
        return self();
    }

    @Override
    public Integer getCardHeight(State state) {
        return ((Integer) (getOptionValue("cardHeight", state)));
    }

    @Override
    public Collection<State> getCardHeightStates() {
        return getOptionStates("cardHeight");
    }

    @Override
    public ComponentOption<Integer> getCardHeightOption(State state) {
        return ((ComponentOption<Integer>) (getOption("cardHeight", state)));
    }

    protected void setLayoutChildrenCardHeight(Integer cardHeight) {
    }

    protected void setLayoutChildrenCardHeight(Integer cardHeight, State state) {
    }

    protected void setLayoutChildrenCardHeight(ScreenSizeValues<Integer> cardHeight) {
    }

    private void setDefaultCardHeight(Integer cardHeight) {
        setDefaultOption("cardHeight", cardHeight, true);
        setLayoutChildrenCardHeight(cardHeight);
    }

    private void setDefaultCardHeight(Integer cardHeight, State state) {
        setDefaultOption("cardHeight", cardHeight, state, true);
        setLayoutChildrenCardHeight(cardHeight, state);
    }

    private void setDefaultCardHeightAllStates(Integer cardHeight) {
        // HIMADDIE!!
        clearOptionStates("cardHeight");
        setCardHeight(cardHeight);
        setLayoutChildrenCardHeight(cardHeight);
    }

    @Override
    public CardGridPositionMode getPositionMode() {
        return ((CardGridPositionMode) (getOptionValue("positionMode")));
    }

    @Override
    public ComponentOption<CardGridPositionMode> getPositionModeOption() {
        return ((ComponentOption<CardGridPositionMode>) (getOption("positionMode")));
    }

    @Override
    public S setPositionMode(CardGridPositionMode positionMode) {
        setOption("positionMode", positionMode, true);
        setLayoutChildrenPositionMode(positionMode);
        return self();
    }

    protected void setLayoutChildrenPositionMode(CardGridPositionMode positionMode) {
    }

    private void setDefaultPositionMode(CardGridPositionMode positionMode) {
        setDefaultOption("positionMode", positionMode, true);
        setLayoutChildrenPositionMode(positionMode);
    }

    @Override
    public boolean isAnimationEnabled() {
        return Boolean.TRUE.equals(getOptionValue("animationEnabled"));
    }

    @Override
    public ComponentOption<Boolean> getAnimationEnabledOption() {
        return ((ComponentOption<Boolean>) (getOption("animationEnabled")));
    }

    @Override
    public S setAnimationEnabled(Boolean animationEnabled) {
        setOption("animationEnabled", animationEnabled, true);
        setLayoutChildrenAnimationEnabled(animationEnabled);
        return self();
    }

    protected void setLayoutChildrenAnimationEnabled(Boolean animationEnabled) {
    }

    private void setDefaultAnimationEnabled(Boolean animationEnabled) {
        setDefaultOption("animationEnabled", animationEnabled, true);
        setLayoutChildrenAnimationEnabled(animationEnabled);
    }

    @Override
    public boolean isExpandableCards() {
        return Boolean.TRUE.equals(getOptionValue("expandableCards"));
    }

    @Override
    public ComponentOption<Boolean> getExpandableCardsOption() {
        return ((ComponentOption<Boolean>) (getOption("expandableCards")));
    }

    @Override
    public S setExpandableCards(Boolean expandableCards) {
        setOption("expandableCards", expandableCards, true);
        setLayoutChildrenExpandableCards(expandableCards);
        return self();
    }

    protected void setLayoutChildrenExpandableCards(Boolean expandableCards) {
    }

    private void setDefaultExpandableCards(Boolean expandableCards) {
        setDefaultOption("expandableCards", expandableCards, true);
        setLayoutChildrenExpandableCards(expandableCards);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrimOptions() {
        return scrimOptions;
    }

    @Override
    public boolean hasScrimOptions() {
        return scrimOptions != null;
    }

    @Override
    public S setScrimOptions(dev.reuise.core.layout.CoreContainerOptions scrimOptions) {
        if (!hasScrimOptions())
            this.scrimOptions = createDefaultScrimOptions();

        // Merge with default options
        this.scrimOptions.merge(scrimOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getCardContainerOptions() {
        return cardContainerOptions;
    }

    @Override
    public boolean hasCardContainerOptions() {
        return cardContainerOptions != null;
    }

    @Override
    public S setCardContainerOptions(dev.reuise.core.layout.CoreContainerOptions cardContainerOptions) {
        if (!hasCardContainerOptions())
            this.cardContainerOptions = createDefaultCardContainerOptions();

        // Merge with default options
        this.cardContainerOptions.merge(cardContainerOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultScrimOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultCardContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}