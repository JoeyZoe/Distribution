package typings.sipJs.coreMod

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "RegisterUserAgentServer")
@js.native
class RegisterUserAgentServer protected ()
  extends typings.sipJs.userAgentsMod.RegisterUserAgentServer {
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

