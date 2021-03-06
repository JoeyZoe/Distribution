package typings.webBluetooth

import typings.std.EventTarget
import typings.std.Event_
import typings.webBluetooth.webBluetoothStrings.advertisementreceived
import typings.webBluetooth.webBluetoothStrings.gattserverdisconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothDevice
  extends EventTarget
     with BluetoothDeviceEventHandlers
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  val gatt: js.UndefOr[BluetoothRemoteGATTServer] = js.native
  val id: String = js.native
  val name: js.UndefOr[String] = js.native
  val uuids: js.UndefOr[js.Array[String]] = js.native
  val watchingAdvertisements: Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserverdisconnected(
    `type`: gattserverdisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserverdisconnected(
    `type`: gattserverdisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  def unwatchAdvertisements(): Unit = js.native
  def watchAdvertisements(): js.Promise[Unit] = js.native
}

