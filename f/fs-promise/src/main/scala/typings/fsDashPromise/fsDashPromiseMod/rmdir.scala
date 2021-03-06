package typings.fsDashPromise.fsDashPromiseMod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirAsyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "rmdir")
@js.native
object rmdir extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[Unit] = js.native
  def apply(path: Buffer, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
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
  def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
}

