package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandParams
import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "ExecuteCommandRequest")
@js.native
object ExecuteCommandRequest extends js.Object {
  val `type`: ProtocolRequestType[ExecuteCommandParams, js.Any, scala.Nothing, Unit, ExecuteCommandRegistrationOptions] = js.native
}

