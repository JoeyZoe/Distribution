package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProxySessionsRequest extends js.Object {
  var MaxResults: js.UndefOr[ResultMax] = js.native
  var NextToken: js.UndefOr[NextTokenString] = js.native
  var Status: js.UndefOr[ProxySessionStatus] = js.native
  var VoiceConnectorId: NonEmptyString128 = js.native
}

object ListProxySessionsRequest {
  @scala.inline
  def apply(
    VoiceConnectorId: NonEmptyString128,
    MaxResults: Int | Double = null,
    NextToken: NextTokenString = null,
    Status: ProxySessionStatus = null
  ): ListProxySessionsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProxySessionsRequest]
  }
}

