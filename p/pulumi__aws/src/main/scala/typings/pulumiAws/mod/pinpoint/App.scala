package typings.pulumiAws.mod.pinpoint

import typings.pulumiAws.appMod.AppArgs
import typings.pulumiAws.appMod.AppState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pinpoint.App")
@js.native
class App protected ()
  extends typings.pulumiAws.pinpointMod.App {
  /**
    * Create a App resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AppArgs) = this()
  def this(name: String, args: AppArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "pinpoint.App")
@js.native
object App extends js.Object {
  /**
    * Get an existing App resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.appMod.App = js.native
  def get(name: String, id: Input[ID], state: AppState): typings.pulumiAws.appMod.App = js.native
  def get(name: String, id: Input[ID], state: AppState, opts: CustomResourceOptions): typings.pulumiAws.appMod.App = js.native
  /**
    * Returns true if the given object is an instance of App.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/app.App */ Boolean = js.native
}

