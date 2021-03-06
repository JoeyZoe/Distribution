package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tokenization data for the payment method.
  *
  * @see PaymentMethodTokenizationSpecification
  */
trait PaymentMethodTokenizationData extends js.Object {
  /**
    * The generated payment method token.
    *
    * The contents of this token and how it should be used will depend on
    * the selected
    * [[PaymentMethodTokenizationSpecification.type|`PaymentMethodTokenizationSpecification.type`]].
    */
  var token: String
  /**
    * The type of tokenization to be applied to the selected payment
    * method.
    *
    * This value will match the
    * [[PaymentMethodTokenizationSpecification.type|`PaymentMethodTokenizationSpecification.type`]]
    * specified in the request.
    */
  var `type`: PaymentMethodTokenizationType
}

object PaymentMethodTokenizationData {
  @scala.inline
  def apply(token: String, `type`: PaymentMethodTokenizationType): PaymentMethodTokenizationData = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationData]
  }
}

