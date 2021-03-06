package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsLabel extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.label.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.label.indentFromAxis */
  var indentFromAxis: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.label.overlappingBehavior */
  var overlappingBehavior: js.UndefOr[none | hide] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.label.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxPolarChartCommonAxisSettingsLabel {
  @scala.inline
  def apply(
    font: Font = null,
    indentFromAxis: Int | Double = null,
    overlappingBehavior: none | hide = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (indentFromAxis != null) __obj.updateDynamic("indentFromAxis")(indentFromAxis.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsLabel]
  }
}

