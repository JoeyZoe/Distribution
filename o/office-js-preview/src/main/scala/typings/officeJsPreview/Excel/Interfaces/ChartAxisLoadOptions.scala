package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single axis in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxisLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the group for the specified axis. See Excel.ChartAxisGroup for details. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var axisGroup: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[Boolean] = js.undefined
  /**
    * [DEPRECATED; kept for back-compat with existing first-party solutions]. Please use `Position` instead.
    * Represents the specified axis where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var crosses: js.UndefOr[Boolean] = js.undefined
  /**
    * [DEPRECATED; kept for back-compat with existing first-party solutions]. Please use `PositionAt` instead.
    * Represents the specified axis where the other axis crosses at. Read Only. Set to this property should use SetCrossesAt(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var crossesAt: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the custom axis display unit value. Read-only. To set this property, please use the SetCustomDisplayUnit(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var customDisplayUnit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the height, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of the axis to the left of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether or not the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the base of the logarithm when using logarithmic scales.
    *
    * [Api set: ExcelApi 1.7]
    */
  var logBase: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.undefined
  /**
    *
    * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a Gridlines object that represents the minor gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.undefined
  /**
    *
    * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether an axis is multilevel or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the specified axis position where the other axis crosses at. You should use the SetPositionAt(double) method to set this property.
    *
    * [Api set: ExcelApi 1.8]
    */
  var positionAt: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether Microsoft Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the angle to which the text is oriented for the chart axis tick label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleLoadOptions] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the axis type. See Excel.ChartAxisType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * A boolean value represents the visibility of the axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object ChartAxisLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    alignment: js.UndefOr[Boolean] = js.undefined,
    axisGroup: js.UndefOr[Boolean] = js.undefined,
    baseTimeUnit: js.UndefOr[Boolean] = js.undefined,
    categoryType: js.UndefOr[Boolean] = js.undefined,
    crosses: js.UndefOr[Boolean] = js.undefined,
    crossesAt: js.UndefOr[Boolean] = js.undefined,
    customDisplayUnit: js.UndefOr[Boolean] = js.undefined,
    displayUnit: js.UndefOr[Boolean] = js.undefined,
    format: ChartAxisFormatLoadOptions = null,
    height: js.UndefOr[Boolean] = js.undefined,
    isBetweenCategories: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    linkNumberFormat: js.UndefOr[Boolean] = js.undefined,
    logBase: js.UndefOr[Boolean] = js.undefined,
    majorGridlines: ChartGridlinesLoadOptions = null,
    majorTickMark: js.UndefOr[Boolean] = js.undefined,
    majorTimeUnitScale: js.UndefOr[Boolean] = js.undefined,
    majorUnit: js.UndefOr[Boolean] = js.undefined,
    maximum: js.UndefOr[Boolean] = js.undefined,
    minimum: js.UndefOr[Boolean] = js.undefined,
    minorGridlines: ChartGridlinesLoadOptions = null,
    minorTickMark: js.UndefOr[Boolean] = js.undefined,
    minorTimeUnitScale: js.UndefOr[Boolean] = js.undefined,
    minorUnit: js.UndefOr[Boolean] = js.undefined,
    multiLevel: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    positionAt: js.UndefOr[Boolean] = js.undefined,
    reversePlotOrder: js.UndefOr[Boolean] = js.undefined,
    scaleType: js.UndefOr[Boolean] = js.undefined,
    showDisplayUnitLabel: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    tickLabelPosition: js.UndefOr[Boolean] = js.undefined,
    tickLabelSpacing: js.UndefOr[Boolean] = js.undefined,
    tickMarkSpacing: js.UndefOr[Boolean] = js.undefined,
    title: ChartAxisTitleLoadOptions = null,
    top: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): ChartAxisLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(axisGroup)) __obj.updateDynamic("axisGroup")(axisGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(baseTimeUnit)) __obj.updateDynamic("baseTimeUnit")(baseTimeUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(categoryType)) __obj.updateDynamic("categoryType")(categoryType.asInstanceOf[js.Any])
    if (!js.isUndefined(crosses)) __obj.updateDynamic("crosses")(crosses.asInstanceOf[js.Any])
    if (!js.isUndefined(crossesAt)) __obj.updateDynamic("crossesAt")(crossesAt.asInstanceOf[js.Any])
    if (!js.isUndefined(customDisplayUnit)) __obj.updateDynamic("customDisplayUnit")(customDisplayUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(displayUnit)) __obj.updateDynamic("displayUnit")(displayUnit.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isBetweenCategories)) __obj.updateDynamic("isBetweenCategories")(isBetweenCategories.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(logBase)) __obj.updateDynamic("logBase")(logBase.asInstanceOf[js.Any])
    if (majorGridlines != null) __obj.updateDynamic("majorGridlines")(majorGridlines.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTickMark)) __obj.updateDynamic("majorTickMark")(majorTickMark.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTimeUnitScale)) __obj.updateDynamic("majorTimeUnitScale")(majorTimeUnitScale.asInstanceOf[js.Any])
    if (!js.isUndefined(majorUnit)) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorGridlines != null) __obj.updateDynamic("minorGridlines")(minorGridlines.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickMark)) __obj.updateDynamic("minorTickMark")(minorTickMark.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTimeUnitScale)) __obj.updateDynamic("minorTimeUnitScale")(minorTimeUnitScale.asInstanceOf[js.Any])
    if (!js.isUndefined(minorUnit)) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLevel)) __obj.updateDynamic("multiLevel")(multiLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(positionAt)) __obj.updateDynamic("positionAt")(positionAt.asInstanceOf[js.Any])
    if (!js.isUndefined(reversePlotOrder)) __obj.updateDynamic("reversePlotOrder")(reversePlotOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleType)) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (!js.isUndefined(showDisplayUnitLabel)) __obj.updateDynamic("showDisplayUnitLabel")(showDisplayUnitLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLabelPosition)) __obj.updateDynamic("tickLabelPosition")(tickLabelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLabelSpacing)) __obj.updateDynamic("tickLabelSpacing")(tickLabelSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(tickMarkSpacing)) __obj.updateDynamic("tickMarkSpacing")(tickMarkSpacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisLoadOptions]
  }
}

