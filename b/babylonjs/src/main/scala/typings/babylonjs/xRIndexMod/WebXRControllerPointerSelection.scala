package typings.babylonjs.xRIndexMod

import typings.babylonjs.webXRControllerPointerSelectionMod.IWebXRControllerPointerSelectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/index", "WebXRControllerPointerSelection")
@js.native
class WebXRControllerPointerSelection protected ()
  extends typings.babylonjs.featuresIndexMod.WebXRControllerPointerSelection {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param _options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRControllerPointerSelectionOptions
  ) = this()
}

/* static members */
@JSImport("babylonjs/XR/index", "WebXRControllerPointerSelection")
@js.native
object WebXRControllerPointerSelection extends js.Object {
  /**
    * The module's name
    */
  val Name: String = js.native
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  val Version: Double = js.native
  var _idCounter: js.Any = js.native
}

