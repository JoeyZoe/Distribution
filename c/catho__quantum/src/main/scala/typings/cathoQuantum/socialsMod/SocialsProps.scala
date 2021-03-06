package typings.cathoQuantum.socialsMod

import typings.cathoQuantum.AnonName
import typings.cathoQuantum.AnonSpacingObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialsProps extends js.Object {
  var items: NonEmptyArray[AnonName]
  var size: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[AnonSpacingObject] = js.undefined
  var withBox: js.UndefOr[Boolean] = js.undefined
}

object SocialsProps {
  @scala.inline
  def apply(
    items: NonEmptyArray[AnonName],
    size: String = null,
    theme: AnonSpacingObject = null,
    withBox: js.UndefOr[Boolean] = js.undefined
  ): SocialsProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(withBox)) __obj.updateDynamic("withBox")(withBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialsProps]
  }
}

