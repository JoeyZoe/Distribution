package typings.cypressCucumberPreprocessor.stepsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress-cucumber-preprocessor/steps", "given")
@js.native
object given extends js.Object {
  def apply(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def apply(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

