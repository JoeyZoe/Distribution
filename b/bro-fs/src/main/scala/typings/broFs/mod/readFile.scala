package typings.broFs.mod

import typings.broFs.Anon0
import typings.broFs.Anon1
import typings.broFs.AnonType
import typings.broFs.AnonTypeTextType
import typings.filesystem.FileEntry
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, options: Anon0): js.Promise[Blob] = js.native
  def apply(path: String, options: Anon1): js.Promise[File] = js.native
  def apply(path: String, options: AnonType): js.Promise[ArrayBuffer] = js.native
  def apply(path: String, options: AnonTypeTextType): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: Anon0): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: Anon1): js.Promise[File] = js.native
  def apply(path: FileEntry, options: AnonType): js.Promise[ArrayBuffer] = js.native
  def apply(path: FileEntry, options: AnonTypeTextType): js.Promise[String] = js.native
}

