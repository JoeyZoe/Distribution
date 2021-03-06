package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopActionPayload extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  // n: the number of routes to pop of the stack
  var n: js.UndefOr[Double] = js.undefined
  var prune: js.UndefOr[Boolean] = js.undefined
}

object NavigationPopActionPayload {
  @scala.inline
  def apply(
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    n: Int | Double = null,
    prune: js.UndefOr[Boolean] = js.undefined
  ): NavigationPopActionPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (!js.isUndefined(prune)) __obj.updateDynamic("prune")(prune.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopActionPayload]
  }
}

