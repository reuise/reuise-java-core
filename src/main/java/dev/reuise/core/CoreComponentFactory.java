package dev.reuise.core;
import dev.reuise.core.accordion.CoreAccordion;
import dev.reuise.core.accordion.CoreAccordionItem;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.core.accordion.CoreAccordionOptions;
import dev.reuise.core.applayout.CoreAppLayout;
import dev.reuise.core.applayout.CoreAppLayoutBody;
import dev.reuise.core.applayout.CoreAppLayoutBodyOptions;
import dev.reuise.core.applayout.CoreAppLayoutOptions;
import dev.reuise.core.avatar.CoreAvatar;
import dev.reuise.core.avatar.CoreAvatarOptions;
import dev.reuise.core.badge.CoreBadge;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.banner.CoreBanner;
import dev.reuise.core.banner.CoreBannerOptions;
import dev.reuise.core.basecomponent.CoreBaseComponent;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.bottomappbar.CoreBottomAppBar;
import dev.reuise.core.bottomappbar.CoreBottomAppBarOptions;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonBar;
import dev.reuise.core.button.CoreButtonBarOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.card.CoreCard;
import dev.reuise.core.card.CoreCardGrid;
import dev.reuise.core.card.CoreCardGridOptions;
import dev.reuise.core.card.CoreCardOptions;
import dev.reuise.core.carousel.CoreCarousel;
import dev.reuise.core.carousel.CoreCarouselCard;
import dev.reuise.core.carousel.CoreCarouselCardOptions;
import dev.reuise.core.carousel.CoreCarouselOptions;
import dev.reuise.core.chat.CoreChatBox;
import dev.reuise.core.chat.CoreChatBoxOptions;
import dev.reuise.core.checkbox.CoreBasicCheckbox;
import dev.reuise.core.checkbox.CoreBasicCheckboxOptions;
import dev.reuise.core.checkbox.CoreCheckbox;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.chip.CoreChip;
import dev.reuise.core.chip.CoreChipGroup;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.core.chip.CoreFilterChip;
import dev.reuise.core.chip.CoreFilterChipOptions;
import dev.reuise.core.consent.CoreConsentBanner;
import dev.reuise.core.consent.CoreConsentBannerOptions;
import dev.reuise.core.currencyselector.CoreCurrencySelector;
import dev.reuise.core.currencyselector.CoreCurrencySelectorOptions;
import dev.reuise.core.dialog.CoreDialog;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.dialog.CoreMessageDialog;
import dev.reuise.core.dialog.CoreMessageDialogOptions;
import dev.reuise.core.divider.CoreDivider;
import dev.reuise.core.divider.CoreDividerOptions;
import dev.reuise.core.drawer.CoreDrawer;
import dev.reuise.core.drawer.CoreDrawerOptions;
import dev.reuise.core.dropzone.CoreDropZone;
import dev.reuise.core.dropzone.CoreDropZoneOptions;
import dev.reuise.core.floating.CoreFloatingActionButton;
import dev.reuise.core.floating.CoreFloatingActionButtonOptions;
import dev.reuise.core.floating.CoreFloatingPanel;
import dev.reuise.core.floating.CoreFloatingPanelOptions;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.input.CoreBasicInputField;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.core.input.CoreChipField;
import dev.reuise.core.input.CoreChipFieldOptions;
import dev.reuise.core.input.CoreMultiEmailAddressField;
import dev.reuise.core.input.CoreMultiEmailAddressFieldOptions;
import dev.reuise.core.input.CorePasswordField;
import dev.reuise.core.input.CorePasswordFieldOptions;
import dev.reuise.core.input.CoreSearchField;
import dev.reuise.core.input.CoreSearchFieldOptions;
import dev.reuise.core.input.CoreSegmentedTextField;
import dev.reuise.core.input.CoreSegmentedTextFieldOptions;
import dev.reuise.core.input.CoreTextField;
import dev.reuise.core.input.CoreTextFieldOptions;
import dev.reuise.core.layout.CoreColumnLayout;
import dev.reuise.core.layout.CoreColumnLayoutOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFieldSet;
import dev.reuise.core.layout.CoreFieldSetOptions;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.CoreRowLayout;
import dev.reuise.core.layout.CoreRowLayoutOptions;
import dev.reuise.core.layout.CoreSheetLayout;
import dev.reuise.core.layout.CoreSheetLayoutOptions;
import dev.reuise.core.layout.CoreSurface;
import dev.reuise.core.layout.CoreSurfaceOptions;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.link.CoreNavigationLink;
import dev.reuise.core.link.CoreNavigationLinkOptions;
import dev.reuise.core.list.CoreBasicList;
import dev.reuise.core.list.CoreBasicListItem;
import dev.reuise.core.list.CoreBasicListItemOptions;
import dev.reuise.core.list.CoreBasicListOptions;
import dev.reuise.core.list.CoreListItem;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.core.list.CoreListView;
import dev.reuise.core.list.CoreListViewOptions;
import dev.reuise.core.media.CoreAudioPlayer;
import dev.reuise.core.media.CoreAudioPlayerOptions;
import dev.reuise.core.media.CoreMediaPlayer;
import dev.reuise.core.media.CoreMediaPlayerOptions;
import dev.reuise.core.media.CoreTextTrack;
import dev.reuise.core.media.CoreTextTrackOptions;
import dev.reuise.core.media.CoreVideoPlayer;
import dev.reuise.core.media.CoreVideoPlayerOptions;
import dev.reuise.core.menu.CoreMenu;
import dev.reuise.core.menu.CoreMenuButton;
import dev.reuise.core.menu.CoreMenuButtonItem;
import dev.reuise.core.menu.CoreMenuButtonItemOptions;
import dev.reuise.core.menu.CoreMenuButtonOptions;
import dev.reuise.core.menu.CoreMenuDivider;
import dev.reuise.core.menu.CoreMenuDividerOptions;
import dev.reuise.core.menu.CoreMenuItem;
import dev.reuise.core.menu.CoreMenuItemOptions;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.navigation.CoreNavigationTree;
import dev.reuise.core.navigation.CoreNavigationTreeGroup;
import dev.reuise.core.navigation.CoreNavigationTreeGroupOptions;
import dev.reuise.core.navigation.CoreNavigationTreeLink;
import dev.reuise.core.navigation.CoreNavigationTreeLinkOptions;
import dev.reuise.core.navigation.CoreNavigationTreeOptions;
import dev.reuise.core.overflow.CoreOverflowBar;
import dev.reuise.core.overflow.CoreOverflowBarOptions;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.core.progressindicator.CoreProgressIndicator;
import dev.reuise.core.progressindicator.CoreProgressIndicatorOptions;
import dev.reuise.core.regionselector.CoreRegionSelector;
import dev.reuise.core.regionselector.CoreRegionSelectorOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdge;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdgeOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollArea;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions;
import dev.reuise.core.selectmenu.CoreSelectMenu;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.core.skeleton.CoreSkeleton;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainer;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdge;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgeOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerDivider;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanel;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions;
import dev.reuise.core.table.CoreCheckboxTableCell;
import dev.reuise.core.table.CoreCheckboxTableCellOptions;
import dev.reuise.core.table.CoreCheckboxTableColumn;
import dev.reuise.core.table.CoreCheckboxTableColumnOptions;
import dev.reuise.core.table.CoreTable;
import dev.reuise.core.table.CoreTableBody;
import dev.reuise.core.table.CoreTableBodyOptions;
import dev.reuise.core.table.CoreTableCell;
import dev.reuise.core.table.CoreTableCellOptions;
import dev.reuise.core.table.CoreTableColumn;
import dev.reuise.core.table.CoreTableColumnGroup;
import dev.reuise.core.table.CoreTableColumnGroupOptions;
import dev.reuise.core.table.CoreTableColumnOptions;
import dev.reuise.core.table.CoreTableFooter;
import dev.reuise.core.table.CoreTableFooterOptions;
import dev.reuise.core.table.CoreTableHeader;
import dev.reuise.core.table.CoreTableHeaderCell;
import dev.reuise.core.table.CoreTableHeaderCellOptions;
import dev.reuise.core.table.CoreTableHeaderOptions;
import dev.reuise.core.table.CoreTableHeaderRow;
import dev.reuise.core.table.CoreTableHeaderRowOptions;
import dev.reuise.core.table.CoreTableOptions;
import dev.reuise.core.table.CoreTableRow;
import dev.reuise.core.table.CoreTableRowOptions;
import dev.reuise.core.tabs.CoreTab;
import dev.reuise.core.tabs.CoreTabBar;
import dev.reuise.core.tabs.CoreTabBarOptions;
import dev.reuise.core.tabs.CoreTabOptions;
import dev.reuise.core.text.CoreHeading;
import dev.reuise.core.text.CoreHeadingOptions;
import dev.reuise.core.text.CoreIconLabel;
import dev.reuise.core.text.CoreIconLabelOptions;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreLabel;
import dev.reuise.core.text.CoreLabelOptions;
import dev.reuise.core.text.CoreLineBreak;
import dev.reuise.core.text.CoreLineBreakOptions;
import dev.reuise.core.text.CoreParagraph;
import dev.reuise.core.text.CoreParagraphOptions;
import dev.reuise.core.text.CoreRotatingText;
import dev.reuise.core.text.CoreRotatingTextOptions;
import dev.reuise.core.text.CoreText;
import dev.reuise.core.text.CoreTextBlock;
import dev.reuise.core.text.CoreTextBlockOptions;
import dev.reuise.core.text.CoreTextOptions;
import dev.reuise.core.topappbar.CoreTopAppBar;
import dev.reuise.core.topappbar.CoreTopAppBarOptions;
import dev.reuise.core.view.CoreSheetView;
import dev.reuise.core.view.CoreSheetViewOptions;
import dev.reuise.core.view.CoreView;
import dev.reuise.core.view.CoreViewOptions;
public interface CoreComponentFactory {
    CoreLabel createLabel(CoreLabelOptions options);

