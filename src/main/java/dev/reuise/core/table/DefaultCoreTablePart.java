package dev.reuise.core.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.theme.Theme;
import java.util.Collection;
import java.util.List;
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
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultCoreTablePart<S extends DefaultCoreTablePart<S, O>, O extends CoreTablePartOptions> implements ComponentPart , CoreTable {
    @Override
    public S addColumn(CoreTableColumnOptions column) {
        if (column == null)
            return self();

        if (this.columnGroup != null)
            this.columnGroup.addColumn(column);

        if (this.header != null)
            this.header.addColumn(column);

        return self();
    }

    @Override
    public S removeColumn(CoreTableColumnOptions column) {
        if (column == null)
            return self();

        if (this.columnGroup != null)
            this.columnGroup.removeColumn(column);

        if (this.header != null)
            this.header.removeColumn(column);

        return self();
    }

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    protected CoreContainer table;

    protected CoreTableColumnGroup columnGroup;

    protected CoreTableHeader header;

    protected CoreTableBody body;

    protected CoreTableFooter footer;

    protected Boolean hasHeader;

    protected Boolean hasFooter;

    protected DefaultCoreTablePart(O options) {
    }

    protected void setupReferences() {
        // Parts
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
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
    public RootComponent getRootComponent() {
        return parentComponentPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.parentComponentPart.setRootComponent(rootComponent);
        if (table != null)
            table.setRootComponent(rootComponent);

        if (columnGroup != null)
            columnGroup.setRootComponent(rootComponent);

        if (header != null)
            header.setRootComponent(rootComponent);

        if (body != null)
            body.setRootComponent(rootComponent);

        if (footer != null)
            footer.setRootComponent(rootComponent);

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
        return parentComponentPart.hasWrapper();
    }

    public boolean isInitialized() {
        return parentComponentPart.isInitialized();
    }

    public void log(Object obj) {
        parentComponentPart.log(obj);
    }

    public void removeFromParent() {
        parentComponentPart.removeFromParent();
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
    public CoreTable getComponent() {
        return ((CoreTable) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        // Layout children
        table = createTable(options);
        columnGroup = createColumnGroup(options);
        if (needsHeader(options)) {
            header = createHeader(options);
        }
        body = createBody(options);
        if (needsFooter(options)) {
            footer = createFooter(options);
        }
        setupReferences();
        return true;
    }

    public CoreContainer getTable() {
        return table;
    }

    private boolean needsTable(O options) {
        if (table != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createTable(O options) {
        if ((table != null) || (options == null))
            return table;

        CoreContainerOptions tableOptions = options.getTableOptions();
        if (tableOptions == null)
            return table;

        tableOptions.setParent(this);
        ComponentCreator tableCreator = options.getTableCreator();
        table = (tableCreator != null) ? ((CoreContainer) (tableCreator.create(tableOptions))) : getComponentFactory().createContainer(tableOptions);
        getParentComponentPart().add(table);
        return table;
    }

    public CoreTableColumnGroup getColumnGroup() {
        return columnGroup;
    }

    private boolean needsColumnGroup(O options) {
        if (columnGroup != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreTableColumnGroup createColumnGroup(O options) {
        if ((columnGroup != null) || (options == null))
            return columnGroup;

        CoreTableColumnGroupOptions columnGroupOptions = options.getColumnGroupOptions();
        if (columnGroupOptions == null)
            return columnGroup;

        CoreParentComponentPart parent = (table != null) ? table : getParentComponentPart();
        columnGroupOptions.setParent(table != null ? table : this);
        ComponentCreator columnGroupCreator = options.getColumnGroupCreator();
        columnGroup = (columnGroupCreator != null) ? ((CoreTableColumnGroup) (columnGroupCreator.create(columnGroupOptions))) : getComponentFactory().createTableColumnGroup(columnGroupOptions);
        parent.add(columnGroup);
        return columnGroup;
    }

    public CoreTableHeader getHeader() {
        return header;
    }

    private boolean needsHeader(O options) {
        if (header != null)
            return true;

        if (options == null)
            return false;

        if (options.hasHeaderOptions())
            return true;

        if (options.isHasHeader() || options.isFixedHeader())
            return true;

        return false;
    }

    private CoreTableHeader createHeader(O options) {
        if ((header != null) || (options == null))
            return header;

        CoreTableHeaderOptions headerOptions = options.getOrCreateHeaderOptions();
        if (headerOptions == null)
            return header;

        CoreParentComponentPart parent = (table != null) ? table : getParentComponentPart();
        headerOptions.setParent(table != null ? table : this);
        ComponentCreator headerCreator = options.getHeaderCreator();
        header = (headerCreator != null) ? ((CoreTableHeader) (headerCreator.create(headerOptions))) : getComponentFactory().createTableHeader(headerOptions);
        parent.add(header);
        return header;
    }

    public CoreTableBody getBody() {
        return body;
    }

    private boolean needsBody(O options) {
        if (body != null)
            return true;

        if (options == null)
            return false;

        return false;
    }

    private CoreTableBody createBody(O options) {
        if ((body != null) || (options == null))
            return body;

        CoreTableBodyOptions bodyOptions = options.getBodyOptions();
        if (bodyOptions == null)
            return body;

        CoreParentComponentPart parent = (table != null) ? table : getParentComponentPart();
        bodyOptions.setParent(table != null ? table : this);
        ComponentCreator bodyCreator = options.getBodyCreator();
        body = (bodyCreator != null) ? ((CoreTableBody) (bodyCreator.create(bodyOptions))) : getComponentFactory().createTableBody(bodyOptions);
        parent.add(body);
        return body;
    }

    @Override
    public S add(CoreComponent child) {
        body.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        body.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        body.addText(text);
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        body.remove(child);
    }

    @Override
    public void removeAll() {
        body.removeAll();
    }

    @Override
    public List<CoreComponent> getChildren() {
        return body.getChildren();
    }

    public CoreTableFooter getFooter() {
        return footer;
    }

    private boolean needsFooter(O options) {
        if (footer != null)
            return true;

        if (options == null)
            return false;

        if (options.hasFooterOptions())
            return true;

        if (options.isHasFooter())
            return true;

        return false;
    }

    private CoreTableFooter createFooter(O options) {
        if ((footer != null) || (options == null))
            return footer;

        CoreTableFooterOptions footerOptions = options.getOrCreateFooterOptions();
        if (footerOptions == null)
            return footer;

        CoreParentComponentPart parent = (table != null) ? table : getParentComponentPart();
        footerOptions.setParent(table != null ? table : this);
        ComponentCreator footerCreator = options.getFooterCreator();
        footer = (footerCreator != null) ? ((CoreTableFooter) (footerCreator.create(footerOptions))) : getComponentFactory().createTableFooter(footerOptions);
        parent.add(footer);
        return footer;
    }

    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        CoreTablePart component = ((CoreTablePart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getHasHeaderOption(), component::setHasHeader);
        applicator.add(options.getFixedHeaderOption(), component::setFixedHeader);
        applicator.add(options.getFixedFooterOption(), component::setFixedFooter);
        applicator.add(options.getHasFooterOption(), component::setHasFooter);
        applicator.add(options.getColumnsOption(), component::setColumns);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        parentComponentPart.onInitializeComponentType(rootComponent);
    }

    public S setFixedHeader(Boolean fixedHeader) {
        if (header != null)
            header.setFixed(fixedHeader);

        return self();
    }

    public boolean isFixedHeader() {
        if (header == null)
            return false;

        return header.isFixed();
    }

    // Implementation
    public S setColumns(List<CoreTableColumnOptions> columns) {
        if (isInitialized())
            return self();

        if (this.columnGroup != null)
            this.columnGroup.setColumns(columns);

        if (this.header != null)
            this.header.setColumns(columns);

        return self();
    }

    // Implementation
    public List<CoreTableColumnOptions> getColumns() {
        return null;
    }

    public S setFixedFooter(Boolean fixedFooter) {
        if (footer != null)
            footer.setFixed(fixedFooter);

        return self();
    }

    public boolean isFixedFooter() {
        if (footer == null)
            return false;

        return footer.isFixed();
    }

    protected abstract S self();

    @Override
    public boolean isHasHeader() {
        return Boolean.TRUE.equals(hasHeader);
    }

    @Override
    public S setHasHeader(Boolean hasHeader) {
        this.hasHeader = hasHeader;
        return self();
    }

    @Override
    public boolean isHasFooter() {
        return Boolean.TRUE.equals(hasFooter);
    }

    @Override
    public S setHasFooter(Boolean hasFooter) {
        this.hasFooter = hasFooter;
        return self();
    }
}