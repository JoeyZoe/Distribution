package typings.babylonjs.mod

import typings.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends typings.babylonjs.legacyMod.BoundingInfo {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    */
  def this(
    minimum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    maximum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ) = this()
  def this(
    minimum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    maximum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    worldMatrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ) = this()
}

/* static members */
@JSImport("babylonjs", "BoundingInfo")
@js.native
object BoundingInfo extends js.Object {
  val TmpVector3: js.Any = js.native
}

