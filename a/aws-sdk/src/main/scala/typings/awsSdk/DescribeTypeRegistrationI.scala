package typings.awsSdk

import typings.awsSdk.cloudformationMod.RegistrationToken
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudformation.DescribeTypeRegistrationInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeTypeRegistrationI extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The identifier for this registration request. This registration token is generated by CloudFormation when you initiate a registration request using  RegisterType .
    */
  var RegistrationToken: typings.awsSdk.cloudformationMod.RegistrationToken = js.native
}

object DescribeTypeRegistrationI {
  @scala.inline
  def apply(RegistrationToken: RegistrationToken, $waiter: WaiterConfiguration = null): DescribeTypeRegistrationI = {
    val __obj = js.Dynamic.literal(RegistrationToken = RegistrationToken.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTypeRegistrationI]
  }
}

