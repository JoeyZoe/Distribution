package typings.angularIdle.mod.idle

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure the Title service.
  */
trait ITitleProvider extends IServiceProvider {
  /**
    * Enables or disables the Title functionality.
    *
    * @param enabled Boolean, default is true.
    */
  def enabled(enabled: Boolean): Unit
}

object ITitleProvider {
  @scala.inline
  def apply($get: js.Any, enabled: Boolean => Unit): ITitleProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], enabled = js.Any.fromFunction1(enabled))
  
    __obj.asInstanceOf[ITitleProvider]
  }
}

