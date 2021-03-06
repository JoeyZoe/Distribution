package typings.babylonjs.spriteMapMod

import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpriteMapOptions extends js.Object {
  /**
    * number cell index of the base tile when the system compiles.
    */
  var baseTile: js.UndefOr[Double] = js.undefined
  /**
    * Vector3 scalar of the global RGB values of the SpriteMap.
    */
  var colorMultiply: js.UndefOr[Vector3] = js.undefined
  /**
    * boolean flip the sprite after its been repositioned by the framing data.
    */
  var flipU: js.UndefOr[Boolean] = js.undefined
  /**
    * number of layers that the system will reserve in resources.
    */
  var layerCount: js.UndefOr[Double] = js.undefined
  /**
    * number of max animation frames a single cell will reserve in resources.
    */
  var maxAnimationFrames: js.UndefOr[Double] = js.undefined
  /**
    * Vector3 of the position of the output plane in World Units.
    */
  var outputPosition: js.UndefOr[Vector3] = js.undefined
  /**
    * Vector3 of the rotation of the output plane.
    */
  var outputRotation: js.UndefOr[Vector3] = js.undefined
  /**
    * Vector2 of the size of the output plane in World Units.
    */
  var outputSize: js.UndefOr[Vector2] = js.undefined
  /**
    * Vector2 of the number of cells in the grid.
    */
  var stageSize: js.UndefOr[Vector2] = js.undefined
}

object ISpriteMapOptions {
  @scala.inline
  def apply(
    baseTile: Int | Double = null,
    colorMultiply: Vector3 = null,
    flipU: js.UndefOr[Boolean] = js.undefined,
    layerCount: Int | Double = null,
    maxAnimationFrames: Int | Double = null,
    outputPosition: Vector3 = null,
    outputRotation: Vector3 = null,
    outputSize: Vector2 = null,
    stageSize: Vector2 = null
  ): ISpriteMapOptions = {
    val __obj = js.Dynamic.literal()
    if (baseTile != null) __obj.updateDynamic("baseTile")(baseTile.asInstanceOf[js.Any])
    if (colorMultiply != null) __obj.updateDynamic("colorMultiply")(colorMultiply.asInstanceOf[js.Any])
    if (!js.isUndefined(flipU)) __obj.updateDynamic("flipU")(flipU.asInstanceOf[js.Any])
    if (layerCount != null) __obj.updateDynamic("layerCount")(layerCount.asInstanceOf[js.Any])
    if (maxAnimationFrames != null) __obj.updateDynamic("maxAnimationFrames")(maxAnimationFrames.asInstanceOf[js.Any])
    if (outputPosition != null) __obj.updateDynamic("outputPosition")(outputPosition.asInstanceOf[js.Any])
    if (outputRotation != null) __obj.updateDynamic("outputRotation")(outputRotation.asInstanceOf[js.Any])
    if (outputSize != null) __obj.updateDynamic("outputSize")(outputSize.asInstanceOf[js.Any])
    if (stageSize != null) __obj.updateDynamic("stageSize")(stageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteMapOptions]
  }
}

