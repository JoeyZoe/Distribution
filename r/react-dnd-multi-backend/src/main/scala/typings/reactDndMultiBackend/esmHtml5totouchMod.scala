package typings.reactDndMultiBackend

import typings.reactDndMultiBackend.mod.Backends
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-multi-backend/dist/esm/HTML5toTouch", JSImport.Namespace)
@js.native
object esmHtml5totouchMod extends js.Object {
  /**
    * Most commonly used set of Backends.
    * The default backend is the react-dnd-html5-backend.
    * The second backend is the react-dnd-touch-backend with enableMouseEvents = true,
    * preview = true, and the transition triggering on the "touchstart" event.
    */
  val default: Backends = js.native
}

