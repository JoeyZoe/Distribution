package typings.plottable

import typings.plottable.interfacesMod.AttributeToProjector
import typings.plottable.interfacesMod.Projector
import typings.plottable.memThunkMod.Thunk
import typings.plottable.memoizeMemoizeMod.MemoizedFunction
import typings.plottable.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/memoize", JSImport.Namespace)
@js.native
object memoizeMod extends js.Object {
  def memThunk[I1, O](arg1: Thunk[I1], compute: js.ThisFunction1[/* this */ Unit, /* arg1 */ I1, O]): MemoizedFunction[Thunk[O]] = js.native
  def memThunk[I1, I2, O](
    arg1: Thunk[I1],
    arg2: Thunk[I2],
    compute: js.ThisFunction2[/* this */ Unit, /* arg1 */ I1, /* arg2 */ I2, O]
  ): MemoizedFunction[Thunk[O]] = js.native
  def memThunk[I1, I2, I3, O](
    arg1: Thunk[I1],
    arg2: Thunk[I2],
    arg3: Thunk[I3],
    compute: js.ThisFunction3[/* this */ Unit, /* arg1 */ I1, /* arg2 */ I2, /* arg3 */ I3, O]
  ): MemoizedFunction[Thunk[O]] = js.native
  def memThunk[I1, I2, I3, I4, O](
    arg1: Thunk[I1],
    arg2: Thunk[I2],
    arg3: Thunk[I3],
    arg4: Thunk[I4],
    compute: js.ThisFunction4[/* this */ Unit, /* arg1 */ I1, /* arg2 */ I2, /* arg3 */ I3, /* arg4 */ I4, O]
  ): MemoizedFunction[Thunk[O]] = js.native
  def memoize[F /* <: js.Function */](compute: F): MemoizedFunction[F] = js.native
  def memoizeProjector(projector: Projector): Projector = js.native
  def memoizeProjectors(attrToProjector: AttributeToProjector): AttributeToProjector = js.native
  def sign(a: js.Any): Signature = js.native
}

