package typings.pulumiAws

import typings.pulumiAws.projectMod.ProjectArgs
import typings.pulumiAws.projectMod.ProjectState
import typings.pulumiAws.sourceCredentialMod.SourceCredentialArgs
import typings.pulumiAws.sourceCredentialMod.SourceCredentialState
import typings.pulumiAws.webhookMod.WebhookArgs
import typings.pulumiAws.webhookMod.WebhookState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codebuild", JSImport.Namespace)
@js.native
object codebuildMod extends js.Object {
  @js.native
  class Project protected ()
    extends typings.pulumiAws.projectMod.Project {
    /**
      * Create a Project resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProjectArgs) = this()
    def this(name: String, args: ProjectArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SourceCredential protected ()
    extends typings.pulumiAws.sourceCredentialMod.SourceCredential {
    /**
      * Create a SourceCredential resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SourceCredentialArgs) = this()
    def this(name: String, args: SourceCredentialArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Webhook protected ()
    extends typings.pulumiAws.webhookMod.Webhook {
    /**
      * Create a Webhook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebhookArgs) = this()
    def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Project extends js.Object {
    /**
      * Get an existing Project resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.projectMod.Project = js.native
    def get(name: String, id: Input[ID], state: ProjectState): typings.pulumiAws.projectMod.Project = js.native
    def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): typings.pulumiAws.projectMod.Project = js.native
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SourceCredential extends js.Object {
    /**
      * Get an existing SourceCredential resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    def get(name: String, id: Input[ID], state: SourceCredentialState): typings.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    def get(name: String, id: Input[ID], state: SourceCredentialState, opts: CustomResourceOptions): typings.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    /**
      * Returns true if the given object is an instance of SourceCredential.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Webhook extends js.Object {
    /**
      * Get an existing Webhook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.webhookMod.Webhook = js.native
    def get(name: String, id: Input[ID], state: WebhookState): typings.pulumiAws.webhookMod.Webhook = js.native
    def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): typings.pulumiAws.webhookMod.Webhook = js.native
    /**
      * Returns true if the given object is an instance of Webhook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/webhook.Webhook */ Boolean = js.native
  }
  
}