    CoreLabelOptions createLabelOptions();

    CoreTab createTab(CoreTabOptions options);

    CoreTabOptions createTabOptions();

    CoreAudioPlayer createAudioPlayer(CoreAudioPlayerOptions options);

    CoreAudioPlayerOptions createAudioPlayerOptions();

    CoreMenuButtonItem createMenuButtonItem(CoreMenuButtonItemOptions options);

    CoreMenuButtonItemOptions createMenuButtonItemOptions();

    CoreIconLabel createIconLabel(CoreIconLabelOptions options);

    CoreIconLabelOptions createIconLabelOptions();

    CoreTableHeaderCell createTableHeaderCell(CoreTableHeaderCellOptions options);

    CoreTableHeaderCellOptions createTableHeaderCellOptions();

    CoreNavigationTreeLink createNavigationTreeLink(CoreNavigationTreeLinkOptions options);

    CoreNavigationTreeLinkOptions createNavigationTreeLinkOptions();

    CorePasswordField createPasswordField(CorePasswordFieldOptions options);

    CorePasswordFieldOptions createPasswordFieldOptions();

    CoreMultiEmailAddressField createMultiEmailAddressField(CoreMultiEmailAddressFieldOptions options);

    CoreMultiEmailAddressFieldOptions createMultiEmailAddressFieldOptions();

