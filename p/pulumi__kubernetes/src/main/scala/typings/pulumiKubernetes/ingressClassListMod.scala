package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.outputMod.networking.v1beta1.IngressClass
import typings.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/networking/v1beta1/IngressClassList", JSImport.Namespace)
@js.native
object ingressClassListMod extends js.Object {
  @js.native
  class IngressClassList protected () extends CustomResource {
    /**
      * Create a networking.v1beta1.IngressClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressClassList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressClassList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[networkingDotk8sDotioSlashv1beta1] = js.native
    /**
      * Items is the list of IngressClasses.
      */
    val items: Output_[js.Array[IngressClass]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.IngressClassList] = js.native
    /**
      * Standard list metadata.
      */
    val metadata: Output_[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object IngressClassList extends js.Object {
    /**
      * Get the state of an existing `IngressClassList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): IngressClassList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): IngressClassList = js.native
    /**
      * Returns true if the given object is an instance of IngressClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/IngressClassList.IngressClassList */ Boolean = js.native
  }
  
}

