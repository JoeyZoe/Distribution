package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFallback extends js.Object {
  var fallback: Boolean
  var paths: js.Array[String]
}

object AnonFallback {
  @scala.inline
  def apply(fallback: Boolean, paths: js.Array[String]): AnonFallback = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFallback]
  }
}

