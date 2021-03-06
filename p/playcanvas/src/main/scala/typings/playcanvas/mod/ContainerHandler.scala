package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ContainerHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Loads files that contain in them multiple resources. For example GLB files which can contain
  * textures, models and animations.
  * @param {pc.GraphicsDevice} device - The graphics device that will be rendering.
  * @param {pc.StandardMaterial} defaultMaterial - The shared default material that is used in any place that a material is not specified.
  */
@JSImport("playcanvas", "ContainerHandler")
@js.native
class ContainerHandler protected ()
  extends typings.playcanvas.pc.ContainerHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    defaultMaterial: typings.playcanvas.pc.StandardMaterial
  ) = this()
}

