package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/format/index", JSImport.Namespace)
@js.native
object dateFnsIndexMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, format: String): String = js.native
    def apply(date: Double, format: String, options: AnonFirstWeekContainsDate): String = js.native
    def apply(date: Date, format: String): String = js.native
    def apply(date: Date, format: String, options: AnonFirstWeekContainsDate): String = js.native
  }
  
}

