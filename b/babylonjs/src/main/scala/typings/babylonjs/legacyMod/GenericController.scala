package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "GenericController")
@js.native
class GenericController protected ()
  extends typings.babylonjs.indexMod.GenericController {
  /**
    * Creates a new GenericController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "GenericController")
@js.native
object GenericController extends js.Object {
  /**
    * Base Url for the controller model.
    */
  val MODEL_BASE_URL: String = js.native
  /**
    * File name for the controller model.
    */
  val MODEL_FILENAME: String = js.native
}

