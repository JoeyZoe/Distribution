package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration extends js.Object {
  /**
    * Enables or disables data processing.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]
  ] = js.native
}

object FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    processors: js.Array[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor] = null
  ): FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]
  }
}

