package typings.web3CoreHelpers.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionRevertInstructionError extends Error {
  var reason: String
  var signature: String
}

object TransactionRevertInstructionError {
  @scala.inline
  def apply(message: String, name: String, reason: String, signature: String, stack: String = null): TransactionRevertInstructionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRevertInstructionError]
  }
}

