package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/race", JSImport.Namespace)
@js.native
object raceMod extends js.Object {
  def race[T](
    observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
    ]))*
  ): js.Any = js.native
  def race[T](
    observables: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
    ]
  ): js.Any = js.native
  @JSName("race")
  def race_TR[T, R](
    observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]))*
  ): js.Any = js.native
  @JSName("race")
  def race_TR[T, R](
    observables: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
    ]
  ): js.Any = js.native
}

