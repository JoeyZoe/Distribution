package typings.coreJs

import typings.std.ArrayLike
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/values", JSImport.Namespace)
@js.native
object arrayValuesMod extends js.Object {
  def apply[T](array: ArrayLike[T]): IterableIterator[T] = js.native
}

