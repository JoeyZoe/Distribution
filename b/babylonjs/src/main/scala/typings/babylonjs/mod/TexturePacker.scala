package typings.babylonjs.mod

import typings.babylonjs.packerMod.ITexturePackerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "TexturePacker")
@js.native
class TexturePacker protected ()
  extends typings.babylonjs.legacyMod.TexturePacker {
  /**
    * Initializes a texture package series from an array of meshes or a single mesh.
    * @param name The name of the package
    * @param meshes The target meshes to compose the package from
    * @param options The arguments that texture packer should follow while building.
    * @param scene The scene which the textures are scoped to.
    * @returns TexturePacker
    */
  def this(
    name: String,
    meshes: js.Array[typings.babylonjs.abstractMeshMod.AbstractMesh],
    options: ITexturePackerOptions,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}

/* static members */
@JSImport("babylonjs", "TexturePacker")
@js.native
object TexturePacker extends js.Object {
  /** Packer Layout Constant 2 */
  val LAYOUT_COLNUM: Double = js.native
  /** Packer Layout Constant 1 */
  val LAYOUT_POWER2: Double = js.native
  /** Packer Layout Constant 0 */
  val LAYOUT_STRIP: Double = js.native
  /** Packer Layout Constant 2 */
  val SUBUV_COLOR: Double = js.native
  /** Packer Layout Constant 1 */
  val SUBUV_EXTEND: Double = js.native
  /** Packer Layout Constant 0 */
  val SUBUV_WRAP: Double = js.native
}

