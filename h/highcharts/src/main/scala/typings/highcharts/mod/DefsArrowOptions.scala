package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsArrowOptions extends js.Object {
  var children: js.UndefOr[js.Array[DefsOptions]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var markerHeight: js.UndefOr[Double] = js.undefined
  var markerWidth: js.UndefOr[Double] = js.undefined
  var refX: js.UndefOr[Double] = js.undefined
  var refY: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[Boolean] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object DefsArrowOptions {
  @scala.inline
  def apply(
    children: js.Array[DefsOptions] = null,
    id: String = null,
    markerHeight: Int | Double = null,
    markerWidth: Int | Double = null,
    refX: Int | Double = null,
    refY: Int | Double = null,
    render: js.UndefOr[Boolean] = js.undefined,
    tagName: String = null
  ): DefsArrowOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (refX != null) __obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
    if (refY != null) __obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
    if (!js.isUndefined(render)) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsArrowOptions]
  }
}

