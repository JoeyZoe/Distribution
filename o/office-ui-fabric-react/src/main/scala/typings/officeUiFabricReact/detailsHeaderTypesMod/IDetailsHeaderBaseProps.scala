package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typings.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase
import typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsHeaderBaseProps
  extends ClassAttributes[DetailsHeaderBase]
     with IDetailsItemProps {
  /** ariaLabel for the entire header */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /** ariaLabel for the header checkbox that selects or deselects everything */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.undefined
  /** ariaLabel for the selection column */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.undefined
  /** ariaLabel for expand/collapse group button */
  var ariaLabelForToggleAllGroupsButton: js.UndefOr[String] = js.undefined
  /** Overriding class name */
  var className: js.UndefOr[String] = js.undefined
  /** Whether to collapse for all visibility */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
  /** Column reordering options */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.undefined
  /** Column reordering options */
  var columnReorderProps: js.UndefOr[IColumnReorderHeaderProps] = js.undefined
  /** Ref to the component itself */
  var componentRef: js.UndefOr[IRefObject[IDetailsHeader]] = js.undefined
  /** Whether or not all is collapsed */
  var isAllCollapsed: js.UndefOr[Boolean] = js.undefined
  /** Layout mode - fixedColumns or justified */
  var layoutMode: DetailsListLayoutMode
  /** Minimum pixels to be moved before dragging is registered */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
  /** Callback for when column is automatically resized */
  var onColumnAutoResized: js.UndefOr[js.Function2[/* column */ IColumn, /* columnIndex */ Double, Unit]] = js.undefined
  /** Callback for when the column is clicked */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
  ] = js.undefined
  /** Callback for when the column needs to show a context menu */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  /** Callback for when column sizing has changed */
  var onColumnIsSizingChanged: js.UndefOr[js.Function2[/* column */ IColumn, /* isSizing */ Boolean, Unit]] = js.undefined
  /** Callback for when column is resized */
  var onColumnResized: js.UndefOr[
    js.Function3[/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double, Unit]
  ] = js.undefined
  /** Callback to render a tooltip for the column header */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.undefined
  /** If provided, can be used to render a custom checkbox */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
  /** Callback for when collapse all is toggled */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.undefined
  /** Select all button visibility */
  var selectAllVisibility: js.UndefOr[SelectAllVisibility] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]] = js.undefined
  /** Theme from the Higher Order Component */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
}

object IDetailsHeaderBaseProps {
  @scala.inline
  def apply(
    layoutMode: DetailsListLayoutMode,
    ariaLabel: String = null,
    ariaLabelForSelectAllCheckbox: String = null,
    ariaLabelForSelectionColumn: String = null,
    ariaLabelForToggleAllGroupsButton: String = null,
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
    columnReorderOptions: IColumnReorderOptions = null,
    columnReorderProps: IColumnReorderHeaderProps = null,
    columns: js.Array[IColumn] = null,
    componentRef: IRefObject[IDetailsHeader] = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    minimumPixelsForDrag: Int | Double = null,
    onColumnAutoResized: (/* column */ IColumn, /* columnIndex */ Double) => Unit = null,
    onColumnClick: (/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn) => Unit = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onColumnIsSizingChanged: (/* column */ IColumn, /* isSizing */ Boolean) => Unit = null,
    onColumnResized: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Unit = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
    ]) => Element | Null = null,
    onRenderDetailsCheckbox: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null = null,
    onToggleCollapseAll: /* isAllCollapsed */ Boolean => Unit = null,
    ref: LegacyRef[DetailsHeaderBase] = null,
    rowWidth: Int | Double = null,
    selectAllVisibility: SelectAllVisibility = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IDetailsHeaderBaseProps = {
    val __obj = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelForSelectAllCheckbox != null) __obj.updateDynamic("ariaLabelForSelectAllCheckbox")(ariaLabelForSelectAllCheckbox.asInstanceOf[js.Any])
    if (ariaLabelForSelectionColumn != null) __obj.updateDynamic("ariaLabelForSelectionColumn")(ariaLabelForSelectionColumn.asInstanceOf[js.Any])
    if (ariaLabelForToggleAllGroupsButton != null) __obj.updateDynamic("ariaLabelForToggleAllGroupsButton")(ariaLabelForToggleAllGroupsButton.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility.asInstanceOf[js.Any])
    if (columnReorderOptions != null) __obj.updateDynamic("columnReorderOptions")(columnReorderOptions.asInstanceOf[js.Any])
    if (columnReorderProps != null) __obj.updateDynamic("columnReorderProps")(columnReorderProps.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    if (onColumnAutoResized != null) __obj.updateDynamic("onColumnAutoResized")(js.Any.fromFunction2(onColumnAutoResized))
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2(onColumnClick))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(onColumnContextMenu))
    if (onColumnIsSizingChanged != null) __obj.updateDynamic("onColumnIsSizingChanged")(js.Any.fromFunction2(onColumnIsSizingChanged))
    if (onColumnResized != null) __obj.updateDynamic("onColumnResized")(js.Any.fromFunction3(onColumnResized))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(onRenderColumnHeaderTooltip))
    if (onRenderDetailsCheckbox != null) __obj.updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2(onRenderDetailsCheckbox))
    if (onToggleCollapseAll != null) __obj.updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1(onToggleCollapseAll))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (selectAllVisibility != null) __obj.updateDynamic("selectAllVisibility")(selectAllVisibility.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderBaseProps]
  }
}

