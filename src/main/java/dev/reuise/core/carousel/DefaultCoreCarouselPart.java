package dev.reuise.core.carousel;
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
import dev.reuise.core.image.CoreImage;
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
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreParagraph;
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
public abstract class DefaultCoreCarouselPart<S extends DefaultCoreCarouselPart<S, O>, O extends CoreCarouselPartOptions> implements ComponentPart , CoreCarousel {
    private CoreContainerPart containerPart;

    private CoreParentComponentPart parentComponentPart;

    private CoreBaseComponentPart baseComponentPart;

    protected CoreContainer viewport;

    protected CoreContainer slider;

    protected CoreContainer navigation;

    protected CoreButton previousButton;

    protected CoreContainer indicators;

    protected CoreButton nextButton;

    protected CoreButton autoplayButton;

    protected CoreInlineText announcement;

    protected Integer activeIndex;

    protected Integer groupSize;

    protected String align;

    protected Boolean whitespace;

    protected Boolean circular;

    protected Boolean draggable;

    protected Boolean autoplay;

    protected Integer autoplayInterval;

    protected Boolean paused;

    protected Integer transitionMillis;

    protected Boolean showNavigation;

    protected Boolean showIndicators;

    protected Integer gap;

    protected String label;

    protected String previousLabel;

    protected String nextLabel;

    protected String playLabel;

    protected String pauseLabel;

    protected String pageLabel;

