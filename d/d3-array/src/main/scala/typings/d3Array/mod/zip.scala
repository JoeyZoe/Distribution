package typings.d3Array.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", "zip")
@js.native
object zip extends js.Object {
  def apply[T](arrays: ArrayLike[T]*): js.Array[js.Array[T]] = js.native
}

