package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: Tensor2D | Tensor3D */](x: T | TensorLike, filter: Tensor3D | TensorLike, stride: Double, pad: valid_ | same_ | Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double,
    dataFormat: NWC | NCW
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double,
    dataFormat: NWC | NCW,
    dilation: Double
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double,
    dataFormat: NWC | NCW,
    dilation: Double,
    dimRoundingMode: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
  ): T = js.native
}

