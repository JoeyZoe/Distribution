package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivatingEventUIParam extends js.Object {
  /**
  	 * Used to get reference to this igToolbarButton.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ActivatingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ActivatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatingEventUIParam]
  }
}

