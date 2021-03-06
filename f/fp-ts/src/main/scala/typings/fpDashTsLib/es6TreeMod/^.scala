package typings
package fpDashTsLib.es6TreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Tree = js.native
  val tree: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[URI] with fpDashTsLib.es6ComonadMod.Comonad1[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, duplicate, extend, flatten, foldMap, map, reduce, reduceRight) */ def ap[A](fa: Tree[A]): js.Function1[/* fab */ Tree[js.Function1[/* a */ A, _]], Tree[_]] = js.native
  def drawForest(forest: fpDashTsLib.libArrayMod.Global.Array[Tree[java.lang.String]]): java.lang.String = js.native
  def drawTree(tree: Tree[java.lang.String]): java.lang.String = js.native
  def elem[A](E: fpDashTsLib.es6EqMod.Eq[A]): js.Function2[/* a */ A, /* fa */ Tree[A], scala.Boolean] = js.native
  def getEq[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Tree[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Tree[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Tree[A]] = js.native
  def make[A](a: A): Tree[A] = js.native
  def make[A](a: A, forest: Forest[A]): Tree[A] = js.native
  def unfoldForest[A, B](
    bs: fpDashTsLib.libArrayMod.Global.Array[B],
    f: js.Function1[/* b */ B, js.Tuple2[A, fpDashTsLib.libArrayMod.Global.Array[B]]]
  ): fpDashTsLib.libArrayMod.Global.Array[Tree[A]] = js.native
  def unfoldForestM[M](M: fpDashTsLib.es6MonadMod.Monad[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.es6HKTMod.HKT[M, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Const(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Const[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Either(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Either[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Free[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IOEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IOEither[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IxIO(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IxIO[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Map(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Map[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Reader(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Reader[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_ReaderTaskEither(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_ReaderTaskEither[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_State(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_State[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Store(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Store[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_TaskEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_TaskEither[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_These(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_These[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Traced(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Traced, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Traced[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Traced, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.Tree, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Tuple(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Tuple[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Validation(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Validation[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Writer(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Writer[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, Forest[_]]
  ] = js.native
  def unfoldTree[A, B](b: B, f: js.Function1[/* b */ B, js.Tuple2[A, fpDashTsLib.libArrayMod.Global.Array[B]]]): Tree[A] = js.native
  def unfoldTreeM[M](M: fpDashTsLib.es6MonadMod.Monad[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.es6HKTMod.HKT[M, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Const(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Const[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Either(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Either[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Free[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IOEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IOEither[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IxIO(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IxIO[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Map(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Map[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Reader(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Reader[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_ReaderTaskEither(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_ReaderTaskEither[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_State(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_State[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Store(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Store[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_TaskEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_TaskEither[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_These(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_These[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Traced(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Traced, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Traced[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Traced, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.Tree, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Tuple(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Tuple[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Validation(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Validation[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Writer(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Writer[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, Tree[_]]
  ] = js.native
}

