package typings.pulumiAws.mod.opsworks

import typings.pulumiAws.userProfileMod.UserProfileArgs
import typings.pulumiAws.userProfileMod.UserProfileState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks.UserProfile")
@js.native
class UserProfile protected ()
  extends typings.pulumiAws.opsworksMod.UserProfile {
  /**
    * Create a UserProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserProfileArgs) = this()
  def this(name: String, args: UserProfileArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "opsworks.UserProfile")
@js.native
object UserProfile extends js.Object {
  /**
    * Get an existing UserProfile resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.userProfileMod.UserProfile = js.native
  def get(name: String, id: Input[ID], state: UserProfileState): typings.pulumiAws.userProfileMod.UserProfile = js.native
  def get(name: String, id: Input[ID], state: UserProfileState, opts: CustomResourceOptions): typings.pulumiAws.userProfileMod.UserProfile = js.native
  /**
    * Returns true if the given object is an instance of UserProfile.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/userProfile.UserProfile */ Boolean = js.native
}

