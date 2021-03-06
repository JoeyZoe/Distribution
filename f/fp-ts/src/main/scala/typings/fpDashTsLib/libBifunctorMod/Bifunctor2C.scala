package typings
package fpDashTsLib.libBifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def bimap[A, M, B](
    fla: fpDashTsLib.libHKTMod.Kind2[F, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.libHKTMod.Kind2[F, M, B]
}

object Bifunctor2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    bimap: (fpDashTsLib.libHKTMod.Kind2[F, L, js.Any], js.Function1[/* l */ L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
  ): Bifunctor2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap))
  
    __obj.asInstanceOf[Bifunctor2C[F, L]]
  }
}

