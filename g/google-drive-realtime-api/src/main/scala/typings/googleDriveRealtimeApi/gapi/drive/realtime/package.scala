package typings.googleDriveRealtimeApi.gapi.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtime {
  type GoogEventHandler = (js.Function1[
    (/* e */ typings.std.Event_) | (/* evt */ typings.googleDriveRealtimeApi.gapi.drive.realtime.ObjectChangedEvent), 
    scala.Unit
  ]) | typings.std.EventListener
}
