package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentLink
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentLinkRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val method: textDocumentSlashdocumentLink = js.native
  /** @deprecated Use DocumentLinkRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink]] = js.native
  val `type`: ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

