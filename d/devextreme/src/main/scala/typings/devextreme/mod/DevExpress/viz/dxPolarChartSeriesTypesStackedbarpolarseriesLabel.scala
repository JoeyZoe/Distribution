package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorDashStyle
import typings.devextreme.AnonColorVisible
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartSeriesTypesStackedbarpolarseriesLabel extends dxPolarChartSeriesTypesCommonPolarChartSeriesLabel

object dxPolarChartSeriesTypesStackedbarpolarseriesLabel {
  @scala.inline
  def apply(
    argumentFormat: format = null,
    backgroundColor: String = null,
    border: AnonColorDashStyle = null,
    connector: AnonColorVisible = null,
    customizeText: /* pointInfo */ js.Any => String = null,
    font: Font = null,
    format: format = null,
    position: inside | outside = null,
    rotationAngle: Int | Double = null,
    showForZeroValues: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartSeriesTypesStackedbarpolarseriesLabel = {
    val __obj = js.Dynamic.literal()
    if (argumentFormat != null) __obj.updateDynamic("argumentFormat")(argumentFormat.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(showForZeroValues)) __obj.updateDynamic("showForZeroValues")(showForZeroValues.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypesStackedbarpolarseriesLabel]
  }
}

