package typings.reactOnsenui

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.AnimationOptions
import typings.reactOnsenui.reactOnsenuiStrings.ascend
import typings.reactOnsenui.reactOnsenuiStrings.default
import typings.reactOnsenui.reactOnsenuiStrings.fade
import typings.reactOnsenui.reactOnsenuiStrings.fall
import typings.reactOnsenui.reactOnsenuiStrings.lift
import typings.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  isOpen  :boolean,   animation ? :'default' | 'ascend' | 'lift' | 'fall' | 'fade' | 'none',   modifier ? :string,   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   onPreShow ? :(): void,   onPostShow ? :(): void,   onPreHide ? :(): void,   onPostHide ? :(): void,   onDeviceBackButton ? :(): void} */
trait HTMLAttributesidclassNameOnDeviceBackButton extends js.Object {
  var animation: js.UndefOr[default | ascend | lift | fall | fade | none] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isOpen: Boolean
  var modifier: js.UndefOr[String] = js.undefined
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameOnDeviceBackButton {
  @scala.inline
  def apply(
    isOpen: Boolean,
    animation: default | ascend | lift | fall | fade | none = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    id: String = null,
    modifier: String = null,
    onDeviceBackButton: () => Unit = null,
    onPostHide: () => Unit = null,
    onPostShow: () => Unit = null,
    onPreHide: () => Unit = null,
    onPreShow: () => Unit = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameOnDeviceBackButton = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onDeviceBackButton != null) __obj.updateDynamic("onDeviceBackButton")(js.Any.fromFunction0(onDeviceBackButton))
    if (onPostHide != null) __obj.updateDynamic("onPostHide")(js.Any.fromFunction0(onPostHide))
    if (onPostShow != null) __obj.updateDynamic("onPostShow")(js.Any.fromFunction0(onPostShow))
    if (onPreHide != null) __obj.updateDynamic("onPreHide")(js.Any.fromFunction0(onPreHide))
    if (onPreShow != null) __obj.updateDynamic("onPreShow")(js.Any.fromFunction0(onPreShow))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameOnDeviceBackButton]
  }
}

