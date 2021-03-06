package typings.googleVisualization.google.visualization

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.DateFormat")
@js.native
class DateFormat protected () extends DefaultFormatter {
  def this(options: DateFormatOptions) = this()
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: Date): String = js.native
}

