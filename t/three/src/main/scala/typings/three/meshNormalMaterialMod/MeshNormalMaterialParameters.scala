package typings.three.meshNormalMaterialMod

import typings.three.constantsMod.Blending
import typings.three.constantsMod.BlendingDstFactor
import typings.three.constantsMod.BlendingEquation
import typings.three.constantsMod.BlendingSrcFactor
import typings.three.constantsMod.DepthModes
import typings.three.constantsMod.NormalMapTypes
import typings.three.constantsMod.Side
import typings.three.constantsMod.StencilFunc
import typings.three.constantsMod.StencilOp
import typings.three.materialMod.MaterialParameters
import typings.three.planeMod.Plane
import typings.three.textureMod.Texture
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshNormalMaterialParameters extends MaterialParameters {
  var bumpMap: js.UndefOr[Texture | Null] = js.undefined
  var bumpScale: js.UndefOr[Double] = js.undefined
  var displacementBias: js.UndefOr[Double] = js.undefined
  var displacementMap: js.UndefOr[Texture | Null] = js.undefined
  var displacementScale: js.UndefOr[Double] = js.undefined
  var morphNormals: js.UndefOr[Boolean] = js.undefined
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  var normalMap: js.UndefOr[Texture | Null] = js.undefined
  var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
  var normalScale: js.UndefOr[Vector2] = js.undefined
  var skinning: js.UndefOr[Boolean] = js.undefined
  var wireframe: js.UndefOr[Boolean] = js.undefined
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}