    CoreSlideContainerEdge createSlideContainerEdge(CoreSlideContainerEdgeOptions options);

    CoreSlideContainerEdgeOptions createSlideContainerEdgeOptions();

    CoreBasicInputField createBasicInputField(CoreBasicInputFieldOptions options);

    CoreBasicInputFieldOptions createBasicInputFieldOptions();

    CoreHeading createHeading(CoreHeadingOptions options);

    CoreHeadingOptions createHeadingOptions();

    CoreScrollableContainerEdge createScrollableContainerEdge(CoreScrollableContainerEdgeOptions options);

    CoreScrollableContainerEdgeOptions createScrollableContainerEdgeOptions();

    CoreMenuItem createMenuItem(CoreMenuItemOptions options);

    CoreMenuItemOptions createMenuItemOptions();

    CoreCardGrid createCardGrid(CoreCardGridOptions options);

    CoreCardGridOptions createCardGridOptions();

    CoreDrawer createDrawer(CoreDrawerOptions options);

    CoreDrawerOptions createDrawerOptions();

    CoreChipField createChipField(CoreChipFieldOptions options);

    CoreChipFieldOptions createChipFieldOptions();

    CoreAppLayoutBody createAppLayoutBody(CoreAppLayoutBodyOptions options);

    CoreAppLayoutBodyOptions createAppLayoutBodyOptions();

