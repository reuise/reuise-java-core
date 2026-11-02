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
import dev.reuise.core.basecomponent.CoreBaseComponent;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.bottomappbar.CoreBottomAppBar;
import dev.reuise.core.bottomappbar.CoreBottomAppBarOptions;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.card.CoreCard;
import dev.reuise.core.card.CoreCardGrid;
import dev.reuise.core.card.CoreCardGridOptions;
import dev.reuise.core.card.CoreCardOptions;
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
import dev.reuise.core.menu.CoreMenuDivider;
import dev.reuise.core.menu.CoreMenuDividerOptions;
import dev.reuise.core.menu.CoreMenuItem;
import dev.reuise.core.menu.CoreMenuItemOptions;
import dev.reuise.core.menu.CoreMenuOptions;
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
    CoreNavigationLink createNavigationLink(CoreNavigationLinkOptions options);

    CoreNavigationLinkOptions createNavigationLinkOptions();

    CoreAppLayout createAppLayout(CoreAppLayoutOptions options);

    CoreAppLayoutOptions createAppLayoutOptions();

    CoreFilterChip createFilterChip(CoreFilterChipOptions options);

    CoreFilterChipOptions createFilterChipOptions();

    CoreImage createImage(CoreImageOptions options);

    CoreImageOptions createImageOptions();

    CoreParagraph createParagraph(CoreParagraphOptions options);

    CoreParagraphOptions createParagraphOptions();

    CoreTableRow createTableRow(CoreTableRowOptions options);

    CoreTableRowOptions createTableRowOptions();

    CoreText createText(CoreTextOptions options);

    CoreTextOptions createTextOptions();

    CoreRegionSelector createRegionSelector(CoreRegionSelectorOptions options);

    CoreRegionSelectorOptions createRegionSelectorOptions();

    CoreBaseComponent createBaseComponent(CoreBaseComponentPartOptions options);

    CoreBaseComponentOptions createBaseComponentOptions();

    CoreAccordion createAccordion(CoreAccordionOptions options);

    CoreAccordionOptions createAccordionOptions();

    CoreDrawer createDrawer(CoreDrawerOptions options);

    CoreDrawerOptions createDrawerOptions();

    CoreBasicListItem createBasicListItem(CoreBasicListItemOptions options);

    CoreBasicListItemOptions createBasicListItemOptions();

    CoreLabel createLabel(CoreLabelOptions options);

    CoreLabelOptions createLabelOptions();

    CoreFlexContainer createFlexContainer(CoreFlexContainerOptions options);

    CoreFlexContainerOptions createFlexContainerOptions();

    CoreLink createLink(CoreLinkOptions options);

    CoreLinkOptions createLinkOptions();

    CoreMultiEmailAddressField createMultiEmailAddressField(CoreMultiEmailAddressFieldOptions options);

    CoreMultiEmailAddressFieldOptions createMultiEmailAddressFieldOptions();

    CoreTableCell createTableCell(CoreTableCellOptions options);

    CoreTableCellOptions createTableCellOptions();

    CoreButton createButton(CoreButtonOptions options);

    CoreButtonOptions createButtonOptions();

    CoreTableHeaderCell createTableHeaderCell(CoreTableHeaderCellOptions options);

    CoreTableHeaderCellOptions createTableHeaderCellOptions();

    CoreIconLabel createIconLabel(CoreIconLabelOptions options);

    CoreIconLabelOptions createIconLabelOptions();

    CoreColumnLayout createColumnLayout(CoreColumnLayoutOptions options);

    CoreColumnLayoutOptions createColumnLayoutOptions();

    CoreSlideContainer createSlideContainer(CoreSlideContainerOptions options);

    CoreSlideContainerOptions createSlideContainerOptions();

    CoreMenuDivider createMenuDivider(CoreMenuDividerOptions options);

    CoreMenuDividerOptions createMenuDividerOptions();

    CoreSegmentedTextField createSegmentedTextField(CoreSegmentedTextFieldOptions options);

    CoreSegmentedTextFieldOptions createSegmentedTextFieldOptions();

    CoreInlineText createInlineText(CoreInlineTextOptions options);

    CoreInlineTextOptions createInlineTextOptions();

    CoreSheetView createSheetView(CoreSheetViewOptions options);

    CoreSheetViewOptions createSheetViewOptions();

    CoreListView createListView(CoreListViewOptions options);

    CoreListViewOptions createListViewOptions();

    CoreMessageDialog createMessageDialog(CoreMessageDialogOptions options);

    CoreMessageDialogOptions createMessageDialogOptions();

    CoreAvatar createAvatar(CoreAvatarOptions options);

    CoreAvatarOptions createAvatarOptions();

    CoreSplitContainerPanel createSplitContainerPanel(CoreSplitContainerPanelOptions options);

    CoreSplitContainerPanelOptions createSplitContainerPanelOptions();

    CoreTableHeaderRow createTableHeaderRow(CoreTableHeaderRowOptions options);

    CoreTableHeaderRowOptions createTableHeaderRowOptions();

    CoreMediaPlayer createMediaPlayer(CoreMediaPlayerOptions options);

    CoreMediaPlayerOptions createMediaPlayerOptions();

    CoreTable createTable(CoreTableOptions options);

    CoreTableOptions createTableOptions();

    CoreAudioPlayer createAudioPlayer(CoreAudioPlayerOptions options);

    CoreAudioPlayerOptions createAudioPlayerOptions();

    CoreCheckbox createCheckbox(CoreCheckboxOptions options);

    CoreCheckboxOptions createCheckboxOptions();

    CoreMenuItem createMenuItem(CoreMenuItemOptions options);

    CoreMenuItemOptions createMenuItemOptions();

    CoreTopAppBar createTopAppBar(CoreTopAppBarOptions options);

    CoreTopAppBarOptions createTopAppBarOptions();

    CoreBadge createBadge(CoreBadgeOptions options);

    CoreBadgeOptions createBadgeOptions();

    CoreFieldSet createFieldSet(CoreFieldSetOptions options);

    CoreFieldSetOptions createFieldSetOptions();

    CoreTextField createTextField(CoreTextFieldOptions options);

    CoreTextFieldOptions createTextFieldOptions();

    CoreVideoPlayer createVideoPlayer(CoreVideoPlayerOptions options);

    CoreVideoPlayerOptions createVideoPlayerOptions();

    CoreTableFooter createTableFooter(CoreTableFooterOptions options);

    CoreTableFooterOptions createTableFooterOptions();

    CoreTextTrack createTextTrack(CoreTextTrackOptions options);

    CoreTextTrackOptions createTextTrackOptions();

    CoreSheetLayout createSheetLayout(CoreSheetLayoutOptions options);

    CoreSheetLayoutOptions createSheetLayoutOptions();

    CoreSkeleton createSkeleton(CoreSkeletonOptions options);

    CoreSkeletonOptions createSkeletonOptions();

    CoreHeading createHeading(CoreHeadingOptions options);

    CoreHeadingOptions createHeadingOptions();

    CoreSplitContainerDivider createSplitContainerDivider(CoreSplitContainerDividerOptions options);

    CoreSplitContainerDividerOptions createSplitContainerDividerOptions();

    CoreMenu createMenu(CoreMenuOptions options);

    CoreMenuOptions createMenuOptions();

    CoreLineBreak createLineBreak(CoreLineBreakOptions options);

    CoreLineBreakOptions createLineBreakOptions();

    CoreContainer createContainer(CoreContainerOptions options);

    CoreContainerOptions createContainerOptions();

    CoreChipGroup createChipGroup(CoreChipGroupOptions options);

    CoreChipGroupOptions createChipGroupOptions();

    CoreTabBar createTabBar(CoreTabBarOptions options);

    CoreTabBarOptions createTabBarOptions();

    CoreTableColumn createTableColumn(CoreTableColumnOptions options);

    CoreTableColumnOptions createTableColumnOptions();

    CoreCurrencySelector createCurrencySelector(CoreCurrencySelectorOptions options);

    CoreCurrencySelectorOptions createCurrencySelectorOptions();

    CoreDialog createDialog(CoreDialogOptions options);

    CoreDialogOptions createDialogOptions();

    CorePasswordField createPasswordField(CorePasswordFieldOptions options);

    CorePasswordFieldOptions createPasswordFieldOptions();

    CoreSearchField createSearchField(CoreSearchFieldOptions options);

    CoreSearchFieldOptions createSearchFieldOptions();

    CoreCardGrid createCardGrid(CoreCardGridOptions options);

    CoreCardGridOptions createCardGridOptions();

    CoreScrollableContainer createScrollableContainer(CoreScrollableContainerOptions options);

    CoreScrollableContainerOptions createScrollableContainerOptions();

    CoreScrollableContainerScrollArea createScrollableContainerScrollArea(CoreScrollableContainerScrollAreaOptions options);

    CoreScrollableContainerScrollAreaOptions createScrollableContainerScrollAreaOptions();

    CoreBottomAppBar createBottomAppBar(CoreBottomAppBarOptions options);

    CoreBottomAppBarOptions createBottomAppBarOptions();

    CoreSelectMenu createSelectMenu(CoreSelectMenuOptions options);

    CoreSelectMenuOptions createSelectMenuOptions();

    CoreCard createCard(CoreCardOptions options);

    CoreCardOptions createCardOptions();

    CoreView createView(CoreViewOptions options);

    CoreViewOptions createViewOptions();

    CoreSplitContainer createSplitContainer(CoreSplitContainerOptions options);

    CoreSplitContainerOptions createSplitContainerOptions();

    CoreSlideContainerEdge createSlideContainerEdge(CoreSlideContainerEdgeOptions options);

    CoreSlideContainerEdgeOptions createSlideContainerEdgeOptions();

    CoreDropZone createDropZone(CoreDropZoneOptions options);

    CoreDropZoneOptions createDropZoneOptions();

    CoreChip createChip(CoreChipOptions options);

    CoreChipOptions createChipOptions();

    CoreAccordionItem createAccordionItem(CoreAccordionItemOptions options);

    CoreAccordionItemOptions createAccordionItemOptions();

    CoreAppLayoutBody createAppLayoutBody(CoreAppLayoutBodyOptions options);

    CoreAppLayoutBodyOptions createAppLayoutBodyOptions();

    CoreIcon createIcon(CoreIconOptions options);

    CoreIconOptions createIconOptions();

    CoreBasicInputField createBasicInputField(CoreBasicInputFieldOptions options);

    CoreBasicInputFieldOptions createBasicInputFieldOptions();

    CoreTableHeader createTableHeader(CoreTableHeaderOptions options);

    CoreTableHeaderOptions createTableHeaderOptions();

    CoreTableBody createTableBody(CoreTableBodyOptions options);

    CoreTableBodyOptions createTableBodyOptions();

    CoreTableColumnGroup createTableColumnGroup(CoreTableColumnGroupOptions options);

    CoreTableColumnGroupOptions createTableColumnGroupOptions();

    CoreSurface createSurface(CoreSurfaceOptions options);

    CoreSurfaceOptions createSurfaceOptions();

    CoreTextBlock createTextBlock(CoreTextBlockOptions options);

    CoreTextBlockOptions createTextBlockOptions();

    CoreCheckboxTableCell createCheckboxTableCell(CoreCheckboxTableCellOptions options);

    CoreCheckboxTableCellOptions createCheckboxTableCellOptions();

    CoreDivider createDivider(CoreDividerOptions options);

    CoreDividerOptions createDividerOptions();

    CoreCheckboxTableColumn createCheckboxTableColumn(CoreCheckboxTableColumnOptions options);

    CoreCheckboxTableColumnOptions createCheckboxTableColumnOptions();

    CoreProgressIndicator createProgressIndicator(CoreProgressIndicatorOptions options);

    CoreProgressIndicatorOptions createProgressIndicatorOptions();

    CoreScrollableContainerEdge createScrollableContainerEdge(CoreScrollableContainerEdgeOptions options);

    CoreScrollableContainerEdgeOptions createScrollableContainerEdgeOptions();

    CoreRowLayout createRowLayout(CoreRowLayoutOptions options);

    CoreRowLayoutOptions createRowLayoutOptions();

    CoreIconButton createIconButton(CoreIconButtonOptions options);

    CoreIconButtonOptions createIconButtonOptions();

    CoreParentComponent createParentComponent(CoreParentComponentPartOptions options);

    CoreParentComponentOptions createParentComponentOptions();

    CoreTab createTab(CoreTabOptions options);

    CoreTabOptions createTabOptions();

    CoreListItem createListItem(CoreListItemOptions options);

    CoreListItemOptions createListItemOptions();

    CoreBasicList createBasicList(CoreBasicListOptions options);

    CoreBasicListOptions createBasicListOptions();

    CoreBasicCheckbox createBasicCheckbox(CoreBasicCheckboxOptions options);

    CoreBasicCheckboxOptions createBasicCheckboxOptions();

    CoreChipField createChipField(CoreChipFieldOptions options);

    CoreChipFieldOptions createChipFieldOptions();

    void setRootComponent(RootComponent rootComponent);

    RootComponent getRootComponent();
}
