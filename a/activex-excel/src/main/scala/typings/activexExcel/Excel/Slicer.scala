package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Slicer")
@js.native
class Slicer protected () extends js.Object {
  val ActiveItem: SlicerItem = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  var Caption: String = js.native
  var ColumnWidth: Double = js.native
  val Creator: XlCreator = js.native
  var DisableMoveResizeUI: Boolean = js.native
  var DisplayHeader: Boolean = js.native
  @JSName("Excel.Slicer_typekey")
  var ExcelDotSlicer_typekey: Slicer = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  var Locked: Boolean = js.native
  var Name: String = js.native
  var NumberOfColumns: Double = js.native
  val Parent: js.Any = js.native
  var RowHeight: Double = js.native
  val Shape: typings.activexExcel.Excel.Shape = js.native
  val SlicerCache: typings.activexExcel.Excel.SlicerCache = js.native
  val SlicerCacheLevel: typings.activexExcel.Excel.SlicerCacheLevel = js.native
  var Style: js.Any = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
}

