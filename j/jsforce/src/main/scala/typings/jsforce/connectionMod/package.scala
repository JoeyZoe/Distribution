package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectionMod {
  type Callback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ T, scala.Unit]
  type ConnectionEvent = typings.jsforce.jsforceStrings.refresh
}
