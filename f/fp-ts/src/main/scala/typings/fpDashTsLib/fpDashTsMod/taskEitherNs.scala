package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "taskEither")
@js.native
object taskEitherNs extends js.Object {
  @js.native
  class TaskEither[L, A] protected ()
    extends fpDashTsLib.libTaskEitherMod.TaskEither[L, A] {
    def this(value: fpDashTsLib.libTaskMod.Task[fpDashTsLib.libEitherMod.Either[L, A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.TaskEither = js.native
  val taskEither: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[fpDashTsLib.libTaskEitherMod.URI] = js.native
  val taskEitherSeq: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask2[fpDashTsLib.libTaskEitherMod.URI] with fpDashTsLib.libMonadThrowMod.MonadThrow2[fpDashTsLib.libTaskEitherMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, bimap, chain, chainFirst, flatten, map, mapLeft, fromOption, fromPredicate, filterOrElse) */ def alt[L, A](that: js.Function0[fpDashTsLib.libTaskEitherMod.TaskEither[L, A]]): js.Function1[
    /* fa */ fpDashTsLib.libTaskEitherMod.TaskEither[L, A], 
    fpDashTsLib.libTaskEitherMod.TaskEither[L, A]
  ] = js.native
  def bracket[L, A, B](
    acquire: fpDashTsLib.libTaskEitherMod.TaskEither[L, A],
    use: js.Function1[/* a */ A, fpDashTsLib.libTaskEitherMod.TaskEither[L, B]],
    release: js.Function2[
      /* a */ A, 
      /* e */ fpDashTsLib.libEitherMod.Either[L, B], 
      fpDashTsLib.libTaskEitherMod.TaskEither[L, scala.Unit]
    ]
  ): fpDashTsLib.libTaskEitherMod.TaskEither[L, B] = js.native
  def fold[E, A, R](
    onLeft: js.Function1[/* e */ E, fpDashTsLib.libTaskMod.Task[R]],
    onRight: js.Function1[/* a */ A, fpDashTsLib.libTaskMod.Task[R]]
  ): js.Function1[
    /* ma */ fpDashTsLib.libTaskEitherMod.TaskEither[E, A], 
    fpDashTsLib.libTaskMod.Task[R]
  ] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
  def fromIO[L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
  def fromIOEither[L, A](fa: fpDashTsLib.libIOEitherMod.IOEither[L, A]): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
  def fromLeft[L, A](l: L): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
  def getApplyMonoid[L, A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libTaskEitherMod.TaskEither[L, A]] = js.native
  def getApplySemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTaskEitherMod.TaskEither[L, A]] = js.native
  def getOrElse[E, A](f: js.Function1[/* e */ E, fpDashTsLib.libTaskMod.Task[A]]): js.Function1[
    /* ma */ fpDashTsLib.libTaskEitherMod.TaskEither[E, A], 
    fpDashTsLib.libTaskMod.Task[A]
  ] = js.native
  def getSemigroup[L, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTaskEitherMod.TaskEither[L, A]] = js.native
  def left[L, A](fl: fpDashTsLib.libTaskMod.Task[L]): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
  def left2v[E, A](e: E): fpDashTsLib.libTaskEitherMod.TaskEither[E, A] = js.native
  def leftIO[E, A](me: fpDashTsLib.libIOMod.IO[E]): fpDashTsLib.libTaskEitherMod.TaskEither[E, A] = js.native
  def leftTask[E, A](me: fpDashTsLib.libTaskMod.Task[E]): fpDashTsLib.libTaskEitherMod.TaskEither[E, A] = js.native
  def orElse[E, A, M](f: js.Function1[/* e */ E, fpDashTsLib.libTaskEitherMod.TaskEither[M, A]]): js.Function1[
    /* ma */ fpDashTsLib.libTaskEitherMod.TaskEither[E, A], 
    fpDashTsLib.libTaskEitherMod.TaskEither[M, A]
  ] = js.native
  def right[L, A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
  def right2v[E, A](a: A): fpDashTsLib.libTaskEitherMod.TaskEither[E, A] = js.native
  def rightIO[E, A](ma: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libTaskEitherMod.TaskEither[E, A] = js.native
  def rightTask[E, A](ma: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libTaskEitherMod.TaskEither[E, A] = js.native
  def taskify[L, R](
    f: js.Function1[
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function0[fpDashTsLib.libTaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, L, R](
    f: js.Function2[
      /* a */ A, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* a */ A, fpDashTsLib.libTaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, B, L, R](
    f: js.Function3[
      /* a */ A, 
      /* b */ B, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function2[/* a */ A, /* b */ B, fpDashTsLib.libTaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, B, C, L, R](
    f: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function3[/* a */ A, /* b */ B, /* c */ C, fpDashTsLib.libTaskEitherMod.TaskEither[L, R]] = js.native
  def taskify[A, B, C, D, L, R](
    f: js.Function5[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function4[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    fpDashTsLib.libTaskEitherMod.TaskEither[L, R]
  ] = js.native
  def taskify[A, B, C, D, E, L, R](
    f: js.Function6[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | scala.Null], /* r */ js.UndefOr[R], scala.Unit], 
      scala.Unit
    ]
  ): js.Function5[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* e */ E, 
    fpDashTsLib.libTaskEitherMod.TaskEither[L, R]
  ] = js.native
  def tryCatch[L, A](
    f: fpDashTsLib.libFunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
}

