package typings.nodeZopfli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZopfli.nodeZopfliStrings.deflate
  - typings.nodeZopfli.nodeZopfliStrings.gzip
  - typings.nodeZopfli.nodeZopfliStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typings.nodeZopfli.nodeZopfliStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typings.nodeZopfli.nodeZopfliStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typings.nodeZopfli.nodeZopfliStrings.zlib = this.cast("zlib")
}

