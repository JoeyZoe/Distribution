package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CannonJSPlugin")
@js.native
class CannonJSPlugin () extends IPhysicsEnginePlugin {
  def this(_useDeltaForWorldStep: Boolean) = this()
  def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
  def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: js.Any) = this()
  var BJSCANNON: js.Any = js.native
  var _addMaterial: js.Any = js.native
  var _cannonRaycastResult: js.Any = js.native
  var _checkWithEpsilon: js.Any = js.native
  var _createHeightmap: js.Any = js.native
  var _createShape: js.Any = js.native
  var _extendNamespace: js.Any = js.native
  var _fixedTimeStep: js.Any = js.native
  var _minus90X: js.Any = js.native
  var _physicsBodysToRemoveAfterStep: js.Any = js.native
  var _physicsMaterials: js.Any = js.native
  var _plus90X: js.Any = js.native
  var _processChildMeshes: js.Any = js.native
  var _raycastResult: js.Any = js.native
  var _removeMarkedPhysicsBodiesFromWorld: js.Any = js.native
  var _tmpDeltaPosition: js.Any = js.native
  var _tmpPosition: js.Any = js.native
  var _tmpUnityRotation: js.Any = js.native
  var _updatePhysicsBodyTransformation: js.Any = js.native
  var _useDeltaForWorldStep: js.Any = js.native
  def executeStep(delta: Double): Unit = js.native
  def setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
  def setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
  def setMotor(joint: IMotorEnabledJoint): Unit = js.native
}

