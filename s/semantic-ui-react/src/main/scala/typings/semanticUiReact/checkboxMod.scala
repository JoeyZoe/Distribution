package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.checkboxCheckboxMod.CheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox", JSImport.Namespace)
@js.native
object checkboxMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[CheckboxProps, ComponentState, js.Any] {
    def this(props: CheckboxProps) = this()
    def this(props: CheckboxProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentClass[CheckboxProps, ComponentState]]
  
}

