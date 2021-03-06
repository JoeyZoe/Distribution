package typings.angularDesktopNotification

import typings.angularDesktopNotification.angularDesktopNotificationStrings.default
import typings.angularDesktopNotification.angularDesktopNotificationStrings.denied
import typings.angularDesktopNotification.angularDesktopNotificationStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: typings.angularDesktopNotification.angularDesktopNotificationStrings.default
  var denied: typings.angularDesktopNotification.angularDesktopNotificationStrings.denied
  var granted: typings.angularDesktopNotification.angularDesktopNotificationStrings.granted
}

object AnonDefault {
  @scala.inline
  def apply(default: default, denied: denied, granted: granted): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault]
  }
}

