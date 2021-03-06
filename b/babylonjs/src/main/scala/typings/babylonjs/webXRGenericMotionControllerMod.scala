package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/motionController/webXRGenericMotionController", JSImport.Namespace)
@js.native
object webXRGenericMotionControllerMod extends js.Object {
  @js.native
  class WebXRGenericTriggerMotionController protected () extends WebXRAbstractMotionController {
    def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
    /* protected */ def _updateModel(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object WebXRGenericTriggerMotionController extends js.Object {
    /**
      * Static version of the profile id of this controller
      */
    var ProfileId: String = js.native
  }
  
}

