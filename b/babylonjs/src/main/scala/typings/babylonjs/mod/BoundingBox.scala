package typings.babylonjs.mod

import typings.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "BoundingBox")
@js.native
class BoundingBox protected ()
  extends typings.babylonjs.legacyMod.BoundingBox {
  /**
    * Creates a new bounding box
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(
    min: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ) = this()
  def this(
    min: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    worldMatrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ) = this()
}

/* static members */
@JSImport("babylonjs", "BoundingBox")
@js.native
object BoundingBox extends js.Object {
  val TmpVector3: js.Any = js.native
  /**
    * Tests if two bounding boxes are intersections
    * @param box0 defines the first box to test
    * @param box1 defines the second box to test
    * @returns true if there is an intersection
    */
  def Intersects(
    box0: DeepImmutable[typings.babylonjs.boundingBoxMod.BoundingBox],
    box1: DeepImmutable[typings.babylonjs.boundingBoxMod.BoundingBox]
  ): Boolean = js.native
  /**
    * Tests if a bounding box defines by a min/max vectors intersects a sphere
    * @param minPoint defines the minimum vector of the bounding box
    * @param maxPoint defines the maximum vector of the bounding box
    * @param sphereCenter defines the sphere center
    * @param sphereRadius defines the sphere radius
    * @returns true if there is an intersection
    */
  def IntersectsSphere(
    minPoint: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    maxPoint: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    sphereCenter: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    sphereRadius: Double
  ): Boolean = js.native
  /**
    * Tests if a bounding box defined with 8 vectors is entirely inside frustum planes
    * @param boundingVectors defines an array of 8 vectors representing a bounding box
    * @param frustumPlanes defines the frustum planes to test
    * @return true if there is an inclusion
    */
  def IsCompletelyInFrustum(
    boundingVectors: js.Array[DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]],
    frustumPlanes: js.Array[DeepImmutable[typings.babylonjs.mathPlaneMod.Plane]]
  ): Boolean = js.native
  /**
    * Tests if a bounding box defined with 8 vectors intersects frustum planes
    * @param boundingVectors defines an array of 8 vectors representing a bounding box
    * @param frustumPlanes defines the frustum planes to test
    * @return true if there is an intersection
    */
  def IsInFrustum(
    boundingVectors: js.Array[DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]],
    frustumPlanes: js.Array[DeepImmutable[typings.babylonjs.mathPlaneMod.Plane]]
  ): Boolean = js.native
}

