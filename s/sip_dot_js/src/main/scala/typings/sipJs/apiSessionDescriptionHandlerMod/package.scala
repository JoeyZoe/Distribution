package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiSessionDescriptionHandlerMod {
  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ typings.std.RTCSessionDescriptionInit, 
    js.Promise[typings.std.RTCSessionDescriptionInit]
  ]
}
