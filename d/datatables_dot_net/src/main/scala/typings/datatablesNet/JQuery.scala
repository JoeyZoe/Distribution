package typings.datatablesNet

import typings.datatablesNet.DataTables.Api
import typings.datatablesNet.DataTables.JQueryDataTables
import typings.datatablesNet.DataTables.Settings
import typings.datatablesNet.DataTables.StaticFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dataTable")
  var dataTable_Original: StaticFunctions = js.native
  def DataTable(): Api = js.native
  def DataTable(opts: Settings): Api = js.native
  /**
    * Returns JQuery object
    *
    * Usage:
    * $( selector ).dataTable();
    */
  def dataTable(): JQueryDataTables = js.native
}

