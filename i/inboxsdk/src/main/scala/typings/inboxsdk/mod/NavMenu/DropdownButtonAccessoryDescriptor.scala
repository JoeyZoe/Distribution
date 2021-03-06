package typings.inboxsdk.mod.NavMenu

import typings.inboxsdk.inboxsdkStrings.DROPDOWN_BUTTON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownButtonAccessoryDescriptor extends js.Object {
  var buttonBackgroundColor: String
  var buttonForegroundColor: String
  var `type`: DROPDOWN_BUTTON
  def onClick(event: DropdownButtonClickEvent): Unit
}

object DropdownButtonAccessoryDescriptor {
  @scala.inline
  def apply(
    buttonBackgroundColor: String,
    buttonForegroundColor: String,
    onClick: DropdownButtonClickEvent => Unit,
    `type`: DROPDOWN_BUTTON
  ): DropdownButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
  }
}

