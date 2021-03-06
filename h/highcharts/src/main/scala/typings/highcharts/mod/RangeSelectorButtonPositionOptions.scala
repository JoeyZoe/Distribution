package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButtonPositionOptions extends js.Object {
  /**
    * (Highstock, Gantt) The alignment of the input box. Allowed properties are
    * `left`, `center`, `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highstock, Gantt) X offset of the button row.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Y offset of the button row.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object RangeSelectorButtonPositionOptions {
  @scala.inline
  def apply(align: AlignValue = null, x: Int | Double = null, y: Int | Double = null): RangeSelectorButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorButtonPositionOptions]
  }
}

