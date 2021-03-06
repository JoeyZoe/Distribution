package typings.ionicCore

import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/app/app", JSImport.Namespace)
@js.native
object appMod extends js.Object {
  @js.native
  class App () extends ComponentInterface {
    var el: HTMLElement = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MApp(): Unit = js.native
    @JSName("render")
    def render_MApp(): js.Any = js.native
  }
  
}

