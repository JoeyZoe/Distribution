package typings.pulumiAws.mod.cloudwatch

import typings.pulumiAws.logGroupMod.LogGroupArgs
import typings.pulumiAws.logGroupMod.LogGroupState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.LogGroup")
@js.native
class LogGroup protected ()
  extends typings.pulumiAws.cloudwatchMod.LogGroup {
  /**
    * Create a LogGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: LogGroupArgs) = this()
  def this(name: String, args: LogGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "cloudwatch.LogGroup")
@js.native
object LogGroup extends js.Object {
  /**
    * Get an existing LogGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.logGroupMod.LogGroup = js.native
  def get(name: String, id: Input[ID], state: LogGroupState): typings.pulumiAws.logGroupMod.LogGroup = js.native
  def get(name: String, id: Input[ID], state: LogGroupState, opts: CustomResourceOptions): typings.pulumiAws.logGroupMod.LogGroup = js.native
  /**
    * Returns true if the given object is an instance of LogGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logGroup.LogGroup */ Boolean = js.native
}

