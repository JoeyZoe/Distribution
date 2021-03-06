package typings.reactNavigationMaterialBottomTabs

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveColorDark extends js.Object {
  var activeColorDark: js.UndefOr[String] = js.undefined
  var activeColorLight: js.UndefOr[String] = js.undefined
  var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveColorDark: js.UndefOr[String] = js.undefined
  var inactiveColorLight: js.UndefOr[String] = js.undefined
}

object AnonActiveColorDark {
  @scala.inline
  def apply(
    activeColorDark: String = null,
    activeColorLight: String = null,
    barStyleDark: StyleProp[ViewStyle] = null,
    barStyleLight: StyleProp[ViewStyle] = null,
    inactiveColorDark: String = null,
    inactiveColorLight: String = null
  ): AnonActiveColorDark = {
    val __obj = js.Dynamic.literal()
    if (activeColorDark != null) __obj.updateDynamic("activeColorDark")(activeColorDark.asInstanceOf[js.Any])
    if (activeColorLight != null) __obj.updateDynamic("activeColorLight")(activeColorLight.asInstanceOf[js.Any])
    if (barStyleDark != null) __obj.updateDynamic("barStyleDark")(barStyleDark.asInstanceOf[js.Any])
    if (barStyleLight != null) __obj.updateDynamic("barStyleLight")(barStyleLight.asInstanceOf[js.Any])
    if (inactiveColorDark != null) __obj.updateDynamic("inactiveColorDark")(inactiveColorDark.asInstanceOf[js.Any])
    if (inactiveColorLight != null) __obj.updateDynamic("inactiveColorLight")(inactiveColorLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveColorDark]
  }
}

