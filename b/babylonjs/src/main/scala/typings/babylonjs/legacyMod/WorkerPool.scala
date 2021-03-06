package typings.babylonjs.legacyMod

import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "WorkerPool")
@js.native
class WorkerPool protected ()
  extends typings.babylonjs.indexMod.WorkerPool {
  /**
    * Constructor
    * @param workers Array of workers to use for actions
    */
  def this(workers: js.Array[Worker]) = this()
}

