package typings.sumchecker.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sumchecker", "ErrorWithFilename")
@js.native
class ErrorWithFilename protected () extends Error {
  def this(filename: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

