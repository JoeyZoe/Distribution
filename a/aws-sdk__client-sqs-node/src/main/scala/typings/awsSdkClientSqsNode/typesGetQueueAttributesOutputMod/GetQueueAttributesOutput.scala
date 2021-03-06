package typings.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueAttributesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A map of attributes to their respective values.</p>
    */
  var Attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string}
    */ typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.GetQueueAttributesOutput with js.Any
  ] = js.undefined
}

object GetQueueAttributesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string}
    */ typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.GetQueueAttributesOutput with js.Any = null
  ): GetQueueAttributesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueAttributesOutput]
  }
}

