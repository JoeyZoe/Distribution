package typings.blueprintjsTimezone

import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import typings.blueprintjsTimezone.timezoneMetadataMod.ITimezoneMetadata
import typings.blueprintjsTimezone.timezonePickerMod.ITimezonePickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/timezone", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TimezonePicker protected ()
    extends typings.blueprintjsTimezone.componentsMod.TimezonePicker {
    def this(props: ITimezonePickerProps) = this()
    def this(props: ITimezonePickerProps, context: js.Any) = this()
  }
  
  def getTimezoneMetadata(timezone: String): ITimezoneMetadata = js.native
  def getTimezoneMetadata(timezone: String, date: Date): ITimezoneMetadata = js.native
  @js.native
  object Classes extends js.Object {
    val TIMEZONE_PICKER: String = js.native
    val TIMEZONE_PICKER_POPOVER: String = js.native
  }
  
  @js.native
  object TimezoneDisplayFormat extends js.Object {
    /** Abbreviation format: `"HST"` */
    var ABBREVIATION: abbreviation = js.native
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    var COMPOSITE: composite = js.native
    /** Name format: `"Pacific/Honolulu"` */
    var NAME: name = js.native
    /** Offset format: `"-10:00"` */
    var OFFSET: offset = js.native
  }
  
  /* static members */
  @js.native
  object TimezonePicker extends js.Object {
    var defaultProps: PartialITimezonePickerPro = js.native
    var displayName: String = js.native
  }
  
}

