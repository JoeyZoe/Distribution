package typings.pulumiAws.mod.rds

import typings.pulumiAws.rdsClusterMod.ClusterArgs
import typings.pulumiAws.rdsClusterMod.ClusterState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.Cluster")
@js.native
class Cluster protected ()
  extends typings.pulumiAws.rdsMod.Cluster {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClusterArgs) = this()
  def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "rds.Cluster")
@js.native
object Cluster extends js.Object {
  /**
    * Get an existing Cluster resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.rdsClusterMod.Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.rdsClusterMod.Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.rdsClusterMod.Cluster = js.native
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ Boolean = js.native
}

