package typings.pixiJs.mod

import typings.pixiJs.AnonPluginName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@JSImport("pixi.js", "MeshMaterial")
@js.native
class MeshMaterial protected ()
  extends typings.pixiJs.PIXI.MeshMaterial {
  def this(uSampler: typings.pixiJs.PIXI.Texture) = this()
  def this(uSampler: typings.pixiJs.PIXI.Texture, options: AnonPluginName) = this()
}

