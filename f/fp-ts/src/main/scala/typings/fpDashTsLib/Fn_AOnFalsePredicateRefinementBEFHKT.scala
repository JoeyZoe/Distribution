package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AOnFalsePredicateRefinementBEFHKT[F] extends js.Object {
  def apply[E, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, A]] = js.native
}

