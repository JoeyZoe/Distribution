package typings.prompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var title: String
  var value: js.Any
}

object Choice {
  @scala.inline
  def apply(
    title: String,
    value: js.Any,
    description: String = null,
    disable: js.UndefOr[Boolean] = js.undefined
  ): Choice = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choice]
  }
}

