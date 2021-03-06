package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.argumentArgumentMod._Argument
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleRpcStatus extends _Argument {
  /**
    * The status code, which should be an enum value of google.rpc.Code.
    */
  var code: js.UndefOr[Double] = js.undefined
  /**
    * A list of messages that carry the error details.  There is a common set of
    * message types for APIs to use.
    */
  var details: js.UndefOr[js.Array[ApiClientObjectMap[_]]] = js.undefined
  /**
    * A developer-facing error message, which should be in English. Any
    * user-facing error message should be localized and sent in the
    * google.rpc.Status.details field, or localized by the client.
    */
  var message: js.UndefOr[String] = js.undefined
}

object GoogleRpcStatus {
  @scala.inline
  def apply(code: Int | Double = null, details: js.Array[ApiClientObjectMap[_]] = null, message: String = null): GoogleRpcStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleRpcStatus]
  }
}

