package typings
package fpDashTsLib.es6Foldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2vComposition12[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6FoldableMod.FoldableComposition12[F, G] {
  def foldMap[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, _, _]], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[LG, A, B](
    fa: fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, LG, A]],
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}

object Foldable2vComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, _, _]], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind2[G, js.Any, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable2vComposition12[F, G] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldr = js.Any.fromFunction3(foldr), reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable2vComposition12[F, G]]
  }
}

