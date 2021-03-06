package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notConfigured
  - typings.microsoftGraph.microsoftGraphStrings.disabled
  - typings.microsoftGraph.microsoftGraphStrings.enabled
*/
trait WindowsSpotlightEnablementSettings extends js.Object

object WindowsSpotlightEnablementSettings {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def enabled: typings.microsoftGraph.microsoftGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def notConfigured: typings.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
}

