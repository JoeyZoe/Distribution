package typings.pulumiAws.applicationloadbalancingLoadBalancerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.application
  - typings.pulumiAws.pulumiAwsStrings.network
*/
trait LoadBalancerType extends js.Object

object LoadBalancerType {
  @scala.inline
  def application: typings.pulumiAws.pulumiAwsStrings.application = this.cast("application")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def network: typings.pulumiAws.pulumiAwsStrings.network = this.cast("network")
}

