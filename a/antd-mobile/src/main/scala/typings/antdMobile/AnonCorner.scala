package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorner extends js.Object {
  var corner: Boolean
  var dot: Boolean
  var overflowCount: Double
  var prefixCls: String
  var size: String
}

object AnonCorner {
  @scala.inline
  def apply(corner: Boolean, dot: Boolean, overflowCount: Double, prefixCls: String, size: String): AnonCorner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCorner]
  }
}

