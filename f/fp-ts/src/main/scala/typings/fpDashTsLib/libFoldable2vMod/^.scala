package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Foldable2v", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def elem[F, A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v[F]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.HKT[F, A], scala.Boolean] = js.native
  @JSName("elem")
  def elem_Array[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Const[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Const[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Either[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Either[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Eq[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Free[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Free[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_FreeGroup[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IO[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IOEither[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IOEither[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Identity[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IxIO[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IxIO[A, U, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Map[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Map[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_NonEmptyArray[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_NonEmptyArray2v[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Option[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Ord[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Pair[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Reader[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Reader[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_ReaderTaskEither[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_ReaderTaskEither[A, U, L](
    E: fpDashTsLib.libEqMod.Eq[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Record[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_State[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_State[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Store[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Store[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_StrMap[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Task[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_TaskEither[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_TaskEither[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_These[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_These[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Traced[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Traced[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tree[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tuple[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tuple[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Validation[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Validation[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Writer[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Writer[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Zipper[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    scala.Boolean
  ] = js.native
  def findFirst[F](F: Foldable2v[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Array(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Const(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Const[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Either(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Either[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Eq(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Free(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Free[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_FreeGroup(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_IO(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_IOEither(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_IOEither[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Identity(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_IxIO(F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_IxIO[U, L](F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Map(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Map[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_NonEmptyArray(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_NonEmptyArray2v(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Option(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Ord(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Pair(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Reader(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Reader[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_ReaderTaskEither(F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_ReaderTaskEither[U, L](F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Record(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_State(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_State[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Store(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Store[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_StrMap(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Task(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_TaskEither(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_TaskEither[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_These(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_These[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Traced(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Traced[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Tree(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Tuple(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Tuple[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Validation(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Validation[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Writer(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Writer[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("findFirst")
  def findFirst_Zipper(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def fold[M, F](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, M], M] = js.native
  def foldM(
    M: fpDashTsLib.libMonadMod.Monad1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  def foldM(
    M: fpDashTsLib.libMonadMod.Monad2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  def foldM(
    M: fpDashTsLib.libMonadMod.Monad3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  def foldM[L](
    M: fpDashTsLib.libMonadMod.Monad2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  def foldM[U, L](
    M: fpDashTsLib.libMonadMod.Monad3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  def foldM[M, F](M: fpDashTsLib.libMonadMod.Monad[M], F: Foldable2v[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Array(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Eq(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("foldM")
  def foldM_FreeGroup(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("foldM")
  def foldM_IO(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Identity(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("foldM")
  def foldM_NonEmptyArray(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("foldM")
  def foldM_NonEmptyArray2v(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Option(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Ord(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Pair(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Record(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("foldM")
  def foldM_StrMap(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Task(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Tree(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Zipper(
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  @JSName("fold")
  def fold_Array[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, M], M] = js.native
  @JSName("fold")
  def fold_Const[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Const[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Either[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Either[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Eq[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, M], M] = js.native
  @JSName("fold")
  def fold_Free[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, M], M] = js.native
  @JSName("fold")
  def fold_Free[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, M], M] = js.native
  @JSName("fold")
  def fold_FreeGroup[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IO[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, M], M] = js.native
  @JSName("fold")
  def fold_IOEither[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IOEither[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Identity[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, M], M] = js.native
  @JSName("fold")
  def fold_IxIO[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IxIO[M, U, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Map[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, M], M] = js.native
  @JSName("fold")
  def fold_Map[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, M], M] = js.native
  @JSName("fold")
  def fold_NonEmptyArray[M](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray2v[M](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Option[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, M], M] = js.native
  @JSName("fold")
  def fold_Ord[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, M], M] = js.native
  @JSName("fold")
  def fold_Pair[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, M], M] = js.native
  @JSName("fold")
  def fold_Reader[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Reader[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_ReaderTaskEither[M](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_ReaderTaskEither[M, U, L](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Record[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, M], M] = js.native
  @JSName("fold")
  def fold_State[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_State[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Store[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Store[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_StrMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, M], M] = js.native
  @JSName("fold")
  def fold_Task[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, M], M] = js.native
  @JSName("fold")
  def fold_TaskEither[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_TaskEither[M, L](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_These[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_These[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Traced[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Traced[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Tree[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, M], M] = js.native
  @JSName("fold")
  def fold_Tuple[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Tuple[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Validation[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Validation[M, L](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Writer[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Writer[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Zipper[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, M], M] = js.native
  def getFoldableComposition(
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  def getFoldableComposition(
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Foldable2v2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): Foldable2vComposition12[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  def getFoldableComposition(
    F: Foldable2v2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): Foldable2vComposition21[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  def getFoldableComposition(
    F: Foldable2v2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Foldable2v2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  def getFoldableComposition[LG](
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Foldable2v2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ]
  ): Foldable2vComposition12C[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.Writer, LG] = js.native
  def getFoldableComposition[LF](
    F: Foldable2v2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LF
    ],
    G: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): Foldable2vComposition2C1[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.StrMap, LF] = js.native
  def getFoldableComposition[LG](
    F: Foldable2v2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Foldable2v2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.IOEither, LG] = js.native
  def getFoldableComposition[UF, LF](
    F: Foldable2v3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      UF, 
      LF
    ],
    G: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): Foldable2vComposition3C1[
    fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
    fpDashTsLib.fpDashTsLibStrings.StrMap, 
    UF, 
    LF
  ] = js.native
  def getFoldableComposition[F, G](F: Foldable2v[F], G: Foldable2v[G]): Foldable2vComposition[F, G] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Array(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Const(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Const[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Either(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Either[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Eq(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Free(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Free[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_FreeGroup(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IO(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IOEither(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IOEither[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Identity(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Map(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Map[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_NonEmptyArray(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): Foldable2vComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_NonEmptyArray2v(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): Foldable2vComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Option(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Ord(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Pair(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Reader(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Reader[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Record(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_State(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_State[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Store(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Store[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_StrMap(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Task(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_TaskEither(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): Foldable2vComposition22[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_TaskEither[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, LG]
  ): Foldable2vComposition22C[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    LG
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_These(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_These[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Traced(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Traced[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tree(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tuple(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tuple[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Validation(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): Foldable2vComposition22[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Validation[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, LG]
  ): Foldable2vComposition22C[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    LG
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Writer(
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): Foldable2vComposition22[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Writer[LG](
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, LG]
  ): Foldable2vComposition22C[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Zipper(
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    G: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): Foldable2vComposition11[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def intercalate[M, F](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v[F]): js.Function2[/* sep */ M, /* fm */ fpDashTsLib.libHKTMod.HKT[F, M], M] = js.native
  @JSName("intercalate")
  def intercalate_Array[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Const[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Const[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Either[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Either[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Eq[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Free[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Free[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_FreeGroup[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_IO[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_IOEither[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_IOEither[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Identity[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_IxIO[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_IxIO[M, U, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Map[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Map[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_NonEmptyArray[M](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_NonEmptyArray2v[M](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Option[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Ord[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Pair[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Reader[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Reader[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_ReaderTaskEither[M](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_ReaderTaskEither[M, U, L](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Record[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_State[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_State[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Store[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Store[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_StrMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Task[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_TaskEither[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_TaskEither[M, L](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]
  ): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_These[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_These[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Traced[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Traced[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tree[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tuple[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tuple[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Validation[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Validation[M, L](
    M: fpDashTsLib.libMonoidMod.Monoid[M],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]
  ): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Writer[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Writer[M, L](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, M], 
    M
  ] = js.native
  @JSName("intercalate")
  def intercalate_Zipper[M](M: fpDashTsLib.libMonoidMod.Monoid[M], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* sep */ M, 
    /* fm */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, M], 
    M
  ] = js.native
  def max[F, A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  @JSName("max")
  def max_Array[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Const[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Const[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Either[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Either[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Eq[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Free[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Free[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_FreeGroup[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_IO[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_IOEither[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_IOEither[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Identity[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_IxIO[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_IxIO[A, U, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Map[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Map[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_NonEmptyArray[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_NonEmptyArray2v[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Option[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Ord[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Pair[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Reader[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Reader[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_ReaderTaskEither[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_ReaderTaskEither[A, U, L](
    O: fpDashTsLib.libOrdMod.Ord[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Record[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_State[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_State[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Store[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Store[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_StrMap[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Task[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_TaskEither[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_TaskEither[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_These[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_These[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Traced[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Traced[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Tree[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Tuple[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Tuple[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Validation[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Validation[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Writer[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Writer[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("max")
  def max_Zipper[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def member[F, A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v[F]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.HKT[F, A], scala.Boolean] = js.native
  @JSName("member")
  def member_Array[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Const[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Const[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Either[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Either[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Eq[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Free[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Free[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_FreeGroup[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_IO[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_IOEither[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_IOEither[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Identity[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_IxIO[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_IxIO[A, U, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Map[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Map[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_NonEmptyArray[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_NonEmptyArray2v[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Option[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Ord[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Pair[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Reader[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Reader[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_ReaderTaskEither[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_ReaderTaskEither[A, U, L](
    E: fpDashTsLib.libEqMod.Eq[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Record[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_State[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_State[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Store[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Store[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_StrMap[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Task[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_TaskEither[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_TaskEither[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_These[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_These[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Traced[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Traced[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Tree[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Tuple[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Tuple[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Validation[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Validation[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Writer[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Writer[A, L](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("member")
  def member_Zipper[A](E: fpDashTsLib.libEqMod.Eq[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    scala.Boolean
  ] = js.native
  def min[F, A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  @JSName("min")
  def min_Array[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Const[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Const[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Either[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Either[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Eq[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Free[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Free[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_FreeGroup[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_IO[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_IOEither[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_IOEither[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Identity[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_IxIO[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_IxIO[A, U, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Map[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Map[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_NonEmptyArray[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_NonEmptyArray2v[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Option[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Ord[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Pair[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Reader[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Reader[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_ReaderTaskEither[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_ReaderTaskEither[A, U, L](
    O: fpDashTsLib.libOrdMod.Ord[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Record[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_State[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_State[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Store[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Store[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_StrMap[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Task[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_TaskEither[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_TaskEither[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_These[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_These[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Traced[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Traced[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Tree[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Tuple[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Tuple[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Validation[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Validation[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Writer[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Writer[A, L](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("min")
  def min_Zipper[A](O: fpDashTsLib.libOrdMod.Ord[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def oneOf(
    P: fpDashTsLib.libPlusMod.Plus1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  def oneOf(
    P: fpDashTsLib.libPlusMod.Plus2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  def oneOf(
    P: fpDashTsLib.libPlusMod.Plus3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  def oneOf[L](
    P: fpDashTsLib.libPlusMod.Plus2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  def oneOf[U, L](
    P: fpDashTsLib.libPlusMod.Plus3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  def oneOf[P, F](P: fpDashTsLib.libPlusMod.Plus[P], F: Foldable2v[F]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[P, _]], 
    fpDashTsLib.libHKTMod.HKT[P, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Array(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Eq(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Eq],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Eq, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_FreeGroup(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_IO(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Identity(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_NonEmptyArray(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_NonEmptyArray2v(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Option(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Ord(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Ord],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Ord, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Pair(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Record(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Record],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Record, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_StrMap(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Task(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Tree(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Zipper(
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def product[F, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  @JSName("product")
  def product_Array[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], A] = js.native
  @JSName("product")
  def product_Const[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Const[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Either[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Either[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Eq[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], A] = js.native
  @JSName("product")
  def product_Free[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], A] = js.native
  @JSName("product")
  def product_Free[A, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], A] = js.native
  @JSName("product")
  def product_FreeGroup[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IO[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], A] = js.native
  @JSName("product")
  def product_IOEither[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IOEither[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Identity[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], A] = js.native
  @JSName("product")
  def product_IxIO[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IxIO[A, U, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Map[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], A] = js.native
  @JSName("product")
  def product_Map[A, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], A] = js.native
  @JSName("product")
  def product_NonEmptyArray[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    A
  ] = js.native
  @JSName("product")
  def product_NonEmptyArray2v[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Option[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], A] = js.native
  @JSName("product")
  def product_Ord[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], A] = js.native
  @JSName("product")
  def product_Pair[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], A] = js.native
  @JSName("product")
  def product_Reader[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Reader[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_ReaderTaskEither[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_ReaderTaskEither[A, U, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Record[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], A] = js.native
  @JSName("product")
  def product_State[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_State[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Store[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Store[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_StrMap[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], A] = js.native
  @JSName("product")
  def product_Task[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], A] = js.native
  @JSName("product")
  def product_TaskEither[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_TaskEither[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_These[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_These[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Traced[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Traced[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Tree[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], A] = js.native
  @JSName("product")
  def product_Tuple[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Tuple[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Validation[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Validation[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Writer[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Writer[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Zipper[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], A] = js.native
  def sequence_(
    M: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  def sequence_(
    M: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, scala.Unit]
  ] = js.native
  def sequence_(
    M: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, scala.Unit]
  ] = js.native
  def sequence_[L](
    M: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, scala.Unit]
  ] = js.native
  def sequence_[U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, scala.Unit]
  ] = js.native
  def sequence_[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: Foldable2v[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Array(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Eq(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Eq, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__FreeGroup(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__IO(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Identity(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__NonEmptyArray(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__NonEmptyArray2v(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Option(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Ord(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Ord, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Pair(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Record(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Record, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__StrMap(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Task(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Tree(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Zipper(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
  def sum[F, A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  @JSName("sum")
  def sum_Array[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], A] = js.native
  @JSName("sum")
  def sum_Const[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Const[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Either[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Either[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Eq[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], A] = js.native
  @JSName("sum")
  def sum_Free[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], A] = js.native
  @JSName("sum")
  def sum_Free[A, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], A] = js.native
  @JSName("sum")
  def sum_FreeGroup[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IO[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], A] = js.native
  @JSName("sum")
  def sum_IOEither[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IOEither[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Identity[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], A] = js.native
  @JSName("sum")
  def sum_IxIO[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IxIO[A, U, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Map[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], A] = js.native
  @JSName("sum")
  def sum_Map[A, L](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], A] = js.native
  @JSName("sum")
  def sum_NonEmptyArray[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_NonEmptyArray2v[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Option[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], A] = js.native
  @JSName("sum")
  def sum_Ord[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], A] = js.native
  @JSName("sum")
  def sum_Pair[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], A] = js.native
  @JSName("sum")
  def sum_Reader[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Reader[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_ReaderTaskEither[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_ReaderTaskEither[A, U, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Record[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], A] = js.native
  @JSName("sum")
  def sum_State[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_State[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Store[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Store[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_StrMap[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], A] = js.native
  @JSName("sum")
  def sum_Task[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], A] = js.native
  @JSName("sum")
  def sum_TaskEither[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_TaskEither[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_These[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_These[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Traced[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Traced[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Tree[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], A] = js.native
  @JSName("sum")
  def sum_Tuple[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Tuple[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Validation[A](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Validation[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Writer[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Writer[A, L](
    S: fpDashTsLib.libSemiringMod.Semiring[A],
    F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Zipper[A](S: fpDashTsLib.libSemiringMod.Semiring[A], F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], A] = js.native
  def toArray[F](F: Foldable2v[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libArrayMod.Global.Array[_]] = js.native
  @JSName("toArray")
  def toArray_Array(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Const(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Const[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Either(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Either[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Eq(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Free(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Free[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_FreeGroup(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IO(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IOEither(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IOEither[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Identity(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IxIO(F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IxIO[U, L](F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Map(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Map[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_NonEmptyArray(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_NonEmptyArray2v(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Option(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Ord(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Pair(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Reader(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Reader[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_ReaderTaskEither(F: Foldable2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_ReaderTaskEither[U, L](F: Foldable2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Record(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_State(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_State[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Store(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Store[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_StrMap(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Task(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_TaskEither(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_TaskEither[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_These(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_These[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Traced(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Traced[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tree(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tuple(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tuple[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Validation(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Validation[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Writer(F: Foldable2v2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Writer[L](F: Foldable2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Zipper(F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, scala.Unit]
  ] = js.native
  def traverse_[L](
    M: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, scala.Unit]
  ] = js.native
  def traverse_[U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: Foldable2v1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, scala.Unit]
  ] = js.native
  def traverse_[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: Foldable2v[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Array(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Eq(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__FreeGroup(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__IO(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Identity(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__NonEmptyArray(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__NonEmptyArray2v(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Option(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Ord(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Pair(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Record(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__StrMap(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Task(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Tree(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Zipper(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: Foldable2v1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
}

