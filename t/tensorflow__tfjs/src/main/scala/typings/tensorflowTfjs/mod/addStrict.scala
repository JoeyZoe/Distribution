package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "addStrict")
@js.native
object addStrict extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, b: TensorLike): T = js.native
}

