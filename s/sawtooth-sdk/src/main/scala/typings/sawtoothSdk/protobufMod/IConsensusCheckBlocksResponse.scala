package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusCheckBlocksResponse extends js.Object {
  /** ConsensusCheckBlocksResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusCheckBlocksResponse {
  @scala.inline
  def apply(status: Status = null): IConsensusCheckBlocksResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusCheckBlocksResponse]
  }
}

