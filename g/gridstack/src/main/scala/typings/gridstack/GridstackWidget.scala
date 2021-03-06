package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gridstack Widget creation options
  * @param x widget position x (default?: 0)
  * @param y widget position y (default?: 0)
  * @param width  widget dimension width (default?: 1)
  * @param height widget dimension height (default?: 1)
  * @param autoPosition if true then x, y parameters will be ignored and widget will be places on the first available position (default?: false)
  * @param minWidth minimum width allowed during resize/creation (default?: undefined = un-constrained)
  * @param maxWidth maximum width allowed during resize/creation (default?: undefined = un-constrained)
  * @param minHeight minimum height allowed during resize/creation (default?: undefined = un-constrained)
  * @param maxHeight maximum height allowed during resize/creation (default?: undefined = un-constrained)
  * @param noResize prevent resizing (default?: undefined = un-constrained)
  * @param noMove prevents moving (default?: undefined = un-constrained)
  * @param locked prevents moving and resizing (default?: undefined = un-constrained)
  * @param resizeHandles widgets can have their own resize handles. For example 'e,w' will make the particular widget only resize east and west.
  * @param id value for `data-gs-id` stored on the widget (default?: undefined)
  */
trait GridstackWidget extends js.Object {
  var autoPosition: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var noMove: js.UndefOr[Boolean] = js.undefined
  var noResize: js.UndefOr[Boolean] = js.undefined
  var resizeHandles: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object GridstackWidget {
  @scala.inline
  def apply(
    autoPosition: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    id: Double | String = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    noMove: js.UndefOr[Boolean] = js.undefined,
    noResize: js.UndefOr[Boolean] = js.undefined,
    resizeHandles: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): GridstackWidget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noMove)) __obj.updateDynamic("noMove")(noMove.asInstanceOf[js.Any])
    if (!js.isUndefined(noResize)) __obj.updateDynamic("noResize")(noResize.asInstanceOf[js.Any])
    if (resizeHandles != null) __obj.updateDynamic("resizeHandles")(resizeHandles.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridstackWidget]
  }
}

