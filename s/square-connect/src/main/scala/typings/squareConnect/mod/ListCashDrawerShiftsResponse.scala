package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListCashDrawerShiftsResponse")
@js.native
class ListCashDrawerShiftsResponse () extends js.Object {
  /**
    * Opaque cursor for fetching the next page of results. Cursor is not present in the last page of results.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * A collection of CashDrawerShiftSummary objects for shifts that match the query.
    */
  var items: js.UndefOr[js.Array[CashDrawerShiftSummary]] = js.native
}

