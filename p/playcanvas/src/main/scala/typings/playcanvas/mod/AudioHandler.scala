package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.AudioHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Sound} resources.
  * @param {pc.SoundManager} manager - The sound manager.
  */
@JSImport("playcanvas", "AudioHandler")
@js.native
class AudioHandler protected ()
  extends typings.playcanvas.pc.AudioHandler {
  def this(manager: typings.playcanvas.pc.SoundManager) = this()
}

