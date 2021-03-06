package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.rbac.v1alpha1.AggregationRule
import typings.pulumiKubernetes.outputMod.rbac.v1alpha1.PolicyRule
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac/v1alpha1/ClusterRole", JSImport.Namespace)
@js.native
object clusterRoleMod extends js.Object {
  @js.native
  class ClusterRole protected () extends CustomResource {
    /**
      * Create a rbac.v1alpha1.ClusterRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRole) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRole,
      opts: CustomResourceOptions
    ) = this()
    /**
      * AggregationRule is an optional field that describes how to build the Rules for this
      * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
      * changes to Rules will be stomped by the controller.
      */
    val aggregationRule: Output_[AggregationRule] = js.native
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1alpha1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole] = js.native
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Rules holds all the PolicyRules for this ClusterRole
      */
    val rules: Output_[js.Array[PolicyRule]] = js.native
  }
  
  /* static members */
  @js.native
  object ClusterRole extends js.Object {
    /**
      * Get the state of an existing `ClusterRole` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): ClusterRole = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRole = js.native
    /**
      * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/ClusterRole.ClusterRole */ Boolean = js.native
  }
  
}

