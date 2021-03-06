package typings.antd

import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.bottomLeft
import typings.antd.antdStrings.bottomRight
import typings.antd.antdStrings.danger
import typings.antd.antdStrings.dashed
import typings.antd.antdStrings.default
import typings.antd.antdStrings.ghost
import typings.antd.antdStrings.left
import typings.antd.antdStrings.leftBottom
import typings.antd.antdStrings.leftTop
import typings.antd.antdStrings.link
import typings.antd.antdStrings.primary
import typings.antd.antdStrings.right
import typings.antd.antdStrings.rightBottom
import typings.antd.antdStrings.rightTop
import typings.antd.antdStrings.top
import typings.antd.antdStrings.topLeft
import typings.antd.antdStrings.topRight
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Boolean
  var icon: Element
  var okType: js.UndefOr[link | default | primary | ghost | dashed | danger] = js.undefined
  var placement: js.UndefOr[
    bottom | left | right | top | topLeft | topRight | bottomLeft | bottomRight | leftTop | leftBottom | rightTop | rightBottom
  ] = js.undefined
  var transitionName: String
  var trigger: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AnonDisabled {
  @scala.inline
  def apply(
    disabled: Boolean,
    icon: Element,
    transitionName: String,
    okType: link | default | primary | ghost | dashed | danger = null,
    placement: bottom | left | right | top | topLeft | topRight | bottomLeft | bottomRight | leftTop | leftBottom | rightTop | rightBottom = null,
    trigger: String | js.Array[String] = null
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}

