package typings
package fpDashTsLib.es6BoundedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounded[A]
  extends fpDashTsLib.es6OrdMod.Ord[A] {
  val bottom: A
  val top: A
}

object Bounded {
  @scala.inline
  def apply[A](
    bottom: A,
    compare: (A, A) => fpDashTsLib.es6OrderingMod.Ordering,
    equals: (A, A) => scala.Boolean,
    top: A
  ): Bounded[A] = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], compare = js.Any.fromFunction2(compare), equals = js.Any.fromFunction2(equals), top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounded[A]]
  }
}

