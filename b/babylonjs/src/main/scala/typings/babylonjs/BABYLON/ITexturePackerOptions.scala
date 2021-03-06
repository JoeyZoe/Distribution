package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITexturePackerOptions extends js.Object {
  /**
    * number of columns if using custom column count layout(2).  This defaults to 4.
    */
  var colnum: js.UndefOr[Double] = js.undefined
  /**
    * string value representing the context fill style color.  Defaults to 'black'.
    */
  var customFillColor: js.UndefOr[String] = js.undefined
  /**
    * boolean flag to dispose all the source textures.  Defaults to true.
    */
  var disposeSources: js.UndefOr[Boolean] = js.undefined
  /**
    * Fills the blank cells in a set to the customFillColor.  Defaults to true.
    */
  var fillBlanks: js.UndefOr[Boolean] = js.undefined
  /**
    * Width and Height Value of each Frame in the TexturePacker Sets
    */
  var frameSize: js.UndefOr[Double] = js.undefined
  /**
    * number representing the layout style. Defaults to LAYOUT_STRIP
    */
  var layout: js.UndefOr[Double] = js.undefined
  /**
    * Custom targets for the channels of a texture packer.  Default is all the channels of the Standard Material
    */
  var map: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If in SUBUV_COLOR padding mode what color to use.
    */
  var paddingColor: js.UndefOr[Color3 | Color4] = js.undefined
  /**
    * Number that declares the fill method for the padding gutter.
    */
  var paddingMode: js.UndefOr[Double] = js.undefined
  /**
    * Ratio of the value to add padding wise to each cell.  Defaults to 0.0115
    */
  var paddingRatio: js.UndefOr[Double] = js.undefined
  /**
    * flag to update the input meshes to the new packed texture after compilation. Defaults to true.
    */
  var updateInputMeshes: js.UndefOr[Boolean] = js.undefined
  /**
    * the UV input targets, as a single value for all meshes. Defaults to VertexBuffer.UVKind
    */
  var uvsIn: js.UndefOr[String] = js.undefined
  /**
    * the UV output targets, as a single value for all meshes.  Defaults to VertexBuffer.UVKind
    */
  var uvsOut: js.UndefOr[String] = js.undefined
}

object ITexturePackerOptions {
  @scala.inline
  def apply(
    colnum: Int | Double = null,
    customFillColor: String = null,
    disposeSources: js.UndefOr[Boolean] = js.undefined,
    fillBlanks: js.UndefOr[Boolean] = js.undefined,
    frameSize: Int | Double = null,
    layout: Int | Double = null,
    map: js.Array[String] = null,
    paddingColor: Color3 | Color4 = null,
    paddingMode: Int | Double = null,
    paddingRatio: Int | Double = null,
    updateInputMeshes: js.UndefOr[Boolean] = js.undefined,
    uvsIn: String = null,
    uvsOut: String = null
  ): ITexturePackerOptions = {
    val __obj = js.Dynamic.literal()
    if (colnum != null) __obj.updateDynamic("colnum")(colnum.asInstanceOf[js.Any])
    if (customFillColor != null) __obj.updateDynamic("customFillColor")(customFillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(disposeSources)) __obj.updateDynamic("disposeSources")(disposeSources.asInstanceOf[js.Any])
    if (!js.isUndefined(fillBlanks)) __obj.updateDynamic("fillBlanks")(fillBlanks.asInstanceOf[js.Any])
    if (frameSize != null) __obj.updateDynamic("frameSize")(frameSize.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (paddingColor != null) __obj.updateDynamic("paddingColor")(paddingColor.asInstanceOf[js.Any])
    if (paddingMode != null) __obj.updateDynamic("paddingMode")(paddingMode.asInstanceOf[js.Any])
    if (paddingRatio != null) __obj.updateDynamic("paddingRatio")(paddingRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(updateInputMeshes)) __obj.updateDynamic("updateInputMeshes")(updateInputMeshes.asInstanceOf[js.Any])
    if (uvsIn != null) __obj.updateDynamic("uvsIn")(uvsIn.asInstanceOf[js.Any])
    if (uvsOut != null) __obj.updateDynamic("uvsOut")(uvsOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITexturePackerOptions]
  }
}

