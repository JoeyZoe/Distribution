package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Window")
@js.native
class Window protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: WindowOptions) = this()
  @JSName("options")
  var options_Window: WindowOptions = js.native
  var wrapper: JQuery = js.native
  def center(): Window = js.native
  def close(): Window = js.native
  def content(): Window = js.native
  def content(content: String): Window = js.native
  def content(content: JQuery): Window = js.native
  @JSName("content")
  def content_String(): String = js.native
  def isMaximized(): Boolean = js.native
  def isMinimized(): Boolean = js.native
  def maximize(): Window = js.native
  def minimize(): Window = js.native
  def open(): Window = js.native
  def pin(): Unit = js.native
  def refresh(options: js.Any): Window = js.native
  def restore(): Window = js.native
  def setOptions(options: js.Any): Unit = js.native
  def title(): Window = js.native
  def title(text: String): Window = js.native
  @JSName("title")
  def title_String(): String = js.native
  def toFront(): Window = js.native
  def toggleMaximization(): Window = js.native
  def unpin(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Window")
@js.native
object Window extends js.Object {
  var fn: Window = js.native
  def extend(proto: js.Object): Window = js.native
}

