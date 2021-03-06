package typings.tensorflowTfjsNode.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.Uint8ClampedArray
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "browser")
@js.native
object browser extends js.Object {
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike): js.Promise[Uint8ClampedArray] = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike, canvas: HTMLCanvasElement): js.Promise[Uint8ClampedArray] = js.native
}

