package typings.sinon.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeTimersConfig extends js.Object {
  var now: Double | Date
  var shouldAdvanceTime: Boolean
  var toFake: js.Array[String]
}

object SinonFakeTimersConfig {
  @scala.inline
  def apply(now: Double | Date, shouldAdvanceTime: Boolean, toFake: js.Array[String]): SinonFakeTimersConfig = {
    val __obj = js.Dynamic.literal(now = now.asInstanceOf[js.Any], shouldAdvanceTime = shouldAdvanceTime.asInstanceOf[js.Any], toFake = toFake.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SinonFakeTimersConfig]
  }
}

