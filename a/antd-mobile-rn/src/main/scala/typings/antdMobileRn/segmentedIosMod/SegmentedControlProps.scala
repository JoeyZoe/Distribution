package typings.antdMobileRn.segmentedIosMod

import typings.antdMobileRn.segmentedControlPropsTypeMod.SegmentedControlPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps extends SegmentedControlPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ js.Any => Unit = null,
    onValueChange: /* value */ String => Unit = null,
    selectedIndex: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null,
    tintColor: String = null,
    values: js.Array[String] = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

