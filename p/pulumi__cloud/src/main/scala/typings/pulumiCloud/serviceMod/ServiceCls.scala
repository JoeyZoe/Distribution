package typings.pulumiCloud.serviceMod

import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/service", "Service")
@js.native
class ServiceCls protected () extends Service {
  /**
    * Construct a new Service, which is one or more managed replicas of a group of one or more Containers.
    *
    * @param name The unique name of the service.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String, args: ServiceArguments) = this()
  def this(name: String, args: ServiceArguments, opts: ResourceOptions) = this()
}

