package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DaydreamController")
@js.native
class DaydreamController protected () extends WebVRController {
  /**
    * Creates a new DaydreamController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/* static members */
@JSGlobal("BABYLON.DaydreamController")
@js.native
object DaydreamController extends js.Object {
  /**
    * Gamepad Id prefix used to identify Daydream Controller.
    */
  val GAMEPAD_ID_PREFIX: String = js.native
  /**
    * Base Url for the controller model.
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * File name for the controller model.
    */
  var MODEL_FILENAME: String = js.native
}

