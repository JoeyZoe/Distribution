package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "AnaglyphGamepadCamera")
@js.native
class AnaglyphGamepadCamera protected ()
  extends typings.babylonjs.babylonjsMod.AnaglyphGamepadCamera {
  /**
    * Creates a new AnaglyphGamepadCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    interaxialDistance: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}

