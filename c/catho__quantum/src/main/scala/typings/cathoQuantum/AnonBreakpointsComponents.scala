package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreakpointsComponents extends js.Object {
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  var components: js.UndefOr[js.Object] = js.undefined
}

object AnonBreakpointsComponents {
  @scala.inline
  def apply(breakpoints: js.Object = null, components: js.Object = null): AnonBreakpointsComponents = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreakpointsComponents]
  }
}

