package typings.antDesignIcons.antdIconMod

import typings.antDesignIcons.twoTonePrimaryColorMod.TwoToneColor
import typings.antDesignIconsSvg.typesMod.IconDefinition
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconComponentProps extends AntdIconProps {
  var icon: IconDefinition
}

object IconComponentProps {
  @scala.inline
  def apply(
    icon: IconDefinition,
    children: ReactNode = null,
    className: String = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement] => Unit = null,
    role: String = null,
    rotate: Int | Double = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    title: String = null,
    twoToneColor: TwoToneColor = null
  ): IconComponentProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (twoToneColor != null) __obj.updateDynamic("twoToneColor")(twoToneColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconComponentProps]
  }
}

