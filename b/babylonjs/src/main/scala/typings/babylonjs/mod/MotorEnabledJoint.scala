package typings.babylonjs.mod

import typings.babylonjs.physicsJointMod.PhysicsJointData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "MotorEnabledJoint")
@js.native
class MotorEnabledJoint protected ()
  extends typings.babylonjs.legacyMod.MotorEnabledJoint {
  /**
    * Initializes the Motor-Enabled Joint
    * @param type The type of the joint
    * @param jointData The physica joint data for the joint
    */
  def this(`type`: Double, jointData: PhysicsJointData) = this()
}

