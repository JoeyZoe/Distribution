package typings.babylonjs.mod

import typings.babylonjs.physicsJointMod.PhysicsJointData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "HingeJoint")
@js.native
class HingeJoint protected ()
  extends typings.babylonjs.legacyMod.HingeJoint {
  /**
    * Initializes the Hinge-Joint
    * @param jointData The joint data for the Hinge-Joint
    */
  def this(jointData: PhysicsJointData) = this()
}

