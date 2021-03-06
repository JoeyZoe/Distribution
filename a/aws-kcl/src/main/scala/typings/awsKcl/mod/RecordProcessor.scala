package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line:no-empty-interface
trait RecordProcessor extends js.Object {
  /**
    * Called once by the KCL before any calls to processRecords. Any initialization
    * logic for record processing can go here.
    *
    * @param initializeInput - Initialization related information.
    * @param completeCallback - The callback that must be invoked
    *          once the initialization operation is complete.
    */
  def initialize(initializeInput: InitializeInput, completeCallback: Callback): Unit
  /**
    * Called by the KCL to indicate that this record processor should shut down.
    * After the lease lost operation is complete, there will not be any more calls to
    * any other functions of this record processor. Clients should not attempt to
    * checkpoint because the lease has been lost by this Worker.
    *
    * @param leaseLostInput    Lease lost information.
    * @param completeCallback  The callback must be invoked once lease
    *             lost operations are completed.
    */
  def leaseLost(leaseLostInput: LeaseLossInput, completeCallback: Callback): Unit
  /**
    * Called by KCL with a list of records to be processed and checkpointed.
    * A record looks like:
    *
    * The checkpointer can optionally be used to checkpoint a particular sequence
    * number (from a record). If checkpointing, the checkpoint must always be
    * invoked before calling `completeCallback` for processRecords. Moreover,
    * `completeCallback` should only be invoked once the checkpoint operation
    * callback is received.
    *
    * @param processRecordsInput       Process records information with
    *             array of records that are to be processed.
    * @param completeCallback          The callback that must be invoked
    *             once all records are processed and checkpoint (optional) is
    *             complete.
    */
  def processRecords(processRecordsInput: ProcessRecordsInput, completeCallback: Callback): Unit
  /**
    * Called by the KCL to indicate that this record processor should shutdown.
    * After the shard ended operation is complete, there will not be any more calls to
    * any other functions of this record processor. Clients are required to checkpoint
    * at this time. This indicates that the current record processor has finished
    * processing and new record processors for the children will be created.
    *
    * @param shardEndedInput       ShardEnded information.
    * @param completeCallback      The callback must be invoked once shard
    *               ended operations are completed.
    */
  def shardEnded(shardEndedInput: ShardEndedInput, completeCallback: Callback): Unit
}

object RecordProcessor {
  @scala.inline
  def apply(
    initialize: (InitializeInput, Callback) => Unit,
    leaseLost: (LeaseLossInput, Callback) => Unit,
    processRecords: (ProcessRecordsInput, Callback) => Unit,
    shardEnded: (ShardEndedInput, Callback) => Unit
  ): RecordProcessor = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction2(initialize), leaseLost = js.Any.fromFunction2(leaseLost), processRecords = js.Any.fromFunction2(processRecords), shardEnded = js.Any.fromFunction2(shardEnded))
  
    __obj.asInstanceOf[RecordProcessor]
  }
}

