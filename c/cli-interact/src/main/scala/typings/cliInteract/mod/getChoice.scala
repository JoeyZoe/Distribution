package typings.cliInteract.mod

import typings.cliInteract.ChoiceOptionsreturnNumeri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-interact", "getChoice")
@js.native
object getChoice extends js.Object {
  def apply(title: String, choices: js.Array[String]): String = js.native
  def apply(title: String, choices: js.Array[String], opts: ChoiceOptionsreturnNumeri): Double = js.native
  def apply(title: String, choices: js.Array[String], opts: ChoiceOptions): String = js.native
}

