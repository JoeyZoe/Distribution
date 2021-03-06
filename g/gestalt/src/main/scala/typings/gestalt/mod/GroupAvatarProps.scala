package typings.gestalt.mod

import typings.gestalt.AnonName
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupAvatarProps extends js.Object {
  var collaborators: js.Array[AnonName]
  var outline: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[sm | md | lg] = js.undefined
}

object GroupAvatarProps {
  @scala.inline
  def apply(
    collaborators: js.Array[AnonName],
    outline: js.UndefOr[Boolean] = js.undefined,
    size: sm | md | lg = null
  ): GroupAvatarProps = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupAvatarProps]
  }
}