    CoreListItem createListItem(CoreListItemOptions options);

    CoreListItemOptions createListItemOptions();

    CoreFlexContainer createFlexContainer(CoreFlexContainerOptions options);

    CoreFlexContainerOptions createFlexContainerOptions();

    CoreSheetLayout createSheetLayout(CoreSheetLayoutOptions options);

    CoreSheetLayoutOptions createSheetLayoutOptions();

    CoreLink createLink(CoreLinkOptions options);

    CoreLinkOptions createLinkOptions();

    CoreFilterChip createFilterChip(CoreFilterChipOptions options);

    CoreFilterChipOptions createFilterChipOptions();

    CoreMenu createMenu(CoreMenuOptions options);

    CoreMenuOptions createMenuOptions();

    CoreNavigationTreeGroup createNavigationTreeGroup(CoreNavigationTreeGroupOptions options);

    CoreNavigationTreeGroupOptions createNavigationTreeGroupOptions();

    CoreFloatingPanel createFloatingPanel(CoreFloatingPanelOptions options);

    CoreFloatingPanelOptions createFloatingPanelOptions();

    CoreDialog createDialog(CoreDialogOptions options);

    CoreDialogOptions createDialogOptions();

    CoreButton createButton(CoreButtonOptions options);

    CoreButtonOptions createButtonOptions();

    CoreContainer createContainer(CoreContainerOptions options);

    CoreContainerOptions createContainerOptions();

    CoreVideoPlayer createVideoPlayer(CoreVideoPlayerOptions options);

    CoreVideoPlayerOptions createVideoPlayerOptions();

    CoreDropZone createDropZone(CoreDropZoneOptions options);

    CoreDropZoneOptions createDropZoneOptions();

    CoreParentComponent createParentComponent(CoreParentComponentPartOptions options);

    CoreParentComponentOptions createParentComponentOptions();

    CoreCurrencySelector createCurrencySelector(CoreCurrencySelectorOptions options);

    CoreCurrencySelectorOptions createCurrencySelectorOptions();

    CoreChip createChip(CoreChipOptions options);

    CoreChipOptions createChipOptions();

    CoreSplitContainerPanel createSplitContainerPanel(CoreSplitContainerPanelOptions options);

    CoreSplitContainerPanelOptions createSplitContainerPanelOptions();

    CoreTableHeaderRow createTableHeaderRow(CoreTableHeaderRowOptions options);

    CoreTableHeaderRowOptions createTableHeaderRowOptions();

    CoreLineBreak createLineBreak(CoreLineBreakOptions options);

    CoreLineBreakOptions createLineBreakOptions();

    CoreConsentBanner createConsentBanner(CoreConsentBannerOptions options);

    CoreConsentBannerOptions createConsentBannerOptions();

    CoreTextBlock createTextBlock(CoreTextBlockOptions options);

    CoreTextBlockOptions createTextBlockOptions();

    CoreMediaPlayer createMediaPlayer(CoreMediaPlayerOptions options);

    CoreMediaPlayerOptions createMediaPlayerOptions();

    CoreFloatingActionButton createFloatingActionButton(CoreFloatingActionButtonOptions options);

    CoreFloatingActionButtonOptions createFloatingActionButtonOptions();

    CoreAppLayout createAppLayout(CoreAppLayoutOptions options);

    CoreAppLayoutOptions createAppLayoutOptions();

    CoreTabBar createTabBar(CoreTabBarOptions options);

    CoreTabBarOptions createTabBarOptions();

    CoreAvatar createAvatar(CoreAvatarOptions options);

    CoreAvatarOptions createAvatarOptions();

    CoreSelectMenu createSelectMenu(CoreSelectMenuOptions options);

    CoreSelectMenuOptions createSelectMenuOptions();

    CoreFieldSet createFieldSet(CoreFieldSetOptions options);

