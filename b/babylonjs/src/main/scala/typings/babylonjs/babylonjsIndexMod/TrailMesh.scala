package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/index", "TrailMesh")
@js.native
class TrailMesh protected ()
  extends typings.babylonjs.trailMeshMod.TrailMesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param generator The mesh or transform node to generate a trail.
    * @param scene The scene to add this mesh to.
    * @param diameter Diameter of trailing mesh. Default is 1.
    * @param length Length of trailing mesh. Default is 60.
    * @param autoStart Automatically start trailing mesh. Default true.
    */
  def this(name: String, generator: typings.babylonjs.transformNodeMod.TransformNode, scene: Scene) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: Scene,
    diameter: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: Scene,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: Scene,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/Meshes/index", "TrailMesh")
@js.native
object TrailMesh extends js.Object {
  /**
    * Parses a serialized trail mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the trail mesh in
    * @returns the created trail mesh
    */
  def Parse(parsedMesh: js.Any, scene: Scene): typings.babylonjs.trailMeshMod.TrailMesh = js.native
}

