package typings.debounceFn.mod

import typings.debounceFn.debounceFnBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOptions extends Options {
  @JSName("before")
  val before_BeforeOptions: `true`
}

object BeforeOptions {
  @scala.inline
  def apply(before: `true`, after: js.UndefOr[Boolean] = js.undefined, wait: Int | Double = null): BeforeOptions = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    if (!js.isUndefined(after)) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeOptions]
  }
}

