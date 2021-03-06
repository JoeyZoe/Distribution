package typings.reactTypingAnimation.mod.Typing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetProperties extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object ResetProperties {
  @scala.inline
  def apply(count: Int | Double = null, delay: Int | Double = null, speed: Int | Double = null): ResetProperties = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetProperties]
  }
}