    CoreFieldSetOptions createFieldSetOptions();

    CoreRowLayout createRowLayout(CoreRowLayoutOptions options);

    CoreRowLayoutOptions createRowLayoutOptions();

    CoreProgressIndicator createProgressIndicator(CoreProgressIndicatorOptions options);

    CoreProgressIndicatorOptions createProgressIndicatorOptions();

    CoreSegmentedTextField createSegmentedTextField(CoreSegmentedTextFieldOptions options);

    CoreSegmentedTextFieldOptions createSegmentedTextFieldOptions();

    CoreView createView(CoreViewOptions options);

    CoreViewOptions createViewOptions();

    CoreBasicListItem createBasicListItem(CoreBasicListItemOptions options);

    CoreBasicListItemOptions createBasicListItemOptions();

    CoreTableRow createTableRow(CoreTableRowOptions options);

    CoreTableRowOptions createTableRowOptions();

    CoreParagraph createParagraph(CoreParagraphOptions options);

    CoreParagraphOptions createParagraphOptions();

    CoreIconButton createIconButton(CoreIconButtonOptions options);

    CoreIconButtonOptions createIconButtonOptions();

    CoreSplitContainer createSplitContainer(CoreSplitContainerOptions options);

    CoreSplitContainerOptions createSplitContainerOptions();

    CoreChipGroup createChipGroup(CoreChipGroupOptions options);

    CoreChipGroupOptions createChipGroupOptions();

    CoreDivider createDivider(CoreDividerOptions options);

    CoreDividerOptions createDividerOptions();

    CoreBadge createBadge(CoreBadgeOptions options);

    CoreBadgeOptions createBadgeOptions();

    CoreMenuDivider createMenuDivider(CoreMenuDividerOptions options);

    CoreMenuDividerOptions createMenuDividerOptions();

    CoreMenuButton createMenuButton(CoreMenuButtonOptions options);

    CoreMenuButtonOptions createMenuButtonOptions();

    CoreCheckboxTableCell createCheckboxTableCell(CoreCheckboxTableCellOptions options);

    CoreCheckboxTableCellOptions createCheckboxTableCellOptions();

    CoreNavigationTree createNavigationTree(CoreNavigationTreeOptions options);

    CoreNavigationTreeOptions createNavigationTreeOptions();

    CoreAccordionItem createAccordionItem(CoreAccordionItemOptions options);

    CoreAccordionItemOptions createAccordionItemOptions();

    CoreCarousel createCarousel(CoreCarouselOptions options);

    CoreCarouselOptions createCarouselOptions();

    CoreBasicList createBasicList(CoreBasicListOptions options);

    CoreBasicListOptions createBasicListOptions();

    CoreCard createCard(CoreCardOptions options);

    CoreCardOptions createCardOptions();

    CoreRotatingText createRotatingText(CoreRotatingTextOptions options);

    CoreRotatingTextOptions createRotatingTextOptions();

    CoreRegionSelector createRegionSelector(CoreRegionSelectorOptions options);

    CoreRegionSelectorOptions createRegionSelectorOptions();

    CoreCheckbox createCheckbox(CoreCheckboxOptions options);

    CoreCheckboxOptions createCheckboxOptions();

    CoreTableHeader createTableHeader(CoreTableHeaderOptions options);

    CoreTableHeaderOptions createTableHeaderOptions();

    CoreBottomAppBar createBottomAppBar(CoreBottomAppBarOptions options);

    CoreBottomAppBarOptions createBottomAppBarOptions();

    CoreChatBox createChatBox(CoreChatBoxOptions options);

    CoreChatBoxOptions createChatBoxOptions();

    CoreCheckboxTableColumn createCheckboxTableColumn(CoreCheckboxTableColumnOptions options);

    CoreCheckboxTableColumnOptions createCheckboxTableColumnOptions();

    CoreTableFooter createTableFooter(CoreTableFooterOptions options);

    CoreTableFooterOptions createTableFooterOptions();

    CoreSheetView createSheetView(CoreSheetViewOptions options);

    CoreSheetViewOptions createSheetViewOptions();

    CoreTableColumn createTableColumn(CoreTableColumnOptions options);

