package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def extend[L, A, B](
    ea: fpDashTsLib.libHKTMod.Kind2[F, L, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, L, A], B]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, B]
}

object Extend2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    extend: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
  ): Extend2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend2[F]]
  }
}

