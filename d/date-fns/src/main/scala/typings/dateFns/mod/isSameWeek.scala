package typings.dateFns.mod

import typings.dateFns.AnonLocale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "isSameWeek")
@js.native
object isSameWeek extends js.Object {
  def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
  def apply(dateLeft: Double, dateRight: Double, options: AnonLocale): Boolean = js.native
  def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
  def apply(dateLeft: Double, dateRight: Date, options: AnonLocale): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Double, options: AnonLocale): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Date, options: AnonLocale): Boolean = js.native
}

