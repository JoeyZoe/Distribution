package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingArgs
import typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getInstanceTypeOffering")
@js.native
object getInstanceTypeOffering extends js.Object {
  def apply(): js.Promise[GetInstanceTypeOfferingResult] with GetInstanceTypeOfferingResult = js.native
  def apply(args: GetInstanceTypeOfferingArgs): js.Promise[GetInstanceTypeOfferingResult] with GetInstanceTypeOfferingResult = js.native
  def apply(args: GetInstanceTypeOfferingArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingResult] with GetInstanceTypeOfferingResult = js.native
}

