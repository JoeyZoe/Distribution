package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhSenkouSpanBStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the line.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotIkhSenkouSpanBStylesOptions {
  @scala.inline
  def apply(lineColor: ColorString = null, lineWidth: Int | Double = null): PlotIkhSenkouSpanBStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhSenkouSpanBStylesOptions]
  }
}

