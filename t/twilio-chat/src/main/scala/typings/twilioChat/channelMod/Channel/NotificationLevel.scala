package typings.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.default
  - typings.twilioChat.twilioChatStrings.muted
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.twilioChat.twilioChatStrings.default = this.cast("default")
  @scala.inline
  def muted: typings.twilioChat.twilioChatStrings.muted = this.cast("muted")
}

