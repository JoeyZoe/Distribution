package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.rbac.v1alpha1.RoleRef
import typings.pulumiKubernetes.outputMod.rbac.v1alpha1.Subject
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac/v1alpha1/ClusterRoleBinding", JSImport.Namespace)
@js.native
object clusterRoleBindingMod extends js.Object {
  @js.native
  class ClusterRoleBinding protected () extends CustomResource {
    /**
      * Create a rbac.v1alpha1.ClusterRoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleBinding) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleBinding,
      opts: CustomResourceOptions
    ) = this()
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
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding] = js.native
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
      * resolved, the Authorizer must return an error.
      */
    val roleRef: Output_[RoleRef] = js.native
    /**
      * Subjects holds references to the objects the role applies to.
      */
    val subjects: Output_[js.Array[Subject]] = js.native
  }
  
  /* static members */
  @js.native
  object ClusterRoleBinding extends js.Object {
    /**
      * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): ClusterRoleBinding = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRoleBinding = js.native
    /**
      * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/ClusterRoleBinding.ClusterRoleBinding */ Boolean = js.native
  }
  
}

