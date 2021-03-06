package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedProfileTime extends js.Object {
  /**
    * The time period.
    */
  var period: js.UndefOr[AggregationPeriod] = js.native
  /**
    * The start time.
    */
  var start: js.UndefOr[Timestamp] = js.native
}

object AggregatedProfileTime {
  @scala.inline
  def apply(period: AggregationPeriod = null, start: Timestamp = null): AggregatedProfileTime = {
    val __obj = js.Dynamic.literal()
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedProfileTime]
  }
}

