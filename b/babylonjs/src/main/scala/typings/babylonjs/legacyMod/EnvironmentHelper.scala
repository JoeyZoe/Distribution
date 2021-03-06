package typings.babylonjs.legacyMod

import typings.babylonjs.PartialIEnvironmentHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "EnvironmentHelper")
@js.native
class EnvironmentHelper protected ()
  extends typings.babylonjs.indexMod.EnvironmentHelper {
  /**
    * constructor
    * @param options Defines the options we want to customize the helper
    * @param scene The scene to add the material to
    */
  def this(options: PartialIEnvironmentHelper, scene: typings.babylonjs.sceneMod.Scene) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "EnvironmentHelper")
@js.native
object EnvironmentHelper extends js.Object {
  /**
    * Default environment texture URL.
    */
  var _environmentTextureCDNUrl: js.Any = js.native
  /**
    * Creates the default options for the helper.
    */
  var _getDefaultOptions: js.Any = js.native
  /**
    * Default ground texture URL.
    */
  var _groundTextureCDNUrl: js.Any = js.native
  /**
    * Default skybox texture URL.
    */
  var _skyboxTextureCDNUrl: js.Any = js.native
}

