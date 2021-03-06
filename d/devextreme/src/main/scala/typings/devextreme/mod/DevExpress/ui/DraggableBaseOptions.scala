package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonY
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableBaseOptions[T] extends DOMComponentOptions[T] {
  /** @name DraggableBase.Options.autoScroll */
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  /** @name DraggableBase.Options.boundary */
  var boundary: js.UndefOr[String | Element | JQuery] = js.undefined
  /** @name DraggableBase.Options.container */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** @name DraggableBase.Options.cursorOffset */
  var cursorOffset: js.UndefOr[String | AnonY] = js.undefined
  /** @name DraggableBase.Options.data */
  var data: js.UndefOr[js.Any] = js.undefined
  /** @name DraggableBase.Options.dragDirection */
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.undefined
  /** @name DraggableBase.Options.group */
  var group: js.UndefOr[String] = js.undefined
  /** @name DraggableBase.Options.handle */
  var handle: js.UndefOr[String] = js.undefined
  /** @name DraggableBase.Options.scrollSensitivity */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  /** @name DraggableBase.Options.scrollSpeed */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}

object DraggableBaseOptions {
  @scala.inline
  def apply[T](
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    boundary: String | Element | JQuery = null,
    container: String | Element | JQuery = null,
    cursorOffset: String | AnonY = null,
    data: js.Any = null,
    dragDirection: both | horizontal | vertical = null,
    elementAttr: js.Any = null,
    group: String = null,
    handle: String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): DraggableBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragDirection != null) __obj.updateDynamic("dragDirection")(dragDirection.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableBaseOptions[T]]
  }
}

