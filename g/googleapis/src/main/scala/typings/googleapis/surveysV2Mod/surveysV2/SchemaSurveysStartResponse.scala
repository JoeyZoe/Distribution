package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSurveysStartResponse extends js.Object {
  /**
    * Unique request ID used for logging and debugging. Please include in any
    * error reporting or troubleshooting requests.
    */
  var requestId: js.UndefOr[String] = js.native
}

object SchemaSurveysStartResponse {
  @scala.inline
  def apply(requestId: String = null): SchemaSurveysStartResponse = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSurveysStartResponse]
  }
}

