package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: String = js.native
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
    */
  var name: String = js.native
}

object GetLaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(arn: String, name: String): GetLaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateIamInstanceProfile]
  }
}

