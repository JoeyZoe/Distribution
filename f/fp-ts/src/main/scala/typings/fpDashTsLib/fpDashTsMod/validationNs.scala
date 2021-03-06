package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "validation")
@js.native
object validationNs extends js.Object {
  @js.native
  class Failure[L, A] protected ()
    extends fpDashTsLib.libValidationMod.Failure[L, A] {
    def this(value: L) = this()
  }
  
  @js.native
  class Success[L, A] protected ()
    extends fpDashTsLib.libValidationMod.Success[L, A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Validation = js.native
  val validation: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libValidationMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libValidationMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[fpDashTsLib.libValidationMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[fpDashTsLib.libValidationMod.URI] = js.native
  def failure[L, A](l: L): fpDashTsLib.libValidationMod.Validation[L, A] = js.native
  def fromEither[L, A](e: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libValidationMod.Validation[L, A] = js.native
  def fromPredicate[L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.libValidationMod.Validation[L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_LABA[L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], f: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, fpDashTsLib.libValidationMod.Validation[L, B]] = js.native
  def getAlt[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libAltMod.Alt2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getApplicative[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getCompactable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libCompactableMod.Compactable2C[fpDashTsLib.libValidationMod.URI, L] = js.native
  def getEq[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libValidationMod.Validation[L, A]] = js.native
  def getFilterable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libFilterableMod.Filterable2C[fpDashTsLib.libValidationMod.URI, L] = js.native
  def getMonad[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getMonadThrow[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libMonadThrowMod.MonadThrow2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  def getMonoid[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libValidationMod.Validation[L, A]] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libValidationMod.Validation[L, A]] = js.native
  def getSetoid[L, A](EL: fpDashTsLib.libEqMod.Eq[L], EA: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libValidationMod.Validation[L, A]] = js.native
  def getShow[L, A](SL: fpDashTsLib.libShowMod.Show[L], SA: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libValidationMod.Validation[L, A]] = js.native
  def getWitherable[L](ML: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libWitherableMod.Witherable2C[fpDashTsLib.libValidationMod.URI, L] = js.native
  def isFailure[L, A](fa: fpDashTsLib.libValidationMod.Validation[L, A]): /* is fp-ts.fp-ts/lib/Validation.Failure<L, A> */ scala.Boolean = js.native
  def isSuccess[L, A](fa: fpDashTsLib.libValidationMod.Validation[L, A]): /* is fp-ts.fp-ts/lib/Validation.Success<L, A> */ scala.Boolean = js.native
  def success[L, A](a: A): fpDashTsLib.libValidationMod.Validation[L, A] = js.native
  def tryCatch[L, A](f: fpDashTsLib.libFunctionMod.Lazy[A], onError: js.Function1[/* e */ js.Any, L]): fpDashTsLib.libValidationMod.Validation[L, A] = js.native
}

