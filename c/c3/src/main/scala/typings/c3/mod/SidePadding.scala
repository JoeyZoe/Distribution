package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidePadding extends js.Object {
  /** Left padding. */
  var left: js.UndefOr[Double] = js.undefined
  /** Right padding. */
  var right: js.UndefOr[Double] = js.undefined
}

object SidePadding {
  @scala.inline
  def apply(left: Int | Double = null, right: Int | Double = null): SidePadding = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidePadding]
  }
}