    protected DefaultCoreCarouselPart(O options) {
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
        if (viewport != null)
            viewport.setRootComponent(rootComponent);

        if (slider != null)
            slider.setRootComponent(rootComponent);

        if (navigation != null)
            navigation.setRootComponent(rootComponent);

        if (previousButton != null)
            previousButton.setRootComponent(rootComponent);

        if (indicators != null)
            indicators.setRootComponent(rootComponent);

        if (nextButton != null)
            nextButton.setRootComponent(rootComponent);

        if (autoplayButton != null)
            autoplayButton.setRootComponent(rootComponent);

        if (announcement != null)
            announcement.setRootComponent(rootComponent);

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
    public CoreCarousel getComponent() {
        return ((CoreCarousel) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        // Layout children
        viewport = createViewport(options);
        slider = createSlider(options);
        navigation = createNavigation(options);
        previousButton = createPreviousButton(options);
        indicators = createIndicators(options);
        nextButton = createNextButton(options);
        autoplayButton = createAutoplayButton(options);
        announcement = createAnnouncement(options);
        setupReferences();
        return true;
    }

    public CoreContainer getViewport() {
        return viewport;
    }

    private boolean needsViewport(O options) {
        if (viewport != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createViewport(O options) {
        if ((viewport != null) || (options == null))
            return viewport;

        CoreContainerOptions viewportOptions = options.getViewportOptions();
        if (viewportOptions == null)
            return viewport;

        viewportOptions.setParent(this);
        ComponentCreator viewportCreator = options.getViewportCreator();
        viewport = (viewportCreator != null) ? ((CoreContainer) (viewportCreator.create(viewportOptions))) : getComponentFactory().createContainer(viewportOptions);
        getParentComponentPart().add(viewport);
        return viewport;
    }

    public CoreContainer getSlider() {
        return slider;
    }

    private boolean needsSlider(O options) {
        if (slider != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createSlider(O options) {
        if ((slider != null) || (options == null))
            return slider;

        CoreContainerOptions sliderOptions = options.getSliderOptions();
        if (sliderOptions == null)
            return slider;

        CoreParentComponentPart parent = (viewport != null) ? viewport : getParentComponentPart();
        sliderOptions.setParent(viewport != null ? viewport : this);
        ComponentCreator sliderCreator = options.getSliderCreator();
        slider = (sliderCreator != null) ? ((CoreContainer) (sliderCreator.create(sliderOptions))) : getComponentFactory().createContainer(sliderOptions);
        parent.add(slider);
        return slider;
    }

    @Override
    public S add(CoreComponent child) {
        slider.add(child);
        child.setRootComponent(getRootComponent());
        child.setParent(self());
        return self();
    }

    @Override
    public S addAll(List<? extends CoreComponent> children) {
        slider.addAll(children);
        return self();
    }

    @Override
    public void insertBefore(CoreComponent child, CoreComponent beforeChild) {
        slider.insertBefore(child, beforeChild);
    }

    @Override
    public S addText(String text) {
        slider.addText(text);
        return self();
    }

    @Override
    public S addLineBreak() {
        slider.addLineBreak();
        return self();
    }

    @Override
    public void remove(CoreComponent child) {
        slider.remove(child);
    }

    @Override
    public void removeAll() {
        slider.removeAll();
    }

    @Override
    public List<CoreComponent> getChildren() {
        return slider.getChildren();
    }

    public CoreContainer getNavigation() {
        return navigation;
    }

    private boolean needsNavigation(O options) {
        if (navigation != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createNavigation(O options) {
        if ((navigation != null) || (options == null))
            return navigation;

        CoreContainerOptions navigationOptions = options.getNavigationOptions();
        if (navigationOptions == null)
            return navigation;

        navigationOptions.setParent(this);
        ComponentCreator navigationCreator = options.getNavigationCreator();
        navigation = (navigationCreator != null) ? ((CoreContainer) (navigationCreator.create(navigationOptions))) : getComponentFactory().createContainer(navigationOptions);
        getParentComponentPart().add(navigation);
        return navigation;
    }

    public CoreButton getPreviousButton() {
        return previousButton;
    }

    private boolean needsPreviousButton(O options) {
        if (previousButton != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreButton createPreviousButton(O options) {
        if ((previousButton != null) || (options == null))
            return previousButton;

        CoreButtonOptions previousButtonOptions = options.getPreviousButtonOptions();
        if (previousButtonOptions == null)
            return previousButton;

        CoreParentComponentPart parent = (navigation != null) ? navigation : getParentComponentPart();
        previousButtonOptions.setParent(navigation != null ? navigation : this);
        ComponentCreator previousButtonCreator = options.getPreviousButtonCreator();
        previousButton = (previousButtonCreator != null) ? ((CoreButton) (previousButtonCreator.create(previousButtonOptions))) : getComponentFactory().createButton(previousButtonOptions);
        parent.add(previousButton);
        return previousButton;
    }

    public CoreContainer getIndicators() {
        return indicators;
    }

    private boolean needsIndicators(O options) {
        if (indicators != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreContainer createIndicators(O options) {
        if ((indicators != null) || (options == null))
            return indicators;

        CoreContainerOptions indicatorsOptions = options.getIndicatorsOptions();
        if (indicatorsOptions == null)
            return indicators;

        CoreParentComponentPart parent = (navigation != null) ? navigation : getParentComponentPart();
        indicatorsOptions.setParent(navigation != null ? navigation : this);
        ComponentCreator indicatorsCreator = options.getIndicatorsCreator();
        indicators = (indicatorsCreator != null) ? ((CoreContainer) (indicatorsCreator.create(indicatorsOptions))) : getComponentFactory().createContainer(indicatorsOptions);
        parent.add(indicators);
        return indicators;
    }

    public CoreButton getNextButton() {
        return nextButton;
    }

    private boolean needsNextButton(O options) {
        if (nextButton != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreButton createNextButton(O options) {
        if ((nextButton != null) || (options == null))
            return nextButton;

        CoreButtonOptions nextButtonOptions = options.getNextButtonOptions();
        if (nextButtonOptions == null)
            return nextButton;

        CoreParentComponentPart parent = (navigation != null) ? navigation : getParentComponentPart();
        nextButtonOptions.setParent(navigation != null ? navigation : this);
        ComponentCreator nextButtonCreator = options.getNextButtonCreator();
        nextButton = (nextButtonCreator != null) ? ((CoreButton) (nextButtonCreator.create(nextButtonOptions))) : getComponentFactory().createButton(nextButtonOptions);
        parent.add(nextButton);
        return nextButton;
    }

    public CoreButton getAutoplayButton() {
        return autoplayButton;
    }

    private boolean needsAutoplayButton(O options) {
        if (autoplayButton != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreButton createAutoplayButton(O options) {
        if ((autoplayButton != null) || (options == null))
            return autoplayButton;

        CoreButtonOptions autoplayButtonOptions = options.getAutoplayButtonOptions();
        if (autoplayButtonOptions == null)
            return autoplayButton;

        CoreParentComponentPart parent = (navigation != null) ? navigation : getParentComponentPart();
        autoplayButtonOptions.setParent(navigation != null ? navigation : this);
        ComponentCreator autoplayButtonCreator = options.getAutoplayButtonCreator();
        autoplayButton = (autoplayButtonCreator != null) ? ((CoreButton) (autoplayButtonCreator.create(autoplayButtonOptions))) : getComponentFactory().createButton(autoplayButtonOptions);
        parent.add(autoplayButton);
        return autoplayButton;
    }

    public CoreInlineText getAnnouncement() {
        return announcement;
    }

    private boolean needsAnnouncement(O options) {
        if (announcement != null)
            return false;

        if (options == null)
            return false;

        return false;
    }

    private CoreInlineText createAnnouncement(O options) {
        if ((announcement != null) || (options == null))
            return announcement;

        CoreInlineTextOptions announcementOptions = options.getAnnouncementOptions();
        if (announcementOptions == null)
            return announcement;

        announcementOptions.setParent(this);
        ComponentCreator announcementCreator = options.getAnnouncementCreator();
        announcement = (announcementCreator != null) ? ((CoreInlineText) (announcementCreator.create(announcementOptions))) : getComponentFactory().createInlineText(announcementOptions);
        getParentComponentPart().add(announcement);
        return announcement;
    }

    public void onInitialize(O options) {
    }

    public void onCreate(O options) {
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        CoreCarouselPart component = ((CoreCarouselPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getActiveIndexOption(), component::setActiveIndex);
        applicator.add(options.getGroupSizeOption(), component::setGroupSize);
        applicator.add(options.getAlignOption(), component::setAlign);
        applicator.add(options.getWhitespaceOption(), component::setWhitespace);
        applicator.add(options.getCircularOption(), component::setCircular);
        applicator.add(options.getDraggableOption(), component::setDraggable);
        applicator.add(options.getAutoplayOption(), component::setAutoplay);
        applicator.add(options.getAutoplayIntervalOption(), component::setAutoplayInterval);
        applicator.add(options.getPausedOption(), component::setPaused);
        applicator.add(options.getTransitionMillisOption(), component::setTransitionMillis);
        applicator.add(options.getShowNavigationOption(), component::setShowNavigation);
        applicator.add(options.getShowIndicatorsOption(), component::setShowIndicators);
        applicator.add(options.getGapOption(), component::setGap);
        applicator.add(options.getLabelOption(), component::setLabel);
        applicator.add(options.getPreviousLabelOption(), component::setPreviousLabel);
        applicator.add(options.getNextLabelOption(), component::setNextLabel);
        applicator.add(options.getPlayLabelOption(), component::setPlayLabel);
        applicator.add(options.getPauseLabelOption(), component::setPauseLabel);
        applicator.add(options.getPageLabelOption(), component::setPageLabel);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        containerPart.onInitializeComponentType(rootComponent);
    }

    protected abstract S self();

    @Override
    public Integer getActiveIndex() {
        return activeIndex;
    }

    @Override
    public S setActiveIndex(Integer activeIndex) {
        this.activeIndex = activeIndex;
        return self();
    }

    @Override
    public Integer getGroupSize() {
        return groupSize;
    }

    @Override
    public S setGroupSize(Integer groupSize) {
        this.groupSize = groupSize;
        return self();
    }

    @Override
    public String getAlign() {
        return align;
    }

    @Override
    public S setAlign(String align) {
        this.align = align;
        return self();
    }

    @Override
    public boolean isWhitespace() {
        return Boolean.TRUE.equals(whitespace);
    }

    @Override
    public S setWhitespace(Boolean whitespace) {
        this.whitespace = whitespace;
        return self();
    }

    @Override
    public boolean isCircular() {
        return Boolean.TRUE.equals(circular);
    }

    @Override
    public S setCircular(Boolean circular) {
        this.circular = circular;
        return self();
    }

    @Override
    public boolean isDraggable() {
        return Boolean.TRUE.equals(draggable);
    }

    @Override
    public S setDraggable(Boolean draggable) {
        this.draggable = draggable;
        return self();
    }

    @Override
    public boolean isAutoplay() {
        return Boolean.TRUE.equals(autoplay);
    }

    @Override
    public S setAutoplay(Boolean autoplay) {
        this.autoplay = autoplay;
        return self();
    }

    @Override
    public Integer getAutoplayInterval() {
        return autoplayInterval;
    }

    @Override
    public S setAutoplayInterval(Integer autoplayInterval) {
        this.autoplayInterval = autoplayInterval;
        return self();
    }

    @Override
    public boolean isPaused() {
        return Boolean.TRUE.equals(paused);
    }

    @Override
    public S setPaused(Boolean paused) {
        this.paused = paused;
        return self();
    }

    @Override
    public Integer getTransitionMillis() {
        return transitionMillis;
    }

    @Override
    public S setTransitionMillis(Integer transitionMillis) {
        this.transitionMillis = transitionMillis;
        return self();
    }

    @Override
    public boolean isShowNavigation() {
        return Boolean.TRUE.equals(showNavigation);
    }

    @Override
    public S setShowNavigation(Boolean showNavigation) {
        this.showNavigation = showNavigation;
        return self();
    }

    @Override
    public boolean isShowIndicators() {
        return Boolean.TRUE.equals(showIndicators);
    }

    @Override
    public S setShowIndicators(Boolean showIndicators) {
        this.showIndicators = showIndicators;
        return self();
    }

    @Override
    public Integer getGap() {
        return gap;
    }

    @Override
    public S setGap(Integer gap) {
        this.gap = gap;
        return self();
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public S setLabel(String label) {
        this.label = label;
        return self();
    }

    @Override
    public String getPreviousLabel() {
        return previousLabel;
    }

    @Override
    public S setPreviousLabel(String previousLabel) {
        this.previousLabel = previousLabel;
        return self();
    }

    @Override
    public String getNextLabel() {
        return nextLabel;
    }

    @Override
    public S setNextLabel(String nextLabel) {
        this.nextLabel = nextLabel;
        return self();
    }

    @Override
    public String getPlayLabel() {
        return playLabel;
    }

    @Override
    public S setPlayLabel(String playLabel) {
        this.playLabel = playLabel;
        return self();
    }

    @Override
    public String getPauseLabel() {
        return pauseLabel;
    }

    @Override
    public S setPauseLabel(String pauseLabel) {
        this.pauseLabel = pauseLabel;
        return self();
    }

    @Override
    public String getPageLabel() {
        return pageLabel;
    }

    @Override
    public S setPageLabel(String pageLabel) {
        this.pageLabel = pageLabel;
        return self();
    }

    // Implementation
    public S next() {
        int size = (getGroupSize() == null) ? 1 : getGroupSize();
        int count = getSlider().getChildren().size();
        int pages = (count == 0) ? 0 : 1 + ((count - 1) / size);
        if (pages > 0)
            setActiveIndex(isCircular() ? (getActiveIndex() + 1) % pages : Math.min(pages - 1, getActiveIndex() + 1));

        return self();
    }

    // Implementation
    public S previous() {
        int size = (getGroupSize() == null) ? 1 : getGroupSize();
        int count = getSlider().getChildren().size();
        int pages = (count == 0) ? 0 : 1 + ((count - 1) / size);
        if (pages > 0)
            setActiveIndex(isCircular() ? ((getActiveIndex() + pages) - 1) % pages : Math.max(0, getActiveIndex() - 1));

        return self();
    }

    // Implementation
    public S play() {
        setAutoplay(true);
        setPaused(false);
        return self();
    }

    // Implementation
    public S pause() {
        setPaused(true);
        return self();
    }

    // Implementation
    public S refresh() {
        return self();
    }
}
