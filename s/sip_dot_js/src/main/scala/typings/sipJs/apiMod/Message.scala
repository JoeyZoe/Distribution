package typings.sipJs.apiMod

import typings.sipJs.methodsMessageMod.IncomingMessageRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Message")
@js.native
class Message protected ()
  extends typings.sipJs.messageMod.Message {
  /** @internal */
  def this(incomingMessageRequest: IncomingMessageRequest) = this()
}

