package typings.devextreme

import typings.devextreme.devextremeStrings.close
import typings.devextreme.devextremeStrings.high
import typings.devextreme.devextremeStrings.low
import typings.devextreme.devextremeStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorLevel extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[close | high | low | open] = js.undefined
}

object AnonColorLevel {
  @scala.inline
  def apply(color: String = null, level: close | high | low | open = null): AnonColorLevel = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorLevel]
  }
}

