package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoArrowheadLength
import typings.activexOffice.Office.MsoArrowheadStyle
import typings.activexOffice.Office.MsoArrowheadWidth
import typings.activexOffice.Office.MsoLineDashStyle
import typings.activexOffice.Office.MsoLineStyle
import typings.activexOffice.Office.MsoPatternType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.LineFormat")
@js.native
class LineFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var BackColor: ColorFormat = js.native
  var BeginArrowheadLength: MsoArrowheadLength = js.native
  var BeginArrowheadStyle: MsoArrowheadStyle = js.native
  var BeginArrowheadWidth: MsoArrowheadWidth = js.native
  val Creator: Double = js.native
  var DashStyle: MsoLineDashStyle = js.native
  var EndArrowheadLength: MsoArrowheadLength = js.native
  var EndArrowheadStyle: MsoArrowheadStyle = js.native
  var EndArrowheadWidth: MsoArrowheadWidth = js.native
  var ForeColor: ColorFormat = js.native
  var InsetPen: MsoTriState = js.native
  val Parent: js.Any = js.native
  var Pattern: MsoPatternType = js.native
  @JSName("PowerPoint.LineFormat_typekey")
  var PowerPointDotLineFormat_typekey: LineFormat = js.native
  var Style: MsoLineStyle = js.native
  var Transparency: Double = js.native
  var Visible: MsoTriState = js.native
  var Weight: Double = js.native
}

