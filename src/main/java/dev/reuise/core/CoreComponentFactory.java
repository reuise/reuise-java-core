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
    CoreListItem createListItem(CoreListItemOptions options);

    CoreListItemOptions createListItemOptions();

    CoreChipGroup createChipGroup(CoreChipGroupOptions options);

    CoreChipGroupOptions createChipGroupOptions();

    CoreCheckboxTableCell createCheckboxTableCell(CoreCheckboxTableCellOptions options);

    CoreCheckboxTableCellOptions createCheckboxTableCellOptions();

    CoreAppLayout createAppLayout(CoreAppLayoutOptions options);

    CoreAppLayoutOptions createAppLayoutOptions();

    CoreBasicInputField createBasicInputField(CoreBasicInputFieldOptions options);

    CoreBasicInputFieldOptions createBasicInputFieldOptions();

    CoreAccordion createAccordion(CoreAccordionOptions options);

    CoreAccordionOptions createAccordionOptions();

    CoreTopAppBar createTopAppBar(CoreTopAppBarOptions options);

    CoreTopAppBarOptions createTopAppBarOptions();

    CoreColumnLayout createColumnLayout(CoreColumnLayoutOptions options);

    CoreColumnLayoutOptions createColumnLayoutOptions();

    CoreSheetView createSheetView(CoreSheetViewOptions options);

    CoreSheetViewOptions createSheetViewOptions();

    CoreScrollableContainer createScrollableContainer(CoreScrollableContainerOptions options);

    CoreScrollableContainerOptions createScrollableContainerOptions();

    CoreFlexContainer createFlexContainer(CoreFlexContainerOptions options);

    CoreFlexContainerOptions createFlexContainerOptions();

    CoreTableColumnGroup createTableColumnGroup(CoreTableColumnGroupOptions options);

    CoreTableColumnGroupOptions createTableColumnGroupOptions();

    CoreTableBody createTableBody(CoreTableBodyOptions options);

    CoreTableBodyOptions createTableBodyOptions();

    CoreTab createTab(CoreTabOptions options);

    CoreTabOptions createTabOptions();

    CoreSheetLayout createSheetLayout(CoreSheetLayoutOptions options);

    CoreSheetLayoutOptions createSheetLayoutOptions();

    CoreSearchField createSearchField(CoreSearchFieldOptions options);

    CoreSearchFieldOptions createSearchFieldOptions();

    CoreLabel createLabel(CoreLabelOptions options);

    CoreLabelOptions createLabelOptions();

    CoreMenu createMenu(CoreMenuOptions options);

    CoreMenuOptions createMenuOptions();

    CoreText createText(CoreTextOptions options);

    CoreTextOptions createTextOptions();

    CoreSplitContainerPanel createSplitContainerPanel(CoreSplitContainerPanelOptions options);

    CoreSplitContainerPanelOptions createSplitContainerPanelOptions();

    CoreTextTrack createTextTrack(CoreTextTrackOptions options);

    CoreTextTrackOptions createTextTrackOptions();

    CoreTableHeaderCell createTableHeaderCell(CoreTableHeaderCellOptions options);

    CoreTableHeaderCellOptions createTableHeaderCellOptions();

    CoreTableCell createTableCell(CoreTableCellOptions options);

    CoreTableCellOptions createTableCellOptions();

    CoreListView createListView(CoreListViewOptions options);

    CoreListViewOptions createListViewOptions();

    CoreTableFooter createTableFooter(CoreTableFooterOptions options);

    CoreTableFooterOptions createTableFooterOptions();

    CoreBottomAppBar createBottomAppBar(CoreBottomAppBarOptions options);

    CoreBottomAppBarOptions createBottomAppBarOptions();

    CoreBasicList createBasicList(CoreBasicListOptions options);

    CoreBasicListOptions createBasicListOptions();

    CoreMultiEmailAddressField createMultiEmailAddressField(CoreMultiEmailAddressFieldOptions options);

    CoreMultiEmailAddressFieldOptions createMultiEmailAddressFieldOptions();

    CoreMenuDivider createMenuDivider(CoreMenuDividerOptions options);

    CoreMenuDividerOptions createMenuDividerOptions();

    CoreAvatar createAvatar(CoreAvatarOptions options);

    CoreAvatarOptions createAvatarOptions();

    CoreIconButton createIconButton(CoreIconButtonOptions options);

    CoreIconButtonOptions createIconButtonOptions();

    CoreDivider createDivider(CoreDividerOptions options);

    CoreDividerOptions createDividerOptions();

    CoreDialog createDialog(CoreDialogOptions options);

    CoreDialogOptions createDialogOptions();

    CoreAppLayoutBody createAppLayoutBody(CoreAppLayoutBodyOptions options);

    CoreAppLayoutBodyOptions createAppLayoutBodyOptions();

    CoreTableRow createTableRow(CoreTableRowOptions options);

    CoreTableRowOptions createTableRowOptions();

    CoreDropZone createDropZone(CoreDropZoneOptions options);

    CoreDropZoneOptions createDropZoneOptions();

    CoreCheckbox createCheckbox(CoreCheckboxOptions options);

    CoreCheckboxOptions createCheckboxOptions();

    CoreChipField createChipField(CoreChipFieldOptions options);

    CoreChipFieldOptions createChipFieldOptions();

    CoreSurface createSurface(CoreSurfaceOptions options);

    CoreSurfaceOptions createSurfaceOptions();

    CoreVideoPlayer createVideoPlayer(CoreVideoPlayerOptions options);

    CoreVideoPlayerOptions createVideoPlayerOptions();

    CoreDrawer createDrawer(CoreDrawerOptions options);

    CoreDrawerOptions createDrawerOptions();

    CoreMediaPlayer createMediaPlayer(CoreMediaPlayerOptions options);

    CoreMediaPlayerOptions createMediaPlayerOptions();

    CoreLink createLink(CoreLinkOptions options);

    CoreLinkOptions createLinkOptions();

    CoreTextBlock createTextBlock(CoreTextBlockOptions options);

    CoreTextBlockOptions createTextBlockOptions();

    CoreIcon createIcon(CoreIconOptions options);

    CoreIconOptions createIconOptions();

    CorePasswordField createPasswordField(CorePasswordFieldOptions options);

    CorePasswordFieldOptions createPasswordFieldOptions();

    CoreSelectMenu createSelectMenu(CoreSelectMenuOptions options);

    CoreSelectMenuOptions createSelectMenuOptions();

    CoreBasicListItem createBasicListItem(CoreBasicListItemOptions options);

    CoreBasicListItemOptions createBasicListItemOptions();

    CoreIconLabel createIconLabel(CoreIconLabelOptions options);

    CoreIconLabelOptions createIconLabelOptions();

    CoreTable createTable(CoreTableOptions options);

    CoreTableOptions createTableOptions();

    CoreScrollableContainerScrollArea createScrollableContainerScrollArea(CoreScrollableContainerScrollAreaOptions options);

    CoreScrollableContainerScrollAreaOptions createScrollableContainerScrollAreaOptions();

    CoreParentComponent createParentComponent(CoreParentComponentPartOptions options);

    CoreParentComponentOptions createParentComponentOptions();

    CoreBaseComponent createBaseComponent(CoreBaseComponentPartOptions options);

    CoreBaseComponentOptions createBaseComponentOptions();

    CoreInlineText createInlineText(CoreInlineTextOptions options);

    CoreInlineTextOptions createInlineTextOptions();

    CoreView createView(CoreViewOptions options);

    CoreViewOptions createViewOptions();

    CoreHeading createHeading(CoreHeadingOptions options);

    CoreHeadingOptions createHeadingOptions();

    CoreScrollableContainerEdge createScrollableContainerEdge(CoreScrollableContainerEdgeOptions options);

    CoreScrollableContainerEdgeOptions createScrollableContainerEdgeOptions();

    CoreAudioPlayer createAudioPlayer(CoreAudioPlayerOptions options);

    CoreAudioPlayerOptions createAudioPlayerOptions();

    CoreNavigationLink createNavigationLink(CoreNavigationLinkOptions options);

    CoreNavigationLinkOptions createNavigationLinkOptions();

    CoreTableHeader createTableHeader(CoreTableHeaderOptions options);

    CoreTableHeaderOptions createTableHeaderOptions();

    CoreButton createButton(CoreButtonOptions options);

    CoreButtonOptions createButtonOptions();

    CoreRowLayout createRowLayout(CoreRowLayoutOptions options);

    CoreRowLayoutOptions createRowLayoutOptions();

    CoreBasicCheckbox createBasicCheckbox(CoreBasicCheckboxOptions options);

    CoreBasicCheckboxOptions createBasicCheckboxOptions();

    CoreCard createCard(CoreCardOptions options);

    CoreCardOptions createCardOptions();

    CoreLineBreak createLineBreak(CoreLineBreakOptions options);

    CoreLineBreakOptions createLineBreakOptions();

    CoreTableHeaderRow createTableHeaderRow(CoreTableHeaderRowOptions options);

    CoreTableHeaderRowOptions createTableHeaderRowOptions();

    CoreTextField createTextField(CoreTextFieldOptions options);

    CoreTextFieldOptions createTextFieldOptions();

    CoreSlideContainerEdge createSlideContainerEdge(CoreSlideContainerEdgeOptions options);

    CoreSlideContainerEdgeOptions createSlideContainerEdgeOptions();

    CoreTabBar createTabBar(CoreTabBarOptions options);

    CoreTabBarOptions createTabBarOptions();

    CoreMessageDialog createMessageDialog(CoreMessageDialogOptions options);

    CoreMessageDialogOptions createMessageDialogOptions();

    CoreSegmentedTextField createSegmentedTextField(CoreSegmentedTextFieldOptions options);

    CoreSegmentedTextFieldOptions createSegmentedTextFieldOptions();

    CoreCardGrid createCardGrid(CoreCardGridOptions options);

    CoreCardGridOptions createCardGridOptions();

    CoreImage createImage(CoreImageOptions options);

    CoreImageOptions createImageOptions();

    CoreSlideContainer createSlideContainer(CoreSlideContainerOptions options);

    CoreSlideContainerOptions createSlideContainerOptions();

    CoreBadge createBadge(CoreBadgeOptions options);

    CoreBadgeOptions createBadgeOptions();

    CoreMenuItem createMenuItem(CoreMenuItemOptions options);

    CoreMenuItemOptions createMenuItemOptions();

    CoreTableColumn createTableColumn(CoreTableColumnOptions options);

    CoreTableColumnOptions createTableColumnOptions();

    CoreProgressIndicator createProgressIndicator(CoreProgressIndicatorOptions options);

    CoreProgressIndicatorOptions createProgressIndicatorOptions();

    CoreSplitContainerDivider createSplitContainerDivider(CoreSplitContainerDividerOptions options);

    CoreSplitContainerDividerOptions createSplitContainerDividerOptions();

    CoreParagraph createParagraph(CoreParagraphOptions options);

    CoreParagraphOptions createParagraphOptions();

    CoreChip createChip(CoreChipOptions options);

    CoreChipOptions createChipOptions();

    CoreContainer createContainer(CoreContainerOptions options);

    CoreContainerOptions createContainerOptions();

    CoreSkeleton createSkeleton(CoreSkeletonOptions options);

    CoreSkeletonOptions createSkeletonOptions();

    CoreAccordionItem createAccordionItem(CoreAccordionItemOptions options);

    CoreAccordionItemOptions createAccordionItemOptions();

    CoreFieldSet createFieldSet(CoreFieldSetOptions options);

    CoreFieldSetOptions createFieldSetOptions();

    CoreFilterChip createFilterChip(CoreFilterChipOptions options);

    CoreFilterChipOptions createFilterChipOptions();

    CoreCheckboxTableColumn createCheckboxTableColumn(CoreCheckboxTableColumnOptions options);

    CoreCheckboxTableColumnOptions createCheckboxTableColumnOptions();

    CoreSplitContainer createSplitContainer(CoreSplitContainerOptions options);

    CoreSplitContainerOptions createSplitContainerOptions();

    void setRootComponent(RootComponent rootComponent);

    RootComponent getRootComponent();
}