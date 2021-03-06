package typings.firefoxWebextBrowser.browser.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of
  *
  * *   `not_controllable`: cannot be controlled by any extension
  * *   `controlled_by_other_extensions`: controlled by extensions with higher precedence
  * *   `controllable_by_this_extension`: can be controlled by this extension
  * *   `controlled_by_this_extension`: controlled by this extension
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension
*/
trait LevelOfControl extends js.Object

object LevelOfControl {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controllable_by_this_extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension = this.cast("controllable_by_this_extension")
  @scala.inline
  def controlled_by_other_extensions: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions = this.cast("controlled_by_other_extensions")
  @scala.inline
  def controlled_by_this_extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension = this.cast("controlled_by_this_extension")
  @scala.inline
  def not_controllable: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable = this.cast("not_controllable")
}

