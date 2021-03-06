package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "Stage")
@js.native
/**
  * Hide ctor from the rest of the world.
  * @param items The items to add.
  */
class Stage[T /* <: js.Function */] protected ()
  extends typings.babylonjs.legacyMod.Stage[T]

/* static members */
@JSImport("babylonjs", "Stage")
@js.native
object Stage extends js.Object {
  /**
    * Creates a new Stage.
    * @returns A new instance of a Stage
    */
  def Create[T /* <: js.Function */](): typings.babylonjs.sceneComponentMod.Stage[T] = js.native
}

