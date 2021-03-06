package typings.mz.mzMod.fs

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz", "fs.mkdir")
@js.native
object mkdir extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: String, mode: String): js.Promise[Unit] = js.native
  def apply(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: String, mode: Double): js.Promise[Unit] = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[Unit] = js.native
  def apply(path: Buffer, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: Buffer, mode: String): js.Promise[Unit] = js.native
  def apply(path: Buffer, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: Buffer, mode: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory with a mode of `0o777`.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: String, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def apply(path: PathLike, options: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: Null, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
}

