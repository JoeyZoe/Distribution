package typings.rollup

import typings.rollup.mod.RollupError
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends RollupWatcherEvent {
  var code: ERROR
  var error: RollupError
}

object AnonError {
  @scala.inline
  def apply(code: ERROR, error: RollupError): AnonError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

