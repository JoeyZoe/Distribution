package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.k6.k6Strings.HTTPSlash1Dot0
  - typings.k6.k6Strings.HTTPSlash1Dot1
  - typings.k6.k6Strings.HTTPSlash2Dot0
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  def HTTPSlash1Dot0: typings.k6.k6Strings.HTTPSlash1Dot0 = this.cast("HTTP/1.0")
  @scala.inline
  def HTTPSlash1Dot1: typings.k6.k6Strings.HTTPSlash1Dot1 = this.cast("HTTP/1.1")
  @scala.inline
  def HTTPSlash2Dot0: typings.k6.k6Strings.HTTPSlash2Dot0 = this.cast("HTTP/2.0")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

