package typings.agGrid.iCellRendererMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellRendererParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any
  var api: GridApi
  var colDef: ColDef
  var column: Column
  var columnApi: ColumnApi
  var context: js.Any
  var data: js.Any
  var eGridCell: HTMLElement
  var eParentOfValue: HTMLElement
  var node: RowNode
  var rowIndex: Double
  var value: js.Any
  var valueFormatted: js.Any
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit
  def formatValue(value: js.Any): js.Any
  def getValue(): js.Any
  def refreshCell(): Unit
  def setValue(value: js.Any): Unit
}

object ICellRendererParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: HTMLElement,
    eParentOfValue: HTMLElement,
    formatValue: js.Any => js.Any,
    getValue: () => js.Any,
    node: RowNode,
    refreshCell: () => Unit,
    rowIndex: Double,
    setValue: js.Any => Unit,
    value: js.Any,
    valueFormatted: js.Any
  ): ICellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eGridCell = eGridCell.asInstanceOf[js.Any], eParentOfValue = eParentOfValue.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), getValue = js.Any.fromFunction0(getValue), node = node.asInstanceOf[js.Any], refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellRendererParams]
  }
}

