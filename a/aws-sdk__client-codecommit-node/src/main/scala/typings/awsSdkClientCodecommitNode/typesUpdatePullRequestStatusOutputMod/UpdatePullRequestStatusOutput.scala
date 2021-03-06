package typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestStatusOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the pull request.</p>
    */
  var pullRequest: UnmarshalledPullRequest
}

object UpdatePullRequestStatusOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): UpdatePullRequestStatusOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePullRequestStatusOutput]
  }
}

