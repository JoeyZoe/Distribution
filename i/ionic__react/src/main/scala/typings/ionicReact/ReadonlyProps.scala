package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.componentsMod._Global_.HTMLIonBackButtonElement
import typings.ionicCore.mod.Color
import typings.ionicReact.ionicReactStrings.button
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.ionicReact.ionicReactStrings.reset
import typings.ionicReact.ionicReactStrings.submit
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@ionic/react.@ionic/react/dist/types/components/navigation/IonBackButton.Props> */
trait ReadonlyProps extends js.Object {
  val `class`: js.UndefOr[String] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val color: js.UndefOr[Color] = js.undefined
  val defaultHref: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val icon: js.UndefOr[AnonIos | String] = js.undefined
  val mode: js.UndefOr[ios | md] = js.undefined
  val ref: js.UndefOr[RefObject[HTMLIonBackButtonElement]] = js.undefined
  val style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  val text: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[submit | reset | button] = js.undefined
}

object ReadonlyProps {
  @scala.inline
  def apply(
    `class`: String = null,
    className: String = null,
    color: Color = null,
    defaultHref: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: AnonIos | String = null,
    mode: ios | md = null,
    ref: RefObject[HTMLIonBackButtonElement] = null,
    style: StringDictionary[js.Any] = null,
    text: String = null,
    `type`: submit | reset | button = null
  ): ReadonlyProps = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (defaultHref != null) __obj.updateDynamic("defaultHref")(defaultHref.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProps]
  }
}

