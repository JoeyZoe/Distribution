package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliOss.aliOssStrings.Enabled
  - typings.aliOss.aliOssStrings.Disabled
*/
trait RuleStatusType extends js.Object

object RuleStatusType {
  @scala.inline
  def Disabled: typings.aliOss.aliOssStrings.Disabled = this.cast("Disabled")
  @scala.inline
  def Enabled: typings.aliOss.aliOssStrings.Enabled = this.cast("Enabled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

