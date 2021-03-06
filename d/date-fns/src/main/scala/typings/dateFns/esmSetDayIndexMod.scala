package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/setDay/index", JSImport.Namespace)
@js.native
object esmSetDayIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, day: Double): Date = js.native
    def apply(date: Double, day: Double, options: AnonWeekStartsOn): Date = js.native
    def apply(date: Date, day: Double): Date = js.native
    def apply(date: Date, day: Double, options: AnonWeekStartsOn): Date = js.native
  }
  
}

