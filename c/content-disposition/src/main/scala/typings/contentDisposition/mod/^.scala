package typings.contentDisposition.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("content-disposition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create an attachment `Content-Disposition` header value using the given file name, if supplied.
    * The `filename` is optional and if no file name is desired, but you want to specify options, set `filename` to undefined.
    */
  def apply(): String = js.native
  def apply(filename: String): String = js.native
  def apply(filename: String, options: Options): String = js.native
}

