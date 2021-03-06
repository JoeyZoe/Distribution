package typings.storybookComponents.buttonButtonMod

import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.storybookComponents.AnonIsLink
import typings.storybookComponents.PartialButtonPropsRefAttr
import typings.storybookComponents.WeakValidationMapButtonPr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/Button/Button", "Button")
@js.native
object Button extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[AnonIsLink | PartialButtonPropsRefAttr] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ButtonProps with RefAttributes[_]): ReactElement | Null = js.native
}

