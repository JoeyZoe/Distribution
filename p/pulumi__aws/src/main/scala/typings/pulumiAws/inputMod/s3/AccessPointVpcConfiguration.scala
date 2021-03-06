package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointVpcConfiguration extends js.Object {
  /**
    * This access point will only allow connections from the specified VPC ID.
    */
  var vpcId: Input[String] = js.native
}

object AccessPointVpcConfiguration {
  @scala.inline
  def apply(vpcId: Input[String]): AccessPointVpcConfiguration = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccessPointVpcConfiguration]
  }
}

