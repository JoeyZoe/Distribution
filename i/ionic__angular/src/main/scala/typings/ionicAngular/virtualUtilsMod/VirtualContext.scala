package typings.ionicAngular.virtualUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualContext extends js.Object {
  @JSName("$implicit")
  var $implicit: js.Any
  var index: Double
}

object VirtualContext {
  @scala.inline
  def apply($implicit: js.Any, index: Double): VirtualContext = {
    val __obj = js.Dynamic.literal($implicit = $implicit.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualContext]
  }
}