object MeshNormalMaterialParameters {
  @scala.inline
  def apply(
    alphaTest: Int | Double = null,
    blendDst: BlendingDstFactor = null,
    blendDstAlpha: Int | Double = null,
    blendEquation: BlendingEquation = null,
    blendEquationAlpha: Int | Double = null,
    blendSrc: BlendingSrcFactor | BlendingDstFactor = null,
    blendSrcAlpha: Int | Double = null,
    blending: Blending = null,
    bumpMap: Texture = null,
    bumpScale: Int | Double = null,
    clipIntersection: js.UndefOr[Boolean] = js.undefined,
    clipShadows: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: js.Array[Plane] = null,
    colorWrite: js.UndefOr[Boolean] = js.undefined,
    defines: js.Any = null,
    depthFunc: DepthModes = null,
    depthTest: js.UndefOr[Boolean] = js.undefined,
    depthWrite: js.UndefOr[Boolean] = js.undefined,
    displacementBias: Int | Double = null,
    displacementMap: Texture = null,
    displacementScale: Int | Double = null,
    dithering: js.UndefOr[Boolean] = js.undefined,
    flatShading: js.UndefOr[Boolean] = js.undefined,
    fog: js.UndefOr[Boolean] = js.undefined,
    morphNormals: js.UndefOr[Boolean] = js.undefined,
    morphTargets: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    normalMap: Texture = null,
    normalMapType: NormalMapTypes = null,
    normalScale: Vector2 = null,
    opacity: Int | Double = null,
    polygonOffset: js.UndefOr[Boolean] = js.undefined,
    polygonOffsetFactor: Int | Double = null,
    polygonOffsetUnits: Int | Double = null,
    precision: highp | mediump | lowp = null,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    shadowSide: Side = null,
    side: Side = null,
    skinning: js.UndefOr[Boolean] = js.undefined,
    stencilFail: StencilOp = null,
    stencilFunc: StencilFunc = null,
    stencilMask: Int | Double = null,
    stencilRef: Int | Double = null,
    stencilWrite: js.UndefOr[Boolean] = js.undefined,
    stencilZFail: StencilOp = null,
    stencilZPass: StencilOp = null,
    toneMapped: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    vertexColors: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    wireframe: js.UndefOr[Boolean] = js.undefined,
    wireframeLinewidth: Int | Double = null
  ): MeshNormalMaterialParameters = {
    val __obj = js.Dynamic.literal()
    if (alphaTest != null) __obj.updateDynamic("alphaTest")(alphaTest.asInstanceOf[js.Any])
    if (blendDst != null) __obj.updateDynamic("blendDst")(blendDst.asInstanceOf[js.Any])
    if (blendDstAlpha != null) __obj.updateDynamic("blendDstAlpha")(blendDstAlpha.asInstanceOf[js.Any])
    if (blendEquation != null) __obj.updateDynamic("blendEquation")(blendEquation.asInstanceOf[js.Any])
    if (blendEquationAlpha != null) __obj.updateDynamic("blendEquationAlpha")(blendEquationAlpha.asInstanceOf[js.Any])
    if (blendSrc != null) __obj.updateDynamic("blendSrc")(blendSrc.asInstanceOf[js.Any])
    if (blendSrcAlpha != null) __obj.updateDynamic("blendSrcAlpha")(blendSrcAlpha.asInstanceOf[js.Any])
    if (blending != null) __obj.updateDynamic("blending")(blending.asInstanceOf[js.Any])
    if (bumpMap != null) __obj.updateDynamic("bumpMap")(bumpMap.asInstanceOf[js.Any])
    if (bumpScale != null) __obj.updateDynamic("bumpScale")(bumpScale.asInstanceOf[js.Any])
    if (!js.isUndefined(clipIntersection)) __obj.updateDynamic("clipIntersection")(clipIntersection.asInstanceOf[js.Any])
    if (!js.isUndefined(clipShadows)) __obj.updateDynamic("clipShadows")(clipShadows.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite.asInstanceOf[js.Any])
    if (defines != null) __obj.updateDynamic("defines")(defines.asInstanceOf[js.Any])
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest.asInstanceOf[js.Any])
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite.asInstanceOf[js.Any])
    if (displacementBias != null) __obj.updateDynamic("displacementBias")(displacementBias.asInstanceOf[js.Any])
    if (displacementMap != null) __obj.updateDynamic("displacementMap")(displacementMap.asInstanceOf[js.Any])
    if (displacementScale != null) __obj.updateDynamic("displacementScale")(displacementScale.asInstanceOf[js.Any])
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering.asInstanceOf[js.Any])
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading.asInstanceOf[js.Any])
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog.asInstanceOf[js.Any])
    if (!js.isUndefined(morphNormals)) __obj.updateDynamic("morphNormals")(morphNormals.asInstanceOf[js.Any])
    if (!js.isUndefined(morphTargets)) __obj.updateDynamic("morphTargets")(morphTargets.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap.asInstanceOf[js.Any])
    if (normalMapType != null) __obj.updateDynamic("normalMapType")(normalMapType.asInstanceOf[js.Any])
    if (normalScale != null) __obj.updateDynamic("normalScale")(normalScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffset)) __obj.updateDynamic("polygonOffset")(polygonOffset.asInstanceOf[js.Any])
    if (polygonOffsetFactor != null) __obj.updateDynamic("polygonOffsetFactor")(polygonOffsetFactor.asInstanceOf[js.Any])
    if (polygonOffsetUnits != null) __obj.updateDynamic("polygonOffsetUnits")(polygonOffsetUnits.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha.asInstanceOf[js.Any])
    if (shadowSide != null) __obj.updateDynamic("shadowSide")(shadowSide.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(skinning)) __obj.updateDynamic("skinning")(skinning.asInstanceOf[js.Any])
    if (stencilFail != null) __obj.updateDynamic("stencilFail")(stencilFail.asInstanceOf[js.Any])
    if (stencilFunc != null) __obj.updateDynamic("stencilFunc")(stencilFunc.asInstanceOf[js.Any])
    if (stencilMask != null) __obj.updateDynamic("stencilMask")(stencilMask.asInstanceOf[js.Any])
    if (stencilRef != null) __obj.updateDynamic("stencilRef")(stencilRef.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilWrite)) __obj.updateDynamic("stencilWrite")(stencilWrite.asInstanceOf[js.Any])
    if (stencilZFail != null) __obj.updateDynamic("stencilZFail")(stencilZFail.asInstanceOf[js.Any])
    if (stencilZPass != null) __obj.updateDynamic("stencilZPass")(stencilZPass.asInstanceOf[js.Any])
    if (!js.isUndefined(toneMapped)) __obj.updateDynamic("toneMapped")(toneMapped.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (!js.isUndefined(vertexColors)) __obj.updateDynamic("vertexColors")(vertexColors.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(wireframe)) __obj.updateDynamic("wireframe")(wireframe.asInstanceOf[js.Any])
    if (wireframeLinewidth != null) __obj.updateDynamic("wireframeLinewidth")(wireframeLinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshNormalMaterialParameters]
  }
}

