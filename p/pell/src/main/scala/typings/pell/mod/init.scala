package typings.pell.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pell", "init")
@js.native
object init extends js.Object {
  def apply[T /* <: HTMLElement */](c: pellConfig[T]): T with PellElement = js.native
}

