package typings.sipml.SIPml.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Session.Subscribe")
@js.native
class Subscribe ()
  extends typings.sipml.SIPml.Session {
  def subscribe(to: String): Double = js.native
  def subscribe(to: String, configuration: Configuration): Double = js.native
  def unsubscribe(): Double = js.native
  def unsubscribe(configuration: Configuration): Double = js.native
}

@JSGlobal("SIPml.Session.Subscribe")
@js.native
object Subscribe extends js.Object {
  /**
    * Should be
    *
    * Session.EventSubscriptionType | "i_notify"
    */
  type EventSubscriptionType = typings.sipml.SIPml.Session.EventSubscriptionType
}

