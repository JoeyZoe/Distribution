package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorOpacity
import typings.devextreme.AnonLength
import typings.devextreme.AnonLine
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.crossLabels
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.keep
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.reset
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartArgumentAxis extends dxChartCommonAxisSettings {
  /** @name dxChart.Options.argumentAxis.aggregateByCategory */
  var aggregateByCategory: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.argumentAxis.aggregationGroupWidth */
  var aggregationGroupWidth: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.argumentAxis.aggregationInterval */
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxChart.Options.argumentAxis.argumentType */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** @name dxChart.Options.argumentAxis.axisDivisionFactor */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.argumentAxis.breaks */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  /** @name dxChart.Options.argumentAxis.categories */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
  /** @name dxChart.Options.argumentAxis.constantLineStyle */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisConstantLineStyle] = js.undefined
  /** @name dxChart.Options.argumentAxis.constantLines */
  var constantLines: js.UndefOr[js.Array[dxChartArgumentAxisConstantLines]] = js.undefined
  /** @name dxChart.Options.argumentAxis.holidays */
  var holidays: js.UndefOr[js.Array[Date | Double | String]] = js.undefined
  /** @name dxChart.Options.argumentAxis.hoverMode */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.undefined
  /** @name dxChart.Options.argumentAxis.label */
  @JSName("label")
  var label_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisLabel] = js.undefined
  /** @name dxChart.Options.argumentAxis.linearThreshold */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.argumentAxis.logarithmBase */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.argumentAxis.max */
  var max: js.UndefOr[Double | Date | String] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.argumentAxis.min */
  var min: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxChart.Options.argumentAxis.minVisualRangeLength */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxChart.Options.argumentAxis.minorTickCount */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.argumentAxis.minorTickInterval */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxChart.Options.argumentAxis.position */
  var position: js.UndefOr[bottom | left | right | top] = js.undefined
  /** @name dxChart.Options.argumentAxis.singleWorkdays */
  var singleWorkdays: js.UndefOr[js.Array[Date | Double | String]] = js.undefined
  /** @name dxChart.Options.argumentAxis.strips */
  var strips: js.UndefOr[js.Array[dxChartArgumentAxisStrips]] = js.undefined
  /** @name dxChart.Options.argumentAxis.tickInterval */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxChart.Options.argumentAxis.title */
  @JSName("title")
  var title_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisTitle] = js.undefined
  /** @name dxChart.Options.argumentAxis.type */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
  /** @name dxChart.Options.argumentAxis.visualRange */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.undefined
  /** @name dxChart.Options.argumentAxis.visualRangeUpdateMode */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.undefined
  /** @name dxChart.Options.argumentAxis.wholeRange */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.undefined
  /** @name dxChart.Options.argumentAxis.workWeek */
  var workWeek: js.UndefOr[js.Array[Double]] = js.undefined
  /** @name dxChart.Options.argumentAxis.workdaysOnly */
  var workdaysOnly: js.UndefOr[Boolean] = js.undefined
}

object dxChartArgumentAxis {
  @scala.inline
  def apply(
    aggregateByCategory: js.UndefOr[Boolean] = js.undefined,
    aggregationGroupWidth: Int | Double = null,
    aggregationInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    argumentType: datetime | numeric | string_ = null,
    axisDivisionFactor: Int | Double = null,
    breakStyle: AnonLine = null,
    breaks: js.Array[ScaleBreak] = null,
    categories: js.Array[Double | String | Date] = null,
    color: String = null,
    constantLineStyle: dxChartArgumentAxisConstantLineStyle = null,
    constantLines: js.Array[dxChartArgumentAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    holidays: js.Array[Date | Double | String] = null,
    hoverMode: allArgumentPoints | none = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxChartArgumentAxisLabel = null,
    linearThreshold: Int | Double = null,
    logarithmBase: Int | Double = null,
    max: Double | Date | String = null,
    maxValueMargin: Int | Double = null,
    min: Double | Date | String = null,
    minValueMargin: Int | Double = null,
    minVisualRangeLength: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: AnonLength = null,
    minorTickCount: Int | Double = null,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    opacity: Int | Double = null,
    placeholderSize: Int | Double = null,
    position: bottom | left | right | top = null,
    singleWorkdays: js.Array[Date | Double | String] = null,
    stripStyle: dxChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxChartArgumentAxisStrips] = null,
    tick: AnonLength = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    title: dxChartArgumentAxisTitle = null,
    `type`: continuous | discrete | logarithmic = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    visualRange: VizRange | (js.Array[Double | String | Date]) = null,
    visualRangeUpdateMode: auto | keep | reset | shift = null,
    wholeRange: VizRange | (js.Array[Double | String | Date]) = null,
    width: Int | Double = null,
    workWeek: js.Array[Double] = null,
    workdaysOnly: js.UndefOr[Boolean] = js.undefined
  ): dxChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregateByCategory)) __obj.updateDynamic("aggregateByCategory")(aggregateByCategory.asInstanceOf[js.Any])
    if (aggregationGroupWidth != null) __obj.updateDynamic("aggregationGroupWidth")(aggregationGroupWidth.asInstanceOf[js.Any])
    if (aggregationInterval != null) __obj.updateDynamic("aggregationInterval")(aggregationInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (argumentType != null) __obj.updateDynamic("argumentType")(argumentType.asInstanceOf[js.Any])
    if (axisDivisionFactor != null) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.asInstanceOf[js.Any])
    if (breakStyle != null) __obj.updateDynamic("breakStyle")(breakStyle.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (constantLines != null) __obj.updateDynamic("constantLines")(constantLines.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (linearThreshold != null) __obj.updateDynamic("linearThreshold")(linearThreshold.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxValueMargin != null) __obj.updateDynamic("maxValueMargin")(maxValueMargin.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minValueMargin != null) __obj.updateDynamic("minValueMargin")(minValueMargin.asInstanceOf[js.Any])
    if (minVisualRangeLength != null) __obj.updateDynamic("minVisualRangeLength")(minVisualRangeLength.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placeholderSize != null) __obj.updateDynamic("placeholderSize")(placeholderSize.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (singleWorkdays != null) __obj.updateDynamic("singleWorkdays")(singleWorkdays.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visualRange != null) __obj.updateDynamic("visualRange")(visualRange.asInstanceOf[js.Any])
    if (visualRangeUpdateMode != null) __obj.updateDynamic("visualRangeUpdateMode")(visualRangeUpdateMode.asInstanceOf[js.Any])
    if (wholeRange != null) __obj.updateDynamic("wholeRange")(wholeRange.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(workdaysOnly)) __obj.updateDynamic("workdaysOnly")(workdaysOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartArgumentAxis]
  }
}

