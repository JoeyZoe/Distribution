package typings.cathoQuantum

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallbackFn extends js.Object {
  var callbackFn: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonCallbackFn {
  @scala.inline
  def apply(callbackFn: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null, title: String = null): AnonCallbackFn = {
    val __obj = js.Dynamic.literal()
    if (callbackFn != null) __obj.updateDynamic("callbackFn")(js.Any.fromFunction1(callbackFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallbackFn]
  }
}

