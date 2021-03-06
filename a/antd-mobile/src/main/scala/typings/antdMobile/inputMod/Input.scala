package typings.antdMobile.inputMod

import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, js.Any, js.Any] {
  var inputRef: HTMLInputElement | Null = js.native
  def focus(): Unit = js.native
  def onInputBlur(e: FocusEvent[HTMLInputElement]): Unit = js.native
  def onInputFocus(e: FocusEvent[HTMLInputElement]): Unit = js.native
}

