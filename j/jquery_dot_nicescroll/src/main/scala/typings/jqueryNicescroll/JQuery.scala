package typings.jqueryNicescroll

import typings.jqueryNicescroll.JQueryNiceScroll.NiceScroll
import typings.jqueryNicescroll.JQueryNiceScroll.NiceScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def getNiceScroll(): NiceScroll = js.native
  def getNiceScroll(index: Double): NiceScroll = js.native
  def niceScroll(): NiceScroll = js.native
  def niceScroll(options: NiceScrollOptions): NiceScroll = js.native
  def niceScroll(wrapper: String, options: NiceScrollOptions): NiceScroll = js.native
}

