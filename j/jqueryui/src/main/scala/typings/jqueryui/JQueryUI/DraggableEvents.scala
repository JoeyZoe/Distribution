package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableEvents extends js.Object {
  var create: js.UndefOr[DraggableEvent] = js.undefined
  var drag: js.UndefOr[DraggableEvent] = js.undefined
  var start: js.UndefOr[DraggableEvent] = js.undefined
  var stop: js.UndefOr[DraggableEvent] = js.undefined
}

object DraggableEvents {
  @scala.inline
  def apply(
    create: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null,
    drag: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null
  ): DraggableEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2(drag))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[DraggableEvents]
  }
}

