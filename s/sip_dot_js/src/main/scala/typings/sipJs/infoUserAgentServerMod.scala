package typings.sipJs

import typings.sipJs.dialogsMod.SessionDialog
import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.userAgentServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/info-user-agent-server", JSImport.Namespace)
@js.native
object infoUserAgentServerMod extends js.Object {
  @js.native
  class InfoUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
}

