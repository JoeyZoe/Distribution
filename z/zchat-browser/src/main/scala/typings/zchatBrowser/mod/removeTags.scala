package typings.zchatBrowser.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "removeTags")
@js.native
object removeTags extends js.Object {
  def apply(tags: js.Array[String]): Unit = js.native
  def apply(tags: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

