package typings.tensorflowTfjsCore.scatterNdUtilMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "validateUpdateShape")
@js.native
object validateUpdateShape extends js.Object {
  def apply(shape: js.Array[Double], indices: Tensor[Rank], updates: Tensor[Rank]): Unit = js.native
}

