package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "takeWhile")
@js.native
object takeWhile extends js.Object {
  /**
  	 * Returns a parser yield a string containing all the next characters that pass the predicate
  	 */
  def apply(predicate: js.Function1[/* char */ String, Boolean]): Parser[String] = js.native
}

