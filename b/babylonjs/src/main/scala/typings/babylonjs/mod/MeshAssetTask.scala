package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "MeshAssetTask")
@js.native
class MeshAssetTask protected ()
  extends typings.babylonjs.legacyMod.MeshAssetTask {
  /**
    * Creates a new MeshAssetTask
    * @param name defines the name of the task
    * @param meshesNames defines the list of mesh's names you want to load
    * @param rootUrl defines the root url to use as a base to load your meshes and associated resources
    * @param sceneFilename defines the filename of the scene to load from
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the list of mesh's names you want to load
    */
  meshesNames: js.Any,
    /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  rootUrl: String,
    /**
    * Defines the filename of the scene to load from
    */
  sceneFilename: String
  ) = this()
}

