package typings.promiseFs.mod

import typings.node.Buffer
import typings.node.fsMod.PathLike
import typings.promiseFs.promiseFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-fs", "readlinkSync")
@js.native
object readlinkSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): Buffer = js.native
}

