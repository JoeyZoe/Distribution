package typings.stellarSdk.mod

import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Transaction")
@js.native
class Transaction[TMemo /* <: typings.stellarBase.mod.Memo[MemoType] */, TOps /* <: js.Array[typings.stellarBase.mod.Operation] */] protected ()
  extends typings.stellarBase.mod.Transaction[TMemo, TOps] {
  def this(envelope: String) = this()
  def this(envelope: TransactionEnvelope) = this()
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
}

