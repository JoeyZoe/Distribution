package typings.std

import typings.std.stdStrings.transitionstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_transitionstart extends js.Object {
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

