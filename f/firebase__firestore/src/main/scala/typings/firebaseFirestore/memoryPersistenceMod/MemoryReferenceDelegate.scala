package typings.firebaseFirestore.memoryPersistenceMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistenceMod.ReferenceDelegate
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.referenceSetMod.ReferenceSet
import typings.firebaseFirestore.targetDataMod.TargetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryReferenceDelegate extends ReferenceDelegate {
  def documentSize(doc: MaybeDocument): Double
  def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit]
  def onTransactionStarted(): Unit
}

object MemoryReferenceDelegate {
  @scala.inline
  def apply(
    addReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    documentSize: MaybeDocument => Double,
    onTransactionCommitted: PersistenceTransaction => PersistencePromise[Unit],
    onTransactionStarted: () => Unit,
    removeMutationReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
    setInMemoryPins: ReferenceSet => Unit,
    updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
  ): MemoryReferenceDelegate = {
    val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction2(addReference), documentSize = js.Any.fromFunction1(documentSize), onTransactionCommitted = js.Any.fromFunction1(onTransactionCommitted), onTransactionStarted = js.Any.fromFunction0(onTransactionStarted), removeMutationReference = js.Any.fromFunction2(removeMutationReference), removeReference = js.Any.fromFunction2(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), setInMemoryPins = js.Any.fromFunction1(setInMemoryPins), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
  
    __obj.asInstanceOf[MemoryReferenceDelegate]
  }
}

