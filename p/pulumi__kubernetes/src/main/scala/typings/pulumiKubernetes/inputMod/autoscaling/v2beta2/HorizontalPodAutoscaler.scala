package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv2beta2
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which
  * automatically manages the replica count of any resource implementing the scale subresource
  * based on the metrics specified.
  */
trait HorizontalPodAutoscaler extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[autoscalingSlashv2beta2]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler]] = js.undefined
  /**
    * metadata is the standard object metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * spec is the specification for the behaviour of the autoscaler. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
    */
  var spec: js.UndefOr[Input[HorizontalPodAutoscalerSpec]] = js.undefined
}

object HorizontalPodAutoscaler {
  @scala.inline
  def apply(
    apiVersion: Input[autoscalingSlashv2beta2] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[HorizontalPodAutoscalerSpec] = null
  ): HorizontalPodAutoscaler = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscaler]
  }
}

