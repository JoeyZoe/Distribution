package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/eachWeekOfInterval/index", JSImport.Namespace)
@js.native
object esmEachWeekOfIntervalIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(interval: Interval): js.Array[Date] = js.native
    def apply(interval: Interval, options: AnonWeekStartsOn): js.Array[Date] = js.native
  }
  
}

