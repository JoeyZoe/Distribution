package typings.ldapjs.mod

import typings.ldapjs.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "ApproximateFilter")
@js.native
class ApproximateFilter protected () extends Filter {
  def this(options: AnonValue) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

