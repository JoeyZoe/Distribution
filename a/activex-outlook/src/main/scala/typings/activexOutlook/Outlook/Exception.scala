package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Exception")
@js.native
class Exception protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val AppointmentItem: typings.activexOutlook.Outlook.AppointmentItem = js.native
  val Class: OlObjectClass = js.native
  val Deleted: Boolean = js.native
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  val OriginalDate: VarDate = js.native
  @JSName("Outlook.Exception_typekey")
  var OutlookDotException_typekey: Exception = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

