package typings.awsSdkClientS3Node.typesPutBucketReplicationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketReplicationOutput]
  }
}

