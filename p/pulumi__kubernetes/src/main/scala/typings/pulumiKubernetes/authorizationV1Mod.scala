package typings.pulumiKubernetes

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authorization/v1", JSImport.Namespace)
@js.native
object authorizationV1Mod extends js.Object {
  @js.native
  class LocalSubjectAccessReview protected ()
    extends typings.pulumiKubernetes.v1LocalSubjectAccessReviewMod.LocalSubjectAccessReview {
    /**
      * Create a authorization.v1.LocalSubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.authorization.v1.LocalSubjectAccessReview) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.authorization.v1.LocalSubjectAccessReview,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class SelfSubjectAccessReview protected ()
    extends typings.pulumiKubernetes.v1SelfSubjectAccessReviewMod.SelfSubjectAccessReview {
    /**
      * Create a authorization.v1.SelfSubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.authorization.v1.SelfSubjectAccessReview) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.authorization.v1.SelfSubjectAccessReview,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class SelfSubjectRulesReview protected ()
    extends typings.pulumiKubernetes.v1SelfSubjectRulesReviewMod.SelfSubjectRulesReview {
    /**
      * Create a authorization.v1.SelfSubjectRulesReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.authorization.v1.SelfSubjectRulesReview) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.authorization.v1.SelfSubjectRulesReview,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class SubjectAccessReview protected ()
    extends typings.pulumiKubernetes.v1SubjectAccessReviewMod.SubjectAccessReview {
    /**
      * Create a authorization.v1.SubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.authorization.v1.SubjectAccessReview) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.authorization.v1.SubjectAccessReview,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object LocalSubjectAccessReview extends js.Object {
    /**
      * Get the state of an existing `LocalSubjectAccessReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/LocalSubjectAccessReview.LocalSubjectAccessReview */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SelfSubjectAccessReview extends js.Object {
    /**
      * Get the state of an existing `SelfSubjectAccessReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of SelfSubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/SelfSubjectAccessReview.SelfSubjectAccessReview */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SelfSubjectRulesReview extends js.Object {
    /**
      * Get the state of an existing `SelfSubjectRulesReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
    /**
      * Returns true if the given object is an instance of SelfSubjectRulesReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/SelfSubjectRulesReview.SelfSubjectRulesReview */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SubjectAccessReview extends js.Object {
    /**
      * Get the state of an existing `SubjectAccessReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1SubjectAccessReviewMod.SubjectAccessReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1SubjectAccessReviewMod.SubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/SubjectAccessReview.SubjectAccessReview */ Boolean = js.native
  }
  
}

