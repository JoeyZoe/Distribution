package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSendHeadersListenerDetails extends js.Object {
  var id: Double
  var method: String
  var referrer: String
  var requestHeaders: Record[String, String]
  var resourceType: String
  var timestamp: Double
  var url: String
  var webContentsId: js.UndefOr[Double] = js.undefined
}

object OnSendHeadersListenerDetails {
  @scala.inline
  def apply(
    id: Double,
    method: String,
    referrer: String,
    requestHeaders: Record[String, String],
    resourceType: String,
    timestamp: Double,
    url: String,
    webContentsId: Int | Double = null
  ): OnSendHeadersListenerDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (webContentsId != null) __obj.updateDynamic("webContentsId")(webContentsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSendHeadersListenerDetails]
  }
}

