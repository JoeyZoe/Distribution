package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonConnector
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementItem
import typings.devextreme.AnonEventItem
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonHoverStyle
import typings.devextreme.AnonKeepLabels
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonTargetAny
import typings.devextreme.devextremeStrings.Bright
import typings.devextreme.devextremeStrings.Carmine
import typings.devextreme.devextremeStrings.Default
import typings.devextreme.devextremeStrings.Material
import typings.devextreme.devextremeStrings.Ocean
import typings.devextreme.devextremeStrings.Office
import typings.devextreme.devextremeStrings.Pastel
import typings.devextreme.devextremeStrings.Soft
import typings.devextreme.devextremeStrings.Vintage
import typings.devextreme.devextremeStrings.Violet
import typings.devextreme.devextremeStrings.`Dark Moon`
import typings.devextreme.devextremeStrings.`Dark Violet`
import typings.devextreme.devextremeStrings.`Green Mist`
import typings.devextreme.devextremeStrings.`Harmony Light`
import typings.devextreme.devextremeStrings.`Soft Blue`
import typings.devextreme.devextremeStrings.`Soft Pastel`
import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.dynamicHeight
import typings.devextreme.devextremeStrings.dynamicSlope
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.genericDotcarmine
import typings.devextreme.devextremeStrings.genericDotcontrast
import typings.devextreme.devextremeStrings.genericDotdark
import typings.devextreme.devextremeStrings.genericDotdarkmoon
import typings.devextreme.devextremeStrings.genericDotdarkviolet
import typings.devextreme.devextremeStrings.genericDotgreenmist
import typings.devextreme.devextremeStrings.genericDotlight
import typings.devextreme.devextremeStrings.genericDotsoftblue
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFunnelOptions extends BaseWidgetOptions[dxFunnel] {
  /** @name dxFunnel.Options.adaptiveLayout */
  var adaptiveLayout: js.UndefOr[AnonKeepLabels] = js.undefined
  /** @name dxFunnel.Options.algorithm */
  var algorithm: js.UndefOr[dynamicHeight | dynamicSlope] = js.undefined
  /** @name dxFunnel.Options.argumentField */
  var argumentField: js.UndefOr[String] = js.undefined
  /** @name dxFunnel.Options.colorField */
  var colorField: js.UndefOr[String] = js.undefined
  /** @name dxFunnel.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** @name dxFunnel.Options.hoverEnabled */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxFunnel.Options.inverted */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** @name dxFunnel.Options.item */
  var item: js.UndefOr[AnonHoverStyle] = js.undefined
  /** @name dxFunnel.Options.label */
  var label: js.UndefOr[AnonConnector] = js.undefined
  /** @name dxFunnel.Options.legend */
  var legend: js.UndefOr[dxFunnelLegend] = js.undefined
  /** @name dxFunnel.Options.neckHeight */
  var neckHeight: js.UndefOr[Double] = js.undefined
  /** @name dxFunnel.Options.neckWidth */
  var neckWidth: js.UndefOr[Double] = js.undefined
  /** @name dxFunnel.Options.onHoverChanged */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ AnonElementItem, _]] = js.undefined
  /** @name dxFunnel.Options.onItemClick */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ AnonEventItem, _]) | String] = js.undefined
  /** @name dxFunnel.Options.onLegendClick */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonEventItem, _]) | String] = js.undefined
  /** @name dxFunnel.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementItem, _]] = js.undefined
  /** @name dxFunnel.Options.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** @name dxFunnel.Options.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  /** @name dxFunnel.Options.resolveLabelOverlapping */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.undefined
  /** @name dxFunnel.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  /** @name dxFunnel.Options.sortData */
  var sortData: js.UndefOr[Boolean] = js.undefined
  /** @name dxFunnel.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxFunnelOptions: js.UndefOr[dxFunnelTooltip] = js.undefined
  /** @name dxFunnel.Options.valueField */
  var valueField: js.UndefOr[String] = js.undefined
}

object dxFunnelOptions {
  @scala.inline
  def apply(
    adaptiveLayout: AnonKeepLabels = null,
    algorithm: dynamicHeight | dynamicSlope = null,
    argumentField: String = null,
    bindingOptions: js.Any = null,
    colorField: String = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    item: AnonHoverStyle = null,
    label: AnonConnector = null,
    legend: dxFunnelLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    neckHeight: Int | Double = null,
    neckWidth: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxFunnel] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxFunnel] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxFunnel] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxFunnel] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxFunnel] => _ = null,
    onHoverChanged: /* e */ AnonElementItem => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxFunnel] => _ = null,
    onInitialized: /* e */ AnonElement[dxFunnel] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonEventItem, _]) | String = null,
    onLegendClick: (js.Function1[/* e */ AnonEventItem, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxFunnel] => _ = null,
    onSelectionChanged: /* e */ AnonElementItem => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none | shift = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionMode: multiple | none | single_ = null,
    size: BaseWidgetSize = null,
    sortData: js.UndefOr[Boolean] = js.undefined,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxFunnelTooltip = null,
    valueField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFunnelOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (neckHeight != null) __obj.updateDynamic("neckHeight")(neckHeight.asInstanceOf[js.Any])
    if (neckWidth != null) __obj.updateDynamic("neckWidth")(neckWidth.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onHoverChanged != null) __obj.updateDynamic("onHoverChanged")(js.Any.fromFunction1(onHoverChanged))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(onLegendClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortData)) __obj.updateDynamic("sortData")(sortData.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFunnelOptions]
  }
}

