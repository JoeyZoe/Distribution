package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/image_ops", JSImport.Namespace)
@js.native
object imageOpsMod extends js.Object {
  val cropAndResize: js.Function6[
    /* image */ Tensor4D | TensorLike, 
    /* boxes */ Tensor2D | TensorLike, 
    /* boxInd */ Tensor1D | TensorLike, 
    /* cropSize */ js.Tuple2[Double, Double], 
    /* method */ js.UndefOr[bilinear | nearest], 
    /* extrapolationValue */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  val nonMaxSuppression: js.Function5[
    /* boxes */ Tensor2D | TensorLike, 
    /* scores */ Tensor1D | TensorLike, 
    /* maxOutputSize */ Double, 
    /* iouThreshold */ js.UndefOr[Double], 
    /* scoreThreshold */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
  val nonMaxSuppressionAsync: js.Function5[
    /* boxes */ Tensor2D | TensorLike, 
    /* scores */ Tensor1D | TensorLike, 
    /* maxOutputSize */ Double, 
    /* iouThreshold */ js.UndefOr[Double], 
    /* scoreThreshold */ js.UndefOr[Double], 
    js.Promise[Tensor1D]
  ] = js.native
  val nonMaxSuppressionWithScore: js.Function6[
    /* boxes */ Tensor2D | TensorLike, 
    /* scores */ Tensor1D | TensorLike, 
    /* maxOutputSize */ Double, 
    /* iouThreshold */ js.UndefOr[Double], 
    /* scoreThreshold */ js.UndefOr[Double], 
    /* softNmsSigma */ js.UndefOr[Double], 
    NamedTensorMap
  ] = js.native
  val nonMaxSuppressionWithScoreAsync: js.Function6[
    /* boxes */ Tensor2D | TensorLike, 
    /* scores */ Tensor1D | TensorLike, 
    /* maxOutputSize */ Double, 
    /* iouThreshold */ js.UndefOr[Double], 
    /* scoreThreshold */ js.UndefOr[Double], 
    /* softNmsSigma */ js.UndefOr[Double], 
    js.Promise[NamedTensorMap]
  ] = js.native
  @js.native
  object resizeBilinear extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  }
  
  @js.native
  object resizeNearestNeighbor extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  }
  
}

