package typings.stripe.mod.transfers

import typings.stripe.mod.IList
import typings.stripe.mod.resources.TransferReversals
import typings.stripe.mod.transferReversals.IReversal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransferReversals
  extends TransferReversals
     with IList[IReversal]

