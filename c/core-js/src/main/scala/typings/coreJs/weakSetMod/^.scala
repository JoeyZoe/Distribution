package typings.coreJs.weakSetMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Iterable
import typings.std.WeakSet
import typings.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/es6/weak-set", JSImport.Namespace)
@js.native
class ^[T /* <: js.Object */] () extends WeakSet[T] {
  def this(iterable: Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}

@JSImport("core-js/es6/weak-set", JSImport.Namespace)
@js.native
object ^ extends TopLevel[WeakSetConstructor]

