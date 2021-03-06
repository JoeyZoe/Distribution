package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyBlockInvalid extends js.Object {
  /** ConsensusNotifyBlockInvalid blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusNotifyBlockInvalid {
  @scala.inline
  def apply(blockId: Uint8Array = null): IConsensusNotifyBlockInvalid = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyBlockInvalid]
  }
}

