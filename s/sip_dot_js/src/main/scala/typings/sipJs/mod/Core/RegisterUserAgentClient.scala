package typings.sipJs.mod.Core

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.RegisterUserAgentClient")
@js.native
class RegisterUserAgentClient protected ()
  extends typings.sipJs.coreMod.RegisterUserAgentClient {
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}

