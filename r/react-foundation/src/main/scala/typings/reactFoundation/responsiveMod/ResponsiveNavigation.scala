package typings.reactFoundation.responsiveMod

import typings.react.mod.Component
import typings.reactFoundation.AnonAlignX
import typings.reactFoundation.AnonBreakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-foundation/components/responsive", "ResponsiveNavigation")
@js.native
class ResponsiveNavigation ()
  extends Component[ResponsiveNavigationProps, ResponsiveNavigationState, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MResponsiveNavigation(): Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MResponsiveNavigation(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResponsiveNavigation(): Unit = js.native
  /**
    * Called when the menu icon is clicked.
    */
  def toggle(): Unit = js.native
  /**
    * Updates the state of this component.
    * While this might seem like a sub-optimal solution, it is actually the only solution.
    * Using 'hide' and 'show' -classes won't work because they set display with `!important`.
    */
  def update(): Unit = js.native
}

/* static members */
@JSImport("react-foundation/components/responsive", "ResponsiveNavigation")
@js.native
object ResponsiveNavigation extends js.Object {
  var defaultProps: AnonBreakpoint = js.native
  var propTypes: AnonAlignX = js.native
}

