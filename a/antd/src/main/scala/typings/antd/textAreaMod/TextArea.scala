package typings.antd.textAreaMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var clearableInput: typings.antd.clearableLabeledInputMod.default = js.native
  var resizableTextArea: typings.antd.resizableTextAreaMod.default = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLTextAreaElement]): Unit = js.native
  def handleReset(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderTextArea(prefixCls: String): Element = js.native
  def saveClearableInput(clearableInput: typings.antd.clearableLabeledInputMod.default): Unit = js.native
  def saveTextArea(resizableTextArea: typings.antd.resizableTextAreaMod.default): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

