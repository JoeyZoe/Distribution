package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFWorker extends js.Object {
  val messageHandler: js.Any | Null
  val port: js.Any | Null
  val promise: js.Promise[_]
  def destroy(): Unit
}

object PDFWorker {
  @scala.inline
  def apply(destroy: () => Unit, promise: js.Promise[_], messageHandler: js.Any = null, port: js.Any = null): PDFWorker = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), promise = promise.asInstanceOf[js.Any])
    if (messageHandler != null) __obj.updateDynamic("messageHandler")(messageHandler.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFWorker]
  }
}

