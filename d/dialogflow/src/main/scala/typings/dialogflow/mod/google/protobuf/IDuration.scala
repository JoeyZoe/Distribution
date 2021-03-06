package typings.dialogflow.mod.google.protobuf

import typings.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Duration. */
trait IDuration extends js.Object {
  /** Duration nanos */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  /** Duration seconds */
  var seconds: js.UndefOr[Double | Long | String | Null] = js.undefined
}

object IDuration {
  @scala.inline
  def apply(nanos: Int | Double = null, seconds: Double | Long | String = null): IDuration = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDuration]
  }
}

