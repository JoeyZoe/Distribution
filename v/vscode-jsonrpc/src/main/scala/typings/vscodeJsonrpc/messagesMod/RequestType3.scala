package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "RequestType3")
@js.native
class RequestType3[P1, P2, P3, R, E, RO] protected () extends AbstractMessageType {
  def this(method: String) = this()
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple7[P1, P2, P3, R, E, RO, _EM]] = js.native
}

