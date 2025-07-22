package dev.reuise.core.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreTextBlockOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractCoreCardOptions<S extends AbstractCoreCardOptions<S>> implements CoreCardOptions , CoreComponentOptions {
    protected dev.reuise.core.link.CoreLinkOptions mediaLinkOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions mediaContainerOptions;

    protected dev.reuise.core.image.CoreImageOptions imageOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions textContentOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions headlineOptions;

    protected dev.reuise.core.link.CoreLinkOptions headingLinkOptions;

    protected dev.reuise.core.text.CoreTextBlockOptions headingContainerOptions;

    protected dev.reuise.core.text.CoreTextBlockOptions subHeadingContainerOptions;

    protected dev.reuise.core.text.CoreTextBlockOptions textContainerOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions actionsContainerOptions;

    protected AbstractCoreCardOptions() {
        mediaContainerOptions = createDefaultMediaContainerOptions();
        textContentOptions = createDefaultTextContentOptions();
        headlineOptions = createDefaultHeadlineOptions();
        actionsContainerOptions = createDefaultActionsContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultOrientation(CardOrientation.VERTICAL);
        setDefaultActions(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getHeading() {
        return ((String) (getOptionValue("heading")));
    }

    @Override
    public ComponentOption<String> getHeadingOption() {
        return ((ComponentOption<String>) (getOption("heading")));
    }

    @Override
    public S setHeading(String heading) {
        setOption("heading", heading);
        setLayoutChildrenHeading(heading);
        return self();
    }

    protected void setLayoutChildrenHeading(String heading) {
        if (headingContainerOptions == null)
            headingContainerOptions = createDefaultHeadingContainerOptions();

        headingContainerOptions.setText(heading);
    }

    private void setDefaultHeading(String heading) {
        setDefaultOption("heading", heading);
        setLayoutChildrenHeading(heading);
    }

    @Override
    public String getSubHeading() {
        return ((String) (getOptionValue("subHeading")));
    }

    @Override
    public ComponentOption<String> getSubHeadingOption() {
        return ((ComponentOption<String>) (getOption("subHeading")));
    }

    @Override
    public S setSubHeading(String subHeading) {
        setOption("subHeading", subHeading);
        setLayoutChildrenSubHeading(subHeading);
        return self();
    }

    protected void setLayoutChildrenSubHeading(String subHeading) {
        if (subHeadingContainerOptions == null)
            subHeadingContainerOptions = createDefaultSubHeadingContainerOptions();

        subHeadingContainerOptions.setText(subHeading);
    }

    private void setDefaultSubHeading(String subHeading) {
        setDefaultOption("subHeading", subHeading);
        setLayoutChildrenSubHeading(subHeading);
    }

    @Override
    public String getText() {
        return ((String) (getOptionValue("text")));
    }

    @Override
    public ComponentOption<String> getTextOption() {
        return ((ComponentOption<String>) (getOption("text")));
    }

    @Override
    public S setText(String text) {
        setOption("text", text);
        setLayoutChildrenText(text);
        return self();
    }

    protected void setLayoutChildrenText(String text) {
        if (textContainerOptions == null)
            textContainerOptions = createDefaultTextContainerOptions();

        textContainerOptions.setText(text);
    }

    private void setDefaultText(String text) {
        setDefaultOption("text", text);
        setLayoutChildrenText(text);
    }

    @Override
    public CardOrientation getOrientation() {
        return ((CardOrientation) (getOptionValue("orientation")));
    }

    @Override
    public ComponentOption<CardOrientation> getOrientationOption() {
        return ((ComponentOption<CardOrientation>) (getOption("orientation")));
    }

    @Override
    public S setOrientation(CardOrientation orientation) {
        setOption("orientation", orientation);
        setLayoutChildrenOrientation(orientation);
        return self();
    }

    protected void setLayoutChildrenOrientation(CardOrientation orientation) {
    }

    private void setDefaultOrientation(CardOrientation orientation) {
        setDefaultOption("orientation", orientation);
        setLayoutChildrenOrientation(orientation);
    }

    @Override
    public String getUrl() {
        return ((String) (getOptionValue("url")));
    }

    @Override
    public ComponentOption<String> getUrlOption() {
        return ((ComponentOption<String>) (getOption("url")));
    }

    @Override
    public S setUrl(String url) {
        setOption("url", url);
        setLayoutChildrenUrl(url);
        return self();
    }

    protected void setLayoutChildrenUrl(String url) {
        if (mediaLinkOptions == null)
            mediaLinkOptions = createDefaultMediaLinkOptions();

        mediaLinkOptions.setUrl(url);
        if (headingLinkOptions == null)
            headingLinkOptions = createDefaultHeadingLinkOptions();

        headingLinkOptions.setUrl(url);
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
        setLayoutChildrenUrl(url);
    }

    @Override
    public String getImageUrl() {
        return ((String) (getOptionValue("imageUrl")));
    }

    @Override
    public ComponentOption<String> getImageUrlOption() {
        return ((ComponentOption<String>) (getOption("imageUrl")));
    }

    @Override
    public S setImageUrl(String imageUrl) {
        setOption("imageUrl", imageUrl);
        setLayoutChildrenImageUrl(imageUrl);
        return self();
    }

    protected void setLayoutChildrenImageUrl(String imageUrl) {
        if (imageOptions == null)
            imageOptions = createDefaultImageOptions();

        imageOptions.setUrl(imageUrl);
    }

    private void setDefaultImageUrl(String imageUrl) {
        setDefaultOption("imageUrl", imageUrl);
        setLayoutChildrenImageUrl(imageUrl);
    }

    @Override
    public List<CoreButton> getActions() {
        return ((List<CoreButton>) (getOptionValue("actions")));
    }

    @Override
    public ComponentOption<List<CoreButton>> getActionsOption() {
        return ((ComponentOption<List<CoreButton>>) (getOption("actions")));
    }

    @Override
    public S setActions(List<CoreButton> actions) {
        setOption("actions", actions);
        return self();
    }

    @Override
    public S addAction(CoreButton action) {
        List<CoreButton> list = getActions();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setActions(list);
        }
        list.add(action);
        return self();
    }

    @Override
    public S setAction(CoreButton action) {
        setActions(new ArrayList<CoreButton>(Arrays.asList(action)));
        return self();
    }

    @Override
    public S removeAction(CoreButton action) {
        List<CoreButton> list = getActions();
        if (list == null) {
            return self();
        }
        list.remove(action);
        return self();
    }

    private void setDefaultActions(List<CoreButton> actions) {
        setDefaultOption("actions", actions);
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getMediaLinkOptions() {
        return mediaLinkOptions;
    }

    @Override
    public boolean hasMediaLinkOptions() {
        return mediaLinkOptions != null;
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getOrCreateMediaLinkOptions() {
        if (!hasMediaLinkOptions())
            mediaLinkOptions = createDefaultMediaLinkOptions();

        return mediaLinkOptions;
    }

    @Override
    public S setMediaLinkOptions(dev.reuise.core.link.CoreLinkOptions mediaLinkOptions) {
        if (!hasMediaLinkOptions())
            this.mediaLinkOptions = createDefaultMediaLinkOptions();

        // Merge with default options
        this.mediaLinkOptions.merge(mediaLinkOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getMediaContainerOptions() {
        return mediaContainerOptions;
    }

    @Override
    public boolean hasMediaContainerOptions() {
        return mediaContainerOptions != null;
    }

    @Override
    public S setMediaContainerOptions(dev.reuise.core.layout.CoreFlexContainerOptions mediaContainerOptions) {
        if (!hasMediaContainerOptions())
            this.mediaContainerOptions = createDefaultMediaContainerOptions();

        // Merge with default options
        this.mediaContainerOptions.merge(mediaContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.image.CoreImageOptions getImageOptions() {
        return imageOptions;
    }

    @Override
    public boolean hasImageOptions() {
        return imageOptions != null;
    }

    @Override
    public dev.reuise.core.image.CoreImageOptions getOrCreateImageOptions() {
        if (!hasImageOptions())
            imageOptions = createDefaultImageOptions();

        return imageOptions;
    }

    @Override
    public S setImageOptions(dev.reuise.core.image.CoreImageOptions imageOptions) {
        if (!hasImageOptions())
            this.imageOptions = createDefaultImageOptions();

        // Merge with default options
        this.imageOptions.merge(imageOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getTextContentOptions() {
        return textContentOptions;
    }

    @Override
    public boolean hasTextContentOptions() {
        return textContentOptions != null;
    }

    @Override
    public S setTextContentOptions(dev.reuise.core.layout.CoreFlexContainerOptions textContentOptions) {
        if (!hasTextContentOptions())
            this.textContentOptions = createDefaultTextContentOptions();

        // Merge with default options
        this.textContentOptions.merge(textContentOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getHeadlineOptions() {
        return headlineOptions;
    }

    @Override
    public boolean hasHeadlineOptions() {
        return headlineOptions != null;
    }

    @Override
    public S setHeadlineOptions(dev.reuise.core.layout.CoreFlexContainerOptions headlineOptions) {
        if (!hasHeadlineOptions())
            this.headlineOptions = createDefaultHeadlineOptions();

        // Merge with default options
        this.headlineOptions.merge(headlineOptions);
        return self();
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getHeadingLinkOptions() {
        return headingLinkOptions;
    }

    @Override
    public boolean hasHeadingLinkOptions() {
        return headingLinkOptions != null;
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getOrCreateHeadingLinkOptions() {
        if (!hasHeadingLinkOptions())
            headingLinkOptions = createDefaultHeadingLinkOptions();

        return headingLinkOptions;
    }

    @Override
    public S setHeadingLinkOptions(dev.reuise.core.link.CoreLinkOptions headingLinkOptions) {
        if (!hasHeadingLinkOptions())
            this.headingLinkOptions = createDefaultHeadingLinkOptions();

        // Merge with default options
        this.headingLinkOptions.merge(headingLinkOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreTextBlockOptions getHeadingContainerOptions() {
        return headingContainerOptions;
    }

    @Override
    public boolean hasHeadingContainerOptions() {
        return headingContainerOptions != null;
    }

    @Override
    public dev.reuise.core.text.CoreTextBlockOptions getOrCreateHeadingContainerOptions() {
        if (!hasHeadingContainerOptions())
            headingContainerOptions = createDefaultHeadingContainerOptions();

        return headingContainerOptions;
    }

    @Override
    public S setHeadingContainerOptions(dev.reuise.core.text.CoreTextBlockOptions headingContainerOptions) {
        if (!hasHeadingContainerOptions())
            this.headingContainerOptions = createDefaultHeadingContainerOptions();

        // Merge with default options
        this.headingContainerOptions.merge(headingContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreTextBlockOptions getSubHeadingContainerOptions() {
        return subHeadingContainerOptions;
    }

    @Override
    public boolean hasSubHeadingContainerOptions() {
        return subHeadingContainerOptions != null;
    }

    @Override
    public dev.reuise.core.text.CoreTextBlockOptions getOrCreateSubHeadingContainerOptions() {
        if (!hasSubHeadingContainerOptions())
            subHeadingContainerOptions = createDefaultSubHeadingContainerOptions();

        return subHeadingContainerOptions;
    }

    @Override
    public S setSubHeadingContainerOptions(dev.reuise.core.text.CoreTextBlockOptions subHeadingContainerOptions) {
        if (!hasSubHeadingContainerOptions())
            this.subHeadingContainerOptions = createDefaultSubHeadingContainerOptions();

        // Merge with default options
        this.subHeadingContainerOptions.merge(subHeadingContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreTextBlockOptions getTextContainerOptions() {
        return textContainerOptions;
    }

    @Override
    public boolean hasTextContainerOptions() {
        return textContainerOptions != null;
    }

    @Override
    public dev.reuise.core.text.CoreTextBlockOptions getOrCreateTextContainerOptions() {
        if (!hasTextContainerOptions())
            textContainerOptions = createDefaultTextContainerOptions();

        return textContainerOptions;
    }

    @Override
    public S setTextContainerOptions(dev.reuise.core.text.CoreTextBlockOptions textContainerOptions) {
        if (!hasTextContainerOptions())
            this.textContainerOptions = createDefaultTextContainerOptions();

        // Merge with default options
        this.textContainerOptions.merge(textContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getActionsContainerOptions() {
        return actionsContainerOptions;
    }

    @Override
    public boolean hasActionsContainerOptions() {
        return actionsContainerOptions != null;
    }

    @Override
    public S setActionsContainerOptions(dev.reuise.core.layout.CoreFlexContainerOptions actionsContainerOptions) {
        if (!hasActionsContainerOptions())
            this.actionsContainerOptions = createDefaultActionsContainerOptions();

        // Merge with default options
        this.actionsContainerOptions.merge(actionsContainerOptions);
        return self();
    }

    protected CoreLinkOptions createDefaultMediaLinkOptions() {
        CoreLinkOptions options = getComponentFactory().createLinkOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreFlexContainerOptions createDefaultMediaContainerOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreImageOptions createDefaultImageOptions() {
        CoreImageOptions options = getComponentFactory().createImageOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreFlexContainerOptions createDefaultTextContentOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreFlexContainerOptions createDefaultHeadlineOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreLinkOptions createDefaultHeadingLinkOptions() {
        CoreLinkOptions options = getComponentFactory().createLinkOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreTextBlockOptions createDefaultHeadingContainerOptions() {
        CoreTextBlockOptions options = getComponentFactory().createTextBlockOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreTextBlockOptions createDefaultSubHeadingContainerOptions() {
        CoreTextBlockOptions options = getComponentFactory().createTextBlockOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreTextBlockOptions createDefaultTextContainerOptions() {
        CoreTextBlockOptions options = getComponentFactory().createTextBlockOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreFlexContainerOptions createDefaultActionsContainerOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}