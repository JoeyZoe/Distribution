package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "normalizeBatchInTraining")
@js.native
object normalizeBatchInTraining extends js.Object {
  def apply(x: Tensor[Rank], gamma: Tensor[Rank], beta: Tensor[Rank], reductionAxes: js.Array[Double]): js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]] = js.native
  def apply(
    x: Tensor[Rank],
    gamma: Tensor[Rank],
    beta: Tensor[Rank],
    reductionAxes: js.Array[Double],
    epsilon: Double
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]] = js.native
}

