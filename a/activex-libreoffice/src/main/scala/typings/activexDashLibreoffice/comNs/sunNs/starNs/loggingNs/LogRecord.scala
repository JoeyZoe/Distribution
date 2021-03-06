package typings.activexDashLibreoffice.comNs.sunNs.starNs.loggingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * assembles the complete information about a to-be-logged event
  * @see XLogger
  * @since OOo 2.3
  */
trait LogRecord extends js.Object {
  /**
    * specifies the level of the log event
    * @see LogLevel
    */
  var Level: Double
  var LogTime: DateTime
  var LoggerName: String
  var Message: String
  /**
    * specifies the number of the log event.
    *
    * Subsequent events get assigned increasing sequence numbers by the {@link XLogger} at which they're logged.
    */
  var SequenceNumber: Double
  /**
    * specifies the name of the class, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceClassName: String
  /**
    * specifies the name of the method, in which the record was logged.
    *
    * This name might be empty, in case the caller to one of the various `log` methods of {@link XLogger} did not specify it.
    */
  var SourceMethodName: String
  var ThreadID: String
}

object LogRecord {
  @scala.inline
  def apply(
    Level: Double,
    LogTime: DateTime,
    LoggerName: String,
    Message: String,
    SequenceNumber: Double,
    SourceClassName: String,
    SourceMethodName: String,
    ThreadID: String
  ): LogRecord = {
    val __obj = js.Dynamic.literal(Level = Level, LogTime = LogTime, LoggerName = LoggerName, Message = Message, SequenceNumber = SequenceNumber, SourceClassName = SourceClassName, SourceMethodName = SourceMethodName, ThreadID = ThreadID)
  
    __obj.asInstanceOf[LogRecord]
  }
}

