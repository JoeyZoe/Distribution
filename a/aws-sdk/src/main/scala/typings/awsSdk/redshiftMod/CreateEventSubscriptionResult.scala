package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typings.awsSdk.redshiftMod.EventSubscription] = js.native
}

object CreateEventSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): CreateEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventSubscriptionResult]
  }
}

