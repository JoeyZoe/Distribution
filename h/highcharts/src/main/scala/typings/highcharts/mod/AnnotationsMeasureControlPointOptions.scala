package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureControlPointOptions extends js.Object {
  var events: js.UndefOr[js.Any] = js.undefined
}

object AnnotationsMeasureControlPointOptions {
  @scala.inline
  def apply(events: js.Any = null): AnnotationsMeasureControlPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureControlPointOptions]
  }
}

