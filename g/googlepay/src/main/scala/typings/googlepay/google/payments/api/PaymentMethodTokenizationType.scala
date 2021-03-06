package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment method tokenization type enum string.
  *
  * Options:
  *
  * - `PAYMENT_GATEWAY`:
  *   Tokenize a payment response to be consumed or charged by a specified
  *   third-party gateway service.
  *
  * - `DIRECT`:
  *   Tokenize to be consumed/charged directly by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
  - typings.googlepay.googlepayStrings.DIRECT
*/
trait PaymentMethodTokenizationType extends js.Object

object PaymentMethodTokenizationType {
  @scala.inline
  def DIRECT: typings.googlepay.googlepayStrings.DIRECT = this.cast("DIRECT")
  @scala.inline
  def PAYMENT_GATEWAY: typings.googlepay.googlepayStrings.PAYMENT_GATEWAY = this.cast("PAYMENT_GATEWAY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

