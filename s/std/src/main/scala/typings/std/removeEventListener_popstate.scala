package typings.std

import typings.std.stdStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_popstate extends js.Object {
  def apply(`type`: popstate, listener: js.ThisFunction1[/* this */ Window_, /* ev */ PopStateEvent, _]): Unit = js.native
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PopStateEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

