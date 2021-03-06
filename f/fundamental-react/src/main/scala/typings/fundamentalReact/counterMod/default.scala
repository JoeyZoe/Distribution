package typings.fundamentalReact.counterMod

import typings.fundamentalReact.PartialCounterProps
import typings.fundamentalReact.WeakValidationMapCounterP
import typings.fundamentalReact.fundamentalReactStrings.Counter
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Counter/Counter", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialCounterProps] = js.native
  var displayName: js.UndefOr[Counter | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapCounterP] = js.native
  def apply(props: PropsWithChildren[CounterProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[CounterProps], context: js.Any): ReactElement | Null = js.native
}

