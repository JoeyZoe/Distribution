package typings.firebaseFirestore.coreListenSequenceMod

import typings.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceNumberSyncer extends js.Object {
  var sequenceNumberHandler: (js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) | Null
  def writeSequenceNumber(sequenceNumber: ListenSequenceNumber): Unit
}

object SequenceNumberSyncer {
  @scala.inline
  def apply(
    writeSequenceNumber: ListenSequenceNumber => Unit,
    sequenceNumberHandler: /* sequenceNumber */ ListenSequenceNumber => Unit = null
  ): SequenceNumberSyncer = {
    val __obj = js.Dynamic.literal(writeSequenceNumber = js.Any.fromFunction1(writeSequenceNumber))
    if (sequenceNumberHandler != null) __obj.updateDynamic("sequenceNumberHandler")(js.Any.fromFunction1(sequenceNumberHandler))
    __obj.asInstanceOf[SequenceNumberSyncer]
  }
}

