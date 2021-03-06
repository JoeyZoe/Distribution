package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResizeEndEvent extends SchedulerEvent {
  var end: js.UndefOr[Date] = js.undefined
  var event: js.UndefOr[typings.kendoUi.kendo.data.SchedulerEvent] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object SchedulerResizeEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    end: Date = null,
    event: typings.kendoUi.kendo.data.SchedulerEvent = null,
    slot: js.Any = null,
    start: Date = null
  ): SchedulerResizeEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerResizeEndEvent]
  }
}

