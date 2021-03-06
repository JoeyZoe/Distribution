package typings.fsDashPromise.fsDashPromiseMod

import typings.fsDashExtra.fsDashExtraMod.WriteFileOptions
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "outputFile")
@js.native
object outputFile extends js.Object {
  def apply(file: String, data: String): js.Promise[Unit] = js.native
  def apply(file: String, data: String, options: WriteOptions): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def apply(file: String, data: Buffer): js.Promise[Unit] = js.native
  def apply(file: String, data: Buffer, options: WriteOptions): js.Promise[Unit] = js.native
}

