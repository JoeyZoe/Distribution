package typings.promiseFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-fs", "fstatSync")
@js.native
object fstatSync extends js.Object {
  /**
    * Synchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def apply(fd: Double): typings.node.fsMod.Stats = js.native
}

