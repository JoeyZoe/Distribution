package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "AndOrNotEvaluator")
@js.native
class AndOrNotEvaluator ()
  extends typings.babylonjs.legacyMod.AndOrNotEvaluator

/* static members */
@JSImport("babylonjs", "AndOrNotEvaluator")
@js.native
object AndOrNotEvaluator extends js.Object {
  var _HandleParenthesisContent: js.Any = js.native
  var _SimplifyNegation: js.Any = js.native
  /**
    * Evaluate a query
    * @param query defines the query to evaluate
    * @param evaluateCallback defines the callback used to filter result
    * @returns true if the query matches
    */
  def Eval(query: String, evaluateCallback: js.Function1[/* val */ js.Any, Boolean]): Boolean = js.native
}

