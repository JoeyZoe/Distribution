package typings.pulumiAws.mod.s3

import typings.pulumiAws.bucketMod.BucketArgs
import typings.pulumiAws.bucketMod.BucketState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.Bucket")
@js.native
class Bucket protected ()
  extends typings.pulumiAws.s3Mod.Bucket {
  /**
    * Create a Bucket resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: BucketArgs) = this()
  def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "s3.Bucket")
@js.native
object Bucket extends js.Object {
  /**
    * Get an existing Bucket resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.bucketMod.Bucket = js.native
  def get(name: String, id: Input[ID], state: BucketState): typings.pulumiAws.bucketMod.Bucket = js.native
  def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): typings.pulumiAws.bucketMod.Bucket = js.native
  /**
    * Returns true if the given object is an instance of Bucket.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean = js.native
}

