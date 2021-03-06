package typings.awsSdk

import typings.awsSdk.serviceMod.WaiterConfiguration
import typings.awsSdk.sesMod.IdentityList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ses.GetIdentityVerificationAttributesRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetIdentityVerificationAt extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * A list of identities.
    */
  var Identities: IdentityList = js.native
}

object GetIdentityVerificationAt {
  @scala.inline
  def apply(Identities: IdentityList, $waiter: WaiterConfiguration = null): GetIdentityVerificationAt = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAt]
  }
}

