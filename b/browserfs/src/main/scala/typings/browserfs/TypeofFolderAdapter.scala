package typings.browserfs

import org.scalablytyped.runtime.Instantiable2
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.folderAdapterMod.FolderAdapter
import typings.browserfs.folderAdapterMod.FolderAdapterOptions
import typings.browserfs.folderAdapterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFolderAdapter extends Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

