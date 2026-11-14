package dev.reuise.core.chat;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.LocaleContext;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.divider.CoreDivider;
import dev.reuise.core.floating.CoreFloatingPanel;
import dev.reuise.core.floating.CoreFloatingPanelOptions;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.input.CoreBasicInputField;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.BackdropFilterSetting;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreContainerPart;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.list.CoreBasicList;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreHeading;
import dev.reuise.core.text.CoreParagraph;
import dev.reuise.core.text.CoreParagraphOptions;
import dev.reuise.core.theme.Theme;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
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
// Option: LocaleContext - CORE
// Option: LinkUrlResolver - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: container
// add composition for container: addMarkdown
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultCoreChatBoxPart<S extends DefaultCoreChatBoxPart<S, O>, O extends CoreChatBoxPartOptions> implements ComponentPart , CoreChatBox {
    private CoreContainerPart containerPart;

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    protected CoreFloatingPanel floatingPanel;

    protected CoreContainer chatContent;

    protected CoreContainer messages;

    protected CoreParagraph loadingIndicator;

    protected CoreParagraph errorDisplay;

    protected CoreButton retryButton;

    protected CoreParagraph handoffDisplay;

    protected CoreButton requestHumanButton;

    protected CoreContainer composerArea;

    protected CoreBasicInputField composer;

    protected CoreButton sendButton;

    protected CoreButton stopButton;

    protected Boolean loading;

    protected String errorMessage;

    protected String handoffStatus;

    protected String handoffMessage;

    protected String handoffRequestedLabel;

    protected String handoffConnectedLabel;

    protected String handoffUnavailableLabel;

    protected String messagesLabel;

    protected String composerLabel;

    protected String composerPlaceholder;

    protected String sendLabel;

    protected String stopLabel;

    protected String retryLabel;

    protected String requestHumanLabel;

    protected String loadingLabel;

    protected DefaultCoreChatBoxPart(O options) {
    }

    protected void setupReferences() {
        // Parts
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        // Layout children (indirect)
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

    public S addMarkdown(String markdown) {
        containerPart.addMarkdown(markdown);
        return self();
    }

    public S addHeading(int level, String text) {
        containerPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        containerPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        containerPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        containerPart.addHeading(html);
        return self();
    }

    public CoreHeading createHeading(int level, String text) {
        return containerPart.createHeading(level, text);
    }

    public CoreHeading createHeading(String text) {
        return containerPart.createHeading(text);
    }

    public CoreHeading createHeading(int level, Html html) {
        return containerPart.createHeading(level, html);
    }

    public CoreHeading createHeading(Html html) {
        return containerPart.createHeading(html);
    }

    public S addDivider() {
        containerPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        containerPart.addDivider(label);
        return self();
    }

    public CoreDivider createDivider() {
        return containerPart.createDivider();
    }

    public CoreDivider createDivider(String label) {
        return containerPart.createDivider(label);
    }

    public S addImage(String altText, String url) {
        containerPart.addImage(altText, url);
        return self();
    }

    public CoreImage createImage(String altText, String url) {
        return containerPart.createImage(altText, url);
    }

    public S addLink(String label, String url) {
        containerPart.addLink(label, url);
        return self();
    }

    public CoreLink createLink(String label, String url) {
        return containerPart.createLink(label, url);
    }

    public S addParagraph(String text) {
        containerPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        containerPart.addParagraph(html);
        return self();
    }

    public CoreParagraph createParagraph(String text) {
        return containerPart.createParagraph(text);
    }

    public CoreParagraph createParagraph(Html html) {
        return containerPart.createParagraph(html);
    }

    public S addBasicList(boolean ordered, String... items) {
        containerPart.addBasicList(ordered, items);
        return self();
    }

    public S addBasicList(boolean ordered, List<String> items) {
        containerPart.addBasicList(ordered, items);
        return self();
    }

    public S addBasicList(String... items) {
        containerPart.addBasicList(items);
        return self();
    }

    public S addBasicList(List<String> items) {
        containerPart.addBasicList(items);
        return self();
    }

    public CoreBasicList createBasicList(boolean ordered, String... items) {
        return containerPart.createBasicList(ordered, items);
    }

    public CoreBasicList createBasicList(boolean ordered, List<String> items) {
        return containerPart.createBasicList(ordered, items);
    }

    public CoreBasicList createBasicList(String... items) {
        return containerPart.createBasicList(items);
    }

    public CoreBasicList createBasicList(List<String> items) {
        return containerPart.createBasicList(items);
    }

    @Override
    public RootComponent getRootComponent() {
        return containerPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.containerPart.setRootComponent(rootComponent);
        if (floatingPanel != null)
            floatingPanel.setRootComponent(rootComponent);

        if (chatContent != null)
            chatContent.setRootComponent(rootComponent);

        if (messages != null)
            messages.setRootComponent(rootComponent);

        if (loadingIndicator != null)
            loadingIndicator.setRootComponent(rootComponent);

        if (errorDisplay != null)
            errorDisplay.setRootComponent(rootComponent);

        if (retryButton != null)
            retryButton.setRootComponent(rootComponent);

        if (handoffDisplay != null)
            handoffDisplay.setRootComponent(rootComponent);

        if (requestHumanButton != null)
            requestHumanButton.setRootComponent(rootComponent);

        if (composerArea != null)
            composerArea.setRootComponent(rootComponent);

        if (composer != null)
            composer.setRootComponent(rootComponent);

        if (sendButton != null)
            sendButton.setRootComponent(rootComponent);

        if (stopButton != null)
            stopButton.setRootComponent(rootComponent);

    }

    @Override
    public S add(CoreComponent child) {
        containerPart.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public S addAll(List<? extends CoreComponent> children) {
        containerPart.addAll(children);
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        containerPart.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        containerPart.addText(text);
        return self();
    }

    @Override
    public S addLineBreak() {
        containerPart.addLineBreak();
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        containerPart.remove(child);
    }

    @Override
    public void removeAll() {
        containerPart.removeAll();
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
    public S clearChildren() {
        parentComponentPart.clearChildren();
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
    public LocaleContext getLocaleContext() {
        return baseComponentPart.getLocaleContext();
    }

    @Override
    public S setLocaleContext(LocaleContext localeContext) {
        this.baseComponentPart.setLocaleContext(localeContext);
        return self();
    }

    @Override
    public Function<String, String> getLinkUrlResolver() {
        return baseComponentPart.getLinkUrlResolver();
    }

    @Override
    public S setLinkUrlResolver(Function<String, String> linkUrlResolver) {
        this.baseComponentPart.setLinkUrlResolver(linkUrlResolver);
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
        return containerPart.hasWrapper();
    }

    public boolean isInitialized() {
        return containerPart.isInitialized();
    }

    public void log(Object obj) {
        containerPart.log(obj);
    }

    public void removeFromParent() {
        containerPart.removeFromParent();
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
    public CoreChatBox getComponent() {
        return ((CoreChatBox) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        // Layout children
        floatingPanel = createFloatingPanel(options);
        chatContent = createChatContent(options);
        messages = createMessages(options);
        loadingIndicator = createLoadingIndicator(options);
        errorDisplay = createErrorDisplay(options);
        retryButton = createRetryButton(options);
        handoffDisplay = createHandoffDisplay(options);
        requestHumanButton = createRequestHumanButton(options);
        composerArea = createComposerArea(options);
        composer = createComposer(options);
        sendButton = createSendButton(options);
        stopButton = createStopButton(options);
        setupReferences();
        return true;
    }

    public CoreFloatingPanel getFloatingPanel() {
        return floatingPanel;
    }

    private boolean needsFloatingPanel(O options) {
        if (floatingPanel != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreFloatingPanel createFloatingPanel(O options) {
        if ((floatingPanel != null) || (options == null))
            return floatingPanel;

        CoreFloatingPanelOptions floatingPanelOptions = options.getFloatingPanelOptions();
        if (floatingPanelOptions == null)
            return floatingPanel;

        floatingPanelOptions.setParent(this);
        ComponentCreator floatingPanelCreator = options.getFloatingPanelCreator();
        floatingPanel = (floatingPanelCreator != null) ? ((CoreFloatingPanel) (floatingPanelCreator.create(floatingPanelOptions))) : getComponentFactory().createFloatingPanel(floatingPanelOptions);
        getParentComponentPart().add(floatingPanel);
        return floatingPanel;
    }

    public CoreContainer getChatContent() {
        return chatContent;
    }

    private boolean needsChatContent(O options) {
        if (chatContent != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createChatContent(O options) {
        if ((chatContent != null) || (options == null))
            return chatContent;

        CoreContainerOptions chatContentOptions = options.getChatContentOptions();
        if (chatContentOptions == null)
            return chatContent;

        chatContentOptions.setParent(this);
        ComponentCreator chatContentCreator = options.getChatContentCreator();
        chatContent = (chatContentCreator != null) ? ((CoreContainer) (chatContentCreator.create(chatContentOptions))) : getComponentFactory().createContainer(chatContentOptions);
        getParentComponentPart().add(chatContent);
        return chatContent;
    }

    public CoreContainer getMessages() {
        return messages;
    }

    private boolean needsMessages(O options) {
        if (messages != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createMessages(O options) {
        if ((messages != null) || (options == null))
            return messages;

        CoreContainerOptions messagesOptions = options.getMessagesOptions();
        if (messagesOptions == null)
            return messages;

        CoreParentComponentPart parent = (chatContent != null) ? chatContent : getParentComponentPart();
        messagesOptions.setParent(chatContent != null ? chatContent : this);
        ComponentCreator messagesCreator = options.getMessagesCreator();
        messages = (messagesCreator != null) ? ((CoreContainer) (messagesCreator.create(messagesOptions))) : getComponentFactory().createContainer(messagesOptions);
        parent.add(messages);
        return messages;
    }

    public CoreParagraph getLoadingIndicator() {
        return loadingIndicator;
    }

    private boolean needsLoadingIndicator(O options) {
        if (loadingIndicator != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreParagraph createLoadingIndicator(O options) {
        if ((loadingIndicator != null) || (options == null))
            return loadingIndicator;

        CoreParagraphOptions loadingIndicatorOptions = options.getLoadingIndicatorOptions();
        if (loadingIndicatorOptions == null)
            return loadingIndicator;

        CoreParentComponentPart parent = (chatContent != null) ? chatContent : getParentComponentPart();
        loadingIndicatorOptions.setParent(chatContent != null ? chatContent : this);
        ComponentCreator loadingIndicatorCreator = options.getLoadingIndicatorCreator();
        loadingIndicator = (loadingIndicatorCreator != null) ? ((CoreParagraph) (loadingIndicatorCreator.create(loadingIndicatorOptions))) : getComponentFactory().createParagraph(loadingIndicatorOptions);
        parent.add(loadingIndicator);
        return loadingIndicator;
    }

    public CoreParagraph getErrorDisplay() {
        return errorDisplay;
    }

    private boolean needsErrorDisplay(O options) {
        if (errorDisplay != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreParagraph createErrorDisplay(O options) {
        if ((errorDisplay != null) || (options == null))
            return errorDisplay;

        CoreParagraphOptions errorDisplayOptions = options.getErrorDisplayOptions();
        if (errorDisplayOptions == null)
            return errorDisplay;

        CoreParentComponentPart parent = (chatContent != null) ? chatContent : getParentComponentPart();
        errorDisplayOptions.setParent(chatContent != null ? chatContent : this);
        ComponentCreator errorDisplayCreator = options.getErrorDisplayCreator();
        errorDisplay = (errorDisplayCreator != null) ? ((CoreParagraph) (errorDisplayCreator.create(errorDisplayOptions))) : getComponentFactory().createParagraph(errorDisplayOptions);
        parent.add(errorDisplay);
        return errorDisplay;
    }

    public CoreButton getRetryButton() {
        return retryButton;
    }

    private boolean needsRetryButton(O options) {
        if (retryButton != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreButton createRetryButton(O options) {
        if ((retryButton != null) || (options == null))
            return retryButton;

        CoreButtonOptions retryButtonOptions = options.getRetryButtonOptions();
        if (retryButtonOptions == null)
            return retryButton;

        CoreParentComponentPart parent = (chatContent != null) ? chatContent : getParentComponentPart();
        retryButtonOptions.setParent(chatContent != null ? chatContent : this);
        ComponentCreator retryButtonCreator = options.getRetryButtonCreator();
        retryButton = (retryButtonCreator != null) ? ((CoreButton) (retryButtonCreator.create(retryButtonOptions))) : getComponentFactory().createButton(retryButtonOptions);
        parent.add(retryButton);
        return retryButton;
    }

    public CoreParagraph getHandoffDisplay() {
        return handoffDisplay;
    }

    private boolean needsHandoffDisplay(O options) {
        if (handoffDisplay != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreParagraph createHandoffDisplay(O options) {
        if ((handoffDisplay != null) || (options == null))
            return handoffDisplay;

        CoreParagraphOptions handoffDisplayOptions = options.getHandoffDisplayOptions();
        if (handoffDisplayOptions == null)
            return handoffDisplay;

        CoreParentComponentPart parent = (chatContent != null) ? chatContent : getParentComponentPart();
        handoffDisplayOptions.setParent(chatContent != null ? chatContent : this);
        ComponentCreator handoffDisplayCreator = options.getHandoffDisplayCreator();
        handoffDisplay = (handoffDisplayCreator != null) ? ((CoreParagraph) (handoffDisplayCreator.create(handoffDisplayOptions))) : getComponentFactory().createParagraph(handoffDisplayOptions);
        parent.add(handoffDisplay);
        return handoffDisplay;
    }

    public CoreButton getRequestHumanButton() {
        return requestHumanButton;
    }

    private boolean needsRequestHumanButton(O options) {
        if (requestHumanButton != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreButton createRequestHumanButton(O options) {
        if ((requestHumanButton != null) || (options == null))
            return requestHumanButton;

        CoreButtonOptions requestHumanButtonOptions = options.getRequestHumanButtonOptions();
        if (requestHumanButtonOptions == null)
            return requestHumanButton;

        CoreParentComponentPart parent = (chatContent != null) ? chatContent : getParentComponentPart();
        requestHumanButtonOptions.setParent(chatContent != null ? chatContent : this);
        ComponentCreator requestHumanButtonCreator = options.getRequestHumanButtonCreator();
        requestHumanButton = (requestHumanButtonCreator != null) ? ((CoreButton) (requestHumanButtonCreator.create(requestHumanButtonOptions))) : getComponentFactory().createButton(requestHumanButtonOptions);
        parent.add(requestHumanButton);
        return requestHumanButton;
    }

    public CoreContainer getComposerArea() {
        return composerArea;
    }

    private boolean needsComposerArea(O options) {
        if (composerArea != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createComposerArea(O options) {
        if ((composerArea != null) || (options == null))
            return composerArea;

        CoreContainerOptions composerAreaOptions = options.getComposerAreaOptions();
        if (composerAreaOptions == null)
            return composerArea;

        CoreParentComponentPart parent = (chatContent != null) ? chatContent : getParentComponentPart();
        composerAreaOptions.setParent(chatContent != null ? chatContent : this);
        ComponentCreator composerAreaCreator = options.getComposerAreaCreator();
        composerArea = (composerAreaCreator != null) ? ((CoreContainer) (composerAreaCreator.create(composerAreaOptions))) : getComponentFactory().createContainer(composerAreaOptions);
        parent.add(composerArea);
        return composerArea;
    }

    public CoreBasicInputField getComposer() {
        return composer;
    }

    private boolean needsComposer(O options) {
        if (composer != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreBasicInputField createComposer(O options) {
        if ((composer != null) || (options == null))
            return composer;

        CoreBasicInputFieldOptions composerOptions = options.getComposerOptions();
        if (composerOptions == null)
            return composer;

        CoreParentComponentPart parent = (composerArea != null) ? composerArea : getParentComponentPart();
        composerOptions.setParent(composerArea != null ? composerArea : this);
        ComponentCreator composerCreator = options.getComposerCreator();
        composer = (composerCreator != null) ? ((CoreBasicInputField) (composerCreator.create(composerOptions))) : getComponentFactory().createBasicInputField(composerOptions);
        parent.add(composer);
        return composer;
    }

    public CoreButton getSendButton() {
        return sendButton;
    }

    private boolean needsSendButton(O options) {
        if (sendButton != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreButton createSendButton(O options) {
        if ((sendButton != null) || (options == null))
            return sendButton;

        CoreButtonOptions sendButtonOptions = options.getSendButtonOptions();
        if (sendButtonOptions == null)
            return sendButton;

        CoreParentComponentPart parent = (composerArea != null) ? composerArea : getParentComponentPart();
        sendButtonOptions.setParent(composerArea != null ? composerArea : this);
        ComponentCreator sendButtonCreator = options.getSendButtonCreator();
        sendButton = (sendButtonCreator != null) ? ((CoreButton) (sendButtonCreator.create(sendButtonOptions))) : getComponentFactory().createButton(sendButtonOptions);
        parent.add(sendButton);
        return sendButton;
    }

    public CoreButton getStopButton() {
        return stopButton;
    }

    private boolean needsStopButton(O options) {
        if (stopButton != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreButton createStopButton(O options) {
        if ((stopButton != null) || (options == null))
            return stopButton;

        CoreButtonOptions stopButtonOptions = options.getStopButtonOptions();
        if (stopButtonOptions == null)
            return stopButton;

        CoreParentComponentPart parent = (composerArea != null) ? composerArea : getParentComponentPart();
        stopButtonOptions.setParent(composerArea != null ? composerArea : this);
        ComponentCreator stopButtonCreator = options.getStopButtonCreator();
        stopButton = (stopButtonCreator != null) ? ((CoreButton) (stopButtonCreator.create(stopButtonOptions))) : getComponentFactory().createButton(stopButtonOptions);
        parent.add(stopButton);
        return stopButton;
    }

    // Implementation
    // Implementation
    // Implementation
    public void onInitialize(O options) {
        getFloatingPanel().getContent().add(getChatContent());
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        CoreChatBoxPart component = ((CoreChatBoxPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getLoadingOption(), component::setLoading);
        applicator.add(options.getErrorMessageOption(), component::setErrorMessage);
        applicator.add(options.getHandoffStatusOption(), component::setHandoffStatus);
        applicator.add(options.getHandoffMessageOption(), component::setHandoffMessage);
        applicator.add(options.getHandoffRequestedLabelOption(), component::setHandoffRequestedLabel);
        applicator.add(options.getHandoffConnectedLabelOption(), component::setHandoffConnectedLabel);
        applicator.add(options.getHandoffUnavailableLabelOption(), component::setHandoffUnavailableLabel);
        applicator.add(options.getMessagesLabelOption(), component::setMessagesLabel);
        applicator.add(options.getComposerLabelOption(), component::setComposerLabel);
        applicator.add(options.getComposerPlaceholderOption(), component::setComposerPlaceholder);
        applicator.add(options.getSendLabelOption(), component::setSendLabel);
        applicator.add(options.getStopLabelOption(), component::setStopLabel);
        applicator.add(options.getRetryLabelOption(), component::setRetryLabel);
        applicator.add(options.getRequestHumanLabelOption(), component::setRequestHumanLabel);
        applicator.add(options.getLoadingLabelOption(), component::setLoadingLabel);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        containerPart.onInitializeComponentType(rootComponent);
    }

    protected abstract S self();

    @Override
    public boolean isLoading() {
        return Boolean.TRUE.equals(loading);
    }

    @Override
    public S setLoading(Boolean loading) {
        this.loading = loading;
        return self();
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public S setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return self();
    }

    @Override
    public String getHandoffStatus() {
        return handoffStatus;
    }

    @Override
    public S setHandoffStatus(String handoffStatus) {
        this.handoffStatus = handoffStatus;
        return self();
    }

    @Override
    public String getHandoffMessage() {
        return handoffMessage;
    }

    @Override
    public S setHandoffMessage(String handoffMessage) {
        this.handoffMessage = handoffMessage;
        return self();
    }

    @Override
    public String getHandoffRequestedLabel() {
        return handoffRequestedLabel;
    }

    @Override
    public S setHandoffRequestedLabel(String handoffRequestedLabel) {
        this.handoffRequestedLabel = handoffRequestedLabel;
        return self();
    }

    @Override
    public String getHandoffConnectedLabel() {
        return handoffConnectedLabel;
    }

    @Override
    public S setHandoffConnectedLabel(String handoffConnectedLabel) {
        this.handoffConnectedLabel = handoffConnectedLabel;
        return self();
    }

    @Override
    public String getHandoffUnavailableLabel() {
        return handoffUnavailableLabel;
    }

    @Override
    public S setHandoffUnavailableLabel(String handoffUnavailableLabel) {
        this.handoffUnavailableLabel = handoffUnavailableLabel;
        return self();
    }

    @Override
    public String getMessagesLabel() {
        return messagesLabel;
    }

    @Override
    public S setMessagesLabel(String messagesLabel) {
        this.messagesLabel = messagesLabel;
        return self();
    }

    @Override
    public String getComposerLabel() {
        return composerLabel;
    }

    @Override
    public S setComposerLabel(String composerLabel) {
        this.composerLabel = composerLabel;
        return self();
    }

    @Override
    public String getComposerPlaceholder() {
        return composerPlaceholder;
    }

    @Override
    public S setComposerPlaceholder(String composerPlaceholder) {
        this.composerPlaceholder = composerPlaceholder;
        return self();
    }

    @Override
    public String getSendLabel() {
        return sendLabel;
    }

    @Override
    public S setSendLabel(String sendLabel) {
        this.sendLabel = sendLabel;
        return self();
    }

    @Override
    public String getStopLabel() {
        return stopLabel;
    }

    @Override
    public S setStopLabel(String stopLabel) {
        this.stopLabel = stopLabel;
        return self();
    }

    @Override
    public String getRetryLabel() {
        return retryLabel;
    }

    @Override
    public S setRetryLabel(String retryLabel) {
        this.retryLabel = retryLabel;
        return self();
    }

    @Override
    public String getRequestHumanLabel() {
        return requestHumanLabel;
    }

    @Override
    public S setRequestHumanLabel(String requestHumanLabel) {
        this.requestHumanLabel = requestHumanLabel;
        return self();
    }

    @Override
    public String getLoadingLabel() {
        return loadingLabel;
    }

    @Override
    public S setLoadingLabel(String loadingLabel) {
        this.loadingLabel = loadingLabel;
        return self();
    }
}
