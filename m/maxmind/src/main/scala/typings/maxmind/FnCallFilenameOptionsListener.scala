package typings.maxmind

import typings.maxmind.maxmindStrings.buffer
import typings.node.AnonEncodingPersistent
import typings.node.AnonPersistent
import typings.node.AnonRecursive
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallFilenameOptionsListener extends js.Object {
  def apply(filename: PathLike): FSWatcher = js.native
  def apply(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: String): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: buffer): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: AnonEncodingPersistent): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: AnonEncodingPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: AnonPersistent): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: AnonPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: AnonRecursive): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: AnonRecursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
}

