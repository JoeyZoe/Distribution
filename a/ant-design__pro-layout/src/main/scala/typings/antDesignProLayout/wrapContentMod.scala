package typings.antDesignProLayout

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/WrapContent", JSImport.Namespace)
@js.native
object wrapContentMod extends js.Object {
  @js.native
  trait ResizeObserverContent
    extends Component[AnonChildren, AnonContentHeight, js.Any] {
    var resize: js.Any = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizeObserverContent(): Unit = js.native
  }
  
  @js.native
  class default () extends ResizeObserverContent
  
}

