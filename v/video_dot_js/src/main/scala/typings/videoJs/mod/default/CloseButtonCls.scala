package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.CloseButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "CloseButton")
@js.native
class CloseButtonCls protected ()
  extends typings.videoJs.mod.videojs.CloseButton {
  /**
    * Creates an instance of the this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: CloseButtonOptions) = this()
}

