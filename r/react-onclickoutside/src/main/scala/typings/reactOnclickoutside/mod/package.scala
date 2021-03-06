package typings.reactOnclickoutside

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[P] = typings.react.mod.ComponentType[P]
  type OnClickOutProps[P] = typings.reactOnclickoutside.mod.WithoutInjectedClickOutProps[P] with typings.reactOnclickoutside.mod.AdditionalProps
  type PropsOf[T] = js.Any
  type WithoutInjectedClickOutProps[P] = typings.std.Pick[P, typings.std.Exclude[java.lang.String, java.lang.String]]
}
