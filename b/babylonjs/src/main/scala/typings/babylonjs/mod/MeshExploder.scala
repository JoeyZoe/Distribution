package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "MeshExploder")
@js.native
class MeshExploder protected ()
  extends typings.babylonjs.legacyMod.MeshExploder {
  /**
    * Explodes meshes from a center mesh.
    * @param meshes The meshes to explode.
    * @param centerMesh The mesh to be center of explosion.
    */
  def this(meshes: js.Array[typings.babylonjs.meshMod.Mesh]) = this()
  def this(meshes: js.Array[typings.babylonjs.meshMod.Mesh], centerMesh: typings.babylonjs.meshMod.Mesh) = this()
}

