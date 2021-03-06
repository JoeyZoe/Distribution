package typings.pulumiAws.apigatewayMod

import typings.pulumiAws.documentationPartMod.DocumentationPartArgs
import typings.pulumiAws.documentationPartMod.DocumentationPartState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "DocumentationPart")
@js.native
class DocumentationPart protected ()
  extends typings.pulumiAws.documentationPartMod.DocumentationPart {
  /**
    * Create a DocumentationPart resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DocumentationPartArgs) = this()
  def this(name: String, args: DocumentationPartArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "DocumentationPart")
@js.native
object DocumentationPart extends js.Object {
  /**
    * Get an existing DocumentationPart resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.documentationPartMod.DocumentationPart = js.native
  def get(name: String, id: Input[ID], state: DocumentationPartState): typings.pulumiAws.documentationPartMod.DocumentationPart = js.native
  def get(name: String, id: Input[ID], state: DocumentationPartState, opts: CustomResourceOptions): typings.pulumiAws.documentationPartMod.DocumentationPart = js.native
  /**
    * Returns true if the given object is an instance of DocumentationPart.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationPart.DocumentationPart */ Boolean = js.native
}

