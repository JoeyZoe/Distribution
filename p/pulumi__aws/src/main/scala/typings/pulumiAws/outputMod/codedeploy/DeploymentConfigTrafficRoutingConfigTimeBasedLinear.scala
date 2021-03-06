package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigTrafficRoutingConfigTimeBasedLinear extends js.Object {
  /**
    * The number of minutes between each incremental traffic shift of a `TimeBasedLinear` deployment.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * The percentage of traffic that is shifted at the start of each increment of a `TimeBasedLinear` deployment.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object DeploymentConfigTrafficRoutingConfigTimeBasedLinear {
  @scala.inline
  def apply(interval: Int | Double = null, percentage: Int | Double = null): DeploymentConfigTrafficRoutingConfigTimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]
  }
}

