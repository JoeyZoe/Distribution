package typings.babylonjs

import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/Builders/discBuilder", JSImport.Namespace)
@js.native
object discBuilderMod extends js.Object {
  @js.native
  class DiscBuilder () extends js.Object
  
  /* static members */
  @js.native
  object DiscBuilder extends js.Object {
    /**
      * Creates a plane polygonal mesh.  By default, this is a disc
      * * The parameter `radius` sets the radius size (float) of the polygon (default 0.5)
      * * The parameter `tessellation` sets the number of polygon sides (positive integer, default 64). So a tessellation valued to 3 will build a triangle, to 4 a square, etc
      * * You can create an unclosed polygon with the parameter `arc` (positive float, default 1), valued between 0 and 1, what is the ratio of the circumference : 2 x PI x ratio
      * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
      * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
      * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
      * @param name defines the name of the mesh
      * @param options defines the options used to create the mesh
      * @param scene defines the hosting scene
      * @returns the plane polygonal mesh
      * @see https://doc.babylonjs.com/how_to/set_shapes#disc-or-regular-polygon
      */
    def CreateDisc(name: String, options: AnonTessellation): Mesh = js.native
    def CreateDisc(name: String, options: AnonTessellation, scene: Nullable[Scene]): Mesh = js.native
  }
  
}

