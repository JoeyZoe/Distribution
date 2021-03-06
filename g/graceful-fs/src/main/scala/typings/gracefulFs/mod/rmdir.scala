package typings.gracefulFs.mod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirAsyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("graceful-fs", "rmdir")
@js.native
object rmdir extends js.Object {
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: RmDirAsyncOptions, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
}

