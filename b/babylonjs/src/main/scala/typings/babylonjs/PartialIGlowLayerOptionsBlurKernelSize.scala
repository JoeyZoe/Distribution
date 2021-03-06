package typings.babylonjs

import typings.babylonjs.BABYLON.Camera
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IGlowLayerOptions> */
trait PartialIGlowLayerOptionsBlurKernelSize extends js.Object {
  var blurKernelSize: js.UndefOr[Double] = js.undefined
  var camera: js.UndefOr[Nullable[Camera]] = js.undefined
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  var mainTextureRatio: js.UndefOr[Double] = js.undefined
  var mainTextureSamples: js.UndefOr[Double] = js.undefined
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}

object PartialIGlowLayerOptionsBlurKernelSize {
  @scala.inline
  def apply(
    blurKernelSize: Int | Double = null,
    camera: Nullable[Camera] = null,
    mainTextureFixedSize: Int | Double = null,
    mainTextureRatio: Int | Double = null,
    mainTextureSamples: Int | Double = null,
    renderingGroupId: Int | Double = null
  ): PartialIGlowLayerOptionsBlurKernelSize = {
    val __obj = js.Dynamic.literal()
    if (blurKernelSize != null) __obj.updateDynamic("blurKernelSize")(blurKernelSize.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (mainTextureFixedSize != null) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.asInstanceOf[js.Any])
    if (mainTextureRatio != null) __obj.updateDynamic("mainTextureRatio")(mainTextureRatio.asInstanceOf[js.Any])
    if (mainTextureSamples != null) __obj.updateDynamic("mainTextureSamples")(mainTextureSamples.asInstanceOf[js.Any])
    if (renderingGroupId != null) __obj.updateDynamic("renderingGroupId")(renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIGlowLayerOptionsBlurKernelSize]
  }
}

