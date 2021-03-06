package typings.officeUiFabricReact.datePickerFormatExampleMod

import typings.officeUiFabricReact.dateValuesMod.DayOfWeek
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerFormatExampleState extends js.Object {
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  var value: js.UndefOr[Date | Null] = js.undefined
}

object IDatePickerFormatExampleState {
  @scala.inline
  def apply(firstDayOfWeek: DayOfWeek = null, value: Date = null): IDatePickerFormatExampleState = {
    val __obj = js.Dynamic.literal()
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerFormatExampleState]
  }
}

