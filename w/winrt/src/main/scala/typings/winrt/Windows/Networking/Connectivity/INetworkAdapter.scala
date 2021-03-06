package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkAdapter extends js.Object {
  var ianaInterfaceType: Double
  var inboundMaxBitsPerSecond: Double
  var networkAdapterId: String
  var networkItem: NetworkItem
  var outboundMaxBitsPerSecond: Double
  def getConnectedProfileAsync(): IAsyncOperation[ConnectionProfile]
}

object INetworkAdapter {
  @scala.inline
  def apply(
    getConnectedProfileAsync: () => IAsyncOperation[ConnectionProfile],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): INetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = js.Any.fromFunction0(getConnectedProfileAsync), ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INetworkAdapter]
  }
}

