package typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecreaseStreamRetentionPeriodOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
}

object DecreaseStreamRetentionPeriodOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DecreaseStreamRetentionPeriodOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecreaseStreamRetentionPeriodOutput]
  }
}

