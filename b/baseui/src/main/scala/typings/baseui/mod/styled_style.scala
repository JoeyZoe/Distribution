package typings.baseui.mod

import typings.baseui.AnonClassName
import typings.baseui.AnonTheme
import typings.baseui.baseuiStrings.style
import typings.react.mod.ComponentProps
import typings.std.Exclude
import typings.std.Pick
import typings.styletronReact.mod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled_style extends js.Object {
  def apply[P /* <: js.Object */, T](component: style, styledFn: js.Function1[/* props */ AnonTheme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[style], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, T](component: style, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[style], Exclude[String, AnonClassName]]) with P] = js.native
}

