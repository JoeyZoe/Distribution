package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/parse", JSImport.Namespace)
@js.native
object dateFnsParseMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateString: String, formatString: String, referenceDate: Double): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Double,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = js.native
    def apply(dateString: String, formatString: String, referenceDate: Date): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      referenceDate: Date,
      options: AnonUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
    ): Date = js.native
  }
  
}

