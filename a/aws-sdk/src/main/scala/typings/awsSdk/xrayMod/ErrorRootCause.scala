package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorRootCause extends js.Object {
  /**
    * A flag that denotes that the root cause impacts the trace client.
    */
  var ClientImpacting: js.UndefOr[NullableBoolean] = js.native
  /**
    * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ErrorRootCauseServices] = js.native
}

object ErrorRootCause {
  @scala.inline
  def apply(ClientImpacting: js.UndefOr[scala.Boolean] = js.undefined, Services: ErrorRootCauseServices = null): ErrorRootCause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClientImpacting)) __obj.updateDynamic("ClientImpacting")(ClientImpacting.asInstanceOf[js.Any])
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorRootCause]
  }
}

