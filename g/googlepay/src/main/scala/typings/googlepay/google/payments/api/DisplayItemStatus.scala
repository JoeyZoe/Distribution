package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum string of a display item status.
  *
  * Options:
  *
  * - `FINAL`:
  *   DisplayItem is final and the item displays the value in price.
  *
  * - `PENDING`:
  *   DisplayItem does not display value in price but instead display as
  *   "pending".
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.FINAL
  - typings.googlepay.googlepayStrings.PENDING
*/
trait DisplayItemStatus extends js.Object

object DisplayItemStatus {
  @scala.inline
  def FINAL: typings.googlepay.googlepayStrings.FINAL = this.cast("FINAL")
  @scala.inline
  def PENDING: typings.googlepay.googlepayStrings.PENDING = this.cast("PENDING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

