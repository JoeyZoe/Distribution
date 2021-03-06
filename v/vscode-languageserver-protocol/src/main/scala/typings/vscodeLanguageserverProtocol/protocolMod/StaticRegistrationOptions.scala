package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRegistrationOptions extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again. See also Registration#id.
    */
  var id: js.UndefOr[String] = js.undefined
}

@JSImport("vscode-languageserver-protocol/lib/protocol", "StaticRegistrationOptions")
@js.native
object StaticRegistrationOptions extends js.Object {
  def hasId(value: js.Object): /* is vscode-languageserver-protocol.AnonId */ Boolean = js.native
}

