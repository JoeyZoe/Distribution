package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.ShowMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ShowMessageNotification")
@js.native
object ShowMessageNotification extends js.Object {
  val `type`: ProtocolNotificationType[ShowMessageParams, Unit] = js.native
}

