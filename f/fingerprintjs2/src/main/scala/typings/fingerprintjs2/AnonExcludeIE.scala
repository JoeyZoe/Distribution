package typings.fingerprintjs2

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeIE extends js.Object {
  var excludeIE: Boolean
  var sortPluginsFor: js.Array[RegExp]
}

object AnonExcludeIE {
  @scala.inline
  def apply(excludeIE: Boolean, sortPluginsFor: js.Array[RegExp]): AnonExcludeIE = {
    val __obj = js.Dynamic.literal(excludeIE = excludeIE.asInstanceOf[js.Any], sortPluginsFor = sortPluginsFor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExcludeIE]
  }
}

