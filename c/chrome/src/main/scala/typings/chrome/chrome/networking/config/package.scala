package typings.chrome.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object config {
  type CaptivePorttalDetectedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* networkInfo */ typings.chrome.chrome.networking.config.NetworkInfo, scala.Unit]
  ]
}
