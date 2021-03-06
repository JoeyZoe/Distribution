package typings.stripeV3.stripe.paymentRequest

import typings.stripeV3.stripe.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeTokenPaymentResponse extends StripePaymentResponse {
  var token: Token
}

object StripeTokenPaymentResponse {
  @scala.inline
  def apply(
    complete: String => Unit,
    methodName: String,
    token: Token,
    payerEmail: String = null,
    payerName: String = null,
    payerPhone: String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripeTokenPaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail.asInstanceOf[js.Any])
    if (payerName != null) __obj.updateDynamic("payerName")(payerName.asInstanceOf[js.Any])
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone.asInstanceOf[js.Any])
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeTokenPaymentResponse]
  }
}

