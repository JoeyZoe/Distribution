package typings.fsExtra.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "readJSON")
@js.native
object readJSON_ extends js.Object {
  def apply(file: String): js.Promise[_] = js.native
  def apply(file: String, callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  def apply(file: String, options: ReadOptions): js.Promise[_] = js.native
  def apply(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
}

