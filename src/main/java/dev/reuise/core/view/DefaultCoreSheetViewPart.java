package dev.reuise.core.view;
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
import dev.reuise.core.layout.AlignItems;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.BackdropFilterSetting;
import dev.reuise.core.layout.CoreContainerPart;
import dev.reuise.core.layout.CoreFlexContainerPart;
import dev.reuise.core.layout.FlexDirection;
import dev.reuise.core.layout.JustifyContent;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.theme.Theme;
import java.util.Collection;
import java.util.List;
// Option: Title - CORE
// Option: Direction - CORE
// Option: JustifyContent - CORE
// Option: AlignItems - CORE
// Option: ColumnGap - CORE
// Option: RowGap - CORE
// Option: Gap - CORE
// Option: Wrap - CORE
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
// base comp: view
// add composition for view: onHide
// base comp: flexContainer
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
public abstract class DefaultCoreSheetViewPart<S extends DefaultCoreSheetViewPart<S, O>, O extends CoreSheetViewPartOptions> implements ComponentPart , CoreSheetView {
    @Override
    public S setSize(SheetSize size) {
        setSize(((Object) (size.getSize())));
        setMinSize(((Object) (size.getMinSize())));
        setMaxSize(((Object) (size.getMaxSize())));
        return self();
    }

    private CoreViewPart viewPart;

    private CoreFlexContainerPart flexContainerPart;

    private CoreContainerPart containerPart;

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    protected Object size;

    protected Object minSize;

    protected Object maxSize;

    protected DefaultCoreSheetViewPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        viewPart = getViewPart();
        flexContainerPart = getFlexContainerPart();
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
    }

    @Override
    public String getTitle() {
        return viewPart.getTitle();
    }

    @Override
    public S setTitle(String title) {
        this.viewPart.setTitle(title);
        return self();
    }

    public void onHide() {
        viewPart.onHide();
    }

    @Override
    public RootComponent getRootComponent() {
        return viewPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.viewPart.setRootComponent(rootComponent);
    }

    @Override
    public S add(CoreComponent child) {
        viewPart.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        viewPart.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        viewPart.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        viewPart.remove(child);
    }

    @Override
    public void removeAll() {
        viewPart.removeAll();
    }

    @Override
    public FlexDirection getDirection() {
        return flexContainerPart.getDirection();
    }

    @Override
    public S setDirection(FlexDirection direction) {
        this.flexContainerPart.setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(FlexDirection direction, State state) {
        this.flexContainerPart.setDirection(direction, state);
        return self();
    }

    @Override
    public S setDirectionAllStates(FlexDirection direction) {
        setDirection(ScreenSizeValues.of(direction, direction));
        setDirection(direction);
        return self();
    }

    @Override
    public S setDirection(ScreenSizeValues<FlexDirection> direction) {
        this.flexContainerPart.setDirection(direction);
        return self();
    }

    @Override
    public FlexDirection getDirection(State state) {
        return flexContainerPart.getDirection(state);
    }

    @Override
    public JustifyContent getJustifyContent() {
        return flexContainerPart.getJustifyContent();
    }

    @Override
    public S setJustifyContent(JustifyContent justifyContent) {
        this.flexContainerPart.setJustifyContent(justifyContent);
        return self();
    }

    @Override
    public S setJustifyContent(JustifyContent justifyContent, State state) {
        this.flexContainerPart.setJustifyContent(justifyContent, state);
        return self();
    }

    @Override
    public S setJustifyContentAllStates(JustifyContent justifyContent) {
        setJustifyContent(ScreenSizeValues.of(justifyContent, justifyContent));
        setJustifyContent(justifyContent);
        return self();
    }

    @Override
    public S setJustifyContent(ScreenSizeValues<JustifyContent> justifyContent) {
        this.flexContainerPart.setJustifyContent(justifyContent);
        return self();
    }

    @Override
    public JustifyContent getJustifyContent(State state) {
        return flexContainerPart.getJustifyContent(state);
    }

    @Override
    public AlignItems getAlignItems() {
        return flexContainerPart.getAlignItems();
    }

    @Override
    public S setAlignItems(AlignItems alignItems) {
        this.flexContainerPart.setAlignItems(alignItems);
        return self();
    }

    @Override
    public S setAlignItems(AlignItems alignItems, State state) {
        this.flexContainerPart.setAlignItems(alignItems, state);
        return self();
    }

    @Override
    public S setAlignItemsAllStates(AlignItems alignItems) {
        setAlignItems(ScreenSizeValues.of(alignItems, alignItems));
        setAlignItems(alignItems);
        return self();
    }

    @Override
    public S setAlignItems(ScreenSizeValues<AlignItems> alignItems) {
        this.flexContainerPart.setAlignItems(alignItems);
        return self();
    }

    @Override
    public AlignItems getAlignItems(State state) {
        return flexContainerPart.getAlignItems(state);
    }

    @Override
    public Object getColumnGap() {
        return flexContainerPart.getColumnGap();
    }

    @Override
    public S setColumnGap(Object columnGap) {
        this.flexContainerPart.setColumnGap(columnGap);
        return self();
    }

    @Override
    public S setColumnGap(Object columnGap, State state) {
        this.flexContainerPart.setColumnGap(columnGap, state);
        return self();
    }

    @Override
    public S setColumnGapAllStates(Object columnGap) {
        setColumnGap(ScreenSizeValues.of(columnGap, columnGap));
        setColumnGap(columnGap);
        return self();
    }

    @Override
    public S setColumnGap(ScreenSizeValues<Object> columnGap) {
        this.flexContainerPart.setColumnGap(columnGap);
        return self();
    }

    @Override
    public Object getColumnGap(State state) {
        return flexContainerPart.getColumnGap(state);
    }

    @Override
    public Object getRowGap() {
        return flexContainerPart.getRowGap();
    }

    @Override
    public S setRowGap(Object rowGap) {
        this.flexContainerPart.setRowGap(rowGap);
        return self();
    }

    @Override
    public S setRowGap(Object rowGap, State state) {
        this.flexContainerPart.setRowGap(rowGap, state);
        return self();
    }

    @Override
    public S setRowGapAllStates(Object rowGap) {
        setRowGap(ScreenSizeValues.of(rowGap, rowGap));
        setRowGap(rowGap);
        return self();
    }

    @Override
    public S setRowGap(ScreenSizeValues<Object> rowGap) {
        this.flexContainerPart.setRowGap(rowGap);
        return self();
    }

    @Override
    public Object getRowGap(State state) {
        return flexContainerPart.getRowGap(state);
    }

    @Override
    public Object getGap() {
        return flexContainerPart.getGap();
    }

    @Override
    public S setGap(Object gap) {
        this.flexContainerPart.setGap(gap);
        return self();
    }

    @Override
    public S setGap(Object gap, State state) {
        this.flexContainerPart.setGap(gap, state);
        return self();
    }

    @Override
    public S setGapAllStates(Object gap) {
        setGap(ScreenSizeValues.of(gap, gap));
        setGap(gap);
        return self();
    }

    @Override
    public S setGap(ScreenSizeValues<Object> gap) {
        this.flexContainerPart.setGap(gap);
        return self();
    }

    @Override
    public Object getGap(State state) {
        return flexContainerPart.getGap(state);
    }

    @Override
    public boolean isWrap() {
        return flexContainerPart.isWrap();
    }

    @Override
    public S setWrap(Boolean wrap) {
        this.flexContainerPart.setWrap(wrap);
        return self();
    }

    @Override
    public S setWrap(Boolean wrap, State state) {
        this.flexContainerPart.setWrap(wrap, state);
        return self();
    }

    @Override
    public S setWrapAllStates(Boolean wrap) {
        setWrap(ScreenSizeValues.of(wrap, wrap));
        setWrap(wrap);
        return self();
    }

    @Override
    public S setWrap(ScreenSizeValues<Boolean> wrap) {
        this.flexContainerPart.setWrap(wrap);
        return self();
    }

    @Override
    public boolean isWrap(State state) {
        return flexContainerPart.isWrap(state);
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
        viewPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        viewPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        viewPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        viewPart.addHeading(html);
        return self();
    }

    public S addDivider() {
        viewPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        viewPart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        viewPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        viewPart.addParagraph(html);
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
        return viewPart.hasWrapper();
    }

    public boolean isInitialized() {
        return viewPart.isInitialized();
    }

    public void log(Object obj) {
        viewPart.log(obj);
    }

    public void removeFromParent() {
        viewPart.removeFromParent();
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
    public CoreSheetView getComponent() {
        return ((CoreSheetView) (baseComponentPart.getComponent()));
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
        CoreSheetViewPart component = ((CoreSheetViewPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getSizeOption(), component::setSize);
        applicator.add(options.getMinSizeOption(), component::setMinSize);
        applicator.add(options.getMaxSizeOption(), component::setMaxSize);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        viewPart.onInitializeComponentType(rootComponent);
    }

    protected abstract S self();

    @Override
    public Object getSize() {
        return size;
    }

    @Override
    public S setSize(Object size) {
        this.size = size;
        return self();
    }

    @Override
    public Object getMinSize() {
        return minSize;
    }

    @Override
    public S setMinSize(Object minSize) {
        this.minSize = minSize;
        return self();
    }

    @Override
    public Object getMaxSize() {
        return maxSize;
    }

    @Override
    public S setMaxSize(Object maxSize) {
        this.maxSize = maxSize;
        return self();
    }
}