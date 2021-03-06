package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
class MorphTargetManager ()
  extends typings.babylonjs.morphIndexMod.MorphTargetManager {
  def this(scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}

/* static members */
@JSImport("babylonjs/index", "MorphTargetManager")
@js.native
object MorphTargetManager extends js.Object {
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  def Parse(serializationObject: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.morphTargetManagerMod.MorphTargetManager = js.native
}

