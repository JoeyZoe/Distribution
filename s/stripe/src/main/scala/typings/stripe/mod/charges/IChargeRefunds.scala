package typings.stripe.mod.charges

import typings.stripe.mod.IList
import typings.stripe.mod.refunds.IRefund
import typings.stripe.mod.resources.ChargeRefunds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeRefunds
  extends ChargeRefunds
     with IList[IRefund]

