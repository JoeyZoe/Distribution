package typings.pThrottle.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortErrorClass extends Error {
  @JSName("name")
  val name_AbortErrorClass: typings.pThrottle.pThrottleStrings.AbortError
}

object AbortErrorClass {
  @scala.inline
  def apply(message: String, name: typings.pThrottle.pThrottleStrings.AbortError, stack: String = null): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortErrorClass]
  }
}

