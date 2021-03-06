package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for commands like "open", "update", and "synchronize".
  * @see XCommandProcessor
  */
trait OpenCommandArgument extends js.Object {
  /**
    * A mode.
    *
    * The value can be one of the {@link OpenMode} constants.
    */
  var Mode: Double
  /** The command's priority, in the range `0` (highest) to `65535` (lowest). */
  var Priority: Double
  /** The properties, for that the values shall be provided by the {@link DynamicResultSet} returned by the command). */
  var Properties: SafeArray[Property]
  /**
    * The data sink to write the contents into (supporting either {@link com.sun.star.io.XActiveDataSink} , {@link com.sun.star.io.XOutputStream} or {@link
    * com.sun.star.io.XActiveDataStreamer} ).
    *
    * XActiveDataSink and XOutputStream give the caller read-only access to the contents. XActiveDataStreamer offers both read and write access to the
    * contents.
    *
    * If an XActiveDataSink is supplied, the implementation of the command needs to provide an implementation of an object implementing the interface {@link
    * com.sun.star.io.XInputStream} . It is highly recommended that this object also implements the interface {@link com.sun.star.io.XSeekable} , if this
    * can be done without wasting resources (i.e. allocating huge memory buffers). The implementation object has to be supplied to the data sink.
    */
  var Sink: XInterface
}

object OpenCommandArgument {
  @scala.inline
  def apply(Mode: Double, Priority: Double, Properties: SafeArray[Property], Sink: XInterface): OpenCommandArgument = {
    val __obj = js.Dynamic.literal(Mode = Mode, Priority = Priority, Properties = Properties, Sink = Sink)
  
    __obj.asInstanceOf[OpenCommandArgument]
  }
}

