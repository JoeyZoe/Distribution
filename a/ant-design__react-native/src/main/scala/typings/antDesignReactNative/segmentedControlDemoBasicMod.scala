package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/segmented-control/demo/basic", JSImport.Namespace)
@js.native
object segmentedControlDemoBasicMod extends js.Object {
  @js.native
  trait BasicTagExample
    extends Component[js.Any, js.Any, js.Any] {
    def onChange(e: js.Any): Unit = js.native
    def onValueChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends BasicTagExample
  
}

