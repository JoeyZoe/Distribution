package typings.promiseFs

import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferFloat64Array extends js.Object {
  var buffer: Float64Array
  var bytesRead: Double
}

object AnonBufferFloat64Array {
  @scala.inline
  def apply(buffer: Float64Array, bytesRead: Double): AnonBufferFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferFloat64Array]
  }
}

