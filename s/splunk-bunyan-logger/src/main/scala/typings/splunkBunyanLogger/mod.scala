package typings.splunkBunyanLogger

import typings.bunyan.mod.Stream
import typings.node.NodeJS.WritableStream
import typings.splunkLogging.mod.Config
import typings.splunkLogging.mod.EventFormatter
import typings.splunkLogging.mod.Logger
import typings.splunkLogging.mod.SendContext
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("splunk-bunyan-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait SplunkBunyanStream extends Stream {
    @JSName("stream")
    var stream_SplunkBunyanStream: SplunkStream = js.native
    def flush(): Unit = js.native
    def flush(callback: js.Function3[/* error */ Error, /* req */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
    def on(event: String, callback: js.Function2[/* err */ Error, /* context */ SendContext, Unit]): Unit = js.native
    def setEventFormatter(eventFormatter: EventFormatter): Unit = js.native
  }
  
  @js.native
  trait SplunkStream extends WritableStream {
    var logger: Logger = js.native
  }
  
  def createStream(config: Config): SplunkBunyanStream = js.native
}

