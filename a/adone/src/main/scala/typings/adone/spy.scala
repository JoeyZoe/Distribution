package typings.adone

import typings.adone.adoneNs.shaniNs.utilNs.INs.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a spy function
  */
@JSGlobal("spy")
@js.native
object spy extends js.Object {
  def apply(): Spy = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, Unit]): Spy = js.native
  def apply[T](`object`: T, method: String): Spy = js.native
}

