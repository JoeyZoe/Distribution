package typings.antd.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.info
  - typings.antd.antdStrings.success
  - typings.antd.antdStrings.error
  - typings.antd.antdStrings.warning
  - typings.antd.antdStrings.loading
*/
trait NoticeType extends js.Object

object NoticeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.antd.antdStrings.error = this.cast("error")
  @scala.inline
  def info: typings.antd.antdStrings.info = this.cast("info")
  @scala.inline
  def loading: typings.antd.antdStrings.loading = this.cast("loading")
  @scala.inline
  def success: typings.antd.antdStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.antd.antdStrings.warning = this.cast("warning")
}

