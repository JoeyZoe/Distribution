package typings.antd

import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonGroupMod.ButtonGroupProps
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Context
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.buttonButtonMod.default {
    def this(props: ButtonProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: FC[ButtonGroupProps] = js.native
    var __ANT_BUTTON: Boolean = js.native
    var contextType: Context[ConfigConsumerProps] = js.native
    var defaultProps: AnonBlock = js.native
  }
  
}

