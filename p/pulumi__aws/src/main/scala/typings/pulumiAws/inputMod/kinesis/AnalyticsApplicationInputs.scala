package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputs extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[Input[AnalyticsApplicationInputsKinesisFirehose]] = js.native
  /**
    * The Kinesis Stream configuration for the streaming source. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[Input[AnalyticsApplicationInputsKinesisStream]] = js.native
  /**
    * The Name Prefix to use when creating an in-application stream.
    */
  var namePrefix: Input[String] = js.native
  /**
    * The number of Parallel in-application streams to create.
    * See Parallelism below for more details.
    */
  var parallelism: js.UndefOr[Input[AnalyticsApplicationInputsParallelism]] = js.native
  /**
    * The Processing Configuration to transform records as they are received from the stream.
    * See Processing Configuration below for more details.
    */
  var processingConfiguration: js.UndefOr[Input[AnalyticsApplicationInputsProcessingConfiguration]] = js.native
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: Input[AnalyticsApplicationInputsSchema] = js.native
  var startingPositionConfigurations: js.UndefOr[Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]]] = js.native
  var streamNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object AnalyticsApplicationInputs {
  @scala.inline
  def apply(
    namePrefix: Input[String],
    schema: Input[AnalyticsApplicationInputsSchema],
    id: Input[String] = null,
    kinesisFirehose: Input[AnalyticsApplicationInputsKinesisFirehose] = null,
    kinesisStream: Input[AnalyticsApplicationInputsKinesisStream] = null,
    parallelism: Input[AnalyticsApplicationInputsParallelism] = null,
    processingConfiguration: Input[AnalyticsApplicationInputsProcessingConfiguration] = null,
    startingPositionConfigurations: Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]] = null,
    streamNames: Input[js.Array[Input[String]]] = null
  ): AnalyticsApplicationInputs = {
    val __obj = js.Dynamic.literal(namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (startingPositionConfigurations != null) __obj.updateDynamic("startingPositionConfigurations")(startingPositionConfigurations.asInstanceOf[js.Any])
    if (streamNames != null) __obj.updateDynamic("streamNames")(streamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputs]
  }
}

