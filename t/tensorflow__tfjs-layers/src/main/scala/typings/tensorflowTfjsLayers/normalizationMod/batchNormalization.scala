package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
@js.native
object batchNormalization extends js.Object {
  def apply(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank], beta: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank],
    epsilon: Double
  ): Tensor[Rank] = js.native
}

