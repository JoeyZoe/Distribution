package typings.std

import typings.std.stdStrings.pointerup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pointerup extends js.Object {
  def apply(`type`: pointerup, listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _]): Unit = js.native
  def apply(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

