package typings.yog2Kernel

import typings.bodyParser.mod.OptionsText
import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOptions extends js.Object {
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsText): NextHandleFunction = js.native
}

