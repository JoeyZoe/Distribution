package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The reason that this event is being dispatched. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.install
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_update
*/
trait OnInstalledReason extends js.Object

object OnInstalledReason {
  @scala.inline
  def browser_update: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_update = this.cast("browser_update")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def install: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.install = this.cast("install")
  @scala.inline
  def update: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.update = this.cast("update")
}