    CoreTableColumnOptions createTableColumnOptions();

    CoreScrollableContainerScrollArea createScrollableContainerScrollArea(CoreScrollableContainerScrollAreaOptions options);

    CoreScrollableContainerScrollAreaOptions createScrollableContainerScrollAreaOptions();

    CoreTopAppBar createTopAppBar(CoreTopAppBarOptions options);

    CoreTopAppBarOptions createTopAppBarOptions();

    CoreAccordion createAccordion(CoreAccordionOptions options);

    CoreAccordionOptions createAccordionOptions();

    CoreIcon createIcon(CoreIconOptions options);

    CoreIconOptions createIconOptions();

    CoreNavigationLink createNavigationLink(CoreNavigationLinkOptions options);

    CoreNavigationLinkOptions createNavigationLinkOptions();

    CoreText createText(CoreTextOptions options);

    CoreTextOptions createTextOptions();

    CoreBaseComponent createBaseComponent(CoreBaseComponentPartOptions options);

    CoreBaseComponentOptions createBaseComponentOptions();

    CoreTextField createTextField(CoreTextFieldOptions options);

    CoreTextFieldOptions createTextFieldOptions();

    CoreSlideContainer createSlideContainer(CoreSlideContainerOptions options);

    CoreSlideContainerOptions createSlideContainerOptions();

    CoreImage createImage(CoreImageOptions options);

    CoreImageOptions createImageOptions();

    CoreTable createTable(CoreTableOptions options);

    CoreTableOptions createTableOptions();

    CoreTextTrack createTextTrack(CoreTextTrackOptions options);

    CoreTextTrackOptions createTextTrackOptions();

    CoreTableBody createTableBody(CoreTableBodyOptions options);

    CoreTableBodyOptions createTableBodyOptions();

    CoreSkeleton createSkeleton(CoreSkeletonOptions options);

    CoreSkeletonOptions createSkeletonOptions();

    CoreTableColumnGroup createTableColumnGroup(CoreTableColumnGroupOptions options);

    CoreTableColumnGroupOptions createTableColumnGroupOptions();

    CoreSplitContainerDivider createSplitContainerDivider(CoreSplitContainerDividerOptions options);

    CoreSplitContainerDividerOptions createSplitContainerDividerOptions();

    CoreInlineText createInlineText(CoreInlineTextOptions options);

    CoreInlineTextOptions createInlineTextOptions();

    CoreListView createListView(CoreListViewOptions options);

    CoreListViewOptions createListViewOptions();

    CoreOverflowBar createOverflowBar(CoreOverflowBarOptions options);

    CoreOverflowBarOptions createOverflowBarOptions();

    CoreTableCell createTableCell(CoreTableCellOptions options);

    CoreTableCellOptions createTableCellOptions();

    CoreColumnLayout createColumnLayout(CoreColumnLayoutOptions options);

    CoreColumnLayoutOptions createColumnLayoutOptions();

    CoreMessageDialog createMessageDialog(CoreMessageDialogOptions options);

    CoreMessageDialogOptions createMessageDialogOptions();

    CoreButtonBar createButtonBar(CoreButtonBarOptions options);

    CoreButtonBarOptions createButtonBarOptions();

    CoreSearchField createSearchField(CoreSearchFieldOptions options);

    CoreSearchFieldOptions createSearchFieldOptions();

    CoreBasicCheckbox createBasicCheckbox(CoreBasicCheckboxOptions options);

    CoreBasicCheckboxOptions createBasicCheckboxOptions();

    CoreScrollableContainer createScrollableContainer(CoreScrollableContainerOptions options);

    CoreScrollableContainerOptions createScrollableContainerOptions();

    CoreBanner createBanner(CoreBannerOptions options);

    CoreBannerOptions createBannerOptions();

    CoreSurface createSurface(CoreSurfaceOptions options);

    CoreSurfaceOptions createSurfaceOptions();

    CoreCarouselCard createCarouselCard(CoreCarouselCardOptions options);

    CoreCarouselCardOptions createCarouselCardOptions();

    void setRootComponent(RootComponent rootComponent);

    RootComponent getRootComponent();
}
