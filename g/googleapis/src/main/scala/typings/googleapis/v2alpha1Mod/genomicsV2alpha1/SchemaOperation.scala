package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents a long-running operation that is the result of a
  * network API call.
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress. If
    * `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * The error result of the operation in case of failure or cancellation.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * An OperationMetadata or Metadata object. This will always be returned
    * with the Operation.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The server-assigned name, which is only unique within the same service
    * that originally returns it. For example&amp;#58;
    * `operations/CJHU7Oi_ChDrveSpBRjfuL-qzoWAgEw`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An Empty object.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: SchemaStatus = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    response: StringDictionary[js.Any] = null
  ): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperation]
  }
}

