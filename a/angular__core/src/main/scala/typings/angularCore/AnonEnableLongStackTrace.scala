package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnableLongStackTrace extends js.Object {
  var enableLongStackTrace: js.UndefOr[Boolean] = js.undefined
  var shouldCoalesceEventChangeDetection: js.UndefOr[Boolean] = js.undefined
}

object AnonEnableLongStackTrace {
  @scala.inline
  def apply(
    enableLongStackTrace: js.UndefOr[Boolean] = js.undefined,
    shouldCoalesceEventChangeDetection: js.UndefOr[Boolean] = js.undefined
  ): AnonEnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableLongStackTrace)) __obj.updateDynamic("enableLongStackTrace")(enableLongStackTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCoalesceEventChangeDetection)) __obj.updateDynamic("shouldCoalesceEventChangeDetection")(shouldCoalesceEventChangeDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnableLongStackTrace]
  }
}

