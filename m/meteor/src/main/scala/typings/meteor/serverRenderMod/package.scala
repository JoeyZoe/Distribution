package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverRenderMod {
  type Callback = js.Function1[/* sink */ typings.meteor.serverRenderMod.Sink, js.Promise[js.Any] | js.Any]
}
