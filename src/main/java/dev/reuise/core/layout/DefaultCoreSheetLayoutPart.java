package dev.reuise.core.layout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.splitcontainer.CoreSplitContainerDivider;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanel;
import dev.reuise.core.splitcontainer.CoreSplitContainerPart;
import dev.reuise.core.splitcontainer.SplitDirection;
import dev.reuise.core.theme.Theme;
import dev.reuise.core.view.SheetSize;
import java.util.Collection;
import java.util.List;
// Option: Direction - CORE
// Option: ReverseDirection - CORE
// Option: Resizable - CORE
// Option: SplitPosition - CORE
// Option: MinSplitPosition - CORE
// Option: MaxSplitPosition - CORE
// Option: Padding - CORE
// Option: PaddingTop - CORE
// Option: PaddingRight - CORE
// Option: PaddingBottom - CORE
// Option: PaddingLeft - CORE
// Option: Position - CORE
// Option: Inset - CORE
// Option: BackdropFilter - CORE
// Option: Children - CORE
// Option: Mounted - CORE
// Option: Margin - CORE
// Option: MarginTop - CORE
// Option: MarginRight - CORE
// Option: MarginBottom - CORE
// Option: MarginLeft - CORE
// Option: Width - CORE
// Option: MinWidth - CORE
// Option: MaxWidth - CORE
// Option: Height - CORE
// Option: MinHeight - CORE
// Option: MaxHeight - CORE
// Option: RequiredLayoutComponent - CORE
// Option: Parent - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: splitContainer
// base comp: container
// add composition for container: addHeading
// add composition for container: addDivider
// add composition for container: addParagraph
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultCoreSheetLayoutPart<S extends DefaultCoreSheetLayoutPart<S, O>, O extends CoreSheetLayoutPartOptions> implements ComponentPart , CoreSheetLayout {
    private CoreSplitContainerPart splitContainerPart;

    private CoreContainerPart containerPart;

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    private CoreContainer container;

    private CoreSplitContainerPanel startPanel;

    private CoreSplitContainerDivider divider;

    private CoreSplitContainerPanel endPanel;

    protected DefaultCoreSheetLayoutPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        splitContainerPart = getSplitContainerPart();
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
        container = getContainer();
        startPanel = getStartPanel();
        divider = getDivider();
        endPanel = getEndPanel();
    }

    @Override
    public SplitDirection getDirection() {
        return splitContainerPart.getDirection();
    }

    @Override
    public S setDirection(SplitDirection direction) {
        this.splitContainerPart.setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(SplitDirection direction, State state) {
        this.splitContainerPart.setDirection(direction, state);
        return self();
    }

    @Override
    public S setDirectionAllStates(SplitDirection direction) {
        setDirection(ScreenSizeValues.of(direction, direction));
        setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(ScreenSizeValues<SplitDirection> direction) {
        this.splitContainerPart.setDirection(direction);
        return self();
    }

    @Override
    public SplitDirection getDirection(State state) {
        return splitContainerPart.getDirection(state);
    }

    @Override
    public boolean isReverseDirection() {
        return splitContainerPart.isReverseDirection();
    }

    @Override
    public S setReverseDirection(Boolean reverseDirection) {
        this.splitContainerPart.setReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public S setReverseDirection(Boolean reverseDirection, State state) {
        this.splitContainerPart.setReverseDirection(reverseDirection, state);
        return self();
    }

    @Override
    public S setReverseDirectionAllStates(Boolean reverseDirection) {
        setReverseDirection(ScreenSizeValues.of(reverseDirection, reverseDirection));
        setReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public S setReverseDirection(ScreenSizeValues<Boolean> reverseDirection) {
        this.splitContainerPart.setReverseDirection(reverseDirection);
        return self();
    }

    @Override
    public boolean isReverseDirection(State state) {
        return splitContainerPart.isReverseDirection(state);
    }

    @Override
    public boolean isResizable() {
        return splitContainerPart.isResizable();
    }

    @Override
    public S setResizable(Boolean resizable) {
        this.splitContainerPart.setResizable(resizable);
        return self();
    }

    @Override
    public Object getSplitPosition() {
        return splitContainerPart.getSplitPosition();
    }

    @Override
    public S setSplitPosition(Object splitPosition) {
        this.splitContainerPart.setSplitPosition(splitPosition);
        return self();
    }

    @Override
    public S setSplitPosition(Object splitPosition, State state) {
        this.splitContainerPart.setSplitPosition(splitPosition, state);
        return self();
    }

    @Override
    public S setSplitPositionAllStates(Object splitPosition) {
        setSplitPosition(ScreenSizeValues.of(splitPosition, splitPosition));
        setSplitPosition(splitPosition);
        return self();
    }

    @Override
    public S setSplitPosition(ScreenSizeValues<Object> splitPosition) {
        this.splitContainerPart.setSplitPosition(splitPosition);
        return self();
    }

    @Override
    public Object getSplitPosition(State state) {
        return splitContainerPart.getSplitPosition(state);
    }

    @Override
    public Object getMinSplitPosition() {
        return splitContainerPart.getMinSplitPosition();
    }

    @Override
    public S setMinSplitPosition(Object minSplitPosition) {
        this.splitContainerPart.setMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public S setMinSplitPosition(Object minSplitPosition, State state) {
        this.splitContainerPart.setMinSplitPosition(minSplitPosition, state);
        return self();
    }

    @Override
    public S setMinSplitPositionAllStates(Object minSplitPosition) {
        setMinSplitPosition(ScreenSizeValues.of(minSplitPosition, minSplitPosition));
        setMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public S setMinSplitPosition(ScreenSizeValues<Object> minSplitPosition) {
        this.splitContainerPart.setMinSplitPosition(minSplitPosition);
        return self();
    }

    @Override
    public Object getMinSplitPosition(State state) {
        return splitContainerPart.getMinSplitPosition(state);
    }

    @Override
    public Object getMaxSplitPosition() {
        return splitContainerPart.getMaxSplitPosition();
    }

    @Override
    public S setMaxSplitPosition(Object maxSplitPosition) {
        this.splitContainerPart.setMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public S setMaxSplitPosition(Object maxSplitPosition, State state) {
        this.splitContainerPart.setMaxSplitPosition(maxSplitPosition, state);
        return self();
    }

    @Override
    public S setMaxSplitPositionAllStates(Object maxSplitPosition) {
        setMaxSplitPosition(ScreenSizeValues.of(maxSplitPosition, maxSplitPosition));
        setMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public S setMaxSplitPosition(ScreenSizeValues<Object> maxSplitPosition) {
        this.splitContainerPart.setMaxSplitPosition(maxSplitPosition);
        return self();
    }

    @Override
    public Object getMaxSplitPosition(State state) {
        return splitContainerPart.getMaxSplitPosition(state);
    }

    @Override
    public RootComponent getRootComponent() {
        return splitContainerPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.splitContainerPart.setRootComponent(rootComponent);
    }

    // Implementation
    @Override
    public S add(CoreComponent child) {
        this.getStartPanel().add(child);
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        splitContainerPart.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        splitContainerPart.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        splitContainerPart.remove(child);
    }

    @Override
    public void removeAll() {
        splitContainerPart.removeAll();
    }

    @Override
    public Object getPadding() {
        return containerPart.getPadding();
    }

    @Override
    public S setPadding(Object padding) {
        this.containerPart.setPadding(padding);
        return self();
    }

    @Override
    public S setPadding(Object padding, State state) {
        this.containerPart.setPadding(padding, state);
        return self();
    }

    @Override
    public S setPaddingAllStates(Object padding) {
        setPadding(ScreenSizeValues.of(padding, padding));
        setPadding(padding);
        return self();
    }

    @Override
    public S setPadding(ScreenSizeValues<Object> padding) {
        this.containerPart.setPadding(padding);
        return self();
    }

    @Override
    public Object getPadding(State state) {
        return containerPart.getPadding(state);
    }

    @Override
    public Object getPaddingTop() {
        return containerPart.getPaddingTop();
    }

    @Override
    public S setPaddingTop(Object paddingTop) {
        this.containerPart.setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(Object paddingTop, State state) {
        this.containerPart.setPaddingTop(paddingTop, state);
        return self();
    }

    @Override
    public S setPaddingTopAllStates(Object paddingTop) {
        setPaddingTop(ScreenSizeValues.of(paddingTop, paddingTop));
        setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public S setPaddingTop(ScreenSizeValues<Object> paddingTop) {
        this.containerPart.setPaddingTop(paddingTop);
        return self();
    }

    @Override
    public Object getPaddingTop(State state) {
        return containerPart.getPaddingTop(state);
    }

    @Override
    public Object getPaddingRight() {
        return containerPart.getPaddingRight();
    }

    @Override
    public S setPaddingRight(Object paddingRight) {
        this.containerPart.setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(Object paddingRight, State state) {
        this.containerPart.setPaddingRight(paddingRight, state);
        return self();
    }

    @Override
    public S setPaddingRightAllStates(Object paddingRight) {
        setPaddingRight(ScreenSizeValues.of(paddingRight, paddingRight));
        setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public S setPaddingRight(ScreenSizeValues<Object> paddingRight) {
        this.containerPart.setPaddingRight(paddingRight);
        return self();
    }

    @Override
    public Object getPaddingRight(State state) {
        return containerPart.getPaddingRight(state);
    }

    @Override
    public Object getPaddingBottom() {
        return containerPart.getPaddingBottom();
    }

    @Override
    public S setPaddingBottom(Object paddingBottom) {
        this.containerPart.setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(Object paddingBottom, State state) {
        this.containerPart.setPaddingBottom(paddingBottom, state);
        return self();
    }

    @Override
    public S setPaddingBottomAllStates(Object paddingBottom) {
        setPaddingBottom(ScreenSizeValues.of(paddingBottom, paddingBottom));
        setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public S setPaddingBottom(ScreenSizeValues<Object> paddingBottom) {
        this.containerPart.setPaddingBottom(paddingBottom);
        return self();
    }

    @Override
    public Object getPaddingBottom(State state) {
        return containerPart.getPaddingBottom(state);
    }

    @Override
    public Object getPaddingLeft() {
        return containerPart.getPaddingLeft();
    }

    @Override
    public S setPaddingLeft(Object paddingLeft) {
        this.containerPart.setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(Object paddingLeft, State state) {
        this.containerPart.setPaddingLeft(paddingLeft, state);
        return self();
    }

    @Override
    public S setPaddingLeftAllStates(Object paddingLeft) {
        setPaddingLeft(ScreenSizeValues.of(paddingLeft, paddingLeft));
        setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public S setPaddingLeft(ScreenSizeValues<Object> paddingLeft) {
        this.containerPart.setPaddingLeft(paddingLeft);
        return self();
    }

    @Override
    public Object getPaddingLeft(State state) {
        return containerPart.getPaddingLeft(state);
    }

    @Override
    public String getPosition() {
        return containerPart.getPosition();
    }

    @Override
    public S setPosition(String position) {
        this.containerPart.setPosition(position);
        return self();
    }

    @Override
    public S setPosition(String position, State state) {
        this.containerPart.setPosition(position, state);
        return self();
    }

    @Override
    public S setPositionAllStates(String position) {
        setPosition(ScreenSizeValues.of(position, position));
        setPosition(position);
        return self();
    }

    @Override
    public S setPosition(ScreenSizeValues<String> position) {
        this.containerPart.setPosition(position);
        return self();
    }

    @Override
    public String getPosition(State state) {
        return containerPart.getPosition(state);
    }

    @Override
    public Object getInset() {
        return containerPart.getInset();
    }

    @Override
    public S setInset(Object inset) {
        this.containerPart.setInset(inset);
        return self();
    }

    @Override
    public S setInset(Object inset, State state) {
        this.containerPart.setInset(inset, state);
        return self();
    }

    @Override
    public S setInsetAllStates(Object inset) {
        setInset(ScreenSizeValues.of(inset, inset));
        setInset(inset);
        return self();
    }

    @Override
    public S setInset(ScreenSizeValues<Object> inset) {
        this.containerPart.setInset(inset);
        return self();
    }

    @Override
    public Object getInset(State state) {
        return containerPart.getInset(state);
    }

    @Override
    public BackdropFilterSetting getBackdropFilter() {
        return containerPart.getBackdropFilter();
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter) {
        this.containerPart.setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilterSetting backdropFilter, State state) {
        this.containerPart.setBackdropFilter(backdropFilter, state);
        return self();
    }

    @Override
    public S setBackdropFilterAllStates(BackdropFilterSetting backdropFilter) {
        setBackdropFilter(ScreenSizeValues.of(backdropFilter, backdropFilter));
        setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public S setBackdropFilter(ScreenSizeValues<BackdropFilterSetting> backdropFilter) {
        this.containerPart.setBackdropFilter(backdropFilter);
        return self();
    }

    @Override
    public BackdropFilterSetting getBackdropFilter(State state) {
        return containerPart.getBackdropFilter(state);
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        splitContainerPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        splitContainerPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        splitContainerPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        splitContainerPart.addHeading(html);
        return self();
    }

    public S addDivider() {
        splitContainerPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        splitContainerPart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        splitContainerPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        splitContainerPart.addParagraph(html);
        return self();
    }

    @Override
    public List<CoreComponent> getChildren() {
        return parentComponentPart.getChildren();
    }

    @Override
    public S setChildren(List<CoreComponent> children) {
        this.parentComponentPart.setChildren(children);
        return self();
    }

    @Override
    public S setChild(CoreComponent child) {
        parentComponentPart.setChild(child);
        return self();
    }

    @Override
    public S removeChild(CoreComponent child) {
        parentComponentPart.removeChild(child);
        return self();
    }

    @Override
    public boolean isMounted() {
        return baseComponentPart.isMounted();
    }

    @Override
    public S setMounted(Boolean mounted) {
        this.baseComponentPart.setMounted(mounted);
        return self();
    }

    @Override
    public Object getMargin() {
        return baseComponentPart.getMargin();
    }

    @Override
    public S setMargin(Object margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(Object margin, State state) {
        this.baseComponentPart.setMargin(margin, state);
        return self();
    }

    @Override
    public S setMarginAllStates(Object margin) {
        setMargin(ScreenSizeValues.of(margin, margin));
        setMargin(margin);
        return self();
    }

    @Override
    public S setMargin(ScreenSizeValues<Object> margin) {
        this.baseComponentPart.setMargin(margin);
        return self();
    }

    @Override
    public Object getMargin(State state) {
        return baseComponentPart.getMargin(state);
    }

    @Override
    public Object getMarginTop() {
        return baseComponentPart.getMarginTop();
    }

    @Override
    public S setMarginTop(Object marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(Object marginTop, State state) {
        this.baseComponentPart.setMarginTop(marginTop, state);
        return self();
    }

    @Override
    public S setMarginTopAllStates(Object marginTop) {
        setMarginTop(ScreenSizeValues.of(marginTop, marginTop));
        setMarginTop(marginTop);
        return self();
    }

    @Override
    public S setMarginTop(ScreenSizeValues<Object> marginTop) {
        this.baseComponentPart.setMarginTop(marginTop);
        return self();
    }

    @Override
    public Object getMarginTop(State state) {
        return baseComponentPart.getMarginTop(state);
    }

    @Override
    public Object getMarginRight() {
        return baseComponentPart.getMarginRight();
    }

    @Override
    public S setMarginRight(Object marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(Object marginRight, State state) {
        this.baseComponentPart.setMarginRight(marginRight, state);
        return self();
    }

    @Override
    public S setMarginRightAllStates(Object marginRight) {
        setMarginRight(ScreenSizeValues.of(marginRight, marginRight));
        setMarginRight(marginRight);
        return self();
    }

    @Override
    public S setMarginRight(ScreenSizeValues<Object> marginRight) {
        this.baseComponentPart.setMarginRight(marginRight);
        return self();
    }

    @Override
    public Object getMarginRight(State state) {
        return baseComponentPart.getMarginRight(state);
    }

    @Override
    public Object getMarginBottom() {
        return baseComponentPart.getMarginBottom();
    }

    @Override
    public S setMarginBottom(Object marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(Object marginBottom, State state) {
        this.baseComponentPart.setMarginBottom(marginBottom, state);
        return self();
    }

    @Override
    public S setMarginBottomAllStates(Object marginBottom) {
        setMarginBottom(ScreenSizeValues.of(marginBottom, marginBottom));
        setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public S setMarginBottom(ScreenSizeValues<Object> marginBottom) {
        this.baseComponentPart.setMarginBottom(marginBottom);
        return self();
    }

    @Override
    public Object getMarginBottom(State state) {
        return baseComponentPart.getMarginBottom(state);
    }

    @Override
    public Object getMarginLeft() {
        return baseComponentPart.getMarginLeft();
    }

    @Override
    public S setMarginLeft(Object marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(Object marginLeft, State state) {
        this.baseComponentPart.setMarginLeft(marginLeft, state);
        return self();
    }

    @Override
    public S setMarginLeftAllStates(Object marginLeft) {
        setMarginLeft(ScreenSizeValues.of(marginLeft, marginLeft));
        setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public S setMarginLeft(ScreenSizeValues<Object> marginLeft) {
        this.baseComponentPart.setMarginLeft(marginLeft);
        return self();
    }

    @Override
    public Object getMarginLeft(State state) {
        return baseComponentPart.getMarginLeft(state);
    }

    @Override
    public Object getWidth() {
        return baseComponentPart.getWidth();
    }

    @Override
    public S setWidth(Object width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public S setWidth(Object width, State state) {
        this.baseComponentPart.setWidth(width, state);
        return self();
    }

    @Override
    public S setWidthAllStates(Object width) {
        setWidth(ScreenSizeValues.of(width, width));
        setWidth(width);
        return self();
    }

    @Override
    public S setWidth(ScreenSizeValues<Object> width) {
        this.baseComponentPart.setWidth(width);
        return self();
    }

    @Override
    public Object getWidth(State state) {
        return baseComponentPart.getWidth(state);
    }

    @Override
    public Object getMinWidth() {
        return baseComponentPart.getMinWidth();
    }

    @Override
    public S setMinWidth(Object minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(Object minWidth, State state) {
        this.baseComponentPart.setMinWidth(minWidth, state);
        return self();
    }

    @Override
    public S setMinWidthAllStates(Object minWidth) {
        setMinWidth(ScreenSizeValues.of(minWidth, minWidth));
        setMinWidth(minWidth);
        return self();
    }

    @Override
    public S setMinWidth(ScreenSizeValues<Object> minWidth) {
        this.baseComponentPart.setMinWidth(minWidth);
        return self();
    }

    @Override
    public Object getMinWidth(State state) {
        return baseComponentPart.getMinWidth(state);
    }

    @Override
    public Object getMaxWidth() {
        return baseComponentPart.getMaxWidth();
    }

    @Override
    public S setMaxWidth(Object maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(Object maxWidth, State state) {
        this.baseComponentPart.setMaxWidth(maxWidth, state);
        return self();
    }

    @Override
    public S setMaxWidthAllStates(Object maxWidth) {
        setMaxWidth(ScreenSizeValues.of(maxWidth, maxWidth));
        setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public S setMaxWidth(ScreenSizeValues<Object> maxWidth) {
        this.baseComponentPart.setMaxWidth(maxWidth);
        return self();
    }

    @Override
    public Object getMaxWidth(State state) {
        return baseComponentPart.getMaxWidth(state);
    }

    @Override
    public Object getHeight() {
        return baseComponentPart.getHeight();
    }

    @Override
    public S setHeight(Object height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public S setHeight(Object height, State state) {
        this.baseComponentPart.setHeight(height, state);
        return self();
    }

    @Override
    public S setHeightAllStates(Object height) {
        setHeight(ScreenSizeValues.of(height, height));
        setHeight(height);
        return self();
    }

    @Override
    public S setHeight(ScreenSizeValues<Object> height) {
        this.baseComponentPart.setHeight(height);
        return self();
    }

    @Override
    public Object getHeight(State state) {
        return baseComponentPart.getHeight(state);
    }

    @Override
    public Object getMinHeight() {
        return baseComponentPart.getMinHeight();
    }

    @Override
    public S setMinHeight(Object minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(Object minHeight, State state) {
        this.baseComponentPart.setMinHeight(minHeight, state);
        return self();
    }

    @Override
    public S setMinHeightAllStates(Object minHeight) {
        setMinHeight(ScreenSizeValues.of(minHeight, minHeight));
        setMinHeight(minHeight);
        return self();
    }

    @Override
    public S setMinHeight(ScreenSizeValues<Object> minHeight) {
        this.baseComponentPart.setMinHeight(minHeight);
        return self();
    }

    @Override
    public Object getMinHeight(State state) {
        return baseComponentPart.getMinHeight(state);
    }

    @Override
    public Object getMaxHeight() {
        return baseComponentPart.getMaxHeight();
    }

    @Override
    public S setMaxHeight(Object maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(Object maxHeight, State state) {
        this.baseComponentPart.setMaxHeight(maxHeight, state);
        return self();
    }

    @Override
    public S setMaxHeightAllStates(Object maxHeight) {
        setMaxHeight(ScreenSizeValues.of(maxHeight, maxHeight));
        setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public S setMaxHeight(ScreenSizeValues<Object> maxHeight) {
        this.baseComponentPart.setMaxHeight(maxHeight);
        return self();
    }

    @Override
    public Object getMaxHeight(State state) {
        return baseComponentPart.getMaxHeight(state);
    }

    @Override
    public boolean isRequiredLayoutComponent() {
        return baseComponentPart.isRequiredLayoutComponent();
    }

    @Override
    public S setRequiredLayoutComponent(Boolean requiredLayoutComponent) {
        this.baseComponentPart.setRequiredLayoutComponent(requiredLayoutComponent);
        return self();
    }

    @Override
    public CoreComponent getParent() {
        return baseComponentPart.getParent();
    }

    @Override
    public S setParent(CoreComponent parent) {
        this.baseComponentPart.setParent(parent);
        return self();
    }

    @Override
    public CoreParentComponent getWrapper() {
        return baseComponentPart.getWrapper();
    }

    @Override
    public S setWrapper(CoreParentComponent wrapper) {
        this.baseComponentPart.setWrapper(wrapper);
        return self();
    }

    @Override
    public Theme getTheme() {
        return baseComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.baseComponentPart.setTheme(theme);
        return self();
    }

    @Override
    public boolean isVisible() {
        return baseComponentPart.isVisible();
    }

    @Override
    public S setVisible(Boolean visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(Boolean visible, State state) {
        this.baseComponentPart.setVisible(visible, state);
        return self();
    }

    @Override
    public S setVisibleAllStates(Boolean visible) {
        setVisible(ScreenSizeValues.of(visible, visible));
        setVisible(visible);
        return self();
    }

    @Override
    public S setVisible(ScreenSizeValues<Boolean> visible) {
        this.baseComponentPart.setVisible(visible);
        return self();
    }

    @Override
    public boolean isVisible(State state) {
        return baseComponentPart.isVisible(state);
    }

    @Override
    public boolean isEnabled() {
        return baseComponentPart.isEnabled();
    }

    @Override
    public S setEnabled(Boolean enabled) {
        this.baseComponentPart.setEnabled(enabled);
        return self();
    }

    @Override
    public boolean isFocused() {
        return baseComponentPart.isFocused();
    }

    @Override
    public S setFocused(Boolean focused) {
        this.baseComponentPart.setFocused(focused);
        return self();
    }

    @Override
    public boolean isDebug() {
        return baseComponentPart.isDebug();
    }

    @Override
    public S setDebug(Boolean debug) {
        this.baseComponentPart.setDebug(debug);
        return self();
    }

    @Override
    public String getDebugId() {
        return baseComponentPart.getDebugId();
    }

    @Override
    public S setDebugId(String debugId) {
        this.baseComponentPart.setDebugId(debugId);
        return self();
    }

    public boolean hasWrapper() {
        return splitContainerPart.hasWrapper();
    }

    public boolean isInitialized() {
        return splitContainerPart.isInitialized();
    }

    public void log(Object obj) {
        splitContainerPart.log(obj);
    }

    public void removeFromParent() {
        splitContainerPart.removeFromParent();
    }

    @Override
    public CoreComponentFactory getComponentFactory() {
        return ((CoreComponentFactory) (baseComponentPart.getComponentFactory()));
    }

    @Override
    public void addPart(ComponentPart.Type type, ComponentPart part) {
        baseComponentPart.addPart(type, part);
    }

    @Override
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        baseComponentPart.initialize(component, options);
    }

    @Override
    public CoreSheetLayout getComponent() {
        return ((CoreSheetLayout) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        setupReferences();
        return true;
    }

    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        splitContainerPart.onInitializeComponentType(rootComponent);
    }

    protected abstract S self();

    // Implementation
    public S setSheetSize(Object sheetSize) {
        if (sheetSize instanceof SheetSize)
            return setSheetSize(((SheetSize) (sheetSize)));

        setSplitPosition(sheetSize);
        getStartPanel().setSize(sheetSize);
        return self();
    }

    // Implementation
    public S setSheetSize(SheetSize sheetSize) {
        setSheetSize(((Object) (sheetSize.getSize())));
        setMinSheetSize(sheetSize.getMinSize());
        setMaxSheetSize(sheetSize.getMaxSize());
        return self();
    }

    // Implementation
    public S setMinSheetSize(Object minSheetSize) {
        setMinSplitPosition(minSheetSize);
        getStartPanel().setMinSize(minSheetSize);
        return self();
    }

    // Implementation
    public S setMaxSheetSize(Object maxSheetSize) {
        setMaxSplitPosition(maxSheetSize);
        getStartPanel().setMaxSize(maxSheetSize);
        return self();
    }
}