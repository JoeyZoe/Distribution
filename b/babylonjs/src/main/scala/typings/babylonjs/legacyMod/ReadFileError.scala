package typings.babylonjs.legacyMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "ReadFileError")
@js.native
class ReadFileError protected ()
  extends typings.babylonjs.indexMod.ReadFileError {
  /**
    * Creates a new ReadFileError
    * @param message defines the message of the error
    * @param file defines the optional file
    */
  def this(message: String, file: File) = this()
}

